/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.CuentaDao;
import models.CuentaVo;

/**
 *
 * @author andre
 */
public class ManejoCuenta extends javax.swing.JFrame {

    /**
     * Creates new form ManejoCuenta
     */
    public ManejoCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        showClients();
    }

    private void showClients() {
        CuentaDao cuentaDao = new CuentaDao();
        ArrayList<CuentaVo> listAccounts = cuentaDao.getCuentaVo();

        jComboBoxCuenta.removeAllItems();

        for (int i = 0; i < listAccounts.size(); i++) {
            jComboBoxCuenta.addItem(new CuentaVo(listAccounts.get(i).getIdCuenta(),
                    listAccounts.get(i).getNumeroCuenta(),
                    listAccounts.get(i).getTitular(),
                    listAccounts.get(i).getSaldo()));
        }
    }
    
    private void deposit() throws SQLException{
        double cantidad = Double.parseDouble(jTextFieldSaldo.getText());
        double saldo = jComboBoxCuenta.getItemAt(jComboBoxCuenta.getSelectedIndex()).getSaldo();
        int numerocuenta = jComboBoxCuenta.getItemAt(jComboBoxCuenta.getSelectedIndex()).getNumeroCuenta();

        
        double increment = cantidad + saldo;
        
        CuentaDao cuentaDao = new CuentaDao();
        
        cuentaDao.deposit(numerocuenta, increment);

    }
    
    private void retirar() throws SQLException{
        double cantidad = Double.parseDouble(jTextFieldSaldo.getText());
        double saldo = jComboBoxCuenta.getItemAt(jComboBoxCuenta.getSelectedIndex()).getSaldo();
        int numerocuenta = jComboBoxCuenta.getItemAt(jComboBoxCuenta.getSelectedIndex()).getNumeroCuenta();

        
        double increment = saldo - cantidad;
        
        CuentaDao cuentaDao = new CuentaDao();
        
        cuentaDao.deposit(numerocuenta, increment);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxCuenta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButtonMostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSaldo = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Cuentas:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("MANEJO DE CUENTAS");

        jButtonMostrar.setBackground(new java.awt.Color(51, 153, 255));
        jButtonMostrar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.setBorder(null);
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Cantidad:");

        jTextFieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(0, 153, 255));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jToggleButton1.setText("Retirar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Depositar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addComponent(jButton1))
                            .addComponent(jComboBoxCuenta, 0, 401, Short.MAX_VALUE)
                            .addComponent(jTextFieldSaldo))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        // TODO add your handling code here:
        int opcion = jComboBoxCuenta.getItemAt(jComboBoxCuenta.getSelectedIndex()).getIdCuenta();
        double saldo = jComboBoxCuenta.getItemAt(jComboBoxCuenta.getSelectedIndex()).getSaldo();
        System.out.println();
        JOptionPane.showMessageDialog(null, "La cantidad disponible es: " + saldo);
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jTextFieldSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaldoActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
            // TODO add your handling code here:
            retirar();
        } catch (SQLException ex) {
            Logger.getLogger(ManejoCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        CuentaDao cuentaDao = new CuentaDao();
        ArrayList<CuentaVo> listAccounts = cuentaDao.getCuentaVo();
        jComboBoxCuenta.removeAllItems();
        for (int i = 0; i < listAccounts.size(); i++) {
            jComboBoxCuenta.addItem(new CuentaVo(listAccounts.get(i).getIdCuenta(),
                    listAccounts.get(i).getNumeroCuenta(),
                    listAccounts.get(i).getTitular(),
                    listAccounts.get(i).getSaldo()));
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            deposit();
        } catch (SQLException ex) {
            Logger.getLogger(ManejoCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        CuentaDao cuentaDao = new CuentaDao();
        ArrayList<CuentaVo> listAccounts = cuentaDao.getCuentaVo();
        jComboBoxCuenta.removeAllItems();
        for (int i = 0; i < listAccounts.size(); i++) {
            jComboBoxCuenta.addItem(new CuentaVo(listAccounts.get(i).getIdCuenta(),
                    listAccounts.get(i).getNumeroCuenta(),
                    listAccounts.get(i).getTitular(),
                    listAccounts.get(i).getSaldo()));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        super.setVisible(false);
        Dashboard dashboard = null;
        try {
            dashboard = new Dashboard();
        } catch (Exception ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        dashboard.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManejoCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManejoCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManejoCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManejoCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManejoCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JComboBox<CuentaVo> jComboBoxCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldSaldo;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
