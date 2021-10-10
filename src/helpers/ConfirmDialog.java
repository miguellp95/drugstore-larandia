package helpers;
/**
 * @author Miguel
 */
import javax.swing.ImageIcon;

import java.awt.Image;
//import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.font.TextAttribute;

import javax.swing.JPanel;

import java.util.ArrayList;

public class ConfirmDialog extends javax.swing.JFrame implements Interfaces.Observable{
    
    private String message;  
    //private final Color primaryColor = new Color(34, 138, 147);
    //private final Color secondaryColor = new Color(53, 71, 73);
    private final String btnName;
    private boolean result;
    private ArrayList<Interfaces.Observer> listObserver;
    private String itemObservableChanged;

    public ConfirmDialog(JPanel panel, String message, String btnName) {
        this.listObserver = new ArrayList();
        this.btnName = btnName;
        this.message = message; 
        settingBasicWindow(panel);
        btn1.setActionCommand(btnName);
    }
        
    public ConfirmDialog(JPanel panel, String message) {
        this.listObserver = new ArrayList();
        this.message = message;
        this.btnName = "Aceptar";
        settingBasicWindow(panel);
    }
   
    public ConfirmDialog(JPanel panel) {
        this.btnName = "Aceptar";
        settingBasicWindow(panel);
    }
    
    private void settingBasicWindow(JPanel panel){
        initComponents();
        setVisible(true);
        setLocationRelativeTo(panel);
    }
    
    @Override
    public void attachObserver(Interfaces.Observer observer ){
        this.listObserver.add(observer);
    }
    
    @Override
    public void notifyChange(){
        for(Interfaces.Observer observer : this.listObserver){
            observer.update(this.itemObservableChanged);
        }
    }
    private void buttonMode(String mode) {

        switch (mode) {
            case "Salir":
                System.exit(0);
                break;
            case "Eliminar": 
                this.itemObservableChanged = "Eliminar si";
                notifyChange();
                break;
            case "Cancelar":
                this.result = false;
                break;
        }
        dispose();
    } 

    public boolean getResult() {
        return this.result;
    }
     

    public void setIcon(String path) {
        jlIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jlIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(350, 200));
        setMinimumSize(new java.awt.Dimension(350, 200));
        setUndecorated(true);
        setSize(new java.awt.Dimension(350, 200));

        jpMain.setBackground(new java.awt.Color(255, 255, 255));
        jpMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 138, 147), 5));
        jpMain.setMaximumSize(new java.awt.Dimension(350, 200));
        jpMain.setMinimumSize(new java.awt.Dimension(350, 200));
        jpMain.setPreferredSize(new java.awt.Dimension(450, 250));
        jpMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/exclamacion icono 40x40.png"))); // NOI18N
        jlIcon.setToolTipText("");
        jlIcon.setFocusable(false);
        jlIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpMain.add(jlIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel1.setForeground(new java.awt.Color(53, 71, 73));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(message);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 300, 130));

        btn1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1.setForeground(new java.awt.Color(53, 71, 73));
        btn1.setText("Aceptar");
        btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 138, 147), 2, true));
        btn1.setContentAreaFilled(false);
        btn1.setPreferredSize(new java.awt.Dimension(100, 30));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn1MouseReleased(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jpMain.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        btn2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn2.setForeground(new java.awt.Color(53, 71, 73));
        btn2.setText("Cancelar");
        btn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 138, 147), 2, true));
        btn2.setContentAreaFilled(false);
        btn2.setPreferredSize(new java.awt.Dimension(100, 30));
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn2MouseReleased(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jpMain.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        getContentPane().add(jpMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        buttonMode(btn1.getActionCommand());

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        buttonMode(btn2.getActionCommand());

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered
        UnderlineTexts underlineobj = new UnderlineTexts();
        btn1.setFont(underlineobj.underlineText(btn1, TextAttribute.UNDERLINE_ON, 14, TextAttribute.WEIGHT_BOLD));
        btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn1MouseEntered

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        UnderlineTexts underlineobj = new UnderlineTexts();
        btn1.setFont(underlineobj.underlineText(btn1, -1, 12, TextAttribute.WEIGHT_REGULAR));
    }//GEN-LAST:event_btn1MouseExited

    private void btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseEntered
        UnderlineTexts underlineobj = new UnderlineTexts();
        btn2.setFont(underlineobj.underlineText(btn2, TextAttribute.UNDERLINE_ON, 14, TextAttribute.WEIGHT_BOLD));
        btn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn2MouseEntered

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        UnderlineTexts underlineobj = new UnderlineTexts();
        btn2.setFont(underlineobj.underlineText(btn2, -1, 12, TextAttribute.WEIGHT_REGULAR));
    }//GEN-LAST:event_btn2MouseExited

    private void btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MousePressed
        btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
    }//GEN-LAST:event_btn1MousePressed

    private void btn1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseReleased
        btn1.setFont(new Font("Tahoma", Font.PLAIN, 12));
    }//GEN-LAST:event_btn1MouseReleased

    private void btn2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MousePressed
        btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
    }//GEN-LAST:event_btn2MousePressed

    private void btn2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseReleased
        btn2.setFont(new Font("Tahoma", Font.PLAIN, 12));
    }//GEN-LAST:event_btn2MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn1;
    public javax.swing.JButton btn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlIcon;
    private javax.swing.JPanel jpMain;
    // End of variables declaration//GEN-END:variables
}
