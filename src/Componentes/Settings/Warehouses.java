package Componentes.Settings;

import helpers.*;

public class Warehouses extends javax.swing.JPanel {

    CustomizeButtons customizeButton = new CustomizeButtons();
    
    public Warehouses() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtWarehouses = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnNewWarehouse = new javax.swing.JButton();
        btnUpdateWarehouse = new javax.swing.JButton();
        btnDeleteWarehouse1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(740, 250));

        jtWarehouses.setForeground(new java.awt.Color(53, 71, 73));
        jtWarehouses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Bodega", "Descripcion", "Estado"
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
        jtWarehouses.setGridColor(new java.awt.Color(34, 138, 147));
        jtWarehouses.setInheritsPopupMenu(true);
        jtWarehouses.setMaximumSize(new java.awt.Dimension(740, 200));
        jtWarehouses.setMinimumSize(new java.awt.Dimension(740, 200));
        jtWarehouses.setPreferredSize(new java.awt.Dimension(740, 200));
        jtWarehouses.setRowHeight(25);
        jtWarehouses.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jtWarehouses.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jtWarehouses);
        if (jtWarehouses.getColumnModel().getColumnCount() > 0) {
            jtWarehouses.getColumnModel().getColumn(0).setMinWidth(80);
            jtWarehouses.getColumnModel().getColumn(0).setPreferredWidth(80);
            jtWarehouses.getColumnModel().getColumn(0).setMaxWidth(80);
            jtWarehouses.getColumnModel().getColumn(1).setMinWidth(200);
            jtWarehouses.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtWarehouses.getColumnModel().getColumn(1).setMaxWidth(200);
            jtWarehouses.getColumnModel().getColumn(2).setMinWidth(300);
            jtWarehouses.getColumnModel().getColumn(2).setPreferredWidth(300);
            jtWarehouses.getColumnModel().getColumn(2).setMaxWidth(300);
            jtWarehouses.getColumnModel().getColumn(3).setMinWidth(160);
            jtWarehouses.getColumnModel().getColumn(3).setPreferredWidth(160);
            jtWarehouses.getColumnModel().getColumn(3).setMaxWidth(160);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 71, 73));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BODEGAS");
        jLabel1.setMaximumSize(new java.awt.Dimension(1140, 60));
        jLabel1.setMinimumSize(new java.awt.Dimension(1140, 60));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1140, 60));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        btnNewWarehouse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNewWarehouse.setForeground(new java.awt.Color(53, 71, 73));
        btnNewWarehouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addIcon.png"))); // NOI18N
        btnNewWarehouse.setText("Agregar Bodega");
        btnNewWarehouse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnNewWarehouse.setContentAreaFilled(false);
        btnNewWarehouse.setFocusable(false);
        btnNewWarehouse.setPreferredSize(new java.awt.Dimension(150, 30));
        btnNewWarehouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewWarehouseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewWarehouseMouseExited(evt);
            }
        });
        btnNewWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewWarehouseActionPerformed(evt);
            }
        });
        add(btnNewWarehouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        btnUpdateWarehouse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateWarehouse.setForeground(new java.awt.Color(53, 71, 73));
        btnUpdateWarehouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/updateIcon.png"))); // NOI18N
        btnUpdateWarehouse.setText("Actualizar Datos");
        btnUpdateWarehouse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnUpdateWarehouse.setContentAreaFilled(false);
        btnUpdateWarehouse.setFocusable(false);
        btnUpdateWarehouse.setPreferredSize(new java.awt.Dimension(150, 30));
        btnUpdateWarehouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateWarehouseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateWarehouseMouseExited(evt);
            }
        });
        btnUpdateWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateWarehouseActionPerformed(evt);
            }
        });
        add(btnUpdateWarehouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        btnDeleteWarehouse1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteWarehouse1.setForeground(new java.awt.Color(53, 71, 73));
        btnDeleteWarehouse1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteIcon.png"))); // NOI18N
        btnDeleteWarehouse1.setText("Eliminar");
        btnDeleteWarehouse1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnDeleteWarehouse1.setContentAreaFilled(false);
        btnDeleteWarehouse1.setFocusable(false);
        btnDeleteWarehouse1.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDeleteWarehouse1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteWarehouse1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteWarehouse1MouseExited(evt);
            }
        });
        btnDeleteWarehouse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteWarehouse1ActionPerformed(evt);
            }
        });
        add(btnDeleteWarehouse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewWarehouseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewWarehouseMouseEntered
        customizeButton.setHandCursor(btnNewWarehouse);
        customizeButton.stylizeModuleButton(btnNewWarehouse, 14);
    }//GEN-LAST:event_btnNewWarehouseMouseEntered

    private void btnNewWarehouseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewWarehouseMouseExited
        customizeButton.normalStyleModuleButton(btnNewWarehouse, 12);
    }//GEN-LAST:event_btnNewWarehouseMouseExited

    private void btnNewWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewWarehouseActionPerformed
         
    }//GEN-LAST:event_btnNewWarehouseActionPerformed

    private void btnUpdateWarehouseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateWarehouseMouseEntered
        customizeButton.setHandCursor(btnUpdateWarehouse);
        customizeButton.stylizeModuleButton(btnUpdateWarehouse, 14);
    }//GEN-LAST:event_btnUpdateWarehouseMouseEntered

    private void btnUpdateWarehouseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateWarehouseMouseExited
        customizeButton.normalStyleModuleButton(btnUpdateWarehouse, 12);
    }//GEN-LAST:event_btnUpdateWarehouseMouseExited

    private void btnUpdateWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateWarehouseActionPerformed
       
    }//GEN-LAST:event_btnUpdateWarehouseActionPerformed

    private void btnDeleteWarehouse1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteWarehouse1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteWarehouse1MouseEntered

    private void btnDeleteWarehouse1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteWarehouse1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteWarehouse1MouseExited

    private void btnDeleteWarehouse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteWarehouse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteWarehouse1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteWarehouse1;
    private javax.swing.JButton btnNewWarehouse;
    private javax.swing.JButton btnUpdateWarehouse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtWarehouses;
    // End of variables declaration//GEN-END:variables
}
