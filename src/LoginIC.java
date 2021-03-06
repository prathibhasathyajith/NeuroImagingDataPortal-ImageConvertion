
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prathibha
 */
public class LoginIC extends javax.swing.JFrame {

    /**
     * Creates new form LoginIC
     */
    int xmouse;
    int ymouse;
    
    public LoginIC() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        lblclose = new javax.swing.JLabel();
        lblloginButton = new javax.swing.JLabel();
        lblbackground = new javax.swing.JLabel();
        lblDrag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        setShape((new RoundRectangle2D.Double(0, 0, 600, 361, 60, 60)));
        setSize(new java.awt.Dimension(600, 361));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfUsername.setBackground(new java.awt.Color(235, 235, 235));
        tfUsername.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        tfUsername.setForeground(new java.awt.Color(47, 47, 47));
        tfUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUsername.setBorder(null);
        tfUsername.setSelectionColor(new java.awt.Color(0, 204, 255));
        getContentPane().add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 211, 220, 29));

        tfPassword.setBackground(new java.awt.Color(235, 235, 235));
        tfPassword.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(47, 47, 47));
        tfPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPassword.setBorder(null);
        tfPassword.setSelectionColor(new java.awt.Color(0, 204, 255));
        getContentPane().add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 271, 220, 29));

        lblclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closemark-default.png"))); // NOI18N
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblcloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblcloseMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcloseMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcloseMouseEntered(evt);
            }
        });
        getContentPane().add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 13, 45, 45));

        lblloginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mouseDefault.png"))); // NOI18N
        lblloginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblloginButtonMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblloginButtonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblloginButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblloginButtonMouseEntered(evt);
            }
        });
        getContentPane().add(lblloginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 5, 100, 350));

        lblbackground.setBackground(new java.awt.Color(0, 0, 0));
        lblbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        getContentPane().add(lblbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblDrag.setBackground(new java.awt.Color(0, 0, 0));
        lblDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblDragMouseDragged(evt);
            }
        });
        lblDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDragMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDragMouseClicked(evt);
            }
        });
        getContentPane().add(lblDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblloginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblloginButtonMouseEntered
        // TODO add your handling code here:
        ImageIcon II=new ImageIcon(getClass().getResource("/images/mouseEntered.png"));
        lblloginButton.setIcon(II);
    }//GEN-LAST:event_lblloginButtonMouseEntered

    private void lblloginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblloginButtonMouseExited
        // TODO add your handling code here:
        ImageIcon II=new ImageIcon(getClass().getResource("/images/mouseDefault.png"));
        lblloginButton.setIcon(II);
    }//GEN-LAST:event_lblloginButtonMouseExited

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        // TODO add your handling code here:
        ImageIcon II=new ImageIcon(getClass().getResource("/images/closemark-clicked.png"));
        lblclose.setIcon(II);
        System.exit(0);
        
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMousePressed
        // TODO add your handling code here:
        ImageIcon II=new ImageIcon(getClass().getResource("/images/closemark-clicked.png"));
        lblclose.setIcon(II);
    }//GEN-LAST:event_lblcloseMousePressed

    private void lblcloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblcloseMouseReleased

    private void lblcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
        ImageIcon II=new ImageIcon(getClass().getResource("/images/closemark-default.png"));
        lblclose.setIcon(II);
    }//GEN-LAST:event_lblcloseMouseExited

    private void lblloginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblloginButtonMouseClicked
        // TODO add your handling code here:
        ImageIcon II=new ImageIcon(getClass().getResource("/images/mouseClicked.png"));
        
        lblloginButton.setIcon(II);
    }//GEN-LAST:event_lblloginButtonMouseClicked

    private void lblloginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblloginButtonMousePressed
        // TODO add your handling code here:
        ImageIcon II=new ImageIcon(getClass().getResource("/images/mouseClicked.png"));
        lblloginButton.setIcon(II);
    }//GEN-LAST:event_lblloginButtonMousePressed

    private void lblDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDragMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_lblDragMouseDragged

    private void lblDragMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDragMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_lblDragMouseClicked

    private void lblDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDragMousePressed
        // TODO add your handling code here:
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_lblDragMousePressed

    private void lblcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_lblcloseMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(LoginIC.class.getName()).log(Level.SEVERE, null, ex);
                }
                new LoginIC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDrag;
    private javax.swing.JLabel lblbackground;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblloginButton;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
