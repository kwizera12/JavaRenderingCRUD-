
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Ngabo extends javax.swing.JFrame {
    DefaultTableModel Data_table= new DefaultTableModel();
    
  
  
    public Ngabo() {
        initComponents();
        AddColumn();
    }
    public void AddColumn()
    {
        student.setModel(Data_table);
        Data_table.addColumn("NAME");
        Data_table.addColumn("ID");
        Data_table.addColumn("GENDER");
        Data_table.addColumn("DATEOFBIRTH");
        Data_table.addColumn("TELEPHONE");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        GENDERbtn = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        TELEPHONE = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        student = new javax.swing.JTable();
        SAVE = new javax.swing.JButton();
        DISPLAY = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        MALE = new javax.swing.JRadioButton();
        FEMALE = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setText("NAME");

        jLabel2.setText("ID");

        jLabel3.setBackground(new java.awt.Color(0, 255, 102));
        jLabel3.setText("GENDER");

        jLabel4.setText("DOB");

        jLabel5.setText("TELEPHONE");

        NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEActionPerformed(evt);
            }
        });

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        TELEPHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TELEPHONEActionPerformed(evt);
            }
        });

        student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(student);

        SAVE.setText("SAVE");
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });

        DISPLAY.setText("DISPLAY");
        DISPLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISPLAYActionPerformed(evt);
            }
        });

        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        GENDERbtn.add(MALE);
        MALE.setText("MALE");

        GENDERbtn.add(FEMALE);
        FEMALE.setText("FEMALE");
        FEMALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEMALEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TELEPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(MALE)
                        .addGap(18, 18, 18)
                        .addComponent(FEMALE)))
                .addGap(72, 72, 72)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(SAVE)
                .addGap(123, 123, 123)
                .addComponent(DISPLAY)
                .addGap(119, 119, 119)
                .addComponent(UPDATE)
                .addGap(108, 108, 108)
                .addComponent(DELETE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MALE)
                            .addComponent(FEMALE))
                        .addGap(46, 46, 46)
                        .addComponent(TELEPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SAVE)
                    .addComponent(DISPLAY)
                    .addComponent(UPDATE)
                    .addComponent(DELETE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void TELEPHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TELEPHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TELEPHONEActionPerformed

    private void NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEActionPerformed

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        if(NAME.getText().equals("" )|| ID.getText().equals("" ) || TELEPHONE.getText().equals("" )||(((JTextField)DatePICKER.getDateEditor().getUiComponent()).getText()).equals("")){
            JOptionPane.showMessageDialog(this, "fill in all informations");
            return;
        }else{
            MALE.setActionCommand("Male");
            FEMALE.setActionCommand("Female");
            try {
                Connection myconnect= DriverManager.getConnection("jdbc:postgresql://localhost:5432/okila_db","postgres","skanking");
                String sqlquery="insert into stud values ('"+ID.getText()+"','"+NAME.getText()+"','"+((JTextField)DatePICKER.getDateEditor().getUiComponent()).getText()+"','"+GENDERbtn.getSelection().getActionCommand()+"','"+TELEPHONE.getText()+"')";
                PreparedStatement sqlstatement= myconnect.prepareStatement(sqlquery);
                int myrows=sqlstatement.executeUpdate();
                if(myrows>0){
                  JOptionPane.showMessageDialog(this, "save is successful");
                  
                }
                myconnect.close();
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(this, ex.getMessage());
               return;
            }
        }
        ID.setText("");
        NAME.setText("");
        TELEPHONE.setText("");
        DatePICKER.setDate(null);
        GENDERbtn.clearSelection();
    }//GEN-LAST:event_SAVEActionPerformed

    private void DISPLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISPLAYActionPerformed
        try {
             Connection myconnect= DriverManager.getConnection("jdbc:postgresql://localhost:5432/okila_db","postgres","skanking");
                String sqlquery="select * from stud";
                
                PreparedStatement sqlstatement= myconnect.prepareStatement(sqlquery);
                ResultSet displayinfo=sqlstatement.executeQuery();
                Data_table.setRowCount(0);
                while(displayinfo.next()){
                  Data_table.addRow(new Object []{
                    displayinfo.getString("stud_id"),
                    displayinfo.getString("names"),
                    displayinfo.getString("DOB"),
                    displayinfo.getString("GENDER"),
                    displayinfo.getString("phone_number")
                  
                  });
                    
                    
                  
                  }
               
                
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_DISPLAYActionPerformed

    private void FEMALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEMALEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FEMALEActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        if(NAME.getText().equals("" )|| ID.getText().equals("" ) || TELEPHONE.getText().equals("")||(((JTextField)DatePICKER.getDateEditor().getUiComponent()).getText()).equals("")){
            JOptionPane.showMessageDialog(this, "fill in all informations");
            return;
        }else{
            MALE.setActionCommand("Male");
            FEMALE.setActionCommand("Female");
            try {
                Connection myconnect= DriverManager.getConnection("jdbc:postgresql://localhost:5432/okila_db","postgres","skanking");
                String sqlquery="UPDATE stud set names='"+NAME.getText()+"', phone_number='"+TELEPHONE.getText()+"', gender='"+GENDERbtn.getSelection().getActionCommand()+"', dob='"+((JTextField)DatePICKER.getDateEditor().getUiComponent()).getText()+"'where stud_id='"+ID.getText()+"'";
                PreparedStatement sqlstatement= myconnect.prepareStatement(sqlquery);
                int myrows=sqlstatement.executeUpdate();
                if(myrows>0){
                  JOptionPane.showMessageDialog(this, "DATA is updated");
                  
                }
                myconnect.close();
            } catch (Exception ex) {
               ex.printStackTrace();
               
            }
        }
        ID.setText("");
        NAME.setText("");
        TELEPHONE.setText("");
        DatePICKER.setDate(null);
        GENDERbtn.clearSelection();
    }//GEN-LAST:event_UPDATEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
       if(ID.getText().equals("")){
           JOptionPane.showMessageDialog(this, "provide ID");
           return;
        }else{
           try {
               String databaseurl = "jdbc:postgresql://localhost:5433/stud_db";
               Connection myconnect= DriverManager.getConnection("jdbc:postgresql://localhost:5432/okila_db","postgres","skanking");
               String sql="DELETE FROM stud where stud_id='"+ID.getText()+"'";
               PreparedStatement state= myconnect.prepareStatement(sql);
               int RowUpdated = state.executeUpdate();
               if(RowUpdated>0){
                JOptionPane.showMessageDialog(null, "Data is deleted");
               }
               myconnect.close();
           } catch (Exception ex) {
               ex.printStackTrace();
           }
       }
    }//GEN-LAST:event_DELETEActionPerformed

    private void studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMouseClicked
        // TODO add your handling code here:
        int i = student.getSelectedRow();
        TableModel model = student.getModel();
        NAME.setText(model.getValueAt(i,1).toString());
        ID.setText(model.getValueAt(i,0).toString());
        String sex = model.getValueAt(i,3).toString();
        String dob = model.getValueAt(i,2).toString();
        if(sex.equals("Male"))
        {
            MALE.setSelected(true);
        }
        else
        {
            FEMALE.setSelected(true);
        }
        TELEPHONE.setText(model.getValueAt(i,4).toString());
    }//GEN-LAST:event_studentMouseClicked

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
            java.util.logging.Logger.getLogger(Ngabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ngabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ngabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ngabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ngabo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE;
    private javax.swing.JButton DISPLAY;
    private javax.swing.JRadioButton FEMALE;
    private javax.swing.ButtonGroup GENDERbtn;
    private javax.swing.JTextField ID;
    private javax.swing.JRadioButton MALE;
    private javax.swing.JTextField NAME;
    private javax.swing.JButton SAVE;
    private javax.swing.JTextField TELEPHONE;
    private javax.swing.JButton UPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable student;
    // End of variables declaration//GEN-END:variables
}