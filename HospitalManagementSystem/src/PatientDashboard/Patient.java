
package PatientDashboard;

import AdminDashboard.Login;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*; 

public class Patient extends javax.swing.JFrame {

    private final DefaultTableModel AppointmentsTable = new DefaultTableModel();
    private final String[] AppointmentsColumns = {"Time","Date","Doctor_Name"};
    
    private final DefaultTableModel Medical_RecordsTable = new DefaultTableModel();
    private final String[] Medical_RecordsColumns = {"Date_of_Birth","Region","Medical_Problems","Name"};
    
    private final DefaultTableModel Prescribed_MedicationsTable = new DefaultTableModel();
    private final String[] Prescribed_MedicationsColumns = {"Quantity_To_Eat_Per_Day","Medications"};
    
    private final DefaultTableModel Medical_BillsTable = new DefaultTableModel();
    private final String[] Medical_BillsColumns = {"Name", "Patient_ID", "Medicines", "Treatments", "Total", "Date"};
    
    private final DefaultTableModel Payment_ReportsTable = new DefaultTableModel();
    private final String[] Payment_ReportsColumns = {"Name", "Patient_ID", "Paid Amount"};
  
    private int row = -1;
    
    public Patient() {
        AppointmentsTable.setColumnIdentifiers(AppointmentsColumns);
        Medical_RecordsTable.setColumnIdentifiers(Medical_RecordsColumns);
        Prescribed_MedicationsTable.setColumnIdentifiers(Prescribed_MedicationsColumns);
        Medical_BillsTable.setColumnIdentifiers(Medical_BillsColumns);
        Payment_ReportsTable.setColumnIdentifiers(Payment_ReportsColumns);
        initComponents();
        setSize(900, 650);
        setLocationRelativeTo(null);
        Data();
    }
    
