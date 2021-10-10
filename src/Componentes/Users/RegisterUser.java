package Componentes.Users;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

//import org.netbeans.lib.awtextra.AbsoluteConstraints;

import Controller.UserController;
import helpers.ConfirmDialog;
import helpers.CustomizeButtons;
import helpers.UnderlineTexts;
import Models.UserModel;

public class RegisterUser extends JPanel implements Interfaces.Observable{

    private final Color primaryColor;    
    private CustomizeButtons customizeButton;
    private String operationObserved;
    private ArrayList<Interfaces.Observer> observerList;

    public RegisterUser() {
        customizeButton = new CustomizeButtons();
        primaryColor = customizeButton.getprimaryColor();
        this.observerList = new ArrayList();

        initComponents();
    }

    //  Observable methods
    @Override
    public void attachObserver(Interfaces.Observer observer){ 
        this.observerList.add(observer); 
    }
    
    @Override
    public void notifyChange(){  
        for(Interfaces.Observer obs : this.observerList){ 
            obs.update(this.operationObserved);            
        }
    }
    //------------------------------------------------------------
    
    

    /*private void setHandCursor(Component obj) {
        obj.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    private void stylizeModuleButton(javax.swing.JButton button, int fontSize, Color borderColor) {
        button.setBorder(BorderFactory.createMatteBorder(1, 1, 3, 3, borderColor));
        button.setFont(underlineObj.underlineText(button, this.underlineDashed, fontSize, this.weightBold));
    }

    private void normalStyleModuleButton(javax.swing.JButton button, int fontSize, Color borderColor) {
        button.setFont(underlineObj.underlineText(button, this.noUnderline, fontSize, this.weightRegular));
        button.setBorder(BorderFactory.createLineBorder(borderColor, 2));
    }*/

    private void showMessage(String message) {
        ConfirmDialog cd = new ConfirmDialog(this, message);
        cd.btn1.setVisible(false);
        cd.btn2.setText("Aceptar"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpFormRegister = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtUsername = new javax.swing.JTextField();
        jtOwner = new javax.swing.JTextField();
        jtPassword = new javax.swing.JPasswordField();
        jtConfirmPassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1010, 550));
        setMinimumSize(new java.awt.Dimension(1010, 550));
        setPreferredSize(new java.awt.Dimension(1010, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(34, 138, 147));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR NUEVO USUARIO");
        jLabel1.setMaximumSize(new java.awt.Dimension(1140, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(1140, 30));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 40));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 0, -1, -1));

        jpFormRegister.setBackground(new java.awt.Color(255, 255, 255));
        jpFormRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 2));
        jpFormRegister.setPreferredSize(new java.awt.Dimension(600, 380));
        jpFormRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre de Usuario:");
        jLabel4.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormRegister.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 105, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Contraseña:");
        jLabel6.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormRegister.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Confirmar Contraseña:");
        jLabel7.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormRegister.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 235, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombres Completos:");
        jLabel5.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormRegister.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jtUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtUsername.setForeground(new java.awt.Color(53, 71, 73));
        jtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147)));
        jtUsername.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormRegister.add(jtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 105, -1, -1));

        jtOwner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtOwner.setForeground(new java.awt.Color(53, 71, 73));
        jtOwner.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtOwner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147)));
        jtOwner.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormRegister.add(jtOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtPassword.setForeground(new java.awt.Color(53, 71, 73));
        jtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147)));
        jtPassword.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormRegister.add(jtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        jtConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtConfirmPassword.setForeground(new java.awt.Color(53, 71, 73));
        jtConfirmPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147)));
        jtConfirmPassword.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormRegister.add(jtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 235, -1, -1));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(53, 71, 73));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/saveIcon.png"))); // NOI18N
        btnSave.setText("Guardar");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 2));
        btnSave.setContentAreaFilled(false);
        btnSave.setIconTextGap(15);
        btnSave.setPreferredSize(new java.awt.Dimension(130, 40));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jpFormRegister.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        btnCancel.setBackground(new java.awt.Color(255, 0, 102));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 0, 0));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancelIcon.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnCancel.setContentAreaFilled(false);
        btnCancel.setIconTextGap(15);
        btnCancel.setPreferredSize(new java.awt.Dimension(130, 40));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jpFormRegister.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        add(jpFormRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 46, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.operationObserved = "Nuevo Usuario";
        notifyChange();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        customizeButton.normalStyleModuleCancelButton(btnCancel, 14);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        customizeButton.setHandCursor(btnCancel);
        customizeButton.stylizeModuleCancelButton(btnCancel, 16);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String owner = jtOwner.getText();
        String username = jtUsername.getText();
        String password = String.valueOf(jtPassword.getPassword());
        String confirmPassword = String.valueOf(jtConfirmPassword.getPassword());

        if(!password.equals("") && !confirmPassword.equals((""))){
            if(password.length() < 6 || confirmPassword.length() < 6){
                showMessage("<html><body><center>La contraseña debe ser mayor a 6 caracteres.");
                return;
            }
            if (password.equals(confirmPassword)) {
                if (owner.length() > 0 && username.length() > 0) {

                    UserModel user = new UserModel(username, owner, password);
                    boolean result = new UserController().createUser(user);

                    if (result) {
                        showMessage("Usuario creado satisfactoriamente.");
                        this.operationObserved = "Nuevo Usuario";
                        notifyChange();
                    } else {
                        showMessage("No se logro crear usuario.");
                    }

                } else {
                    showMessage("<html><body>Todos los campos deben ser <br>diligenciados por completo.");
                }
            } else {
                showMessage("Las contraseñas no coinciden.");
            }
        }else{
            showMessage("<html><body>Todos los campos deben ser <br>diligenciados por completo.");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        customizeButton.normalStyleModuleButton(btnSave, 14);
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        customizeButton.setHandCursor(btnSave);
        customizeButton.stylizeModuleButton(btnSave, 16);
    }//GEN-LAST:event_btnSaveMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jpFormRegister;
    private javax.swing.JPasswordField jtConfirmPassword;
    private javax.swing.JTextField jtOwner;
    private javax.swing.JPasswordField jtPassword;
    private javax.swing.JTextField jtUsername;
    // End of variables declaration//GEN-END:variables
}
