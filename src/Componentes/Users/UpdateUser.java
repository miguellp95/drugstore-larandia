package Componentes.Users;

import helpers.ConfirmDialog;
import Controller.UserController;
import helpers.CustomizeButtons;
import Models.UserModel;
import java.util.ArrayList;

public class UpdateUser extends javax.swing.JPanel implements Interfaces.Observable {

    private CustomizeButtons customizeButton;
    private UserModel user;
    private String operationObserved;
    private ArrayList<Interfaces.Observer> observerList;
 

    public UpdateUser() { 
        
        this.observerList = new ArrayList();
        customizeButton = new CustomizeButtons();
        initComponents();
        
        javax.swing.ButtonGroup bg = new javax.swing.ButtonGroup();
        bg.add(rbActive);
        bg.add(rbInactive);
        
        user = ModuleUser.user;
        jtOwner.setText(user.getOwner());
        jtUsername.setText(user.getUsername());
        
        
        boolean userState = user.getState().equals("Active"); 
        if(userState){
            rbActive.setSelected(true);
        } else {
            rbInactive.setSelected(true);
        }
        
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
     
      private void showMessage(String message) {
        ConfirmDialog cd = new ConfirmDialog(this, message);
        cd.btn1.setVisible(false);
        cd.btn2.setText("Aceptar");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpFormUpdate = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtUsername = new javax.swing.JTextField();
        jtOwner = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        rbActive = new javax.swing.JRadioButton();
        rbInactive = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1146, 720));
        setMinimumSize(new java.awt.Dimension(1146, 720));
        setPreferredSize(new java.awt.Dimension(1010, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(34, 138, 147));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACTUALIZAR USUARIO");
        jLabel1.setMaximumSize(new java.awt.Dimension(1140, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(1140, 30));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 40));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 0, -1, -1));

        jpFormUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jpFormUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 2));
        jpFormUpdate.setPreferredSize(new java.awt.Dimension(600, 315));
        jpFormUpdate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre de Usuario:");
        jLabel4.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormUpdate.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 105, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombres Completos:");
        jLabel5.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormUpdate.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jtUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtUsername.setForeground(new java.awt.Color(53, 71, 73));
        jtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147)));
        jtUsername.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormUpdate.add(jtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 105, -1, -1));

        jtOwner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtOwner.setForeground(new java.awt.Color(53, 71, 73));
        jtOwner.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtOwner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147)));
        jtOwner.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormUpdate.add(jtOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(53, 71, 73));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/saveIcon.png"))); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 2));
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setIconTextGap(15);
        btnUpdate.setPreferredSize(new java.awt.Dimension(130, 40));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jpFormUpdate.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 235, -1, -1));

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
        jpFormUpdate.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 235, -1, -1));

        rbActive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbActive.setForeground(new java.awt.Color(53, 71, 73));
        rbActive.setText("Activado");
        rbActive.setOpaque(false);
        rbActive.setPreferredSize(new java.awt.Dimension(125, 25));
        jpFormUpdate.add(rbActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        rbInactive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbInactive.setForeground(new java.awt.Color(53, 71, 73));
        rbInactive.setText("Desactivado");
        rbInactive.setOpaque(false);
        rbInactive.setPreferredSize(new java.awt.Dimension(125, 25));
        jpFormUpdate.add(rbInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Estado:");
        jLabel6.setPreferredSize(new java.awt.Dimension(250, 25));
        jpFormUpdate.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        add(jpFormUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 46, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        customizeButton.setHandCursor(btnUpdate);
        customizeButton.stylizeModuleButton(btnUpdate, 16);
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        customizeButton.normalStyleModuleButton(btnUpdate, 14);
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        String owner = jtOwner.getText();
        String username = jtUsername.getText();
        String state = rbActive.isSelected() ? "Active" : "Inactive";

        if(owner.length() >0 && username.length() >0){

            user.setOwner(owner);
            user.setUsername(username);
            user.setState(state);

            boolean result = new UserController().updateUser(user);
            if(result){
                showMessage("Usuario actualizado satisfactoriamente.");
                this.operationObserved = "Usuario Actualizado";
                this.notifyChange();
            }else{
                showMessage("No se logro crear usuario.");
            }

        }else{
            showMessage("<html><body>Todos los campos deben ser <br>diligenciados por completo.");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        customizeButton.setHandCursor(btnCancel);
        customizeButton.stylizeModuleCancelButton(btnCancel, 16);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        customizeButton.normalStyleModuleCancelButton(btnCancel, 14);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.operationObserved ="Usuario Actualizado";
        this.notifyChange();
        
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jpFormUpdate;
    private javax.swing.JTextField jtOwner;
    private javax.swing.JTextField jtUsername;
    private javax.swing.JRadioButton rbActive;
    private javax.swing.JRadioButton rbInactive;
    // End of variables declaration//GEN-END:variables
}
