package Componentes.MainWindows;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

import org.netbeans.lib.awtextra.AbsoluteConstraints;

import Componentes.Buys.ModuleBuys;
import Componentes.Data.ModuleData;
import Componentes.Help.ModuleHelp;
import Componentes.Inventory.ModuleInventory;
import Componentes.Providers.ModuleProvider;
import Componentes.Reports.ModuleReports;
import Componentes.Sells.ModuleSells;
import Componentes.Settings.ModuleSettings;
import Componentes.Users.ModuleUser;
import helpers.CustomizeButtons;
 
public class MainWindow extends javax.swing.JFrame implements Interfaces.Observer {

    private final CustomizeButtons customizeButton;

    public MainWindow() {
        customizeButton = new CustomizeButtons();
        initComponents();

        btnMinimize.setText("");
        btnMinimize.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/source/dash.png")).getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));

        setLocationRelativeTo(null);
    }

    /*Method to update the observer*/
    @Override
    public void update(String itemChanged) { 
        if (itemChanged.equals("Nuevo Usuario") || itemChanged.equals("Usuario Actualizado")){
           addComponentModule(new ModuleUser());
        } 
    }

    private void addComponentModule(javax.swing.JPanel panel) {
        jpCenterSide.removeAll();
        jpCenterSide.add(panel, new AbsoluteConstraints(2, 2, 1146, 786));
        jpCenterSide.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMainWindow = new javax.swing.JPanel();
        jpMainNorth = new javax.swing.JPanel();
        btnMinimize = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jpTitle = new javax.swing.JPanel();
        mainIcon = new javax.swing.JLabel();
        jlDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlNameLegal = new javax.swing.JLabel();
        jlNitNumber = new javax.swing.JLabel();
        jpMainCenter = new javax.swing.JPanel();
        jpLeftSide = new javax.swing.JPanel();
        btnModuleSells = new javax.swing.JButton();
        btnModuleBuys = new javax.swing.JButton();
        btnModuleInventory = new javax.swing.JButton();
        btnModuleUser = new javax.swing.JButton();
        btnModuleProviders = new javax.swing.JButton();
        btnModuleReports = new javax.swing.JButton();
        btnModuleData = new javax.swing.JButton();
        btnModuleSettings = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jpCenterSide = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/source/drugstore_icon.jpg")).getImage()
        );
        setUndecorated(true);

