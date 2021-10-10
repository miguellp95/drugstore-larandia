package Componentes.Settings;

import helpers.CustomizeButtons;

public class Package extends javax.swing.JPanel {

    CustomizeButtons customizeButton = new CustomizeButtons();
    
    public Package() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnNewPackage = new javax.swing.JButton();
        btnUpdatePackage = new javax.swing.JButton();
        btnDeletePackage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPackages = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(53, 71, 73));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Presentación / Empaquetado");
        jLabel2.setMaximumSize(new java.awt.Dimension(1140, 60));
        jLabel2.setMinimumSize(new java.awt.Dimension(1140, 60));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(1140, 60));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        btnNewPackage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNewPackage.setForeground(new java.awt.Color(53, 71, 73));
        btnNewPackage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addIcon.png"))); // NOI18N
        btnNewPackage.setText("Agregar");
        btnNewPackage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnNewPackage.setContentAreaFilled(false);
        btnNewPackage.setFocusable(false);
        btnNewPackage.setPreferredSize(new java.awt.Dimension(150, 30));
        btnNewPackage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewPackageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewPackageMouseExited(evt);
            }
        });
        btnNewPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPackageActionPerformed(evt);
            }
        });
        add(btnNewPackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        btnUpdatePackage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdatePackage.setForeground(new java.awt.Color(53, 71, 73));
        btnUpdatePackage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/updateIcon.png"))); // NOI18N
        btnUpdatePackage.setText("Actualizar Datos");
        btnUpdatePackage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnUpdatePackage.setContentAreaFilled(false);
        btnUpdatePackage.setFocusable(false);
        btnUpdatePackage.setPreferredSize(new java.awt.Dimension(150, 30));
        btnUpdatePackage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdatePackageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdatePackageMouseExited(evt);
            }
        });
        btnUpdatePackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePackageActionPerformed(evt);
            }
        });
        add(btnUpdatePackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        btnDeletePackage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeletePackage.setForeground(new java.awt.Color(53, 71, 73));
        btnDeletePackage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteIcon.png"))); // NOI18N
        btnDeletePackage.setText("Eliminar");
        btnDeletePackage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnDeletePackage.setContentAreaFilled(false);
        btnDeletePackage.setFocusable(false);
        btnDeletePackage.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDeletePackage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeletePackageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeletePackageMouseExited(evt);
            }
        });
        btnDeletePackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePackageActionPerformed(evt);
            }
        });
        add(btnDeletePackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(740, 250));

        jtPackages.setForeground(new java.awt.Color(53, 71, 73));
        jtPackages.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Laboratorio", "Descripcion", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPackages.setGridColor(new java.awt.Color(34, 138, 147));
        jtPackages.setInheritsPopupMenu(true);
        jtPackages.setMaximumSize(new java.awt.Dimension(740, 200));
        jtPackages.setMinimumSize(new java.awt.Dimension(740, 200));
        jtPackages.setPreferredSize(new java.awt.Dimension(740, 200));
        jtPackages.setRowHeight(25);
        jtPackages.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jtPackages.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jtPackages);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewPackageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewPackageMouseEntered
        customizeButton.setHandCursor(btnNewPackage);
        customizeButton.stylizeModuleButton(btnNewPackage, 14);
    }//GEN-LAST:event_btnNewPackageMouseEntered

    private void btnNewPackageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewPackageMouseExited
        customizeButton.normalStyleModuleButton(btnNewPackage, 12);
    }//GEN-LAST:event_btnNewPackageMouseExited

    private void btnNewPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPackageActionPerformed

    }//GEN-LAST:event_btnNewPackageActionPerformed

    private void btnUpdatePackageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdatePackageMouseEntered
        customizeButton.setHandCursor(btnUpdatePackage);
        customizeButton.stylizeModuleButton(btnUpdatePackage, 14);
    }//GEN-LAST:event_btnUpdatePackageMouseEntered

    private void btnUpdatePackageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdatePackageMouseExited
        customizeButton.normalStyleModuleButton(btnUpdatePackage, 12);
    }//GEN-LAST:event_btnUpdatePackageMouseExited

    private void btnUpdatePackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePackageActionPerformed

    }//GEN-LAST:event_btnUpdatePackageActionPerformed

    private void btnDeletePackageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePackageMouseEntered
        customizeButton.setHandCursor(btnDeletePackage);
        customizeButton.stylizeModuleButton(btnDeletePackage, 14);
    }//GEN-LAST:event_btnDeletePackageMouseEntered

    private void btnDeletePackageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePackageMouseExited
        customizeButton.normalStyleModuleButton(btnDeletePackage, 12);
    }//GEN-LAST:event_btnDeletePackageMouseExited

    private void btnDeletePackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePackageActionPerformed

    }//GEN-LAST:event_btnDeletePackageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletePackage;
    private javax.swing.JButton btnNewPackage;
    private javax.swing.JButton btnUpdatePackage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPackages;
    // End of variables declaration//GEN-END:variables
}
