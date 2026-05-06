
package AdminDashboard;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*; 
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;

public class Admin extends javax.swing.JFrame {
    
    private final DefaultTableModel prescriptionTable= new DefaultTableModel();
    private final String[] prescriptionColumns = {"Patient_ID","Medicine_ID","Dosage","Duration"};
    
    private final DefaultTableModel inventoryTable = new DefaultTableModel();
    private final String[] inventoryColumns = {"Medicine_ID","Medicine_Name","Quantity","Price","Expiry_Date"};
    
    private final DefaultTableModel reportTable = new DefaultTableModel();
    private final String[] reportColumns = {"Medicine_ID","Medicine_Name","Quantity","Price","Status","Total_Value"};
    
    private final DefaultTableModel registerTable = new DefaultTableModel();
    private final String[] registerColumns = {"ID", "Name", "Role", "Department", "Contact_Info", "Email_Address"};
    
    private final DefaultTableModel policyTable = new DefaultTableModel();
    private final String[] policyColumns = {"Policy_ID", "Policy_Name", "Description", "Status"};
    
    private final DefaultTableModel programTable = new DefaultTableModel();
    private final String[] programColumns = {"Program_ID", "Program_Name", "Duration", "Cost", "Status"};
    
    private static final String ROLE_DOCTOR = "Doctor";
    private static final String ROLE_NURSE = "Nurse";
    private static final String ROLE_PATIENT = "Patient";
    
