
import java.awt.Color;
import javax.swing.table.DefaultTableModel;


public class WorkingEmployees extends javax.swing.JFrame {

    WorkingEmp emp = new WorkingEmp();
    public WorkingEmployees() {
        initComponents();
        visibleLoc();
        visibleInt();
    }

    
    public void visibleLoc(){
        loc_jTable1.setRowHeight(30);
        loc_jTable1.setShowGrid(true);
        loc_jTable1.setGridColor(Color.black);
        loc_jTable1.setBackground(Color.white);
        loc_jTable1.setSelectionBackground(Color.gray);
        
        emp.EmployeesTableLoc(loc_jTable1, loc_search.getText());
    }
    
       public void visibleInt(){
        int_jTable1.setRowHeight(30);
        int_jTable1.setShowGrid(true);
        int_jTable1.setGridColor(Color.black);
        int_jTable1.setBackground(Color.white);
        int_jTable1.setSelectionBackground(Color.gray);
        
        emp.EmployeesTableInt(int_jTable1, int_search.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loc_jTable1 = new javax.swing.JTable();
        loc_search = new app.bolivia.swing.JCTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        int_jTable1 = new javax.swing.JTable();
        int_search = new app.bolivia.swing.JCTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(520, 160));
        setUndecorated(true);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Search Employee");

        loc_jTable1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Father Name", "Mother Name", "Phone Number", "Date Of Birth", "Gender", "Designation", "Email", "Present Address", "Permanent Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        loc_jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(loc_jTable1);
        if (loc_jTable1.getColumnModel().getColumnCount() > 0) {
            loc_jTable1.getColumnModel().getColumn(0).setPreferredWidth(120);
            loc_jTable1.getColumnModel().getColumn(0).setMaxWidth(150);
            loc_jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
            loc_jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
            loc_jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
            loc_jTable1.getColumnModel().getColumn(2).setMaxWidth(150);
            loc_jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);
            loc_jTable1.getColumnModel().getColumn(3).setMaxWidth(150);
            loc_jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
            loc_jTable1.getColumnModel().getColumn(4).setMaxWidth(150);
            loc_jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
            loc_jTable1.getColumnModel().getColumn(5).setMaxWidth(150);
            loc_jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
            loc_jTable1.getColumnModel().getColumn(6).setMaxWidth(150);
            loc_jTable1.getColumnModel().getColumn(7).setPreferredWidth(120);
            loc_jTable1.getColumnModel().getColumn(7).setMaxWidth(150);
            loc_jTable1.getColumnModel().getColumn(8).setPreferredWidth(120);
            loc_jTable1.getColumnModel().getColumn(8).setMaxWidth(150);
            loc_jTable1.getColumnModel().getColumn(9).setPreferredWidth(120);
            loc_jTable1.getColumnModel().getColumn(9).setMaxWidth(150);
            loc_jTable1.getColumnModel().getColumn(10).setPreferredWidth(120);
            loc_jTable1.getColumnModel().getColumn(10).setMaxWidth(150);
        }

        loc_search.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_search.setPlaceholder("Enter phone number");
        loc_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                loc_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loc_searchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loc_search, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(loc_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Local Employees", jPanel2);

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("Search Employee");

        int_jTable1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Father Name", "Mother Name", "Phone Number", "Date Of Birth", "Gender", "Designation", "Email", "Present Address", "Permanent Address", "Status", "Passport", "Country"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        int_jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(int_jTable1);
        if (int_jTable1.getColumnModel().getColumnCount() > 0) {
            int_jTable1.getColumnModel().getColumn(0).setPreferredWidth(120);
            int_jTable1.getColumnModel().getColumn(0).setMaxWidth(150);
            int_jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
            int_jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
            int_jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
            int_jTable1.getColumnModel().getColumn(2).setMaxWidth(150);
            int_jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);
            int_jTable1.getColumnModel().getColumn(3).setMaxWidth(150);
            int_jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
            int_jTable1.getColumnModel().getColumn(4).setMaxWidth(150);
            int_jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
            int_jTable1.getColumnModel().getColumn(5).setMaxWidth(150);
            int_jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
            int_jTable1.getColumnModel().getColumn(6).setMaxWidth(150);
            int_jTable1.getColumnModel().getColumn(7).setPreferredWidth(120);
            int_jTable1.getColumnModel().getColumn(7).setMaxWidth(150);
            int_jTable1.getColumnModel().getColumn(8).setPreferredWidth(150);
            int_jTable1.getColumnModel().getColumn(8).setMaxWidth(300);
            int_jTable1.getColumnModel().getColumn(9).setPreferredWidth(150);
            int_jTable1.getColumnModel().getColumn(9).setMaxWidth(300);
            int_jTable1.getColumnModel().getColumn(10).setPreferredWidth(120);
            int_jTable1.getColumnModel().getColumn(10).setMaxWidth(150);
            int_jTable1.getColumnModel().getColumn(11).setPreferredWidth(150);
            int_jTable1.getColumnModel().getColumn(12).setPreferredWidth(120);
            int_jTable1.getColumnModel().getColumn(12).setMaxWidth(150);
        }

        int_search.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_search.setPlaceholder("Enter phone number");
        int_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                int_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                int_searchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(int_search, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(int_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("International Employees", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
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

    int xx,xy;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        setVisible(false);
        try{
        Home.jLabel29.setForeground(new Color(0,0,0)); 
        }catch(NullPointerException e){           
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setForeground(new Color(250, 0, 0));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        WorkingEmployees.this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void loc_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loc_searchKeyReleased
        loc_jTable1.setModel(new DefaultTableModel(null, new Object[]{"Name", "Father Name", "Mother Name", "Date Of Birth", "Gender", "Email Address", "Phone Number", "Degree Program", "University Name", "University ID", "Room Number", "Status", "Address"}));
        emp.EmployeesTableLoc(loc_jTable1, loc_search.getText());
    }//GEN-LAST:event_loc_searchKeyReleased

    private void loc_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loc_searchKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_loc_searchKeyTyped

    private void int_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_int_searchKeyReleased
        int_jTable1.setModel(new DefaultTableModel(null, new Object[]{"Name", "Father Name", "Mother Name", "Date Of Birth", "Gender", "Email Address", "Phone Number", "Degree Program", "University Name", "University ID", "Room Number", "Status", "Address","Passport","Country"}));
        emp.EmployeesTableInt(int_jTable1, int_search.getText());
    }//GEN-LAST:event_int_searchKeyReleased

    private void int_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_int_searchKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_int_searchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable int_jTable1;
    private app.bolivia.swing.JCTextField int_search;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable loc_jTable1;
    private app.bolivia.swing.JCTextField loc_search;
    // End of variables declaration//GEN-END:variables
}
