package Componentes.Users;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.netbeans.lib.awtextra.AbsoluteConstraints;

import Controller.UserController;
import helpers.CustomizeButtons;
import helpers.CustomizeJTable;
import helpers.ConfirmDialog;
import helpers.TextPrompt;
import Models.UserModel;

public class ModuleUser extends JPanel implements Interfaces.Observable, Interfaces.Observer {
    
    private final ArrayList<Interfaces.Observer> observers;
    private String itemObvservableChanged;
    private DefaultTableModel tableModel;    
    
    private UserModel[] users;
    public static UserModel user;
    UpdateUser updateUser;
    RegisterUser registerUser;
    CustomizeButtons customizeButton = new CustomizeButtons();
    CustomizeJTable customizeJTable = new CustomizeJTable();

    public ModuleUser() {

        observers = new ArrayList();
        initComponents();

        this.btnReturn.setVisible(false);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbUsername);
        bg.add(rbOwner);
        rbUsername.setSelected(true);

        jtSearchUser.setRequestFocusEnabled(true);
        new TextPrompt("  Buscar usuario", jtSearchUser);   //Placeholder

        showModuleUserHome(true, null);    //first parameter if generalSearch or specific. Second parameter is criteria if is specific.
        customizeJTable.setColorCellsTable(UserTable);

    }

    private void showModuleUserHome(boolean generalSearch, UserModel userObj[]) {
        UserTable.setModel(uploadDataUsers(generalSearch, userObj));
        customizeJTable.customStyleTableHeader(UserTable);
        customizeJTable.centerTextColumnTable(UserTable);
        customizeJTable.setColorCellsTable(UserTable);
        customWidthColumnTable(UserTable);

    }

    //------------------------------------------------
    private void customWidthColumnTable(javax.swing.JTable table) {
        //Prefered Size
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(310);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        table.getColumnModel().getColumn(5).setPreferredWidth(200);

        // Min width
        table.getColumnModel().getColumn(0).setMinWidth(50);
        table.getColumnModel().getColumn(1).setMinWidth(150);
        table.getColumnModel().getColumn(2).setMinWidth(310);
        table.getColumnModel().getColumn(3).setMinWidth(100);
        table.getColumnModel().getColumn(4).setMinWidth(200);
        table.getColumnModel().getColumn(5).setMinWidth(200);
        // Max width
        table.getColumnModel().getColumn(0).setMaxWidth(50);
        table.getColumnModel().getColumn(1).setMaxWidth(150);
        table.getColumnModel().getColumn(2).setMaxWidth(310);
        table.getColumnModel().getColumn(3).setMaxWidth(100);
        table.getColumnModel().getColumn(4).setMaxWidth(200);
        table.getColumnModel().getColumn(5).setMaxWidth(200);
    }

    private DefaultTableModel uploadDataUsers(boolean generalSearch, UserModel userObj[]) {
        tableModel = new DefaultTableModel();
        
        tableModel.addColumn("Id");
        tableModel.addColumn("Nombre de Usuario");
        tableModel.addColumn("Propietario");
        tableModel.addColumn("Estado");
        tableModel.addColumn("Fecha de Creación");
        tableModel.addColumn("Ultima Actualización");

        if (generalSearch) {
            UserController userController = new UserController();
            users = userController.findUsers();
        } else {
            users = userObj;
        }

        if (users[0] == null) {
            showMessage("No hay resultados");
            jtSearchUser.requestFocus();
            return uploadDataUsers(true, null);
        }

        for (UserModel user_ : users) {
            Object[] data = new Object[7];
            data[0] = (Object) user_.getId();
            data[1] = (Object) user_.getUsername();
            data[2] = (Object) user_.getOwner();
            data[3] = user_.getState().equals("Active") ? "Activo" : "Inactivo";
            data[4] = (Object) user_.getCreatedAt();
            data[5] = (Object) user_.getUpdatedAt();
            tableModel.addRow(data);
        }
        return tableModel;
    } 
    
    private void addPanelUser(javax.swing.JPanel panel, javax.swing.JPanel parent) {
        parent.removeAll();
        parent.add(panel, new AbsoluteConstraints(52, 30, 1010, 550));
        parent.revalidate();
    }

    private void showMessage(String message) {
        ConfirmDialog cd = new ConfirmDialog(this, message);
        cd.btn1.setVisible(false);
        cd.btn2.setText("Aceptar");
    }

     // Observer
    @Override
    public void attachObserver(Interfaces.Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyChange() {
        for (Interfaces.Observer observer : this.observers) {
            observer.update(this.itemObvservableChanged);
        }

    }
    //----------------------------------------------------------------

    //--------Overriding method for observer implements 
    @Override
    public void update(String itemChanged) {
        //Observable class COnfirm Dialog to delete an user
        if (itemChanged.equals("Eliminar si")) {
            showModuleUserHome(true, null);
            return;
        }
        if (itemChanged.equals("Nuevo Usuario")) {
            this.itemObvservableChanged = "Nuevo Usuario";
            notifyChange();
            return;
        }
        if (itemChanged.equals("Usuario Actualizado")) {
            this.itemObvservableChanged = "Usuario Actualizado";
            notifyChange();
            return;
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpModuleUser = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();
        jpContainerModuleUser = new javax.swing.JPanel();
        jpHome = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        btnNewUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        rbUsername = new javax.swing.JRadioButton();
        rbOwner = new javax.swing.JRadioButton();
        jtSearchUser = new javax.swing.JTextField();
        btnSearchUser = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 2));
        setMaximumSize(new java.awt.Dimension(1146, 786));
        setMinimumSize(new java.awt.Dimension(1146, 786));
        setPreferredSize(new java.awt.Dimension(1146, 786));

        jLabel1.setBackground(new java.awt.Color(34, 138, 147));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODULO DE USUARIOS");
        jLabel1.setMaximumSize(new java.awt.Dimension(1140, 60));
        jLabel1.setMinimumSize(new java.awt.Dimension(1140, 60));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1140, 60));

        jpModuleUser.setBackground(new java.awt.Color(255, 255, 255));
        jpModuleUser.setMaximumSize(new java.awt.Dimension(1146, 726));
        jpModuleUser.setMinimumSize(new java.awt.Dimension(1146, 726));
        jpModuleUser.setPreferredSize(new java.awt.Dimension(1140, 720));
        jpModuleUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jpModuleUser.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        jpContainerModuleUser.setBackground(new java.awt.Color(255, 255, 255));
        jpContainerModuleUser.setMaximumSize(new java.awt.Dimension(1140, 720));
        jpContainerModuleUser.setMinimumSize(new java.awt.Dimension(1140, 720));
        jpContainerModuleUser.setPreferredSize(new java.awt.Dimension(1140, 670));
        jpContainerModuleUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpHome.setBackground(new java.awt.Color(255, 255, 255));
        jpHome.setPreferredSize(new java.awt.Dimension(1010, 550));
        jpHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1010, 250));

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre de Usuario", "Propietario", "Estado", "Fecha Creación", "Ultima Actualización"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UserTable.setGridColor(new java.awt.Color(34, 138, 147));
        UserTable.setInheritsPopupMenu(true);
        UserTable.setMaximumSize(new java.awt.Dimension(1050, 200));
        UserTable.setMinimumSize(new java.awt.Dimension(1050, 200));
        UserTable.setPreferredSize(new java.awt.Dimension(1010, 200));
        UserTable.setRowHeight(25);
        UserTable.setSelectionBackground(new java.awt.Color(204, 255, 204));
        UserTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(UserTable);
        if (UserTable.getColumnModel().getColumnCount() > 0) {
            UserTable.getColumnModel().getColumn(0).setMinWidth(10);
            UserTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            UserTable.getColumnModel().getColumn(0).setMaxWidth(10);
            UserTable.getColumnModel().getColumn(1).setMinWidth(150);
            UserTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            UserTable.getColumnModel().getColumn(1).setMaxWidth(150);
            UserTable.getColumnModel().getColumn(2).setMinWidth(350);
            UserTable.getColumnModel().getColumn(2).setPreferredWidth(350);
            UserTable.getColumnModel().getColumn(2).setMaxWidth(350);
            UserTable.getColumnModel().getColumn(3).setMinWidth(100);
            UserTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            UserTable.getColumnModel().getColumn(3).setMaxWidth(100);
            UserTable.getColumnModel().getColumn(4).setMinWidth(200);
            UserTable.getColumnModel().getColumn(4).setPreferredWidth(200);
            UserTable.getColumnModel().getColumn(4).setMaxWidth(200);
            UserTable.getColumnModel().getColumn(5).setMinWidth(200);
            UserTable.getColumnModel().getColumn(5).setPreferredWidth(200);
            UserTable.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        jpHome.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, -1, -1));

        btnNewUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNewUser.setForeground(new java.awt.Color(53, 71, 73));
        btnNewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addIcon.png"))); // NOI18N
        btnNewUser.setText("Nuevo Usuario");
        btnNewUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnNewUser.setContentAreaFilled(false);
        btnNewUser.setFocusable(false);
        btnNewUser.setPreferredSize(new java.awt.Dimension(150, 30));
        btnNewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewUserMouseExited(evt);
            }
        });
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });
        jpHome.add(btnNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        btnUpdateUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateUser.setForeground(new java.awt.Color(53, 71, 73));
        btnUpdateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/updateIcon.png"))); // NOI18N
        btnUpdateUser.setText("Actualizar Datos");
        btnUpdateUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnUpdateUser.setContentAreaFilled(false);
        btnUpdateUser.setFocusable(false);
        btnUpdateUser.setPreferredSize(new java.awt.Dimension(150, 30));
        btnUpdateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateUserMouseExited(evt);
            }
        });
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });
        jpHome.add(btnUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        btnDeleteUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteUser.setForeground(new java.awt.Color(53, 71, 73));
        btnDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteIcon.png"))); // NOI18N
        btnDeleteUser.setText("Eliminar");
        btnDeleteUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnDeleteUser.setContentAreaFilled(false);
        btnDeleteUser.setFocusable(false);
        btnDeleteUser.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDeleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteUserMouseExited(evt);
            }
        });
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });
        jpHome.add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        rbUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbUsername.setForeground(new java.awt.Color(53, 71, 73));
        rbUsername.setText("Nombre de Usuario");
        rbUsername.setOpaque(false);
        jpHome.add(rbUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        rbOwner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbOwner.setForeground(new java.awt.Color(53, 71, 73));
        rbOwner.setText("Propietario");
        rbOwner.setOpaque(false);
        jpHome.add(rbOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));

        jtSearchUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 2));
        jtSearchUser.setPreferredSize(new java.awt.Dimension(250, 30));
        jpHome.add(jtSearchUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        btnSearchUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearchUser.setForeground(new java.awt.Color(53, 71, 73));
        btnSearchUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchIcon.png"))); // NOI18N
        btnSearchUser.setText("Buscar");
        btnSearchUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 3));
        btnSearchUser.setContentAreaFilled(false);
        btnSearchUser.setFocusable(false);
        btnSearchUser.setPreferredSize(new java.awt.Dimension(100, 30));
        btnSearchUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchUserMouseExited(evt);
            }
        });
        btnSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUserActionPerformed(evt);
            }
        });
        jpHome.add(btnSearchUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, -1, -1));

        jpContainerModuleUser.add(jpHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 30, -1, -1));

        jpModuleUser.add(jpContainerModuleUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpModuleUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpModuleUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewUserMouseEntered
        customizeButton.setHandCursor(btnNewUser);
        customizeButton.stylizeModuleButton(btnNewUser, 14);
    }//GEN-LAST:event_btnNewUserMouseEntered

    private void btnNewUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewUserMouseExited
        customizeButton.normalStyleModuleButton(btnNewUser, 12);
    }//GEN-LAST:event_btnNewUserMouseExited

    private void btnUpdateUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateUserMouseEntered
        customizeButton.setHandCursor(btnUpdateUser);
        customizeButton.stylizeModuleButton(btnUpdateUser, 14);
    }//GEN-LAST:event_btnUpdateUserMouseEntered

    private void btnUpdateUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateUserMouseExited
        customizeButton.normalStyleModuleButton(btnUpdateUser, 12);
    }//GEN-LAST:event_btnUpdateUserMouseExited

    private void btnDeleteUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUserMouseEntered
        customizeButton.setHandCursor(btnDeleteUser);
        customizeButton.stylizeModuleButton(btnDeleteUser, 14);
    }//GEN-LAST:event_btnDeleteUserMouseEntered

    private void btnDeleteUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUserMouseExited
        customizeButton.normalStyleModuleButton(btnDeleteUser, 12);
    }//GEN-LAST:event_btnDeleteUserMouseExited

    private void btnSearchUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchUserMouseEntered
        customizeButton.setHandCursor(btnSearchUser);
        customizeButton.stylizeModuleButton(btnSearchUser, 14);
    }//GEN-LAST:event_btnSearchUserMouseEntered

    private void btnSearchUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchUserMouseExited
        customizeButton.normalStyleModuleButton(btnSearchUser, 12);
    }//GEN-LAST:event_btnSearchUserMouseExited

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        this.registerUser = new RegisterUser();
        this.btnReturn.setVisible(true);
        addPanelUser(this.registerUser, this.jpContainerModuleUser);
    }//GEN-LAST:event_btnNewUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        int selectedRow = UserTable.getSelectedRow();
        if (selectedRow != -1) {
            user = users[selectedRow];
            this.btnReturn.setVisible(true);
            this.updateUser = new UpdateUser();
            addPanelUser(this.updateUser, this.jpContainerModuleUser);
        } else {
            showMessage("No has seleccionado ninguna fila.");
        }

    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed

        int selectedRow = UserTable.getSelectedRow();
        if (selectedRow != -1) {
            user = users[selectedRow];
            ConfirmDialog cdObservable = new ConfirmDialog(this, "Desea eliminar el usuario " + user.getUsername(), "Eliminar");
            cdObservable.attachObserver(this);
            new UserController().deleteUser(user.getId());
        } else {
            showMessage("No has seleccionado ninguna fila.");
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUserActionPerformed
        String searchText = jtSearchUser.getText().trim();
        UserModel userObj[];
        if (rbUsername.isSelected()) {
            userObj = new UserModel[1];
            userObj[0] = new UserController().findByUsername(searchText);
        } else {
            userObj = new UserController().findByOwner(searchText);
        }
        this.showModuleUserHome(false, userObj);
        jtSearchUser.setText("");

    }//GEN-LAST:event_btnSearchUserActionPerformed

    private void btnReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseEntered
        customizeButton.setHandCursor(btnReturn);
        customizeButton.stylizeModuleButton(btnReturn, 14);
    }//GEN-LAST:event_btnReturnMouseEntered

    private void btnReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseExited
        customizeButton.normalStyleModuleButton(btnReturn, 12);
    }//GEN-LAST:event_btnReturnMouseExited

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.btnReturn.setVisible(false); 
        if(this.registerUser != null){
            this.registerUser.setVisible(false);
            this.jpModuleUser.remove(this.registerUser);
            customizeButton.normalStyleModuleButton(btnNewUser, 12);
        }
        if(this.updateUser != null){
            this.updateUser.setVisible(false);
            this.jpModuleUser.remove(this.updateUser);
            customizeButton.normalStyleModuleButton(btnUpdateUser, 12);
        }
        //this.jpContainerModuleUser.removeAll();
                addPanelUser(jpHome, jpContainerModuleUser);

//        this.jpContainerModuleUser.setVisible(true);

    }//GEN-LAST:event_btnReturnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UserTable;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnNewUser;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearchUser;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpContainerModuleUser;
    private javax.swing.JPanel jpHome;
    private javax.swing.JPanel jpModuleUser;
    private javax.swing.JTextField jtSearchUser;
    private javax.swing.JRadioButton rbOwner;
    private javax.swing.JRadioButton rbUsername;
    // End of variables declaration//GEN-END:variables
}