    private static final String STATUS_ACTIVE = "Active";
    private static final String STATUS_INACTIVE = "Inactive";
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Admin.class.getName());

    private int row = -1;
    
    public Admin() {
        prescriptionTable.setColumnIdentifiers(prescriptionColumns);
        inventoryTable.setColumnIdentifiers(inventoryColumns);
        reportTable.setColumnIdentifiers(reportColumns);
        registerTable.setColumnIdentifiers(registerColumns);
        policyTable.setColumnIdentifiers(policyColumns);
        programTable.setColumnIdentifiers(programColumns);
        initComponents();
        setLocationRelativeTo(null);
        Data();
    }

    private void Data() {
        Object[] pres1 = {"P001", "M001", "300mg/day", "3 days"};
        Object[] pres2 = {"P002", "M002", "15mg/day", "7 days"};
        Object[] pres3 = {"P002", "M003", "75mg/day", "12 days"};
        Object[] pres4 = {"P001", "M004", "500mg/day", "12 days"};
    
        prescriptionTable.addRow(pres1);
        prescriptionTable.addRow(pres2);
        prescriptionTable.addRow(pres3);
        prescriptionTable.addRow(pres4);
    
        Object[] inv1 = {"M001", "Vitamin A", 50, 15.00, LocalDate.of(2025, 12, 31)};
        Object[] inv2 = {"M002", "Vitamin B", 75, 12.50, LocalDate.of(2025, 11, 15)};
        Object[] inv3 = {"M003", "Vitamin C", 100, 8.50, LocalDate.of(2025, 10, 20)};
        Object[] inv4 = {"M004", "Panadol", 200, 7.50, LocalDate.of(2025, 9, 30)};
        Object[] inv5 = {"M005", "Ibuprofen", 150, 8.80, LocalDate.of(2025, 10, 15)};

        inventoryTable.addRow(inv1);
        inventoryTable.addRow(inv2);
        inventoryTable.addRow(inv3);
        inventoryTable.addRow(inv4);
        inventoryTable.addRow(inv5);
        
        Object[] user1 = {"D001", "Dr. Lee", ROLE_DOCTOR, "Cardiology", "019-320-7890", "lee@gmail.com"};
        Object[] user2 = {"D002", "Dr. Wong", ROLE_DOCTOR, "Neurology", "012-897-2185", "wong@gmail.com"};
        Object[] user3 = {"N001", "Nurse Leong", ROLE_NURSE, "Emergency", "017-312-3367", "leong@gmail.com"};
        Object[] user4 = {"N002", "Nurse Law", ROLE_NURSE, "Paediatrics", "011-213-1741", "law@gmail.com"};
        Object[] user5 = {"P001", "Jackson", ROLE_PATIENT, "-", "019-267-2345", "jackson@gmail.com"};
        Object[] user6 = {"P002", "William", ROLE_PATIENT, "-", "010-289-1230", "william@gmail.com"};
        
        registerTable.addRow(user1);
        registerTable.addRow(user2);
        registerTable.addRow(user3);
        registerTable.addRow(user4);
        registerTable.addRow(user5);
        registerTable.addRow(user6);
     
        Object[] policy1 = {"PLC001", "General Visiting Hours Policy", "Visiting hours: 10:00 AM - 8:00 PM",STATUS_ACTIVE};
        Object[] policy2 = {"PLC002", "ICU Visiting Hours Policy", "Visiting hours: 12:00 AM - 6:00 PM. Maximum 1 visitor.",STATUS_ACTIVE};
        
        policyTable.addRow(policy1);
        policyTable.addRow(policy2);
        
        Object[] program1 = {"PG001", "Diabetes Management Program", "12 weeks", 350.00, STATUS_ACTIVE};
        Object[] program2 = {"PG002", "Mental Health Support", "8 weeks", 350.00, STATUS_ACTIVE};
        
        programTable.addRow(program1);
        programTable.addRow(program2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel7 = new javax.swing.JPanel();
        Table = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Delete_Pres = new javax.swing.JButton();
        Edit_Pres = new javax.swing.JButton();
        Add_Pres = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        add_Inv = new javax.swing.JButton();
        edit_Inv = new javax.swing.JButton();
        restock_Inv = new javax.swing.JButton();
        delete_Inv = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        generateReport = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        edit_user = new javax.swing.JButton();
        add_user = new javax.swing.JButton();
        delete_user = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        add_policy = new javax.swing.JButton();
        edit_policy = new javax.swing.JButton();
        delete_policy = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        add_Progarm = new javax.swing.JButton();
        edit_Program = new javax.swing.JButton();
        delete_Program = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        log_out = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));

        Table.setBackground(new java.awt.Color(255, 255, 255));
        Table.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(prescriptionTable);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        Delete_Pres.setBackground(new java.awt.Color(255, 0, 51));
        Delete_Pres.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        Delete_Pres.setText("Delete");
        Delete_Pres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_PresActionPerformed(evt);
            }
        });

        Edit_Pres.setBackground(new java.awt.Color(255, 255, 153));
        Edit_Pres.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        Edit_Pres.setText("Edit");
        Edit_Pres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_PresActionPerformed(evt);
            }
        });

        Add_Pres.setBackground(new java.awt.Color(102, 255, 102));
        Add_Pres.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        Add_Pres.setText("Add");
        Add_Pres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_PresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(Add_Pres)
                .addGap(194, 194, 194)
                .addComponent(Edit_Pres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Delete_Pres)
                .addGap(77, 77, 77))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Pres)
                    .addComponent(Edit_Pres)
                    .addComponent(Delete_Pres))
                .addContainerGap())
        );

        Table.addTab("Prescription", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setModel(inventoryTable);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        add_Inv.setBackground(new java.awt.Color(102, 255, 102));
        add_Inv.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        add_Inv.setText("Add");
        add_Inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_InvActionPerformed(evt);
            }
        });

        edit_Inv.setBackground(new java.awt.Color(255, 255, 153));
        edit_Inv.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        edit_Inv.setText("Edit");
        edit_Inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_InvActionPerformed(evt);
            }
        });

        restock_Inv.setBackground(new java.awt.Color(102, 102, 255));
        restock_Inv.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        restock_Inv.setText("Restock");
        restock_Inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restock_InvActionPerformed(evt);
            }
        });

        delete_Inv.setBackground(new java.awt.Color(255, 0, 51));
        delete_Inv.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        delete_Inv.setText("Delete");
        delete_Inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_InvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(add_Inv)
                .addGap(103, 103, 103)
                .addComponent(edit_Inv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete_Inv)
                .addGap(104, 104, 104)
                .addComponent(restock_Inv)
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_Inv)
                    .addComponent(edit_Inv)
                    .addComponent(delete_Inv)
                    .addComponent(restock_Inv))
                .addGap(9, 9, 9))
        );

        Table.addTab("Inventory", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        generateReport.setBackground(new java.awt.Color(102, 255, 102));
        generateReport.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        generateReport.setText("Generate Report");
        generateReport.setPreferredSize(new java.awt.Dimension(125, 23));
        generateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportActionPerformed(evt);
            }
        });

        jTable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable3.setModel(reportTable);
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(generateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Table.addTab("Stock Report", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable4.setModel(registerTable);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable4MouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable4);

        edit_user.setBackground(new java.awt.Color(255, 255, 153));
        edit_user.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        edit_user.setText("Edit");
        edit_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_userActionPerformed(evt);
            }
        });

        add_user.setBackground(new java.awt.Color(102, 255, 102));
        add_user.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        add_user.setText("Add");
        add_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_userActionPerformed(evt);
            }
        });

        delete_user.setBackground(new java.awt.Color(255, 0, 51));
        delete_user.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        delete_user.setText("Delete");
        delete_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(add_user)
                .addGap(197, 197, 197)
                .addComponent(edit_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete_user)
                .addGap(76, 76, 76))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_user)
                    .addComponent(add_user)
                    .addComponent(delete_user))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Table.addTab("User Management", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable5.setModel(policyTable);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable5MouseReleased(evt);
            }
        });
        jTable5.setRowHeight(40);
        jTable5.getColumnModel().getColumn(2).setPreferredWidth(400);

        jScrollPane5.setViewportView(jTable5);
        jScrollPane5.setViewportView(jTable5);

        add_policy.setBackground(new java.awt.Color(102, 255, 102));
        add_policy.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        add_policy.setText("Add");
        add_policy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_policyActionPerformed(evt);
            }
        });

        edit_policy.setBackground(new java.awt.Color(255, 255, 153));
        edit_policy.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        edit_policy.setText("Edit");
        edit_policy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_policyActionPerformed(evt);
            }
        });

        delete_policy.setBackground(new java.awt.Color(255, 0, 51));
        delete_policy.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        delete_policy.setText("Delete");
        delete_policy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_policyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(add_policy)
                .addGap(192, 192, 192)
                .addComponent(edit_policy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete_policy)
                .addGap(92, 92, 92))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_policy)
                    .addComponent(edit_policy)
                    .addComponent(delete_policy))
                .addContainerGap())
        );

        Table.addTab("Hospital Policies", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable6.setModel(programTable);
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable6MouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);

        add_Progarm.setBackground(new java.awt.Color(102, 255, 102));
        add_Progarm.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        add_Progarm.setText("Add");
        add_Progarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_ProgarmActionPerformed(evt);
            }
        });

        edit_Program.setBackground(new java.awt.Color(255, 255, 153));
        edit_Program.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        edit_Program.setText("Edit");
        edit_Program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_ProgramActionPerformed(evt);
            }
        });

        delete_Program.setBackground(new java.awt.Color(255, 0, 51));
        delete_Program.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        delete_Program.setText("Delete");
        delete_Program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_ProgramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(add_Progarm)
                .addGap(196, 196, 196)
                .addComponent(edit_Program)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(delete_Program)
                .addGap(79, 79, 79))
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_Progarm)
                    .addComponent(edit_Program)
                    .addComponent(delete_Program))
                .addContainerGap())
        );

        Table.addTab("HealthCare Programs", jPanel6);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel1.setText("OOP HOSPITAL - ADMIN MENU");

        log_out.setBackground(new java.awt.Color(255, 0, 51));
        log_out.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        log_out.setText("LOG OUT");
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(109, 109, 109)
                        .addComponent(log_out))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Table)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Table, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_PresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_PresActionPerformed
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
    
        JTextField patientIdField = new JTextField();
        JTextField medicineIdField = new JTextField();
        JTextField dosageField = new JTextField();
        JTextField durationField = new JTextField();
    
        panel.add(new JLabel("Patient ID:"));
        panel.add(patientIdField);
        panel.add(new JLabel("Medicine ID:"));
        panel.add(medicineIdField);
        panel.add(new JLabel("Dosage:"));
        panel.add(dosageField);
        panel.add(new JLabel("Duration:"));
        panel.add(durationField);
    
        int option = JOptionPane.showConfirmDialog(
            this, panel, "Add New Prescription", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    
        if (option == JOptionPane.OK_OPTION) {
            String patientId = patientIdField.getText().trim();
            String medicineId = medicineIdField.getText().trim();
            String duration = durationField.getText().trim();
            String dosage = dosageField.getText().trim();
        
            if (patientId.isEmpty() || medicineId.isEmpty() || duration.isEmpty() || dosage.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Object[] rowData = {patientId, medicineId, duration, dosage};
            prescriptionTable.addRow(rowData);
            JOptionPane.showMessageDialog(this, "Add successfully!");
    }

    }//GEN-LAST:event_Add_PresActionPerformed

    private void Edit_PresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_PresActionPerformed
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
        }
        else{
            JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
    
            JTextField patientIdField = new JTextField();
            JTextField medicineIdField = new JTextField();
            JTextField dosageField = new JTextField();
            JTextField durationField = new JTextField();
         
            String patientId = String.valueOf(prescriptionTable.getValueAt(row, 0));
            String medicineId = String.valueOf(prescriptionTable.getValueAt(row, 1));
            String dosage = String.valueOf(prescriptionTable.getValueAt(row, 2));
            String duration = String.valueOf(prescriptionTable.getValueAt(row, 3));
        
            patientIdField.setText(patientId);
            medicineIdField.setText(medicineId);
            dosageField.setText(dosage);
            durationField.setText(duration);
        
            panel.add(new JLabel("Patient ID:"));
            panel.add(patientIdField);
            panel.add(new JLabel("Medicine ID:"));
            panel.add(medicineIdField);
            panel.add(new JLabel("Dosage:"));
            panel.add(dosageField);
            panel.add(new JLabel("Duration:"));
            panel.add(durationField);
            
            int option = JOptionPane.showConfirmDialog(
            this, panel, "Edit Prescription", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if (option == JOptionPane.OK_OPTION) {
            String newPatientId = patientIdField.getText().trim();
            String newMedicineId = medicineIdField.getText().trim();
            String newDosage = dosageField.getText().trim();
            String newDuration = durationField.getText().trim();   
            
            if (newPatientId.isEmpty() || newMedicineId.isEmpty() || newDosage.isEmpty() || newDuration.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            prescriptionTable.setValueAt(newPatientId, row, 0);
            prescriptionTable.setValueAt(newMedicineId, row, 1);
            prescriptionTable.setValueAt(newDosage, row, 2);
            prescriptionTable.setValueAt(newDuration, row, 3);
            JOptionPane.showMessageDialog(this, "Edit successfully!");
            row = -1;
            }
        }
    }//GEN-LAST:event_Edit_PresActionPerformed

    private void Delete_PresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_PresActionPerformed
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
        }
        else{
            int opt = JOptionPane.showConfirmDialog(
            this, "Are you sure you want to delete?", "Confirm Delete", 
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            
            if (opt == JOptionPane.YES_OPTION){
                prescriptionTable.removeRow(row);
                JOptionPane.showMessageDialog(this, "Prescription deleted successfully!");
                row = -1;
            }
        }
    }//GEN-LAST:event_Delete_PresActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        row = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseReleased

    private void add_InvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_InvActionPerformed
        JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));
    
        JTextField medicineIdField = new JTextField();
        JTextField medicineNameField = new JTextField();
        JTextField quantityField = new JTextField();
        JTextField priceField = new JTextField();
        JTextField expiryField = new JTextField();
        
        panel.add(new JLabel("Medicine ID:"));
        panel.add(medicineIdField);
        panel.add(new JLabel("Medicine Name:"));
        panel.add(medicineNameField);
        panel.add(new JLabel("Quantity:"));
        panel.add(quantityField);
        panel.add(new JLabel("Price:"));
        panel.add(priceField);
        panel.add(new JLabel("Expiry Date (YYYY-MM-DD):"));
        panel.add(expiryField);
    
        int option = JOptionPane.showConfirmDialog(
            this, panel, "Add New Medicine", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    
        if (option == JOptionPane.OK_OPTION) {
            String medicineId = medicineIdField.getText().trim();
            String medicineName = medicineNameField.getText().trim();
            String quantityStr = quantityField.getText().trim();
            String priceStr = priceField.getText().trim();
            String expiryStr = expiryField.getText().trim();
        
            if (medicineId.isEmpty() || medicineName.isEmpty() || quantityStr.isEmpty() || priceStr.isEmpty() || expiryStr.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            for (int i = 0; i < inventoryTable.getRowCount(); i++) {
                if (medicineId.equals(inventoryTable.getValueAt(i, 0))) {
                    JOptionPane.showMessageDialog(this, "Medicine ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
         try {
            int quantity = Integer.parseInt(quantityStr);
            double price = Double.parseDouble(priceStr);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate expiryDate = LocalDate.parse(expiryStr,formatter);
            
            Object[] rowData = {medicineId,medicineName, quantity, price, expiryDate};
            inventoryTable.addRow(rowData);
            JOptionPane.showMessageDialog(this, "Add successfully!");
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers for Quantity and Price", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Please enter expiry date in YYYY-MM-DD format", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_add_InvActionPerformed

    private void edit_InvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_InvActionPerformed
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
        }
        else{
            JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));

            JTextField medicineIdField = new JTextField();
            JTextField medicineNameField = new JTextField();
            JTextField quantityField = new JTextField();
            JTextField priceField = new JTextField();
            JTextField expiryField = new JTextField();

            String medicineId = String.valueOf(inventoryTable.getValueAt(row, 0));
            String medicineName = String.valueOf(inventoryTable.getValueAt(row, 1));
            String quantity = String.valueOf(inventoryTable.getValueAt(row, 2));
            String price = String.valueOf(inventoryTable.getValueAt(row, 3));
            LocalDate expiryDate = (LocalDate) inventoryTable.getValueAt(row, 4); 
            
            medicineIdField.setEditable(false);
            
            medicineIdField.setText(medicineId);
            medicineNameField.setText(medicineName);
            quantityField.setText(quantity);
            priceField.setText(price);
            expiryField.setText(expiryDate.toString());
            
            panel.add(new JLabel("Medicine ID:"));
            panel.add(medicineIdField);
            panel.add(new JLabel("Medicine Name:"));
            panel.add(medicineNameField);
            panel.add(new JLabel("Quantity:"));
            panel.add(quantityField);
            panel.add(new JLabel("Price:"));
            panel.add(priceField);
            panel.add(new JLabel("Expiry Date (YYYY-MM-DD):"));
            panel.add(expiryField);
            
            int option = JOptionPane.showConfirmDialog(
                this, panel, "Edit Medicine", 
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            
            if (option == JOptionPane.OK_OPTION) {
                String newMedicineId = medicineIdField.getText().trim();
                String newMedicineName = medicineNameField.getText().trim();
                String newQuantityStr = quantityField.getText().trim();
                String newPriceStr = priceField.getText().trim();
                String newExpiryStr = expiryField.getText().trim();

            if (newMedicineId.isEmpty() || newMedicineName.isEmpty() || newQuantityStr.isEmpty() || newPriceStr.isEmpty() || newExpiryStr.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                int newQuantity = Integer.parseInt(newQuantityStr);
                double newPrice = Double.parseDouble(newPriceStr);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate newExpiryDate = LocalDate.parse(newExpiryStr, formatter);
                
                inventoryTable.setValueAt(newMedicineId, row, 0);
                inventoryTable.setValueAt(newMedicineName, row, 1);
                inventoryTable.setValueAt(newQuantity, row, 2);
                inventoryTable.setValueAt(newPrice, row, 3);
                inventoryTable.setValueAt(newExpiryDate, row, 4);
                JOptionPane.showMessageDialog(this, "Edit successfully!");
                row = -1;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers for Quantity and Price", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Please enter expiry date in YYYY-MM-DD format", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    }//GEN-LAST:event_edit_InvActionPerformed

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        row = jTable2.getSelectedRow();
    }//GEN-LAST:event_jTable2MouseReleased

    private void delete_InvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_InvActionPerformed
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
        }
        else{
            int opt = JOptionPane.showConfirmDialog(
            this, "Are you sure you want to delete?", "Confirm Delete", 
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            
            if (opt == JOptionPane.YES_OPTION){
                inventoryTable.removeRow(row); 
                JOptionPane.showMessageDialog(this, "Medicine deleted successfully!");
                row = -1;
            }
        }
    }//GEN-LAST:event_delete_InvActionPerformed

    private void restock_InvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restock_InvActionPerformed
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Please select a medicine to restock");
            return;
        }
    
        String currentQty = String.valueOf(inventoryTable.getValueAt(row, 2));
        String input = JOptionPane.showInputDialog(this, "Current quantity: " + currentQty + "\nEnter additional quantity: ", "Restock Medicine", JOptionPane.QUESTION_MESSAGE);
    
        if(input != null && !input.trim().isEmpty()){
            try {
                int additionalQty = Integer.parseInt(input.trim());
                int currentQuantity = Integer.parseInt(currentQty);
                if (additionalQty < 0) {
                    JOptionPane.showMessageDialog(this, "Please enter a positive number", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int newQuantity = currentQuantity + additionalQty;
                inventoryTable.setValueAt(newQuantity, row, 2);
                
                JOptionPane.showMessageDialog(this, "Restocked successfully! New quantity: " + (currentQuantity + additionalQty));
                row = -1;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_restock_InvActionPerformed

    private void generateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportActionPerformed
        reportTable.setRowCount(0);
        reportTable.setColumnIdentifiers(reportColumns);
    
        if (inventoryTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, 
                "No inventory data available. Please add medicines first.", "Info", 
                JOptionPane.INFORMATION_MESSAGE);
        return;
        }
    
        double totalInventoryValue = 0;
        int lowStockItems = 0;
        int outOfStockItems = 0;
        int criticalStockItems = 0;
        int goodStockItems = 0;
        int highStockItems = 0;

        for (int i = 0; i < inventoryTable.getRowCount(); i++) {
            try {
                String medicineId = String.valueOf(inventoryTable.getValueAt(i, 0));
                String medicineName = String.valueOf(inventoryTable.getValueAt(i, 1));
                int quantity = Integer.parseInt(String.valueOf(inventoryTable.getValueAt(i, 2)));
                double price = Double.parseDouble(String.valueOf(inventoryTable.getValueAt(i, 3)));
            
                double totalValue = quantity * price;
                totalInventoryValue += totalValue;
                String status;
                if (quantity == 0) {
                    status = "OUT OF STOCK";outOfStockItems++;
                } else if (quantity <= 25) {
                    status = "LOW STOCK";lowStockItems++;
                } else {
                    status = "GOOD";goodStockItems++;
                }
            
                Object[] rowData = {
                    medicineId, 
                    medicineName, 
                    quantity, 
                    String.format("$%.2f", price),
                    status,
                    String.format("$%.2f", totalValue)
                };
                reportTable.addRow(rowData);
            
            } catch (NumberFormatException e) {
                System.err.println("Error processing row " + i + ": " + e.getMessage());
            }
        }
    
        reportTable.addRow(new Object[]{"", "", "", "", "", ""}); 
    
        reportTable.addRow(new Object[]{
            "TOTAL", 
            "All Medicines", 
            "", 
            "",
            "TOTAL VALUE:",String.format("$%.2f", totalInventoryValue)
        });
    
        reportTable.addRow(new Object[]{
            "SUMMARY", 
            "Out of Stock: " + outOfStockItems, 
            "Low: " + lowStockItems,
            "Good: " + goodStockItems,
            "Total Items: " + inventoryTable.getRowCount()
        });

        JOptionPane.showMessageDialog(this, 
            "Stock Report Generated Successfully!\n\n" +
            "- Total Inventory Value: $" + String.format("%.2f", totalInventoryValue) + "\n" +
            "- Total Medicines: " + inventoryTable.getRowCount() + "\n" +
            "- Out of Stock: " + outOfStockItems + " items\n" +
            "- Critical Stock: " + criticalStockItems + " items\n" +
            "- Low Stock: " + lowStockItems + " items",
            "Report Complete", 
            JOptionPane.INFORMATION_MESSAGE);                                             
    }//GEN-LAST:event_generateReportActionPerformed

    private void jTable4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseReleased
        row = jTable4.getSelectedRow();
    }//GEN-LAST:event_jTable4MouseReleased

    private void add_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_userActionPerformed
        JPanel panel = new JPanel(new GridLayout(6, 2, 5, 5));
    
        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JComboBox<String> roleComboBox = new JComboBox<>(new String[]{ROLE_DOCTOR, ROLE_NURSE, ROLE_PATIENT});
        JTextField departmentField = new JTextField();
        JTextField contactField = new JTextField();
        JTextField emailField = new JTextField();
    
        panel.add(new JLabel("ID:"));
        panel.add(idField);
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Role:"));
        panel.add(roleComboBox);
        panel.add(new JLabel("Department:"));
        panel.add(departmentField);
        panel.add(new JLabel("Contact Info:"));
        panel.add(contactField);
        panel.add(new JLabel("Email Address:"));
        panel.add(emailField);
        
        int option = JOptionPane.showConfirmDialog(
            this, panel, "Add User", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if (option == JOptionPane.OK_OPTION) {
            String id = idField.getText().trim();
            String name = nameField.getText().trim();
            String role = (String) roleComboBox.getSelectedItem();
            String department = departmentField.getText().trim();
            String contact = contactField.getText().trim();
            String email = emailField.getText().trim();
        
            if (id.isEmpty() || name.isEmpty() || department.isEmpty() || contact.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
            for (int i = 0; i < registerTable.getRowCount(); i++) {
                if (id.equals(registerTable.getValueAt(i, 0))) {
                    JOptionPane.showMessageDialog(this, "ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        
            Object[] rowData = {id, name, role, department, contact, email};
            registerTable.addRow(rowData); 
            JOptionPane.showMessageDialog(this, "User added successfully!");
        }
    }//GEN-LAST:event_add_userActionPerformed

    private void edit_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_userActionPerformed
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
    
        JPanel panel = new JPanel(new GridLayout(6, 2, 5, 5));
    
        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JComboBox<String> roleComboBox = new JComboBox<>(new String[]{ROLE_DOCTOR, ROLE_NURSE, ROLE_PATIENT});
        JTextField departmentField = new JTextField();
        JTextField contactField = new JTextField();
        JTextField emailField = new JTextField();
    
        idField.setText(String.valueOf(registerTable.getValueAt(row, 0)));
        nameField.setText(String.valueOf(registerTable.getValueAt(row, 1)));
        roleComboBox.setSelectedItem(registerTable.getValueAt(row, 2));
        departmentField.setText(String.valueOf(registerTable.getValueAt(row, 3)));
        contactField.setText(String.valueOf(registerTable.getValueAt(row, 4)));
        emailField.setText(String.valueOf(registerTable.getValueAt(row, 5)));
    
        idField.setEditable(false);
    
       panel.add(new JLabel("ID:"));
        panel.add(idField);
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Role:"));
        panel.add(roleComboBox);
        panel.add(new JLabel("Department:"));
        panel.add(departmentField);
        panel.add(new JLabel("Contact Info:"));
        panel.add(contactField);
        panel.add(new JLabel("Email Address:"));
        panel.add(emailField);
    
        int option = JOptionPane.showConfirmDialog(
            this, panel, "Edit User", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    
        if (option == JOptionPane.OK_OPTION) {
            String name = nameField.getText().trim();
            String role = (String) roleComboBox.getSelectedItem();
            String department = departmentField.getText().trim();
            String contact = contactField.getText().trim();
            String email = emailField.getText().trim();
        
            if (name.isEmpty() || department.isEmpty() || contact.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
            registerTable.setValueAt(name, row, 1);
            registerTable.setValueAt(role, row, 2);
            registerTable.setValueAt(department, row, 3);
            registerTable.setValueAt(contact, row, 4);
            registerTable.setValueAt(email, row, 5);
        
            JOptionPane.showMessageDialog(this, "User updated successfully!");
            row = -1;
        }
    }//GEN-LAST:event_edit_userActionPerformed

    private void delete_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_userActionPerformed
        if (row == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete");
        return;
    }
    
    String name = String.valueOf(registerTable.getValueAt(row, 1));
    String role = String.valueOf(registerTable.getValueAt(row, 2));
    
    int option = JOptionPane.showConfirmDialog(
        this, 
        "Are you sure you want to delete " + role + " " + name + "?", "Confirm Delete", 
        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
    
    if (option == JOptionPane.YES_OPTION) {
        registerTable.removeRow(row);
        JOptionPane.showMessageDialog(this, "User deleted successfully!");
        row = -1;
    }
    }//GEN-LAST:event_delete_userActionPerformed

    private void add_policyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_policyActionPerformed
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
    
        JTextField policyIdField = new JTextField();
        JTextField policyNameField = new JTextField();
        JTextField descriptionField = new JTextField();
        JComboBox<String> statusComboBox = new JComboBox<>(new String[]{STATUS_ACTIVE, STATUS_INACTIVE});
    
        panel.add(new JLabel("Policy ID:"));
        panel.add(policyIdField);
        panel.add(new JLabel("Policy Name:"));
        panel.add(policyNameField);
        panel.add(new JLabel("Description:"));
        panel.add(descriptionField);
        panel.add(new JLabel("Status:"));
        panel.add(statusComboBox);

        
        int option = JOptionPane.showConfirmDialog(
            this, panel, "Add Hospital Policies", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if (option == JOptionPane.OK_OPTION) {
            String policyId = policyIdField.getText().trim();
            String policyName = policyNameField.getText().trim();
            String description = descriptionField.getText().trim();
            String status = (String) statusComboBox.getSelectedItem();
        
            if (policyId.isEmpty() || policyName.isEmpty() || description.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
            for (int i = 0; i < policyTable.getRowCount(); i++) {
                if (policyId.equals(policyTable.getValueAt(i, 0))) {
                    JOptionPane.showMessageDialog(this, "Policy ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        
            Object[] rowData = {policyId, policyName, description, status};
            policyTable.addRow(rowData);
            JOptionPane.showMessageDialog(this, "Policy added successfully!");
        }
    }//GEN-LAST:event_add_policyActionPerformed

    private void jTable5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseReleased
        row = jTable5.getSelectedRow();
    }//GEN-LAST:event_jTable5MouseReleased

    private void add_ProgarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_ProgarmActionPerformed
        JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));
    
        JTextField programIdField = new JTextField();
        JTextField programNameField = new JTextField();
        JTextField durationField = new JTextField();
        JTextField costField = new JTextField();
        JComboBox<String> statusComboBox = new JComboBox<>(new String[]{STATUS_ACTIVE, STATUS_INACTIVE});
    
        panel.add(new JLabel("Program ID:"));
        panel.add(programIdField);
        panel.add(new JLabel("Program Name:"));
        panel.add(programNameField);
        panel.add(new JLabel("Duration:"));
        panel.add(durationField);
        panel.add(new JLabel("Cost:"));
        panel.add(costField);
        panel.add(new JLabel("Status:"));
        panel.add(statusComboBox);

        
        int option = JOptionPane.showConfirmDialog(
            this, panel, "Add HealthCare Program", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if (option == JOptionPane.OK_OPTION) {
            String programId = programIdField.getText().trim();
            String programName = programNameField.getText().trim();
            String duration = durationField.getText().trim();
            String costStr= costField.getText().trim();
            String status = (String) statusComboBox.getSelectedItem();
        
            if (programId.isEmpty() || programName.isEmpty() || duration.isEmpty() || costStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
            for (int i = 0; i < programTable.getRowCount(); i++) {
                if (programId.equals(programTable.getValueAt(i, 0))) {
                    JOptionPane.showMessageDialog(this, "Program ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
         try {
            double cost = Double.parseDouble(costStr);
            
            Object[] rowData = {programId, programName, duration, cost, status};
            programTable.addRow(rowData);
            JOptionPane.showMessageDialog(this, "Add successfully!");
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers for Cost", "Error", JOptionPane.ERROR_MESSAGE);
            } 
        }
    }//GEN-LAST:event_add_ProgarmActionPerformed

    private void jTable6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseReleased
        row = jTable6.getSelectedRow();
    }//GEN-LAST:event_jTable6MouseReleased

    private void edit_policyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_policyActionPerformed
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
    
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
    
        JTextField policyIdField = new JTextField();
        JTextField policyNameField = new JTextField();
        JTextField descriptionField = new JTextField();
        JComboBox<String> statusComboBox = new JComboBox<>(new String[]{STATUS_ACTIVE, STATUS_INACTIVE});
    
        policyIdField.setText(String.valueOf(policyTable.getValueAt(row, 0)));
        policyNameField.setText(String.valueOf(policyTable.getValueAt(row, 1)));
        descriptionField.setText(String.valueOf(policyTable.getValueAt(row, 2)));
        statusComboBox.setSelectedItem(policyTable.getValueAt(row, 3));

        policyIdField.setEditable(false);
    
        panel.add(new JLabel("Policy ID:"));
        panel.add(policyIdField);
        panel.add(new JLabel("Policy Name:"));
        panel.add(policyNameField);
        panel.add(new JLabel("Description:"));
        panel.add(descriptionField);
        panel.add(new JLabel("Status:"));
        panel.add(statusComboBox);
    
        int option = JOptionPane.showConfirmDialog(
            this, panel, "Edit Policy", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    
        if (option == JOptionPane.OK_OPTION) {
            String policyName = policyNameField.getText().trim();
            String description = descriptionField.getText().trim();
            String status = (String) statusComboBox.getSelectedItem();
        
            if (policyName.isEmpty() || description.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
            policyTable.setValueAt(policyName, row, 1);
            policyTable.setValueAt(description, row, 2);
            policyTable.setValueAt(status, row, 3);
            
            JOptionPane.showMessageDialog(this, "Policy updated successfully!");
            row = -1;
        }
    }//GEN-LAST:event_edit_policyActionPerformed

    private void delete_policyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_policyActionPerformed
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
        }
        else{
            int opt = JOptionPane.showConfirmDialog(
            this, "Are you sure you want to delete?", "Confirm Delete", 
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            
            if (opt == JOptionPane.YES_OPTION){
                policyTable.removeRow(row);
                JOptionPane.showMessageDialog(this, "Policy deleted successfully!");
                row = -1;
            }
        }
    }//GEN-LAST:event_delete_policyActionPerformed

    private void edit_ProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_ProgramActionPerformed
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
        }
        else{
            JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));

            JTextField programIdField = new JTextField();
            JTextField programNameField = new JTextField();
            JTextField durationField = new JTextField();
            JTextField costField = new JTextField();
            JComboBox<String> statusComboBox = new JComboBox<>(new String[]{STATUS_ACTIVE, STATUS_INACTIVE});

            programIdField.setText(String.valueOf(programTable.getValueAt(row, 0)));
            programNameField.setText(String.valueOf(programTable.getValueAt(row, 1)));
            durationField.setText(String.valueOf(programTable.getValueAt(row, 2)));
            costField.setText(String.valueOf(programTable.getValueAt(row, 3)));
            statusComboBox.setSelectedItem(programTable.getValueAt(row, 4));
            
            programIdField.setEditable(false);
    
            panel.add(new JLabel("Program ID:"));
            panel.add(programIdField);
            panel.add(new JLabel("Program Name:"));
            panel.add(programNameField);
            panel.add(new JLabel("Duration:"));
            panel.add(durationField);
            panel.add(new JLabel("Cost:"));
            panel.add(costField);
            panel.add(new JLabel("Status:"));
            panel.add(statusComboBox);
            
            int option = JOptionPane.showConfirmDialog(
                this, panel, "Edit HealthCare Program", 
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            
            if (option == JOptionPane.OK_OPTION) {
                String programName = programNameField.getText().trim();
                String duration = durationField.getText().trim();
                String costStr = costField.getText().trim();
                String status = (String) statusComboBox.getSelectedItem();

            if (programName.isEmpty() || duration.isEmpty() || costStr.isEmpty() || status.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                double cost = Double.parseDouble(costStr);

                programTable.setValueAt(programName, row, 1);
                programTable.setValueAt(duration, row, 2);
                programTable.setValueAt(cost, row, 3);
                programTable.setValueAt(status, row, 4);
                
                JOptionPane.showMessageDialog(this, "Edit successfully!");
                row = -1;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers for Quantity and Price", "Error", JOptionPane.ERROR_MESSAGE);
            } 
        }
    }
    }//GEN-LAST:event_edit_ProgramActionPerformed

    private void delete_ProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_ProgramActionPerformed
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
        }
        else{
            int opt = JOptionPane.showConfirmDialog(
            this, "Are you sure you want to delete?", "Confirm Delete", 
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            
            if (opt == JOptionPane.YES_OPTION){
                programTable.removeRow(row);
                JOptionPane.showMessageDialog(this, "Program deleted successfully!");
                row = -1;
            }
        }
    }//GEN-LAST:event_delete_ProgramActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        Login myMain = new Login();
        myMain.setVisible(true);
        myMain.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_log_outActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Admin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Pres;
    private javax.swing.JButton Delete_Pres;
    private javax.swing.JButton Edit_Pres;
    private javax.swing.JTabbedPane Table;
    private javax.swing.JButton add_Inv;
    private javax.swing.JButton add_Progarm;
    private javax.swing.JButton add_policy;
    private javax.swing.JButton add_user;
    private javax.swing.JButton delete_Inv;
    private javax.swing.JButton delete_Program;
    private javax.swing.JButton delete_policy;
    private javax.swing.JButton delete_user;
    private javax.swing.JButton edit_Inv;
    private javax.swing.JButton edit_Program;
    private javax.swing.JButton edit_policy;
    private javax.swing.JButton edit_user;
    private javax.swing.JButton generateReport;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JButton log_out;
    private javax.swing.JButton restock_Inv;
    // End of variables declaration//GEN-END:variables
}
