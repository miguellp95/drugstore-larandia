package Componentes.Settings;

import helpers.CustomizeButtons;

public class Units extends javax.swing.JPanel {

    CustomizeButtons customizeButton = new CustomizeButtons();
    
    public Units() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNewUnit = new javax.swing.JButton();
        btnUpdateUnit = new javax.swing.JButton();
        btnDeleteUnit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUnits = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(53, 71, 73));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Unidades de medida");
        jLabel2.setMaximumSize(new java.awt.Dimension(1140, 60));
        jLabel2.setMinimumSize(new java.awt.Dimension(1140, 60));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(1140, 60));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        btnNewUnit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNewUnit.setForeground(new java.awt.Color(53, 71, 73));
        btnNewUnit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addIcon.png"))); // NOI18N
        btnNewUnit.setText("Nueva Unidad");
        btnNewUnit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnNewUnit.setContentAreaFilled(false);
        btnNewUnit.setFocusable(false);
        btnNewUnit.setPreferredSize(new java.awt.Dimension(150, 30));
        btnNewUnit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewUnitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewUnitMouseExited(evt);
            }
        });
        btnNewUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUnitActionPerformed(evt);
            }
        });
        add(btnNewUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        btnUpdateUnit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateUnit.setForeground(new java.awt.Color(53, 71, 73));
        btnUpdateUnit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/updateIcon.png"))); // NOI18N
        btnUpdateUnit.setText("Actualizar Datos");
        btnUpdateUnit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnUpdateUnit.setContentAreaFilled(false);
        btnUpdateUnit.setFocusable(false);
        btnUpdateUnit.setPreferredSize(new java.awt.Dimension(150, 30));
        btnUpdateUnit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateUnitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateUnitMouseExited(evt);
            }
        });
        btnUpdateUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUnitActionPerformed(evt);
            }
        });
        add(btnUpdateUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        btnDeleteUnit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteUnit.setForeground(new java.awt.Color(53, 71, 73));
        btnDeleteUnit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteIcon.png"))); // NOI18N
        btnDeleteUnit.setText("Eliminar");
        btnDeleteUnit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnDeleteUnit.setContentAreaFilled(false);
        btnDeleteUnit.setFocusable(false);
        btnDeleteUnit.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDeleteUnit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteUnitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteUnitMouseExited(evt);
            }
        });
        btnDeleteUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUnitActionPerformed(evt);
            }
        });
        add(btnDeleteUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(740, 250));

        jtUnits.setForeground(new java.awt.Color(53, 71, 73));
        jtUnits.setModel(new javax.swing.table.DefaultTableModel(
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
        jtUnits.setGridColor(new java.awt.Color(34, 138, 147));
        jtUnits.setInheritsPopupMenu(true);
        jtUnits.setMaximumSize(new java.awt.Dimension(740, 200));
        jtUnits.setMinimumSize(new java.awt.Dimension(740, 200));
        jtUnits.setPreferredSize(new java.awt.Dimension(740, 200));
        jtUnits.setRowHeight(25);
        jtUnits.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jtUnits.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jtUnits);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewUnitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewUnitMouseEntered
        customizeButton.setHandCursor(btnNewUnit);
        customizeButton.stylizeModuleButton(btnNewUnit, 14);
    }//GEN-LAST:event_btnNewUnitMouseEntered

    private void btnNewUnitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewUnitMouseExited
        customizeButton.normalStyleModuleButton(btnNewUnit, 12);
    }//GEN-LAST:event_btnNewUnitMouseExited

    private void btnNewUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUnitActionPerformed

    }//GEN-LAST:event_btnNewUnitActionPerformed

    private void btnUpdateUnitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateUnitMouseEntered
        customizeButton.setHandCursor(btnUpdateUnit);
        customizeButton.stylizeModuleButton(btnUpdateUnit, 14);
    }//GEN-LAST:event_btnUpdateUnitMouseEntered

    private void btnUpdateUnitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateUnitMouseExited
        customizeButton.normalStyleModuleButton(btnUpdateUnit, 12);
    }//GEN-LAST:event_btnUpdateUnitMouseExited

    private void btnUpdateUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUnitActionPerformed

    }//GEN-LAST:event_btnUpdateUnitActionPerformed

    private void btnDeleteUnitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUnitMouseEntered
        customizeButton.setHandCursor(btnDeleteUnit);
        customizeButton.stylizeModuleButton(btnDeleteUnit, 14);
    }//GEN-LAST:event_btnDeleteUnitMouseEntered

    private void btnDeleteUnitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUnitMouseExited
        customizeButton.normalStyleModuleButton(btnDeleteUnit, 12);
    }//GEN-LAST:event_btnDeleteUnitMouseExited

    private void btnDeleteUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUnitActionPerformed

    }//GEN-LAST:event_btnDeleteUnitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteUnit;
    private javax.swing.JButton btnNewUnit;
    private javax.swing.JButton btnUpdateUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtUnits;
    // End of variables declaration//GEN-END:variables
}