        jpMainWindow.setBackground(new java.awt.Color(255, 255, 255));
        jpMainWindow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 5));
        jpMainWindow.setMaximumSize(new java.awt.Dimension(1320, 920));
        jpMainWindow.setMinimumSize(new java.awt.Dimension(1320, 920));
        jpMainWindow.setPreferredSize(new java.awt.Dimension(1320, 920));
        jpMainWindow.setLayout(new java.awt.BorderLayout());

        jpMainNorth.setBackground(new java.awt.Color(255, 255, 255));
        jpMainNorth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(34, 138, 147)));
        jpMainNorth.setPreferredSize(new java.awt.Dimension(1320, 120));
        jpMainNorth.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimize.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMinimize.setForeground(new java.awt.Color(53, 71, 73));
        btnMinimize.setText("-");
        btnMinimize.setBorder(null);
        btnMinimize.setContentAreaFilled(false);
        btnMinimize.setFocusable(false);
        btnMinimize.setPreferredSize(new java.awt.Dimension(30, 30));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseExited(evt);
            }
        });
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });
        jpMainNorth.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 5, -1, -1));

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(53, 71, 73));
        btnExit.setText("x");
        btnExit.setBorder(null);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusable(false);
        btnExit.setPreferredSize(new java.awt.Dimension(30, 30));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jpMainNorth.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 5, -1, -1));

        jpTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        jpTitle.setOpaque(false);
        jpTitle.setPreferredSize(new java.awt.Dimension(385, 106));
        jpTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        mainIcon.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mainIcon.setForeground(new java.awt.Color(53, 71, 73));
        mainIcon.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        mainIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/drogueria icono.jpg"))); // NOI18N
        mainIcon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jpTitle.add(mainIcon);

        jpMainNorth.add(jpTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 150, -1));

        jlDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDate.setForeground(new java.awt.Color(53, 71, 73));
        jlDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDate.setText("DD / MM / AAAA");
        jlDate.setPreferredSize(new java.awt.Dimension(200, 30));
        jpMainNorth.add(jlDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 138, 147));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DROGUERIA SAN MIGUEL LARANDIA");
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 30));
        jpMainNorth.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jlNameLegal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNameLegal.setForeground(new java.awt.Color(53, 71, 73));
        jlNameLegal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNameLegal.setText("JUAN RICARDO CORREA CHIMBACO");
        jlNameLegal.setPreferredSize(new java.awt.Dimension(500, 30));
        jpMainNorth.add(jlNameLegal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jlNitNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlNitNumber.setForeground(new java.awt.Color(53, 71, 73));
        jlNitNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNitNumber.setText("NIT: 1.117.530.849");
        jlNitNumber.setPreferredSize(new java.awt.Dimension(500, 20));
        jpMainNorth.add(jlNitNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jpMainWindow.add(jpMainNorth, java.awt.BorderLayout.NORTH);

        jpMainCenter.setOpaque(false);
        jpMainCenter.setLayout(new java.awt.BorderLayout(0, 10));

        jpLeftSide.setBackground(new java.awt.Color(255, 255, 255));
        jpLeftSide.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(34, 138, 147)), "Modulos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(34, 138, 147))); // NOI18N
        jpLeftSide.setMaximumSize(new java.awt.Dimension(116, 32767));
        jpLeftSide.setMinimumSize(new java.awt.Dimension(150, 62));
        jpLeftSide.setOpaque(false);
        jpLeftSide.setPreferredSize(new java.awt.Dimension(160, 100));
        jpLeftSide.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        btnModuleSells.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModuleSells.setForeground(new java.awt.Color(53, 71, 73));
        btnModuleSells.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/sellsIcon.png"))); // NOI18N
        btnModuleSells.setText("Ventas");
        btnModuleSells.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 138, 147), 2, true));
        btnModuleSells.setContentAreaFilled(false);
        btnModuleSells.setFocusable(false);
        btnModuleSells.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuleSells.setPreferredSize(new java.awt.Dimension(120, 70));
        btnModuleSells.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuleSells.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModuleSellsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModuleSellsMouseExited(evt);
            }
        });
        btnModuleSells.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuleSellsActionPerformed(evt);
            }
        });
        jpLeftSide.add(btnModuleSells);

        btnModuleBuys.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModuleBuys.setForeground(new java.awt.Color(53, 71, 73));
        btnModuleBuys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/buysIcon.png"))); // NOI18N
        btnModuleBuys.setText("Compras");
        btnModuleBuys.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 138, 147), 2, true));
        btnModuleBuys.setContentAreaFilled(false);
        btnModuleBuys.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuleBuys.setPreferredSize(new java.awt.Dimension(120, 70));
        btnModuleBuys.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuleBuys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModuleBuysMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModuleBuysMouseExited(evt);
            }
        });
        btnModuleBuys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuleBuysActionPerformed(evt);
            }
        });
        jpLeftSide.add(btnModuleBuys);

        btnModuleInventory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModuleInventory.setForeground(new java.awt.Color(53, 71, 73));
        btnModuleInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/inventoryIcon.png"))); // NOI18N
        btnModuleInventory.setText("Inventario");
        btnModuleInventory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 138, 147), 2, true));
        btnModuleInventory.setContentAreaFilled(false);
        btnModuleInventory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuleInventory.setPreferredSize(new java.awt.Dimension(120, 70));
        btnModuleInventory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuleInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModuleInventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModuleInventoryMouseExited(evt);
            }
        });
        btnModuleInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuleInventoryActionPerformed(evt);
            }
        });
        jpLeftSide.add(btnModuleInventory);

        btnModuleUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModuleUser.setForeground(new java.awt.Color(53, 71, 73));
        btnModuleUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/usersIcon.png"))); // NOI18N
        btnModuleUser.setText("Usuarios");
        btnModuleUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 138, 147), 2, true));
        btnModuleUser.setContentAreaFilled(false);
        btnModuleUser.setFocusable(false);
        btnModuleUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuleUser.setPreferredSize(new java.awt.Dimension(120, 70));
        btnModuleUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuleUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModuleUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModuleUserMouseExited(evt);
            }
        });
        btnModuleUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuleUserActionPerformed(evt);
            }
        });
        jpLeftSide.add(btnModuleUser);

        btnModuleProviders.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModuleProviders.setForeground(new java.awt.Color(53, 71, 73));
        btnModuleProviders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/providerIcon.png"))); // NOI18N
        btnModuleProviders.setText("Contactos");
        btnModuleProviders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 138, 147), 2, true));
        btnModuleProviders.setContentAreaFilled(false);
        btnModuleProviders.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuleProviders.setPreferredSize(new java.awt.Dimension(120, 70));
        btnModuleProviders.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuleProviders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModuleProvidersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModuleProvidersMouseExited(evt);
            }
        });
        btnModuleProviders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuleProvidersActionPerformed(evt);
            }
        });
        jpLeftSide.add(btnModuleProviders);

        btnModuleReports.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModuleReports.setForeground(new java.awt.Color(53, 71, 73));
        btnModuleReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/reportsIcon.png"))); // NOI18N
        btnModuleReports.setText("Reportes");
        btnModuleReports.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 138, 147), 2, true));
        btnModuleReports.setContentAreaFilled(false);
        btnModuleReports.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuleReports.setPreferredSize(new java.awt.Dimension(120, 70));
        btnModuleReports.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuleReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModuleReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModuleReportsMouseExited(evt);
            }
        });
        btnModuleReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuleReportsActionPerformed(evt);
            }
        });
        jpLeftSide.add(btnModuleReports);

        btnModuleData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModuleData.setForeground(new java.awt.Color(53, 71, 73));
        btnModuleData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/dataICon.png"))); // NOI18N
        btnModuleData.setText("Datos");
        btnModuleData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 138, 147), 2, true));
        btnModuleData.setContentAreaFilled(false);
        btnModuleData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuleData.setPreferredSize(new java.awt.Dimension(120, 70));
        btnModuleData.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuleData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModuleDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModuleDataMouseExited(evt);
            }
        });
        btnModuleData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuleDataActionPerformed(evt);
            }
        });
        jpLeftSide.add(btnModuleData);

        btnModuleSettings.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModuleSettings.setForeground(new java.awt.Color(53, 71, 73));
        btnModuleSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/settingsIcon.png"))); // NOI18N
        btnModuleSettings.setText("Configurar");
        btnModuleSettings.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 138, 147), 2, true));
        btnModuleSettings.setContentAreaFilled(false);
        btnModuleSettings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuleSettings.setPreferredSize(new java.awt.Dimension(120, 70));
        btnModuleSettings.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuleSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModuleSettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModuleSettingsMouseExited(evt);
            }
        });
        btnModuleSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuleSettingsActionPerformed(evt);
            }
        });
        jpLeftSide.add(btnModuleSettings);

        btnHelp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHelp.setForeground(new java.awt.Color(53, 71, 73));
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/helpIcon.png"))); // NOI18N
        btnHelp.setText("Ayuda");
        btnHelp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 138, 147), 2, true));
        btnHelp.setContentAreaFilled(false);
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setPreferredSize(new java.awt.Dimension(120, 70));
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHelpMouseExited(evt);
            }
        });
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jpLeftSide.add(btnHelp);

        jpMainCenter.add(jpLeftSide, java.awt.BorderLayout.LINE_START);

        jpCenterSide.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 2), " ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP));
        jpCenterSide.setMaximumSize(new java.awt.Dimension(1140, 780));
        jpCenterSide.setOpaque(false);
        jpCenterSide.setPreferredSize(new java.awt.Dimension(1150, 790));
        jpCenterSide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpMainCenter.add(jpCenterSide, java.awt.BorderLayout.CENTER);

        jpMainWindow.add(jpMainCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpMainWindow, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        customizeButton.setHandCursor(btnExit);
        customizeButton.stylizeModuleButton(btnExit, 20);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        customizeButton.setHandCursor(btnMinimize);
        customizeButton.stylizeModuleButton(btnMinimize, 20);
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        customizeButton.normalStyleModuleButton(btnExit, 18);
        btnExit.setBorder(null);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited
        customizeButton.normalStyleModuleButton(btnMinimize, 18);
        btnMinimize.setBorder(null);
    }//GEN-LAST:event_btnMinimizeMouseExited

    private void btnModuleUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleUserMouseEntered
        customizeButton.setHandCursor(btnModuleUser);
        customizeButton.stylizeModuleButton(btnModuleUser, 18);
    }//GEN-LAST:event_btnModuleUserMouseEntered

    private void btnModuleUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleUserMouseExited
        customizeButton.normalStyleModuleButton(btnModuleUser, 14);
    }//GEN-LAST:event_btnModuleUserMouseExited

    private void btnModuleSellsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleSellsMouseEntered
        customizeButton.setHandCursor(btnModuleSells);
        customizeButton.stylizeModuleButton(btnModuleSells, 18);
    }//GEN-LAST:event_btnModuleSellsMouseEntered

    private void btnModuleSellsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleSellsMouseExited
        customizeButton.normalStyleModuleButton(btnModuleSells, 14);
    }//GEN-LAST:event_btnModuleSellsMouseExited

    private void btnModuleBuysMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleBuysMouseEntered
        customizeButton.setHandCursor(btnModuleBuys);
        customizeButton.stylizeModuleButton(btnModuleBuys, 18);
    }//GEN-LAST:event_btnModuleBuysMouseEntered

    private void btnModuleBuysMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleBuysMouseExited
        customizeButton.normalStyleModuleButton(btnModuleBuys, 14);
    }//GEN-LAST:event_btnModuleBuysMouseExited

    private void btnModuleInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleInventoryMouseEntered
        customizeButton.setHandCursor(btnModuleInventory);
        customizeButton.stylizeModuleButton(btnModuleInventory, 18);
    }//GEN-LAST:event_btnModuleInventoryMouseEntered

    private void btnModuleInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleInventoryMouseExited
        customizeButton.normalStyleModuleButton(btnModuleInventory, 14);
    }//GEN-LAST:event_btnModuleInventoryMouseExited

    private void btnModuleReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleReportsMouseEntered
        customizeButton.setHandCursor(btnModuleReports);
        customizeButton.stylizeModuleButton(btnModuleReports, 18);
    }//GEN-LAST:event_btnModuleReportsMouseEntered

    private void btnModuleReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleReportsMouseExited
        customizeButton.normalStyleModuleButton(btnModuleReports, 14);
    }//GEN-LAST:event_btnModuleReportsMouseExited

    private void btnModuleSettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleSettingsMouseEntered
        customizeButton.setHandCursor(btnModuleSettings);
        customizeButton.stylizeModuleButton(btnModuleSettings, 18);
    }//GEN-LAST:event_btnModuleSettingsMouseEntered

    private void btnModuleSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleSettingsMouseExited
        customizeButton.normalStyleModuleButton(btnModuleSettings, 14);
    }//GEN-LAST:event_btnModuleSettingsMouseExited

    private void btnModuleProvidersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleProvidersMouseEntered
        customizeButton.setHandCursor(btnModuleProviders);
        customizeButton.stylizeModuleButton(btnModuleProviders, 18);
    }//GEN-LAST:event_btnModuleProvidersMouseEntered

    private void btnModuleProvidersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleProvidersMouseExited
        customizeButton.normalStyleModuleButton(btnModuleProviders, 14);
    }//GEN-LAST:event_btnModuleProvidersMouseExited

    private void btnModuleDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleDataMouseEntered
        customizeButton.setHandCursor(btnModuleData);
        customizeButton.stylizeModuleButton(btnModuleData, 18);
    }//GEN-LAST:event_btnModuleDataMouseEntered

    private void btnModuleDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleDataMouseExited
        customizeButton.normalStyleModuleButton(btnModuleData, 14);
    }//GEN-LAST:event_btnModuleDataMouseExited

    private void btnHelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseEntered
        customizeButton.setHandCursor(btnHelp);
        customizeButton.stylizeModuleButton(btnHelp, 18);
    }//GEN-LAST:event_btnHelpMouseEntered

    private void btnHelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseExited
        customizeButton.normalStyleModuleButton(btnHelp, 14);
    }//GEN-LAST:event_btnHelpMouseExited

    private void btnModuleUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuleUserActionPerformed
        ModuleUser moduleUser = new ModuleUser();
        moduleUser.attachObserver(this);
        addComponentModule(moduleUser);
    }//GEN-LAST:event_btnModuleUserActionPerformed

    private void btnModuleProvidersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuleProvidersActionPerformed
        addComponentModule(new ModuleProvider());

    }//GEN-LAST:event_btnModuleProvidersActionPerformed

    private void btnModuleSellsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuleSellsActionPerformed
        addComponentModule(new ModuleSells());
    }//GEN-LAST:event_btnModuleSellsActionPerformed

    private void btnModuleBuysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuleBuysActionPerformed
        addComponentModule(new ModuleBuys());
    }//GEN-LAST:event_btnModuleBuysActionPerformed

    private void btnModuleInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuleInventoryActionPerformed
        addComponentModule(new ModuleInventory());
    }//GEN-LAST:event_btnModuleInventoryActionPerformed

    private void btnModuleReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuleReportsActionPerformed
        addComponentModule(new ModuleReports());
    }//GEN-LAST:event_btnModuleReportsActionPerformed

    private void btnModuleDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuleDataActionPerformed
        addComponentModule(new ModuleData());
    }//GEN-LAST:event_btnModuleDataActionPerformed

    private void btnModuleSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuleSettingsActionPerformed
        addComponentModule(new ModuleSettings());
    }//GEN-LAST:event_btnModuleSettingsActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        addComponentModule(new ModuleHelp());
    }//GEN-LAST:event_btnHelpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnModuleBuys;
    private javax.swing.JButton btnModuleData;
    private javax.swing.JButton btnModuleInventory;
    private javax.swing.JButton btnModuleProviders;
    private javax.swing.JButton btnModuleReports;
    private javax.swing.JButton btnModuleSells;
    private javax.swing.JButton btnModuleSettings;
    private javax.swing.JButton btnModuleUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlDate;
    private javax.swing.JLabel jlNameLegal;
    private javax.swing.JLabel jlNitNumber;
    private javax.swing.JPanel jpCenterSide;
    private javax.swing.JPanel jpLeftSide;
    private javax.swing.JPanel jpMainCenter;
    private javax.swing.JPanel jpMainNorth;
    private javax.swing.JPanel jpMainWindow;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JLabel mainIcon;
    // End of variables declaration//GEN-END:variables
}
