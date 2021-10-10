package Componentes.MainWindows;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.UserController;
import helpers.ConfirmDialog;
import helpers.TextPrompt;
import helpers.CustomizeButtons;

public class LoginWindow extends javax.swing.JFrame {

    private final CustomizeButtons customizeButton;  
    
    public LoginWindow() {

        customizeButton = new CustomizeButtons();
        initComponents(); 

        // Placeholders
        TextPrompt tpUsername = new TextPrompt("Usuario", jtUsername);
        TextPrompt tpPassword = new TextPrompt("Contraseña", jtPassword);
        // Aligning placeholders to center
        tpUsername.setHorizontalAlignment(JLabel.CENTER);
        tpPassword.setHorizontalAlignment(JLabel.CENTER);

        // Enter key pressed
        getRootPane().setDefaultButton(btnLogin); 

        jpLogin.setBackground(Color.WHITE);
        jtUsername.requestFocus();
    }

    public void showMessage(JPanel panel, String message) {
        ConfirmDialog cd = new ConfirmDialog(panel, message);
        cd.btn1.setVisible(false);
        cd.btn2.setText("Aceptar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLogin = new javax.swing.JPanel();
        jlIcon = new javax.swing.JLabel();
        jlTitle = new javax.swing.JLabel();
        jpTextFields = new javax.swing.JPanel();
        jtUsername = new javax.swing.JTextField();
        jtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jlTitleEnterprise = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setBackground(new java.awt.Color(0, 51, 102));
        setIconImage(new ImageIcon(getClass().getResource("/source/drugstore_icon.jpg")).getImage());
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(400, 450));
        setUndecorated(true);
        setSize(new java.awt.Dimension(400, 200));

        jpLogin.setBackground(new java.awt.Color(255, 255, 255));
        jpLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 5));
        jpLogin.setForeground(new java.awt.Color(53, 71, 73));
        jpLogin.setMinimumSize(new java.awt.Dimension(400, 450));
        jpLogin.setPreferredSize(new java.awt.Dimension(400, 450));
        jpLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/drogueria icono.jpg"))); // NOI18N
        jpLogin.add(jlIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jlTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(53, 71, 73));
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("Iniciar Sesión");
        jlTitle.setPreferredSize(new java.awt.Dimension(390, 44));
        jpLogin.add(jlTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 90, -1, -1));

        jpTextFields.setOpaque(false);
        jpTextFields.setPreferredSize(new java.awt.Dimension(390, 75));

        jtUsername.setFont(new java.awt.Font("Lucida Console", 2, 18)); // NOI18N
        jtUsername.setForeground(new java.awt.Color(53, 71, 73));
        jtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(34, 138, 147)));
        jtUsername.setPreferredSize(new java.awt.Dimension(260, 30));
        jpTextFields.add(jtUsername);

        jtPassword.setFont(new java.awt.Font("Lucida Console", 2, 18)); // NOI18N
        jtPassword.setForeground(new java.awt.Color(53, 71, 73));
        jtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(34, 138, 147)));
        jtPassword.setPreferredSize(new java.awt.Dimension(260, 30));
        jpTextFields.add(jtPassword);

        jpLogin.add(jpTextFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 240, -1, -1));

        btnLogin.setBackground(new java.awt.Color(53, 71, 73));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(53, 71, 73));
        btnLogin.setText("Ingresar");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnLogin.setContentAreaFilled(false);
        btnLogin.setPreferredSize(new java.awt.Dimension(150, 30));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jpLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 340, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(390, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 138, 147));
        jLabel1.setText("Desarrollador por: Miguel Angel Correa - Copyright 2022");
        jLabel1.setPreferredSize(new java.awt.Dimension(310, 20));
        jPanel1.add(jLabel1);

        jpLogin.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 410, -1, -1));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(53, 71, 73));
        btnExit.setText("  x  ");
        btnExit.setToolTipText("Salir");
        btnExit.setBorder(null);
        btnExit.setContentAreaFilled(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setPreferredSize(new java.awt.Dimension(40, 30));
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
        jpLogin.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jlTitleEnterprise.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlTitleEnterprise.setForeground(new java.awt.Color(34, 138, 147));
        jlTitleEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitleEnterprise.setText("DROGUERIA SAN MIGUEL");
        jlTitleEnterprise.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlTitleEnterprise.setPreferredSize(new java.awt.Dimension(390, 30));
        jpLogin.add(jlTitleEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 40, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 138, 147));
        jLabel2.setText("LARANDIA");
        jpLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 70, 20));

        getContentPane().add(jpLogin, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        String messageLabel = "<html><body> Está seguro que deseas salir <br> <center>del programa?</center>";
        ConfirmDialog cd = new ConfirmDialog(jpLogin, messageLabel);
        cd.btn1.setText("Salir");
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String username = jtUsername.getText();                         
        String password = String.valueOf(jtPassword.getPassword());     

        if (!username.equals("") && !password.equals("")) {
            if (password.length() > 5) {
                UserController userController = new UserController();
                String validateSession = userController.validateSession(username, password);
                boolean userExists = validateSession.equals("");

                if (!userExists) {
                    if (validateSession.equals("Active")) {
                        MainWindow mainWindow = new MainWindow();
                        mainWindow.setVisible(true);
                        mainWindow.setLocationRelativeTo(null);
                        dispose();
                    } else {
                        showMessage(jpLogin, "Usuario no se encuentra activo.");
                    }
                } else {
                    showMessage(jpLogin, "No existe registro de " + username);

                }
                jtUsername.setText("");
                jtPassword.setText("");
            } else {
                showMessage(jpLogin, "Contraseña incorrecta.");
                jtPassword.setText("");
            }
        } else {
            showMessage(jpLogin, "Debe llenar los campos obligatorios");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        customizeButton.setHandCursor(btnLogin);
        customizeButton.stylizeModuleButton(btnLogin, 16); 
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        customizeButton.setHandCursor(btnExit);
        customizeButton.stylizeModuleButton(btnExit, 18); 
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        customizeButton.normalStyleModuleButton(btnExit, 18);/*btnExit.setFont(underlineObj.underlineText(btnExit, -1, 18, TextAttribute.WEIGHT_REGULAR));*/
        btnExit.setBorder(null);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        customizeButton.normalStyleModuleButton(btnLogin, 14);
        //btnLogin.setBorder(null); 
    }//GEN-LAST:event_btnLoginMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlIcon;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JLabel jlTitleEnterprise;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JPanel jpTextFields;
    private javax.swing.JPasswordField jtPassword;
    private javax.swing.JTextField jtUsername;
    // End of variables declaration//GEN-END:variables
}
