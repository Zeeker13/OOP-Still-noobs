/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controllers.RepairController;
import Models.Repair;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CustomerRepairUI extends javax.swing.JFrame {

    
    Repair objRepair;
    RepairController objRepairController;
    Repair[] RepairArray;
    ArrayList<Repair> RepairList;
    int index;
    
    public CustomerRepairUI() {
        initComponents();
        objRepairController = new RepairController();
        RepairArray = new Repair[100];
        RepairList = new ArrayList<>();
        index = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextPane();
        txtProblem = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Done = new javax.swing.JButton();
        upload = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Service");
        setMinimumSize(new java.awt.Dimension(1030, 535));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Model");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        getContentPane().add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 330, 30));
        getContentPane().add(txtProblem, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 330, 120));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Discribe the problem");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Upload image");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        Done.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        getContentPane().add(Done, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, -1, -1));

        upload.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        upload.setText("upload");
        getContentPane().add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        Back1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });
        getContentPane().add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, 30));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\malit\\OneDrive\\Desktop\\Work Place\\OOP Project\\oopproject\\src\\main\\java\\Backgrounds\\CustomerRepairUI.gif")); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1030, 535));
        background.setMinimumSize(new java.awt.Dimension(1030, 535));
        background.setPreferredSize(new java.awt.Dimension(1030, 535));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OrderID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, 40));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 52, 330, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
      // TODO add your handling code here:
      //will play error if spces are empty
      String ModelID = txtModel.getText();
        String Problem = txtProblem.getText();
        
        

        objRepair = objRepairController.AddRepair(ModelID, Problem);
        boolean result = objRepairController.insertRepairTODB(objRepair);
        RepairArray[index] = objRepair;
        RepairList.add(objRepair);
        index++;
      
    }//GEN-LAST:event_DoneActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        // TODO add your handling code here:
        
        CustomerMainUI frm=new CustomerMainUI();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Back1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerRepairUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRepairUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRepairUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRepairUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRepairUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton Done;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane txtModel;
    private javax.swing.JTextPane txtProblem;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
