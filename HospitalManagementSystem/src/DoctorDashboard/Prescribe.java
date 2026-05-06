package DoctorDashboard;
import AdminDashboard.Login;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import java.io.*;

public class Prescribe extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Prescribe.class.getName());
    private DefaultTableModel model = new DefaultTableModel();
    private String[] columnName = {"Medicine_ID","Medicine_Name","Quantity","Price","Expiry_Date"};
    private int row = 0;

    public Prescribe() {
        model.setColumnIdentifiers(columnName);
     try {
    
    String data =
        "M001,Vitamin A,50,15.00,2025-12-31\n" +
        "M002,Vitamin B,75,12.50,2025-11-15\n" +
        "M003,Vitamin C,80,8.50,2025-10-20\n" +
        "M004,Panadol,30,18.75,2025-09-30\n" +   // was 18.7.5 -> 18.75
        "M005,Ibuprofen,150,8.80,2025-10-15";

    BufferedReader br = new BufferedReader(new StringReader(data));
    String line;
    while ((line = br.readLine()) != null) {
        String[] cols = line.split("\\s*,\\s*");
        model.addRow(cols);
    }
    }  catch (Exception e) {
       e.printStackTrace();
     javax.swing.JOptionPane.showMessageDialog(this, "Error loading inline medicine data: " + e.getMessage());
  }
        initComponents();
        

         JTableHeader header = stock.getTableHeader();
         header.setFont(new Font("Poppins", Font.BOLD, 12));
         
        stock.setModel(model);
    }
    private void showMedicineInfo(String name, String use, String dose, String side) {
    String html =
        "<html><div style='width:280px;font-family:Segoe UI,Arial;'>"
      + "<div style='font-size:16px;font-weight:700;margin-bottom:6px;'>" + name + "</div>"
      + "<div style='margin-bottom:6px;'><b>Use:</b> " + use + "</div>"
      + "<div style='margin-bottom:6px;'><b>Typical adult dose:</b> " + dose + "</div>"
      + "<div style='color:#555'><b>Common side effects:</b> " + side + "</div>"
      + "</div></html>";
    JOptionPane.showMessageDialog(this, html, "Medicine Information", JOptionPane.INFORMATION_MESSAGE);
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stock = new javax.swing.JTable();
        prescribeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

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
                .addGap(170, 170, 170)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(log_out)
                .addGap(8, 8, 8))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel2.setText("Stock List");

        stock.setModel(new javax.swing.table.DefaultTableModel(
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
        stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stockMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(stock);

        prescribeBtn.setBackground(new java.awt.Color(0, 153, 153));
        prescribeBtn.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        prescribeBtn.setText("Prescribe");
        prescribeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescribeBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel3.setText("Medicine Information");

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton2.setText("Vitamin A");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton3.setText("Vitamin C");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 255, 153));
        jButton4.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton4.setText("Panadol");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 51));
        jButton5.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton5.setText("Vitamin B");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 204, 255));
        jButton6.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton6.setText("Ibuprofen");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prescribeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(94, 94, 94))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton5))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(69, 69, 69)
                        .addComponent(jButton6)
                        .addGap(62, 62, 62)
                        .addComponent(prescribeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockMouseReleased
    row = stock.getSelectedRow();

    }//GEN-LAST:event_stockMouseReleased

    private void prescribeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescribeBtnActionPerformed
    int row = stock.getSelectedRow();
    if (row < 0) { JOptionPane.showMessageDialog(this, "Select a medicine first!"); return; }

    String medId   = stock.getValueAt(row, 0).toString();
    String medName = stock.getValueAt(row, 1).toString();
    int available  = Integer.parseInt(stock.getValueAt(row, 2).toString());

    String pid = JOptionPane.showInputDialog(this, "Enter Patient ID:");
    if (pid == null || pid.trim().isEmpty()) return;

    String pname = JOptionPane.showInputDialog(this, "Enter Patient Name:");
    if (pname == null || pname.trim().isEmpty()) return;

    String qtyStr = JOptionPane.showInputDialog(this, "Enter Quantity (Available: " + available + "):");
    if (qtyStr == null || qtyStr.trim().isEmpty()) return;
    int qty = Integer.parseInt(qtyStr);

    if (qty <= 0 || qty > available) { JOptionPane.showMessageDialog(this, "Invalid quantity."); return; }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("prescriptions.txt", true))) {
        bw.write(pid + "," + pname + "," + medId + "," + medName + "," + qty + ",PENDING");
        bw.newLine();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error writing prescriptions.txt");
        return;
    }

    stock.setValueAt(available - qty, row, 2);
    JOptionPane.showMessageDialog(this, "Prescription saved for " + pname + " (" + pid + ")");



    }//GEN-LAST:event_prescribeBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    new Appointment().setVisible(true);
    this.dispose(); // or this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    showMedicineInfo(
        "Vitamin A",
        "Supports vision, immune function, and skin health.",
        "5,000–10,000 IU daily (as advised).",
        "Nausea, headache if excessive; avoid high doses in pregnancy."
    );
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        showMedicineInfo(
        "Vitamin C",
        "Antioxidant; supports immunity and wound healing.",
        "500–1000 mg daily.",
        "Heartburn or diarrhea in high doses."
    );
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        showMedicineInfo(
        "Panadol (Paracetamol)",
        "Pain relief and fever reduction.",
        "500–1000 mg every 4–6 hours; max 4,000 mg/day.",
        "Liver risk if overdosed or mixed with alcohol."
    );
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     showMedicineInfo(
        "Vitamin B Complex",
        "Energy metabolism and nerve function.",
        "1 tablet daily with food.",
        "Mild stomach upset, bright yellow urine (niacin/B2)."
    );
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        showMedicineInfo(
        "Ibuprofen",
        "NSAID for pain, inflammation, and fever.",
        "200–400 mg every 6–8 hours with food; max 1,200 mg/day (OTC).",
        "Stomach upset/ulcers; avoid in late pregnancy, kidney issues."
    );
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    new report().setVisible(true); 
    this.dispose(); // or this.setVisible(false); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    new Prescribe().setVisible(true);
    this.dispose(); // or this.setVisible(false);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    new UpdatePatient().setVisible(true);
    this.dispose(); // or this.setVisible(false);

    }//GEN-LAST:event_jButton9ActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        Login myMain = new Login();
        myMain.setVisible(true);
        myMain.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_log_outActionPerformed

 
public static void main(String[] args) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info :
                javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
        // ignore or log
    }

    // SHOW THE FRAME
    java.awt.EventQueue.invokeLater(() -> new Prescribe().setVisible(true));
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton log_out;
    private javax.swing.JButton prescribeBtn;
    private javax.swing.JTable stock;
    // End of variables declaration//GEN-END:variables

}
