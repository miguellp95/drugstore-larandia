package Componentes.Settings;

import helpers.CustomizeButtons;

public class Categories extends javax.swing.JPanel {

    CustomizeButtons customizeButton = new CustomizeButtons();
    
    public Categories() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNewCategory = new javax.swing.JButton();
        btnUpdateCategory = new javax.swing.JButton();
        btnDeleteCategory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCategories = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1140, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 71, 73));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Categorias");
        jLabel1.setMaximumSize(new java.awt.Dimension(1140, 60));
        jLabel1.setMinimumSize(new java.awt.Dimension(1140, 60));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1140, 60));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        btnNewCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNewCategory.setForeground(new java.awt.Color(53, 71, 73));
        btnNewCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addIcon.png"))); // NOI18N
        btnNewCategory.setText("Nueva Categoria");
        btnNewCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnNewCategory.setContentAreaFilled(false);
        btnNewCategory.setFocusable(false);
        btnNewCategory.setPreferredSize(new java.awt.Dimension(150, 30));
        btnNewCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewCategoryMouseExited(evt);
            }
        });
        btnNewCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCategoryActionPerformed(evt);
            }
        });
        add(btnNewCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        btnUpdateCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateCategory.setForeground(new java.awt.Color(53, 71, 73));
        btnUpdateCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/updateIcon.png"))); // NOI18N
        btnUpdateCategory.setText("Actualizar Datos");
        btnUpdateCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnUpdateCategory.setContentAreaFilled(false);
        btnUpdateCategory.setFocusable(false);
        btnUpdateCategory.setPreferredSize(new java.awt.Dimension(150, 30));
        btnUpdateCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateCategoryMouseExited(evt);
            }
        });
        btnUpdateCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCategoryActionPerformed(evt);
            }
        });
        add(btnUpdateCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        btnDeleteCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteCategory.setForeground(new java.awt.Color(53, 71, 73));
        btnDeleteCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteIcon.png"))); // NOI18N
        btnDeleteCategory.setText("Eliminar");
        btnDeleteCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnDeleteCategory.setContentAreaFilled(false);
        btnDeleteCategory.setFocusable(false);
        btnDeleteCategory.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDeleteCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteCategoryMouseExited(evt);
            }
        });
        btnDeleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCategoryActionPerformed(evt);
            }
        });
        add(btnDeleteCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(740, 250));

        jtCategories.setForeground(new java.awt.Color(53, 71, 73));
        jtCategories.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Categoria", "Descripcion", "Estado"
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
        jtCategories.setGridColor(new java.awt.Color(34, 138, 147));
        jtCategories.setInheritsPopupMenu(true);
        jtCategories.setMaximumSize(new java.awt.Dimension(740, 200));
        jtCategories.setMinimumSize(new java.awt.Dimension(740, 200));
        jtCategories.setPreferredSize(new java.awt.Dimension(740, 200));
        jtCategories.setRowHeight(25);
        jtCategories.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jtCategories.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jtCategories);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewCategoryMouseEntered
        customizeButton.setHandCursor(btnNewCategory);
        customizeButton.stylizeModuleButton(btnNewCategory, 14);
    }//GEN-LAST:event_btnNewCategoryMouseEntered

    private void btnNewCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewCategoryMouseExited
        customizeButton.normalStyleModuleButton(btnNewCategory, 12);
    }//GEN-LAST:event_btnNewCategoryMouseExited

    private void btnNewCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCategoryActionPerformed

    }//GEN-LAST:event_btnNewCategoryActionPerformed

    private void btnUpdateCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateCategoryMouseEntered
        customizeButton.setHandCursor(btnUpdateCategory);
        customizeButton.stylizeModuleButton(btnUpdateCategory, 14);
    }//GEN-LAST:event_btnUpdateCategoryMouseEntered

    private void btnUpdateCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateCategoryMouseExited
        customizeButton.normalStyleModuleButton(btnUpdateCategory, 12);
    }//GEN-LAST:event_btnUpdateCategoryMouseExited

    private void btnUpdateCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCategoryActionPerformed

    }//GEN-LAST:event_btnUpdateCategoryActionPerformed

    private void btnDeleteCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCategoryMouseEntered
        customizeButton.setHandCursor(btnDeleteCategory);
        customizeButton.stylizeModuleButton(btnDeleteCategory, 14);
    }//GEN-LAST:event_btnDeleteCategoryMouseEntered

    private void btnDeleteCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCategoryMouseExited
        customizeButton.normalStyleModuleButton(btnDeleteCategory, 12);
    }//GEN-LAST:event_btnDeleteCategoryMouseExited

    private void btnDeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCategoryActionPerformed

    }//GEN-LAST:event_btnDeleteCategoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteCategory;
    private javax.swing.JButton btnNewCategory;
    private javax.swing.JButton btnUpdateCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCategories;
    // End of variables declaration//GEN-END:variables
}
