/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spc;

/**
 *
 * @author Jonas
 */
public class frameforsprint extends javax.swing.JFrame
{

    JDBCInsertQuery insert = new JDBCInsertQuery();
    JDBCSelectQuery select = new JDBCSelectQuery();
    JDBCDeleteQuery delete = new JDBCDeleteQuery();
    JDBCUpdateQuery update = new JDBCUpdateQuery();
    private InfoObjectConstructor info2;
    
    public frameforsprint()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel2 = new javax.swing.JLabel();
        jTextFieldRoomID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEmpID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDateFrom = new javax.swing.JTextField();
        jTextFieldDateTo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPriceprNight = new javax.swing.JTextField();
        jButtonBookIT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldGuestID = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldCountry = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldReturningGuest = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jTextFieldSearchLastName = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        DELETEGUEST = new javax.swing.JTextField();
        DELETEFACID = new javax.swing.JTextField();
        DELETETIMESTART = new javax.swing.JTextField();
        FACTIMESTART = new javax.swing.JTextField();
        FACTIMEEND = new javax.swing.JTextField();
        INSID = new javax.swing.JTextField();
        jTextFieldnoofights = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Room ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jTextFieldRoomID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldRoomIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldRoomID, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 10, 79, -1));

        jLabel3.setText("Employee ID: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 39, -1, -1));
        getContentPane().add(jTextFieldEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 39, 79, -1));

        jLabel4.setText("Date From:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 82, -1, -1));

        jLabel5.setText("Date To:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 82, -1, -1));
        getContentPane().add(jTextFieldDateFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 119, 65, -1));
        getContentPane().add(jTextFieldDateTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 119, 65, -1));

        jLabel6.setText("Price per. Night:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 151, -1, -1));

        jTextFieldPriceprNight.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldPriceprNightActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPriceprNight, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 189, 93, -1));

        jButtonBookIT.setText("Book!");
        jButtonBookIT.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookITActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBookIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 111, 45));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setText("ex. 1500.00");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 169, 100, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setText("ex. 20-dec-14, 20-december-14 or 20-12-14");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 99, 240, -1));

        jLabel9.setText("Guest:");

        jLabel1.setText("Guest ID:");

        jLabel10.setText("First Name:");

        jLabel11.setText("Last Name:");

        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldLastNameActionPerformed(evt);
            }
        });

        jTextFieldCountry.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldCountryActionPerformed(evt);
            }
        });

        jLabel12.setText("Country:");

        jLabel13.setText("Telephone:");

        jLabel14.setText("E-mail:");

        jButton1.setText("PrintWriter");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Returning Guest (Y/N):");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(27, 27, 27))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(13, 13, 13)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15))
                                        .addGap(15, 15, 15)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldFirstName)
                                    .addComponent(jTextFieldGuestID)
                                    .addComponent(jTextFieldLastName)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldCountry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(jTextFieldMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(jTextFieldReturningGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldReturningGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(153, 153, 153)
                .addComponent(jButton2)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 0, -1, 724));

        jButtonSearch.setText("search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSearchActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jTextFieldSearchLastName.setText("Guest ID");
        getContentPane().add(jTextFieldSearchLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 218, 138, 493));

        jTextField1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 84, -1));

        DELETEGUEST.setText("guestID");
        getContentPane().add(DELETEGUEST, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        DELETEFACID.setText("FAC");
        DELETEFACID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DELETEFACIDActionPerformed(evt);
            }
        });
        getContentPane().add(DELETEFACID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        DELETETIMESTART.setText("FACDATE");
        getContentPane().add(DELETETIMESTART, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        FACTIMESTART.setText("TIMESTART");
        FACTIMESTART.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                FACTIMESTARTActionPerformed(evt);
            }
        });
        getContentPane().add(FACTIMESTART, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        FACTIMEEND.setText("TIMEEND");
        FACTIMEEND.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                FACTIMEENDActionPerformed(evt);
            }
        });
        getContentPane().add(FACTIMEEND, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        INSID.setText("INSID");
        getContentPane().add(INSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        jTextFieldnoofights.setText("noofights");
        getContentPane().add(jTextFieldnoofights, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRoomIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldRoomIDActionPerformed
    {//GEN-HEADEREND:event_jTextFieldRoomIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRoomIDActionPerformed

    private void jTextFieldPriceprNightActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldPriceprNightActionPerformed
    {//GEN-HEADEREND:event_jTextFieldPriceprNightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPriceprNightActionPerformed

    private void jButtonBookITActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookITActionPerformed
    {//GEN-HEADEREND:event_jButtonBookITActionPerformed
        insert.JDBCInsertRoom(jTextFieldGuestID.getText(), jTextFieldRoomID.getText(),
                jTextFieldEmpID.getText(), jTextFieldDateFrom.getText(), jTextFieldnoofights.getText(),
                jTextFieldDateTo.getText(), "N", jTextFieldFirstName.getText(), 
                jTextFieldLastName.getText(), jTextFieldCountry.getText(), 
                jTextFieldPhone.getText(), jTextFieldMail.getText(), 
                jTextFieldReturningGuest.getText());
    }//GEN-LAST:event_jButtonBookITActionPerformed

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldLastNameActionPerformed
    {//GEN-HEADEREND:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastNameActionPerformed

    private void jTextFieldCountryActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldCountryActionPerformed
    {//GEN-HEADEREND:event_jTextFieldCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCountryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        select.printWriter(jTextField1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1ActionPerformed
    {//GEN-HEADEREND:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSearchActionPerformed
    {//GEN-HEADEREND:event_jButtonSearchActionPerformed
//        info2 = update.getInfo(jTextFieldSearchLastName.getText());
//        jTextFieldFirstName.setText(info2.getFirstName());
//        jTextFieldLastName.setText(info2.getLastName());
//        jTextFieldCountry.setText(info2.getCountry());
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void FACTIMEENDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_FACTIMEENDActionPerformed
    {//GEN-HEADEREND:event_FACTIMEENDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FACTIMEENDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        delete.JDBCDeleteFacBooking(DELETEGUEST.getText(), DELETEFACID.getText(),
                DELETETIMESTART.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DELETEFACIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DELETEFACIDActionPerformed
    {//GEN-HEADEREND:event_DELETEFACIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DELETEFACIDActionPerformed

    private void FACTIMESTARTActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_FACTIMESTARTActionPerformed
    {//GEN-HEADEREND:event_FACTIMESTARTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FACTIMESTARTActionPerformed


    public static void main(String args[])
    {   
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frameforsprint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frameforsprint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frameforsprint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frameforsprint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
   
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frameforsprint().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DELETEFACID;
    private javax.swing.JTextField DELETEGUEST;
    private javax.swing.JTextField DELETETIMESTART;
    private javax.swing.JTextField FACTIMEEND;
    private javax.swing.JTextField FACTIMESTART;
    private javax.swing.JTextField INSID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBookIT;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCountry;
    private javax.swing.JTextField jTextFieldDateFrom;
    private javax.swing.JTextField jTextFieldDateTo;
    private javax.swing.JTextField jTextFieldEmpID;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldGuestID;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldPriceprNight;
    private javax.swing.JTextField jTextFieldReturningGuest;
    private javax.swing.JTextField jTextFieldRoomID;
    private javax.swing.JTextField jTextFieldSearchLastName;
    private javax.swing.JTextField jTextFieldnoofights;
    // End of variables declaration//GEN-END:variables
}
