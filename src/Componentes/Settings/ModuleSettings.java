package Componentes.Settings; 

import javax.swing.JButton;
import javax.swing.JPanel;

import helpers.CustomizeButtons;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class ModuleSettings extends javax.swing.JPanel {

    private final CustomizeButtons customizeButton;
    private final int [] activeModules;
    
    private Categories category;
    private Company company;
    private Labs lab;
    private Lots lot;
    private Package package_;
    private Semaforo semaforo;
    private Units unit;
    private Warehouses warehouse;
    
    
    public ModuleSettings() {
        
        customizeButton = new CustomizeButtons();        
        activeModules = new int [8];
        
        initComponents();
        this.btnReturn.setVisible(false);
        
    }

    private void setHandCursor(JButton button){
        customizeButton.setHandCursor(button);
    }
    
    private void stylizeButton(JButton button){
        customizeButton.stylizeModuleButton(button, 16);
        customizeButton.setBorderBottom(button);
    }
    
    private void normalizeButton(JButton button){
        customizeButton.normalStyleModuleButton(button, 14);
        button.setBorder(null);
    }
    
    private void changePanel(JPanel panel){
        this.jpHome.setVisible(false);
        this.btnReturn.setVisible(true);
        this.jpHomeSettings.add(panel, new AbsoluteConstraints(0, 40, 1140, 680));
    }
    
    private void removePanel(){
        for(int i=0; i<this.activeModules.length; i++){
            if(this.activeModules[i] == 1){
                switch(i){
                case 0:
                    this.category.setVisible(false);
                    this.jpHomeSettings.remove(this.category);
                    this.activeModules[i] = 0;
                    break;
                case 1:
                    this.company.setVisible(false);
                    this.jpHomeSettings.remove(this.company);
                    this.activeModules[i] = 0;
                    break;
                case 2:
                    this.lab.setVisible(false);
                    this.jpHomeSettings.remove(this.lab);
                    this.activeModules[i] = 0;
                    break;
                case 3:
                    this.lot.setVisible(false);
                    this.jpHomeSettings.remove(this.lot);
                    this.activeModules[i] = 0;
                    break;
                case 4:
                    this.package_.setVisible(false);
                    this.jpHomeSettings.remove(this.package_);
                    this.activeModules[i] = 0;
                    break;
                case 5:
                    this.semaforo.setVisible(false);
                    this.jpHomeSettings.remove(this.semaforo);
                    this.activeModules[i] = 0;
                    break;
                case 6:
                    this.unit.setVisible(false);
                    this.jpHomeSettings.remove(this.unit);
                    this.activeModules[i] = 0;
                    break;
                case 7:
                    this.warehouse.setVisible(false);
                    this.jpHomeSettings.remove(this.warehouse);
                    this.activeModules[i] = 0;
                    break;
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpHomeSettings = new javax.swing.JPanel();
        jpHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnUnitsModule = new javax.swing.JButton();
        btnPackageModule = new javax.swing.JButton();
        btnCategoriesModule = new javax.swing.JButton();
        btnWarehouses = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSemaforo = new javax.swing.JButton();
        btnLots = new javax.swing.JButton();
        btnLabs = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnCompany = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 2));
        setPreferredSize(new java.awt.Dimension(1146, 786));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(34, 138, 147));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONFIGURACIÓN DEL SISTEMA");
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(1146, 60));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jpHomeSettings.setBackground(new java.awt.Color(255, 255, 255));
        jpHomeSettings.setPreferredSize(new java.awt.Dimension(1140, 680));
        jpHomeSettings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpHome.setBackground(new java.awt.Color(255, 255, 255));
        jpHome.setPreferredSize(new java.awt.Dimension(700, 420));
        jpHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(34, 138, 147));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SISTEMA");
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(700, 30));
        jpHome.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(34, 138, 147)));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUnitsModule.setBackground(new java.awt.Color(244, 235, 235));
        btnUnitsModule.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUnitsModule.setForeground(new java.awt.Color(53, 71, 73));
        btnUnitsModule.setText("Medidas");
        btnUnitsModule.setBorder(null);
        btnUnitsModule.setContentAreaFilled(false);
        btnUnitsModule.setFocusable(false);
        btnUnitsModule.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUnitsModule.setPreferredSize(new java.awt.Dimension(150, 50));
        btnUnitsModule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUnitsModuleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUnitsModuleMouseExited(evt);
            }
        });
        btnUnitsModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnitsModuleActionPerformed(evt);
            }
        });
        jPanel2.add(btnUnitsModule, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        btnPackageModule.setBackground(new java.awt.Color(244, 235, 235));
        btnPackageModule.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPackageModule.setForeground(new java.awt.Color(53, 71, 73));
        btnPackageModule.setText("Presentación");
        btnPackageModule.setBorder(null);
        btnPackageModule.setContentAreaFilled(false);
        btnPackageModule.setFocusable(false);
        btnPackageModule.setPreferredSize(new java.awt.Dimension(150, 50));
        btnPackageModule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPackageModuleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPackageModuleMouseExited(evt);
            }
        });
        btnPackageModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPackageModuleActionPerformed(evt);
            }
        });
        jPanel2.add(btnPackageModule, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        btnCategoriesModule.setBackground(new java.awt.Color(244, 235, 235));
        btnCategoriesModule.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCategoriesModule.setForeground(new java.awt.Color(53, 71, 73));
        btnCategoriesModule.setText("Categorias");
        btnCategoriesModule.setBorder(null);
        btnCategoriesModule.setContentAreaFilled(false);
        btnCategoriesModule.setFocusable(false);
        btnCategoriesModule.setPreferredSize(new java.awt.Dimension(150, 50));
        btnCategoriesModule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCategoriesModuleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCategoriesModuleMouseExited(evt);
            }
        });
        btnCategoriesModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriesModuleActionPerformed(evt);
            }
        });
        jPanel2.add(btnCategoriesModule, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        btnWarehouses.setBackground(new java.awt.Color(255, 255, 255));
        btnWarehouses.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnWarehouses.setForeground(new java.awt.Color(53, 71, 73));
        btnWarehouses.setText("Bodegas");
        btnWarehouses.setBorder(null);
        btnWarehouses.setContentAreaFilled(false);
        btnWarehouses.setFocusable(false);
        btnWarehouses.setOpaque(true);
        btnWarehouses.setPreferredSize(new java.awt.Dimension(150, 50));
        btnWarehouses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnWarehousesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnWarehousesMouseExited(evt);
            }
        });
        btnWarehouses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarehousesActionPerformed(evt);
            }
        });
        jPanel2.add(btnWarehouses, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jpHome.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel5.setBackground(new java.awt.Color(34, 138, 147));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FARMACIA");
        jLabel5.setOpaque(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(700, 30));
        jpHome.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(34, 138, 147)));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 70));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSemaforo.setBackground(new java.awt.Color(244, 235, 235));
        btnSemaforo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSemaforo.setForeground(new java.awt.Color(53, 71, 73));
        btnSemaforo.setText("Semaforización");
        btnSemaforo.setBorder(null);
        btnSemaforo.setContentAreaFilled(false);
        btnSemaforo.setFocusable(false);
        btnSemaforo.setPreferredSize(new java.awt.Dimension(150, 50));
        btnSemaforo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSemaforoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSemaforoMouseExited(evt);
            }
        });
        btnSemaforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemaforoActionPerformed(evt);
            }
        });
        jPanel3.add(btnSemaforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 10, -1, -1));

        btnLots.setBackground(new java.awt.Color(244, 235, 235));
        btnLots.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLots.setForeground(new java.awt.Color(53, 71, 73));
        btnLots.setText("Lotes");
        btnLots.setBorder(null);
        btnLots.setContentAreaFilled(false);
        btnLots.setFocusable(false);
        btnLots.setPreferredSize(new java.awt.Dimension(150, 50));
        btnLots.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLotsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLotsMouseExited(evt);
            }
        });
        btnLots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLotsActionPerformed(evt);
            }
        });
        jPanel3.add(btnLots, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 10, -1, -1));

        btnLabs.setBackground(new java.awt.Color(244, 235, 235));
        btnLabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLabs.setForeground(new java.awt.Color(53, 71, 73));
        btnLabs.setText("Laboratorios");
        btnLabs.setBorder(null);
        btnLabs.setContentAreaFilled(false);
        btnLabs.setFocusable(false);
        btnLabs.setPreferredSize(new java.awt.Dimension(150, 50));
        btnLabs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLabsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLabsMouseExited(evt);
            }
        });
        btnLabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabsActionPerformed(evt);
            }
        });
        jPanel3.add(btnLabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 10, -1, -1));

        jpHome.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        jLabel4.setBackground(new java.awt.Color(34, 138, 147));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EMPRESA");
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(700, 30));
        jpHome.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(34, 138, 147)));
        jPanel4.setPreferredSize(new java.awt.Dimension(700, 70));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCompany.setBackground(new java.awt.Color(244, 235, 235));
        btnCompany.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCompany.setForeground(new java.awt.Color(53, 71, 73));
        btnCompany.setText("Datos de la empresa");
        btnCompany.setBorder(null);
        btnCompany.setContentAreaFilled(false);
        btnCompany.setFocusable(false);
        btnCompany.setPreferredSize(new java.awt.Dimension(200, 50));
        btnCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCompanyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCompanyMouseExited(evt);
            }
        });
        btnCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompanyActionPerformed(evt);
            }
        });
        jPanel4.add(btnCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jpHome.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        jpHomeSettings.add(jpHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        add(jpHomeSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 103, -1, -1));

        btnReturn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(53, 71, 73));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/return-button.png"))); // NOI18N
        btnReturn.setText("Regresar");
        btnReturn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnReturn.setContentAreaFilled(false);
        btnReturn.setFocusable(false);
        btnReturn.setPreferredSize(new java.awt.Dimension(100, 30));
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReturnMouseExited(evt);
            }
        });
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 72, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnitsModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnitsModuleActionPerformed
        this.activeModules[6] = 1;
        unit = new Units();
        changePanel(unit);
    }//GEN-LAST:event_btnUnitsModuleActionPerformed

    private void btnPackageModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPackageModuleActionPerformed
        this.activeModules[4] = 1;
        package_ = new Package();
        changePanel(package_);
    }//GEN-LAST:event_btnPackageModuleActionPerformed

    private void btnCategoriesModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriesModuleActionPerformed
        this.activeModules[0] = 1;
        category = new Categories();
        changePanel(category);
    }//GEN-LAST:event_btnCategoriesModuleActionPerformed

    private void btnWarehousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarehousesActionPerformed
        this.activeModules[7] = 1;
        warehouse = new Warehouses();
        changePanel(warehouse);
    }//GEN-LAST:event_btnWarehousesActionPerformed

    private void btnWarehousesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWarehousesMouseEntered
        setHandCursor(btnWarehouses);
        stylizeButton(btnWarehouses);
    }//GEN-LAST:event_btnWarehousesMouseEntered

    private void btnWarehousesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWarehousesMouseExited
        normalizeButton(btnWarehouses);
    }//GEN-LAST:event_btnWarehousesMouseExited

    private void btnPackageModuleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPackageModuleMouseEntered
        setHandCursor(btnPackageModule);
        stylizeButton(btnPackageModule);
    }//GEN-LAST:event_btnPackageModuleMouseEntered

    private void btnPackageModuleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPackageModuleMouseExited
        normalizeButton(btnPackageModule);
    }//GEN-LAST:event_btnPackageModuleMouseExited

    private void btnCategoriesModuleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriesModuleMouseEntered
        setHandCursor(btnCategoriesModule);
        stylizeButton(btnCategoriesModule);
    }//GEN-LAST:event_btnCategoriesModuleMouseEntered

    private void btnCategoriesModuleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriesModuleMouseExited
        normalizeButton(btnCategoriesModule);
    }//GEN-LAST:event_btnCategoriesModuleMouseExited

    private void btnUnitsModuleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnitsModuleMouseEntered
        setHandCursor(btnUnitsModule);
        stylizeButton(btnUnitsModule);
    }//GEN-LAST:event_btnUnitsModuleMouseEntered

    private void btnUnitsModuleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnitsModuleMouseExited
        normalizeButton(btnUnitsModule);
    }//GEN-LAST:event_btnUnitsModuleMouseExited

    private void btnSemaforoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSemaforoMouseEntered
        setHandCursor(btnSemaforo);
        stylizeButton(btnSemaforo);
    }//GEN-LAST:event_btnSemaforoMouseEntered

    private void btnSemaforoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSemaforoMouseExited
        normalizeButton(btnSemaforo);
    }//GEN-LAST:event_btnSemaforoMouseExited

    private void btnSemaforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemaforoActionPerformed
        this.activeModules[5] = 1;
        semaforo = new Semaforo();
        changePanel(semaforo);
    }//GEN-LAST:event_btnSemaforoActionPerformed

    private void btnLotsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLotsMouseEntered
        setHandCursor(btnLots);
        stylizeButton(btnLots);
    }//GEN-LAST:event_btnLotsMouseEntered

    private void btnLotsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLotsMouseExited
        normalizeButton(btnLots);
    }//GEN-LAST:event_btnLotsMouseExited

    private void btnLotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLotsActionPerformed
        this.activeModules[3] = 1;
        lot = new Lots();
        changePanel(lot);
    }//GEN-LAST:event_btnLotsActionPerformed

    private void btnLabsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLabsMouseEntered
        setHandCursor(btnLabs);
        stylizeButton(btnLabs);
    }//GEN-LAST:event_btnLabsMouseEntered

    private void btnLabsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLabsMouseExited
        normalizeButton(btnLabs);
    }//GEN-LAST:event_btnLabsMouseExited

    private void btnLabsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabsActionPerformed
        this.activeModules[2] = 1;
        lab = new Labs();
        changePanel(lab);
    }//GEN-LAST:event_btnLabsActionPerformed

    private void btnCompanyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompanyMouseEntered
        setHandCursor(btnCompany);
        stylizeButton(btnCompany);
    }//GEN-LAST:event_btnCompanyMouseEntered

    private void btnCompanyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompanyMouseExited
        normalizeButton(btnCompany);
    }//GEN-LAST:event_btnCompanyMouseExited

    private void btnCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompanyActionPerformed
        this.activeModules[1] = 1;
        company = new Company();
        changePanel(company);
    }//GEN-LAST:event_btnCompanyActionPerformed

    private void btnReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseEntered
        customizeButton.setHandCursor(btnReturn);
        customizeButton.stylizeModuleButton(btnReturn, 14);
    }//GEN-LAST:event_btnReturnMouseEntered

    private void btnReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseExited
        customizeButton.normalStyleModuleButton(btnReturn, 12);
    }//GEN-LAST:event_btnReturnMouseExited

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.jpHome.setVisible(true);
        this.removePanel();
        this.btnReturn.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoriesModule;
    private javax.swing.JButton btnCompany;
    private javax.swing.JButton btnLabs;
    private javax.swing.JButton btnLots;
    private javax.swing.JButton btnPackageModule;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSemaforo;
    private javax.swing.JButton btnUnitsModule;
    private javax.swing.JButton btnWarehouses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpHome;
    private javax.swing.JPanel jpHomeSettings;
    // End of variables declaration//GEN-END:variables
}
