package Componentes.Settings;

import helpers.CustomizeButtons;

public class Labs extends javax.swing.JPanel {

    CustomizeButtons customizeButton = new CustomizeButtons();
    
    public Labs() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNewLab = new javax.swing.JButton();
        btnUpdateLab = new javax.swing.JButton();
        btnDeleteLab = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLabs = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 71, 73));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Laboratorios");
        jLabel1.setMaximumSize(new java.awt.Dimension(1140, 60));
        jLabel1.setMinimumSize(new java.awt.Dimension(1140, 60));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1140, 60));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        btnNewLab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNewLab.setForeground(new java.awt.Color(53, 71, 73));
        btnNewLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addIcon.png"))); // NOI18N
        btnNewLab.setText("Crear Laboratorio");
        btnNewLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnNewLab.setContentAreaFilled(false);
        btnNewLab.setFocusable(false);
        btnNewLab.setPreferredSize(new java.awt.Dimension(150, 30));
        btnNewLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewLabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewLabMouseExited(evt);
            }
        });
        btnNewLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewLabActionPerformed(evt);
            }
        });
        add(btnNewLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        btnUpdateLab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateLab.setForeground(new java.awt.Color(53, 71, 73));
        btnUpdateLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/updateIcon.png"))); // NOI18N
        btnUpdateLab.setText("Actualizar Datos");
        btnUpdateLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnUpdateLab.setContentAreaFilled(false);
        btnUpdateLab.setFocusable(false);
        btnUpdateLab.setPreferredSize(new java.awt.Dimension(150, 30));
        btnUpdateLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateLabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateLabMouseExited(evt);
            }
        });
        btnUpdateLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateLabActionPerformed(evt);
            }
        });
        add(btnUpdateLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        btnDeleteLab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteLab.setForeground(new java.awt.Color(53, 71, 73));
        btnDeleteLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteIcon.png"))); // NOI18N
        btnDeleteLab.setText("Eliminar");
        btnDeleteLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnDeleteLab.setContentAreaFilled(false);
        btnDeleteLab.setFocusable(false);
        btnDeleteLab.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDeleteLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteLabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteLabMouseExited(evt);
            }
        });
        btnDeleteLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLabActionPerformed(evt);
            }
        });
        add(btnDeleteLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(740, 250));

        jtLabs.setForeground(new java.awt.Color(53, 71, 73));
        jtLabs.setModel(new javax.swing.table.DefaultTableModel(
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
        jtLabs.setGridColor(new java.awt.Color(34, 138, 147));
        jtLabs.setInheritsPopupMenu(true);
        jtLabs.setMaximumSize(new java.awt.Dimension(740, 200));
        jtLabs.setMinimumSize(new java.awt.Dimension(740, 200));
        jtLabs.setPreferredSize(new java.awt.Dimension(740, 200));
        jtLabs.setRowHeight(25);
        jtLabs.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jtLabs.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jtLabs);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewLabMouseEntered
        customizeButton.setHandCursor(btnNewLab);
        customizeButton.stylizeModuleButton(btnNewLab, 14);
    }//GEN-LAST:event_btnNewLabMouseEntered

    private void btnNewLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewLabMouseExited
        customizeButton.normalStyleModuleButton(btnNewLab, 12);
    }//GEN-LAST:event_btnNewLabMouseExited

    private void btnNewLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewLabActionPerformed

    }//GEN-LAST:event_btnNewLabActionPerformed

    private void btnUpdateLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateLabMouseEntered
        customizeButton.setHandCursor(btnUpdateLab);
        customizeButton.stylizeModuleButton(btnUpdateLab, 14);
    }//GEN-LAST:event_btnUpdateLabMouseEntered

    private void btnUpdateLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateLabMouseExited
        customizeButton.normalStyleModuleButton(btnUpdateLab, 12);
    }//GEN-LAST:event_btnUpdateLabMouseExited

    private void btnUpdateLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateLabActionPerformed

    }//GEN-LAST:event_btnUpdateLabActionPerformed

    private void btnDeleteLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteLabMouseEntered
        customizeButton.setHandCursor(btnDeleteLab);
        customizeButton.stylizeModuleButton(btnDeleteLab, 14);
    }//GEN-LAST:event_btnDeleteLabMouseEntered

    private void btnDeleteLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteLabMouseExited
        customizeButton.normalStyleModuleButton(btnDeleteLab, 12);
    }//GEN-LAST:event_btnDeleteLabMouseExited

    private void btnDeleteLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLabActionPerformed

    }//GEN-LAST:event_btnDeleteLabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteLab;
    private javax.swing.JButton btnNewLab;
    private javax.swing.JButton btnUpdateLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtLabs;
    // End of variables declaration//GEN-END:variables
}