    private void Data() {
        Object[] pres1 = {"12:00AM", "3/02/2025", "Dr. Lee"};
        Object[] pres2 = {"1:00PM", "02/05/2025", "Dr. Wong"};
    
        AppointmentsTable.addRow(pres1);
        AppointmentsTable.addRow(pres2);
    
        Object[] inv1 = {"21/02/2006", "Sarawak", "Alzheimer", "Jackson"};
        Object[] inv2 = {"03/07/2008", "Melaka", "Alzheimer", "William"};
        Object[] inv3 = {"12/08/2012", "Johor", "Parkinson", "Arnold"};
        Object[] inv4 = {"09/02/2016", "Sabah", "Hypertension", "Michael"};
        Object[] inv5 = {"25/12/2025", "Perak", "Hypertension", "Mike"};

        Medical_RecordsTable.addRow(inv1);
        Medical_RecordsTable.addRow(inv2);
        Medical_RecordsTable.addRow(inv3);
        Medical_RecordsTable.addRow(inv4);
        Medical_RecordsTable.addRow(inv5);
        
        Object[] user1 = {"20", "Cholinesterase_Inhibitors"};
        Object[] user2 = {"34", "Cholinesterase_Inhibitors"};
        Object[] user3 = {"12", "Diuretics"};
        Object[] user4 = {"4", "Dopamine_Agents"};
        Object[] user5 = {"78", "Dopamine_Agents"};
        
        Prescribed_MedicationsTable.addRow(user1);
        Prescribed_MedicationsTable.addRow(user2);
        Prescribed_MedicationsTable.addRow(user3);
        Prescribed_MedicationsTable.addRow(user4);
        Prescribed_MedicationsTable.addRow(user5);
     
        Object[] policy1 = {"Jackson", "P001", "Panadol", "Neurology", "=100.00$","04/09/2025" };
        Object[] policy2 = {"William", "P002", "Ibuprofen", "Cardiology", "=670.00$","21/02/2006" };
        
        Medical_BillsTable.addRow(policy1);
        Medical_BillsTable.addRow(policy2);
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        log_out = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 700));

        jTable5.setModel(AppointmentsTable);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable5MouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jButton1.setText("Book Appointments");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit Appointments");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete Appointments");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(99, 99, 99)
                .addComponent(jButton2)
                .addGap(130, 130, 130)
                .addComponent(jButton3)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Appointments", jPanel1);

        jTable4.setModel(Medical_RecordsTable);
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Medical_Records", jPanel2);

        jTable3.setModel(Payment_ReportsTable);
        jScrollPane3.setViewportView(jTable3);

        jButton4.setText("Generate Payments");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(362, 362, 362))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton4)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Payment_Reports", jPanel3);

        jTable2.setModel(Medical_BillsTable);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton5.setText("Pay");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton5)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Medical_Bills", jPanel4);

        jTable1.setModel(Prescribed_MedicationsTable);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Prescribed_Medicines", jPanel5);

        log_out.setBackground(new java.awt.Color(255, 0, 51));
        log_out.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        log_out.setText("LOG OUT");
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(log_out)
                .addGap(35, 35, 35))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (Payment_ReportsTable.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this,
            "No payment data available. Please pay the bills first.", "Info",
            JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    Medical_RecordsTable.setRowCount(0);
    Medical_RecordsTable.setColumnIdentifiers(new String[]{"Name", "Patient_ID", "Paid Amount"});

    double totalPaid = 0.0;

    for (int i = 0; i < Payment_ReportsTable.getRowCount(); i++) {
        String name = String.valueOf(Payment_ReportsTable.getValueAt(i, 0));
        String patientId = String.valueOf(Payment_ReportsTable.getValueAt(i, 1));
        String paidAmountStr = String.valueOf(Payment_ReportsTable.getValueAt(i, 2)).replace("$", "").replace("=", "");

        double paidAmount = 0.0;
        try {
            paidAmount = Double.parseDouble(paidAmountStr);
        } catch (NumberFormatException e) {
            System.err.println("Invalid amount for row " + i + ": " + paidAmountStr);
        }

        totalPaid += paidAmount;

        Object[] rowData = {name, patientId, String.format("$%.2f", paidAmount)};
        Medical_RecordsTable.addRow(rowData);
    }

    Medical_RecordsTable.addRow(new Object[]{"", "", ""});
    Medical_RecordsTable.addRow(new Object[]{
        "TOTAL", Payment_ReportsTable.getRowCount() + " payments",
        String.format("$%.2f", totalPaid)
    });

    JOptionPane.showMessageDialog(this,
        "Payments Report Generated Successfully!\n\n" +
        "- Total Payments: " + Payment_ReportsTable.getRowCount() + "\n" +
        "- Total Paid Amount: $" + String.format("%.2f", totalPaid),
        "Report Complete",
        JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Please select a bill to pay!");
        }
        else{
            int opt = JOptionPane.showConfirmDialog(
                this, "Pay this bill?", "Proceed to Pay", 
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
            if (opt == JOptionPane.YES_OPTION){
                String name = String.valueOf(Medical_BillsTable.getValueAt(row, 0));
                String patientId = String.valueOf(Medical_BillsTable.getValueAt(row, 1));
                String totalAmount = String.valueOf(Medical_BillsTable.getValueAt(row, 4));

                Object[] paymentData = {name, patientId, totalAmount};
                Payment_ReportsTable.addRow(paymentData);

                Medical_BillsTable.removeRow(row);

                JOptionPane.showMessageDialog(this, 
                    "Bill has been paid successfully!\n" +
                    "Payment recorded in Payment Reports.");
                row = -1;
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        row = jTable2.getSelectedRow();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
        }
        else{
            int opt = JOptionPane.showConfirmDialog(
                this, "Are you sure you want to delete?", "Confirm Delete",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (opt == JOptionPane.YES_OPTION){
                AppointmentsTable.removeRow(row);
                JOptionPane.showMessageDialog(this, "Prescription deleted successfully!");
                row = -1;
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        row = jTable5.getSelectedRow();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

        JTextField TimeIdField = new JTextField();
        JTextField DateIdField = new JTextField();
        JTextField DoctorField = new JTextField();

        panel.add(new JLabel("Patient ID:"));
        panel.add(TimeIdField);
        panel.add(new JLabel("Medicine ID:"));
        panel.add(DateIdField);
        panel.add(new JLabel("Dosage:"));
        panel.add(DoctorField);

        int option = JOptionPane.showConfirmDialog(
            this, panel, "Add New Prescription",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {
            String TimeId = TimeIdField.getText().trim();
            String DateId = DateIdField.getText().trim();
            String Doctor = DoctorField.getText().trim();

            if (TimeId.isEmpty() || DateId.isEmpty() || Doctor.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Please fill in all Information", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Object[] rowData = {TimeId, DateId, Doctor};
            AppointmentsTable.addRow(rowData);
            JOptionPane.showMessageDialog(this, "Add successfully!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
        }
        else{
            JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

            JTextField TimeIdField = new JTextField();
            JTextField DateIdField = new JTextField();
            JTextField DoctorField = new JTextField();

            String TimeId = String.valueOf(AppointmentsTable.getValueAt(row, 0));
            String DateId = String.valueOf(AppointmentsTable.getValueAt(row, 1));
            String Doctor = String.valueOf(AppointmentsTable.getValueAt(row, 2));

            TimeIdField.setText(TimeId);
            DateIdField.setText(DateId);
            DoctorField.setText(Doctor);

            panel.add(new JLabel("Time:"));
            panel.add(TimeIdField);
            panel.add(new JLabel("Date:"));
            panel.add(DateIdField);
            panel.add(new JLabel("Dosage:"));
            panel.add(DoctorField);

            int option = JOptionPane.showConfirmDialog(
                this, panel, "Edit Prescription",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (option == JOptionPane.OK_OPTION) {
                String newTimeId = TimeIdField.getText().trim();
                String newDateId = DateIdField.getText().trim();
                String newDoctor = DoctorField.getText().trim();

                if (newTimeId.isEmpty() || newDateId.isEmpty() || newDoctor.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                AppointmentsTable.setValueAt(newTimeId, row, 0);
                AppointmentsTable.setValueAt(newDateId, row, 1);
                AppointmentsTable.setValueAt(newDoctor, row, 2);
                JOptionPane.showMessageDialog(this, "Edit successfully!");
                row = -1;
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        row = jTable5.getSelectedRow();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        row = jTable5.getSelectedRow();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTable5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseReleased
        row = jTable5.getSelectedRow();
    }//GEN-LAST:event_jTable5MouseReleased

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        row = jTable2.getSelectedRow();
    }//GEN-LAST:event_jTable2MousePressed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        Login myMain = new Login();
        myMain.setVisible(true);
        myMain.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_log_outActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Patient().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JButton log_out;
    // End of variables declaration//GEN-END:variables
}
