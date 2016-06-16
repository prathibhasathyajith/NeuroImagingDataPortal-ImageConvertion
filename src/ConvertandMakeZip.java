

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prathibha
 */


import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;
import javax.swing.text.DefaultCaret;
import org.dcm4che2.imageio.plugins.dcm.DicomImageReadParam;
//import static progressbar.Pbar.files;

/**
 *
 * @author prathibha
 */

public class ConvertandMakeZip extends SwingWorker<Integer, String>{
    
    ConInterface cn=new ConInterface();
    
    private ReportFinal reportFinal;
    private JLabel label;
    private JProgressBar jpbar;
    private JTextArea txtarea;
    private File[] files;
    private String Zipsavepath;
    String timeStamp = new SimpleDateFormat("yyyy-MM-dd@HH|mm|ss").format(Calendar.getInstance().getTime());
    
    
    public ConvertandMakeZip(JLabel label, JProgressBar jpbar, JTextArea txtarea, File[] files,String filesave,ReportFinal reportFinal) {
        this.label = label;
        this.jpbar = jpbar;
        this.txtarea = txtarea;
        this.files = files;
        this.Zipsavepath = filesave;
        this.reportFinal=reportFinal;
    }
    
    public static String removeCharAt(String s, int pos) {
        
      return s.substring(0, pos) + s.substring(pos + 1);
      
    }
    
    
    

    @Override
    protected Integer doInBackground() throws Exception {
        getLabel().setVisible(true);
        //getJpbar().setIndeterminate(true);
        
        
        try {
            ZipName zna=new ZipName();
            
            System.out.println("this");
            String zipname= zna.setString(getReportFinal());
            
            System.out.println("hiiiii");
            System.out.println("--->0-"+getFiles()[0]);
            
            FileOutputStream fos = new FileOutputStream(getZipsavepath()+"/"+zipname+".zip");
            ZipOutputStream zos = new ZipOutputStream(fos);
            int byteread = 0;
            byte[] b = new byte[2048];
            //
            
            getJpbar().setMaximum(getFiles().length-1);
            for (int i = 0; i < getFiles().length; i++) {
                
                getJpbar().setValue(i);
                
                
                //System.out.println("/Users/prathibha/Desktop/Dicom/"+filepath[i]);
                File myDicomFile = new File(""+getFiles()[i]);

                BufferedImage myJpegImage = null;
                Iterator<ImageReader> iter = ImageIO.getImageReadersByFormatName("DICOM");
                ImageReader reader = (ImageReader) iter.next();
                
                

                DicomImageReadParam param = (DicomImageReadParam) reader.getDefaultReadParam();
                try {
                    ImageInputStream iis = ImageIO.createImageInputStream(myDicomFile);
                    reader.setInput(iis, false);
                    myJpegImage = reader.read(0, param);
                    iis.close();

                    if (myJpegImage == null) {
                        System.out.println("\nError: couldn't read dicom image!");
                        //return;
                    }
                    String jpegname=getFiles()[i].getName()+ ".jpg";
                    
                    File myJpegFile = new File(jpegname);
                    OutputStream output = new BufferedOutputStream(new FileOutputStream(myJpegFile));
                    ImageIO.write(myJpegImage, "jpeg", output);
                    //JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(output);
                    //encoder.encode(myJpegImage);
                    output.close();
                    //myJpegFile.delete();
                    
                    
                    FileInputStream in = new FileInputStream(getFiles()[i].getName()+ ".jpg");
                    jpegname=removeCharAt(jpegname, jpegname.length()-5);
                    ZipEntry zi = new ZipEntry(jpegname);
                    zos.putNextEntry(zi);

                    while ((byteread = in.read(b)) > 0) {
                        //System.out.println(getFiles()[i].getName()+ ".jpg");
                        zos.write(b, 0, byteread);
                    }
                    zos.closeEntry();
                    in.close();
                    
                    myJpegFile.delete();

                } catch (IOException e) {
                    System.out.println("\nError: couldn't read dicom image!" + e.getMessage());
                    //return;
                }
                
                getTxtarea().append("  Dicom to jpeg - "+ getFiles()[i].getName() +" completed \n");
                
                //Thread.sleep(1000);
                
            }
            getLabel().setText("Process Completed.");  
            getTxtarea().append("=========================================================\n");
            getTxtarea().append("=======================Convertion Details=====================\n");
            getTxtarea().append("   -Age_Category: "+ getReportFinal().getAgecategory()+"\n");
            getTxtarea().append("   -Sex: "+ getReportFinal().getSex()+"\n");
            getTxtarea().append("   -No of Images converted: "+ getReportFinal().getNoofimages()+"\n");
            getTxtarea().append("   -Area: "+ getReportFinal().getArea()+"\n");
            getTxtarea().append("   -Weight_Category: "+ getReportFinal().getWeightcategory()+"\n");
            zos.close();
            MessageBox mb=new MessageBox("Process Completed","Message");
            mb.setVisible(true);
            

        } catch (Exception e) {
            System.out.println("error" + e);
        }

        
        //getJpbar().setIndeterminate(false);
        return 0;
    }

    /**
     * @return the label
     */
    public JLabel getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(JLabel label) {
        this.label = label;
    }

    /**
     * @return the jpbar
     */
    public JProgressBar getJpbar() {
        return jpbar;
    }

    /**
     * @param jpbar the jpbar to set
     */
    public void setJpbar(JProgressBar jpbar) {
        this.jpbar = jpbar;
    }

    /**
     * @return the txtarea
     */
    public JTextArea getTxtarea() {
        return txtarea;
    }

    /**
     * @param txtarea the txtarea to set
     */
    public void setTxtarea(JTextArea txtarea) {
        this.txtarea = txtarea;
    }

    /**
     * @return the files
     */
    public File[] getFiles() {
        return files;
    }

    /**
     * @param files the files to set
     */
    public void setFiles(File[] files) {
        this.files = files;
    }

    /**
     * @return the Zipsavepath
     */
    public String getZipsavepath() {
        return Zipsavepath;
    }

    /**
     * @param Zipsavepath the Zipsavepath to set
     */
    public void setZipsavepath(String Zipsavepath) {
        this.Zipsavepath = Zipsavepath;
    }

    /**
     * @return the reportFinal
     */
    public ReportFinal getReportFinal() {
        return reportFinal;
    }

    /**
     * @param reportFinal the reportFinal to set
     */
    public void setReportFinal(ReportFinal reportFinal) {
        this.reportFinal = reportFinal;
    }
    
}
