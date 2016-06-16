
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prathibha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LoginIC LIC=new LoginIC();
        //LIC.setVisible(true);
        //ConfirmationMessage mb=new ConfirmationMessage("Hi this is a message of too short","Message");
        //mb.setVisible(true);
        //System.out.println(mb.returnvalue());
        /*JPanel all = new JPanel();
        all.setLayout(new BorderLayout());
        UIManager UIManager= new UIManager();
        UIManager.put("Panel.background", new ColorUIResource(Color.WHITE));
//all.add(names, BorderLayout.NORTH);
//all.add(academic, BorderLayout.CENTER);
        all.setBackground(Color.WHITE);
        all.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); //int top, int left, int bottom, int right

        Object[] options = {"SAVE", "EXIT"};
        JOptionPane jop = new JOptionPane(all, JOptionPane.PLAIN_MESSAGE, JOptionPane.YES_NO_OPTION, null, options, null);
        final JDialog dialog = jop.createDialog(null, "Username Information");
        jop.setBackground(Color.WHITE);
        dialog.setBackground(Color.WHITE);
        dialog.setLocation(585, 300);
        dialog.setVisible(true);
        String choice = (String) jop.getValue();

        System.out.println(jop.getValue());*/
        ConInterface ca=new ConInterface();
        ca.setVisible(true);
        /*
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
    }
    
}
