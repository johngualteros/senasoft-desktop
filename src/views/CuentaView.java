/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.ClienteDao;
import models.ClienteVo;
import models.CuentaDao;
import models.CuentaVo;

/**
 *
 * @author andre
 */
public class CuentaView extends javax.swing.JFrame {

    DefaultTableModel modelo;
    ClienteVo clienteVo = new ClienteVo();
    ClienteDao clienteDao = new ClienteDao();

    /**
     * Creates new form CuentaView
     */
    public CuentaView() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        showClients();
        this.listar();
    }

    private void showClients() {
        ClienteDao clienteDao = new ClienteDao();
        ArrayList<ClienteVo> listClients = clienteDao.getClienteVo();

        jComboBoxCliente.removeAllItems();

        for (int i = 0; i < listClients.size(); i++) {
            jComboBoxCliente.addItem(new ClienteVo(listClients.get(i).getIdcliente(), listClients.get(i).getCedulaCliente(), listClients.get(i).getNombre()));
        }
    }

    void listar() throws SQLException {
        Object[] cuenta = new Object[6];
        modelo = (DefaultTableModel) jTableCuentas.getModel();
        CuentaDao cuentaDao = new CuentaDao();
        List<CuentaVo> cuentas = cuentaDao.list();
        cuentas.stream().forEach(account -> {
            cuenta[0] = account.getIdCuenta();
            cuenta[1] = account.getNumeroCuenta();
            cuenta[2] = account.getFechaApertura();
            cuenta[3] = account.getTitular();
            cuenta[4] = account.getSaldo();
            if (account.isEstado() == true) {
                cuenta[5] = "Activo";
            } else {
                cuenta[5] = "Inactivo";
            }
            modelo.addRow(cuenta);
        });
        jTableCuentas.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelCedula1 = new javax.swing.JLabel();
        jLabelCedula2 = new javax.swing.JLabel();
        jLabelCedula3 = new javax.swing.JLabel();
        jLabelCedula4 = new javax.swing.JLabel();
        jTextFieldNumeroCuenta = new javax.swing.JTextField();
        jTextFieldSaldoCuenta = new javax.swing.JTextField();
        jTextFieldTitularCuenta = new javax.swing.JTextField();
        jTextFieldFechaCuenta = new javax.swing.JTextField();
        jButtonDeleteAccount = new javax.swing.JButton();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCuentas = new javax.swing.JTable();
        jButtonCuenta1 = new javax.swing.JButton();
        jButtonChangeStatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName("Cuentas"); // NOI18N
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 139, 255));
        jLabel2.setText("Cuentas");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 139, 255));
        jLabel3.setText("Lista de Cuentas");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 139, 255));
        jLabel4.setText("Agregar Cuenta");

        jLabelCedula.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelCedula.setForeground(new java.awt.Color(0, 64, 222));
        jLabelCedula.setText("Número de Cuenta");

        jLabelCedula1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelCedula1.setForeground(new java.awt.Color(0, 64, 222));
        jLabelCedula1.setText("Titular");

        jLabelCedula2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelCedula2.setForeground(new java.awt.Color(0, 64, 222));
        jLabelCedula2.setText("Saldo");

        jLabelCedula3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelCedula3.setForeground(new java.awt.Color(0, 64, 222));
        jLabelCedula3.setText("Fecha de apertura");

        jLabelCedula4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelCedula4.setForeground(new java.awt.Color(0, 64, 222));
        jLabelCedula4.setText("Cliente");

        jTextFieldNumeroCuenta.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTextFieldNumeroCuenta.setForeground(new java.awt.Color(0, 139, 255));
        jTextFieldNumeroCuenta.setCaretColor(new java.awt.Color(0, 139, 255));

        jTextFieldSaldoCuenta.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTextFieldSaldoCuenta.setForeground(new java.awt.Color(0, 139, 255));
        jTextFieldSaldoCuenta.setCaretColor(new java.awt.Color(0, 139, 255));
        jTextFieldSaldoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoCuentaActionPerformed(evt);
            }
        });

        jTextFieldTitularCuenta.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTextFieldTitularCuenta.setForeground(new java.awt.Color(0, 139, 255));
        jTextFieldTitularCuenta.setCaretColor(new java.awt.Color(0, 139, 255));

        jTextFieldFechaCuenta.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTextFieldFechaCuenta.setForeground(new java.awt.Color(0, 139, 255));
        jTextFieldFechaCuenta.setCaretColor(new java.awt.Color(0, 139, 255));
        jTextFieldFechaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaCuentaActionPerformed(evt);
            }
        });

        jButtonDeleteAccount.setBackground(new java.awt.Color(170, 0, 0));
        jButtonDeleteAccount.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonDeleteAccount.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeleteAccount.setText("Eliminar cuenta");
        jButtonDeleteAccount.setBorder(null);
        jButtonDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteAccountActionPerformed(evt);
            }
        });

        jComboBoxCliente.setForeground(new java.awt.Color(0, 139, 255));
        jComboBoxCliente.setBorder(null);
        jComboBoxCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTableCuentas.setForeground(new java.awt.Color(0, 139, 255));
        jTableCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Cuenta", "Titular", "Fecha", "Saldo", "Estado"
            }
        ));
        jTableCuentas.setSelectionForeground(new java.awt.Color(0, 139, 255));
        jTableCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCuentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCuentas);

        jButtonCuenta1.setBackground(new java.awt.Color(0, 139, 255));
        jButtonCuenta1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonCuenta1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCuenta1.setText("Guardar Cuenta");
        jButtonCuenta1.setBorder(null);
        jButtonCuenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuenta1ActionPerformed(evt);
            }
        });

        jButtonChangeStatus.setBackground(new java.awt.Color(0, 222, 222));
        jButtonChangeStatus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonChangeStatus.setForeground(new java.awt.Color(255, 255, 255));
        jButtonChangeStatus.setText("Cambiar estado");
        jButtonChangeStatus.setBorder(null);
        jButtonChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButtonChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTitularCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCedula3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFechaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCedula2)
                            .addComponent(jTextFieldSaldoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCedula4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jTextFieldTitularCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabelCedula3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextFieldFechaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelCedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldSaldoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelCedula4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSaldoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaldoCuentaActionPerformed

    private void jTextFieldFechaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaCuentaActionPerformed

    private void jButtonDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteAccountActionPerformed
        int inputNumberAccount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta para eliminarla", null));
        try {
            CuentaDao cuentaDao = new CuentaDao();
            cuentaDao.delete(inputNumberAccount);
            this.clearTable();
            this.listar();
        } catch (Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_jButtonDeleteAccountActionPerformed

    private void jButtonCuenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuenta1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            registerAccount();
        } catch (SQLException ex) {
            Logger.getLogger(CuentaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCuenta1ActionPerformed

    private void jButtonChangeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeStatusActionPerformed
        // TODO add your handling code here:
        int inputNumberAccount = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Ingrese el número de cuenta", null));
        System.out.println(inputNumberAccount);
        CuentaDao cuentaDao = new CuentaDao();
        try {
            cuentaDao.changeStatus(inputNumberAccount);
            this.clearTable();
            this.listar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El número de cuenta no existe");
            Logger.getLogger(CuentaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonChangeStatusActionPerformed

    private void jTableCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCuentasMouseClicked
        // TODO add your handling code here:
        int fila = jTableCuentas.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Cuenta no Seleccionada");
        } else {
            int id = Integer.parseInt((String)jTableCuentas.getValueAt(fila, 0).toString());
            String cuenta = (String) jTableCuentas.getValueAt(fila, 1);
            String titular = (String) jTableCuentas.getValueAt(fila, 2);
            String fecha = (String) jTableCuentas.getValueAt(fila, 3);
            String saldo = (String) jTableCuentas.getValueAt(fila, 4);
            
            JOptionPane.showMessageDialog(null, id);
            jTextFieldNumeroCuenta.setText(cuenta);
            jTextFieldTitularCuenta.setText(titular);
            jTextFieldFechaCuenta.setText(fecha);
            jTextFieldSaldoCuenta.setText(saldo);
        }
    }//GEN-LAST:event_jTableCuentasMouseClicked

    /**
     *
     */
    void clearTable() {
        for (int i = 0; i < jTableCuentas.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void registerAccount() throws SQLException {

        if (!jTextFieldNumeroCuenta.getText().isEmpty()
                && !jTextFieldTitularCuenta.getText().isEmpty()
                && !jTextFieldSaldoCuenta.getText().isEmpty()
                && !jTextFieldFechaCuenta.getText().isEmpty()) {
            int NumeroCuenta = Integer.parseInt(jTextFieldNumeroCuenta.getText());
            String Titular = jTextFieldTitularCuenta.getText();
            double Saldo = Double.parseDouble(jTextFieldSaldoCuenta.getText());
            String FechaApertura = jTextFieldFechaCuenta.getText();
            boolean Estado = true;
            int idCliente = jComboBoxCliente.getItemAt(jComboBoxCliente.getSelectedIndex()).getIdcliente();

            CuentaDao cuentadao = new CuentaDao();

            CuentaVo cuenta = new CuentaVo(NumeroCuenta, Titular, Saldo, FechaApertura, Estado, idCliente);

            try {
                cuentadao.save(cuenta);
                JOptionPane.showMessageDialog(null, "Registro");
                this.clearTable();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los Campos no pueden estar vacios. Porfavor llenelos");
        }
        this.listar();
    }

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
            java.util.logging.Logger.getLogger(CuentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CuentaView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CuentaView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangeStatus;
    private javax.swing.JButton jButtonCuenta1;
    private javax.swing.JButton jButtonDeleteAccount;
    private javax.swing.JComboBox<ClienteVo> jComboBoxCliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCedula1;
    private javax.swing.JLabel jLabelCedula2;
    private javax.swing.JLabel jLabelCedula3;
    private javax.swing.JLabel jLabelCedula4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCuentas;
    private javax.swing.JTextField jTextFieldFechaCuenta;
    private javax.swing.JTextField jTextFieldNumeroCuenta;
    private javax.swing.JTextField jTextFieldSaldoCuenta;
    private javax.swing.JTextField jTextFieldTitularCuenta;
    // End of variables declaration//GEN-END:variables
}
