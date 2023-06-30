/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employeeleave;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author farja
 */
public class Applyforleave extends javax.swing.JFrame {

    /**
     * Creates new form Applyforleave
     */
    public Applyforleave() {
        initComponents();
        LoadEmpno();
        Loadleave();
    }

    int casual = 0;
    int annual = 0;
    int medical =0;
    
    Connection con;
   
    PreparedStatement pst;
    PreparedStatement pst1;
    PreparedStatement pst2;
    public void Connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/leavemanagementsystem","root","");
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
             ex.printStackTrace();
        }  
    }
    
    public void LoadEmpno()
    {
        
        Connection();     
        try {
            pst = con.prepareStatement("select * from newregistration");
            ResultSet rs = pst.executeQuery();
            txtno.removeAllItems();
            
            
            while(rs.next())
            {
                txtno.addItem(rs.getString("id"));
                
            }
     
        } catch (SQLException ex) {
            ex.printStackTrace();
        }    
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtno = new javax.swing.JComboBox<>();
        txtname = new javax.swing.JTextField();
        txtcategory = new javax.swing.JTextField();
        txtdays = new javax.swing.JSpinner();
        rcasual = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        rmedical = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apply for a leave");

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Category");

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Days");

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Category");

        txtno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoActionPerformed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        rcasual.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        rcasual.setForeground(new java.awt.Color(255, 255, 255));
        rcasual.setText("Casual/Unpaid Leave");
        rcasual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcasualActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Annual Leave");

        rmedical.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        rmedical.setForeground(new java.awt.Color(255, 255, 255));
        rmedical.setText("Sick/Medical Leave");
        rmedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmedicalActionPerformed(evt);
            }
        });

        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtname)
                    .addComponent(txtcategory)
                    .addComponent(txtno, 0, 103, Short.MAX_VALUE)
                    .addComponent(txtdays, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rmedical)
                            .addComponent(jRadioButton2)
                            .addComponent(rcasual)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(rcasual)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jRadioButton2)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(rmedical)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtdays, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rcasualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcasualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcasualActionPerformed

    private void rmedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmedicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rmedicalActionPerformed

    private void txtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoActionPerformed
    String empno = txtno.getSelectedItem().toString();
        
        Connection();
        
        try {
            pst = con.prepareStatement("select * from newregistration where id = ?");
            pst.setString(1, empno);
            ResultSet rs1 = pst.executeQuery();
            
            if(rs1.next() == false)
            {
                JOptionPane.showMessageDialog(this, "Error; id number does not exist our in database");
            }
            else
            {
                String name = rs1.getString("name");
                txtname.setText(name.trim());
                String category = rs1.getString("category"); 
                txtcategory.setText(category.trim());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtnoActionPerformed

    public void Loadleave()
    {
        Connection();
        String empno = txtno.getSelectedItem().toString();
        try {
            pst = con.prepareStatement("select * from setleave where empno = ?");
            pst.setString(1, empno);
            ResultSet rs2 = pst.executeQuery();
            
            if(rs2.next() == false)
            {
                JOptionPane.showMessageDialog(this, "Leave limit Exceded");
                
            }
            else
            {
                casual = rs2.getInt("casual");
                annual = rs2.getInt("annual");
                medical = rs2.getInt("medical"); 
            }
            
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        } 
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Loadleave();
        int bleave = 0;
        
        String empno = txtno.getSelectedItem().toString();
        
        int days = Integer.parseInt(txtdays.getValue().toString());
        if(days <= 0)
        {
            JOptionPane.showMessageDialog(this, "Select valid days");
            exit();
            
        }
        
        
        if(rcasual.isSelected() == true)
        {           
          bleave = casual - days; 
          if(bleave < 0)
          {
              JOptionPane.showMessageDialog(this, "You Have a Casual Leave :  " + casual);
    
          }
          else
          {
              try {
                  pst = con.prepareStatement("update setleave set casual = ? where empno = ?");
                    pst.setInt(1, bleave);
                    pst.setString(2, empno);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Your Casual Leave Updated");
                    
                    
              } catch (SQLException ex) {
                  Logger.getLogger(Applyforleave.class.getName()).log(Level.SEVERE, null, ex);
              }
 
          }         
        }
        
        else if(jRadioButton2.isSelected() == true)
        {
            
          bleave = annual - days; 
          if(bleave < 0)
          {
              JOptionPane.showMessageDialog(this, "You Have a Casual Leave :  " + annual);
    
          }
          else
          {
              try {
                   pst1 = con.prepareStatement("update setleave set annual = ? where empno = ?");
                    pst1.setInt(1, bleave);
                    pst1.setString(2, empno);
                    pst1.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Your Annual Leave Updated");
                    
                    
              } catch (SQLException ex) {
                  Logger.getLogger(Applyforleave.class.getName()).log(Level.SEVERE, null, ex);
              }
 
          }     
        }
      else if(rmedical.isSelected() == true)
        {
            
          bleave = medical - days; 
          if(bleave < 0)
          {
              JOptionPane.showMessageDialog(this, "You Have a Medical Leave :  " + medical);
    
          }
          else
          {
              try {
                   pst1 = con.prepareStatement("update setleave set medical = ? where empno = ?");
                    pst1.setInt(1, bleave);
                    pst1.setString(2, empno);
                    pst1.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Your Medical Leave Updated");
                    
                    
              } catch (SQLException ex) {
                  Logger.getLogger(Applyforleave.class.getName()).log(Level.SEVERE, null, ex);
              }
 
          }     
        }
        else
      {
          
          JOptionPane.showMessageDialog(this, "Something Wrong");
      }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          MainMenu ob=new MainMenu();
          ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    
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
            java.util.logging.Logger.getLogger(Applyforleave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Applyforleave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Applyforleave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Applyforleave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Applyforleave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton rcasual;
    private javax.swing.JRadioButton rmedical;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JSpinner txtdays;
    private javax.swing.JTextField txtname;
    private javax.swing.JComboBox<String> txtno;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
