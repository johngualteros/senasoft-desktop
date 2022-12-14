/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jumbo170
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jButtonGestionarClientes = new javax.swing.JButton();
        jButtonGestionarCuentas = new javax.swing.JButton();
        jButtonManejoCuentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 139, 255));
        jLabel1.setText("JAF");

        jButtonGestionarClientes.setBackground(new java.awt.Color(0, 139, 255));
        jButtonGestionarClientes.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonGestionarClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGestionarClientes.setText("Gestionar Clientes");
        jButtonGestionarClientes.setBorder(null);
        jButtonGestionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarClientesActionPerformed(evt);
            }
        });

        jButtonGestionarCuentas.setBackground(new java.awt.Color(0, 139, 255));
        jButtonGestionarCuentas.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonGestionarCuentas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGestionarCuentas.setText("Gestionar Cuentas");
        jButtonGestionarCuentas.setBorder(null);
        jButtonGestionarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarCuentasActionPerformed(evt);
            }
        });

        jButtonManejoCuentas.setBackground(new java.awt.Color(0, 139, 255));
        jButtonManejoCuentas.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonManejoCuentas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonManejoCuentas.setText("Manejo Cuentas");
        jButtonManejoCuentas.setBorder(null);
        jButtonManejoCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManejoCuentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGestionarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGestionarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonManejoCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonGestionarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButtonGestionarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButtonManejoCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGestionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarClientesActionPerformed
        // TODO add your handling code here:
        super.setVisible(false);
        ClienteView clienteView = null;
        try {
            clienteView = new ClienteView();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        clienteView.setVisible(true);
    }//GEN-LAST:event_jButtonGestionarClientesActionPerformed

    private void jButtonGestionarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarCuentasActionPerformed
        // TODO add your handling code here:
        super.setVisible(false);
        CuentaView cuentaView = null;
        try {
            cuentaView = new CuentaView();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        cuentaView.setVisible(true);
    }//GEN-LAST:event_jButtonGestionarCuentasActionPerformed

    private void jButtonManejoCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManejoCuentasActionPerformed
        // TODO add your handling code here:
        super.setVisible(false);
        ManejoCuenta manejoCuenta = null;
        try {
            manejoCuenta = new ManejoCuenta();
        } catch(Exception e){
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, e);
        }
        manejoCuenta.setVisible(true);
    }//GEN-LAST:event_jButtonManejoCuentasActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGestionarClientes;
    private javax.swing.JButton jButtonGestionarCuentas;
    private javax.swing.JButton jButtonManejoCuentas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
