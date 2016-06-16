
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prathibha
 */
public class ZipName {
    
    
    String timeStamp = new SimpleDateFormat("yyyy-MM-dd@HH|mm|ss").format(Calendar.getInstance().getTime());

    public String ageC(ReportFinal reportname) {
        
        String category = reportname.getAgecategory();
        String agenumber;
        switch (category) {

            case "18-20":
                agenumber = "1";
                break;
            case "20-30":
                agenumber = "2";
                break;
            case "30-40":
                agenumber = "3";
                break;
            case "40-50":
                agenumber = "4";
                break;
            case "50-60":
                agenumber = "5";
                break;
            case "60-70":
                agenumber = "6";
                break;
            case "70-80":
                agenumber = "7";
                break;
            default:
                agenumber = "";
                break;
        }
        return agenumber;
    }

    public String weightC(ReportFinal reportname) {
        
        String category = reportname.getWeightcategory();
        String weightnumber;
        switch (category) {

            case "30-40":
                weightnumber = "1";
                break;
            case "40-50":
                weightnumber = "2";
                break;
            case "50-60":
                weightnumber = "3";
                break;
            case "60-70":
                weightnumber = "4";
                break;
            case "70-80":
                weightnumber = "5";
                break;
            case "80-90":
                weightnumber = "6";
                break;
            case "90-100":
                weightnumber = "7";
                break;
            case "100-110":
                weightnumber = "8";
                break;
            case "110-120":
                weightnumber = "9";
                break;
            default:
                weightnumber = "0";
                break;
        }
        return weightnumber;
    }
    
    public String area(ReportFinal reportname) {
        
        String category = reportname.getArea();
        String area;
        switch (category) {
            case "Ampara":
                area = "1";
                break;
            case "Anuradhapura":
                area = "2";
                break;
            case "Badulla":
                area = "3";
                break;
            case "Batticaloa":
                area = "4";
                break;
            case "Colombo":
                area = "5";
                break;
            case "Galle":
                area = "6";
                break;
            case "Gampaha":
                area = "7";
                break;
            case "Hambantota":
                area = "8";
                break;
            case "Jaffna":
                area = "9";
                break;
            case "Kalutara":
                area = "10";
                break;
            case "Kandy":
                area = "11";
                break;
            case "Kegalle":
                area = "12";
                break;
            case "Kilinochchi":
                area = "13";
                break;
            case "Kurunegala":
                area = "14";
                break;
            case "Mannar":
                area = "15";
                break;
            case "Matale":
                area = "16";
                break;
            case "Matara":
                area = "17";
                break;
            case "Monaragala":
                area = "18";
                break;
            case "Mullaitivu":
                area = "19";
                break;
            case "Nuwara Eliya":
                area = "20";
                break;
            case "Polonnaruwa":
                area = "21";
                break;
            case "Puttalam":
                area = "22";
                break;
            case "Ratnapura":
                area = "23";
                break;
            case "Trincomalee":
                area = "24";
                break;
            case "Vavuniya":
                area = "25";
                break;
            default:
                area = "";
                break;
        }
        return area;
    }
    
    public String sex(ReportFinal reportname){
        String sex;
        if (reportname.getSex() == "Female") {
            sex = "F";
        } else {
            sex = "M";
        }
        return sex;
    }
    
    public String setString(ReportFinal reportname){
        
        String x= reportname.getUserid()+"#"+timeStamp+"#"+ageC(reportname)+"#"+area(reportname)+"#"+sex(reportname)+"#"+weightC(reportname)+"#"+reportname.getNoofimages();
        System.out.println("zipname"+x);
        return x;
        
    }
    /*
    public static void main(String args[]){
        ZipName zn= new ZipName();
        ReportFinal f=new ReportFinal();
        
        f.setAgecategory("18-20");
        f.setArea("Kurunegala");
        f.setWeightcategory("100-110");
        f.setSex("Male");
        f.setUserid("R0001");
        f.setNoofimages("123");
        
        String xx=zn.setString(f);
        //String x= f.getUserid()+"#"+timeStamp+"#"+zn.ageC(f)+"#"+zn.area(f)+"#"+zn.sex(f)+"#"+zn.weightC(f)+"#"+f.getNoofimages();
        System.out.println(xx);
    }*/
}
