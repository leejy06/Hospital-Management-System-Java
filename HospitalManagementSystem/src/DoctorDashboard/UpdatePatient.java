package DoctorDashboard;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.io.InputStreamReader;
import javax.swing.table.JTableHeader;
import AdminDashboard.Login;
import java.io.StringReader;
import java.io.BufferedReader;
import java.io.StringReader;

public class UpdatePatient extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UpdatePatient.class.getName());
    private DefaultTableModel model = new DefaultTableModel();
    private String[] columnName = {"PatientID","Name","Gender","Disease"};
    private int row = -1;

    public UpdatePatient() {
        model.setColumnIdentifiers(columnName);
        try {
       String data =
        "P001, Jackson, Male, Alzheimer\n" +
        "P002, William, Male, Alzheimer ";

    BufferedReader br = new BufferedReader(new StringReader(data));
    String eachLine;
    while ((eachLine = br.readLine()) != null) {
        String[] eachValue = eachLine.split("\\s*,\\s*");
        model.addRow(eachValue);
    }
       } catch (Exception e) {
}
        initComponents();

         JTableHeader header = PatientUpdateTable.getTableHeader();
         header.setFont(new Font("Poppins", Font.BOLD, 12));
         
        PatientUpdateTable.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatientUpdateTable = new javax.swing.JTable();
        name = new javax.swing.JLabel();
        disease = new javax.swing.JLabel();
        patientid = new javax.swing.JLabel();
        editbutton = new javax.swing.JButton();
        gender = new javax.swing.JLabel();
        patientidtxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        gendertxt = new javax.swing.JTextField();
        diseasetxt = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jButton7.setBackground(new java.awt.Color(0, 204, 204));
        jButton7.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Patient Reports");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 204, 204));
        jButton8.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Prescriptions");
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Appointments");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 204, 204));
        jButton9.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Patients");
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        log_out.setBackground(new java.awt.Color(255, 0, 51));
        log_out.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        log_out.setText("LOG OUT");
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(65, 65, 65)
                .addComponent(jButton9)
                .addGap(53, 53, 53)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(log_out)
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton8)
                    .addComponent(jButton7)
                    .addComponent(jButton1)
                    .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        PatientUpdateTable.setModel(new javax.swing.table.DefaultTableModel(
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
        PatientUpdateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PatientUpdateTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(PatientUpdateTable);

        name.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        name.setText("Name");

        disease.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        disease.setText("Disease ");

        patientid.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        patientid.setText("PatientID");

        editbutton.setBackground(new java.awt.Color(255, 255, 204));
        editbutton.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        editbutton.setText("Edit Patient");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        gender.setText("Gender");

        patientidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientidtxtActionPerformed(evt);
            }
        });

        addbutton.setBackground(new java.awt.Color(153, 255, 153));
        addbutton.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        addbutton.setText("Add Patient");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        deletebutton.setBackground(new java.awt.Color(255, 102, 102));
        deletebutton.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        deletebutton.setText("Delete Patient");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientid)
                            .addComponent(name)
                            .addComponent(gender)
                            .addComponent(disease))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(patientidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diseasetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientid)
                            .addComponent(patientidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender)
                            .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diseasetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disease))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to edit!");
        return;
    }

    String newPatientid = patientidtxt.getText().trim();
    String newName      = nametxt.getText().trim();
    String newGender    = gendertxt.getText().trim();
    String newDisease   = diseasetxt.getText().trim();

    model.setValueAt(newPatientid, row, 0);
    model.setValueAt(newName,      row, 1);
    model.setValueAt(newGender,    row, 2);
    model.setValueAt(newDisease,   row, 3);

    }//GEN-LAST:event_editbuttonActionPerformed

    private void patientidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientidtxtActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
    String pid = patientidtxt.getText().trim();
    String nm  = nametxt.getText().trim();
    String gd  = gendertxt.getText().trim();
    String ds  = diseasetxt.getText().trim();

    // simple: require all fields
    if (pid.isEmpty() || nm.isEmpty() || gd.isEmpty() || ds.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

    // confirm with user
    int opt = JOptionPane.showConfirmDialog(
            this, 
            "Add this patient?\n\nID: " + pid + "\nName: " + nm + 
            "\nGender: " + gd + "\nDisease: " + ds, 
            "Confirm Add", 
            JOptionPane.YES_NO_OPTION
    );

    if (opt != JOptionPane.YES_OPTION) {
        return; // user pressed No or closed dialog
    }

    // add to table
    model.addRow(new Object[]{pid, nm, gd, ds});

    // clear fields
    patientidtxt.setText("");
    nametxt.setText("");
    gendertxt.setText("");
    diseasetxt.setText("");
    }//GEN-LAST:event_addbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        if(row == -1){
            JOptionPane.showMessageDialog(this,"Please select a row to delete!");
        }
        else{
            int opt = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this patient?");
            if(opt == 0) {

                model.removeRow(row);
                patientidtxt.setText("");
                nametxt.setText("");
                gendertxt.setText("");
                diseasetxt.setText("");

                row = -1; //reset to non selected row
            }
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void PatientUpdateTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientUpdateTableMouseReleased
    row = PatientUpdateTable.getSelectedRow();
    row = PatientUpdateTable.getSelectedRow();
    if (row < 0) return; // nothing selected

    patientidtxt.setText(String.valueOf(model.getValueAt(row, 0)));
    nametxt.setText(String.valueOf(model.getValueAt(row, 1)));
    gendertxt.setText(String.valueOf(model.getValueAt(row, 2)));
    diseasetxt.setText(String.valueOf(model.getValueAt(row, 3)));
    }//GEN-LAST:event_PatientUpdateTableMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    new Appointment().setVisible(true);
    this.dispose(); // or this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    new UpdatePatient().setVisible(true);
    this.dispose(); // or this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    new report().setVisible(true); 
    this.dispose(); // or this.setVisible(false); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    new Prescribe().setVisible(true);
    this.dispose(); // or this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        Login myMain = new Login();
        myMain.setVisible(true);
        myMain.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_log_outActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new UpdatePatient().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientUpdateTable;
    private javax.swing.JButton addbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JLabel disease;
    private javax.swing.JTextField diseasetxt;
    private javax.swing.JButton editbutton;
    private javax.swing.JLabel gender;
    private javax.swing.JTextField gendertxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton log_out;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel patientid;
    private javax.swing.JTextField patientidtxt;
    // End of variables declaration//GEN-END:variables
}
