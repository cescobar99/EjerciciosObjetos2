/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Camilo_Escobar
 */
import clases.DenominadorCeroException;
import clases.FraccionarioMixtos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        cmdConvertirFraccion.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtDen1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNum2 = new javax.swing.JTextField();
        txtDen2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDen3 = new javax.swing.JTextField();
        txtNum3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cmdLimpiar = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();
        cmdConvertirFraccion = new javax.swing.JButton();
        txtEnt1 = new javax.swing.JTextField();
        txtEnt2 = new javax.swing.JTextField();
        txtEnt3 = new javax.swing.JTextField();
        cmbOperacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Operaciones con Fracciones mixtas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 260, -1));

        txtNum1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 60, -1));

        txtDen1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtDen1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDen1KeyTyped(evt);
            }
        });
        jPanel1.add(txtDen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 60, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 60, 10));

        txtNum2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum2KeyTyped(evt);
            }
        });
        jPanel1.add(txtNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 60, -1));

        txtDen2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtDen2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDen2KeyTyped(evt);
            }
        });
        jPanel1.add(txtDen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 60, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 60, 10));

        txtDen3.setEditable(false);
        txtDen3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jPanel1.add(txtDen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 60, -1));

        txtNum3.setEditable(false);
        txtNum3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jPanel1.add(txtNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 60, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 60, 10));

        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        cmdLimpiar.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        cmdCalcular.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        cmdConvertirFraccion.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        cmdConvertirFraccion.setText("Convertir a Fracción");
        cmdConvertirFraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConvertirFraccionActionPerformed(evt);
            }
        });
        jPanel1.add(cmdConvertirFraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        txtEnt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnt1KeyTyped(evt);
            }
        });
        jPanel1.add(txtEnt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 40, 30));

        txtEnt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnt2KeyTyped(evt);
            }
        });
        jPanel1.add(txtEnt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 40, 30));

        txtEnt3.setEditable(false);
        jPanel1.add(txtEnt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 40, 30));

        cmbOperacion.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        cmbOperacion.setForeground(new java.awt.Color(51, 51, 255));
        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "Division" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtEnt1.setText("");
        txtEnt2.setText("");
        txtEnt3.setText("");
        txtNum1.setText("");
        txtNum2.setText("");
        txtNum3.setText("");
        txtDen1.setText("");
        txtDen2.setText("");
        txtDen3.setText("");
        txtEnt1.setText("");
        cmbOperacion.setSelectedIndex(0);
        txtEnt1.requestFocusInWindow();
        cmdConvertirFraccion.setEnabled(false);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int operacion, num1, num2, den1, den2, entero1, entero2;
        FraccionarioMixtos f1;
        FraccionarioMixtos f2;
        FraccionarioMixtos f3 = null;
        int sw = 1;
        txtNum3.setText("");
        txtDen3.setText("");
        txtEnt3.setText("");
        if (txtEnt1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "digite la parte entera de la fraccion #1", "Error", JOptionPane.ERROR_MESSAGE);
            txtEnt1.requestFocusInWindow();
        } else if (txtNum1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "digite el numerador de la fraccion #1", "Error", JOptionPane.ERROR_MESSAGE);
            txtNum1.requestFocusInWindow();
        } else if (txtDen1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "digite el denominador de la fraccion #1", "Error", JOptionPane.ERROR_MESSAGE);
            txtDen1.requestFocusInWindow();
        } else if (txtEnt2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "digite la parte entera de la fraccion #2", "Error", JOptionPane.ERROR_MESSAGE);
            txtEnt2.requestFocusInWindow();
        } else if (txtNum2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "digite el numerador de la fraccion #2", "Error", JOptionPane.ERROR_MESSAGE);
            txtNum2.requestFocusInWindow();
        } else if (txtDen2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "digite el denominador de la fraccion #2", "Error", JOptionPane.ERROR_MESSAGE);
            txtDen2.requestFocusInWindow();
        } else {
            try {
                entero1 = Integer.parseInt(txtEnt1.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "La parte entera de la fraccion  #1 debe ser valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtEnt1.requestFocusInWindow();
                txtEnt1.selectAll();
                sw = 0;
            }
            try {
                num1 = Integer.parseInt(txtNum1.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El numerador de la fracción número #1 debe ser valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtNum1.requestFocusInWindow();
                txtNum1.selectAll();
                sw = 0;
            }
            try {
                den1 = Integer.parseInt(txtDen1.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El denominador de la fracción número #1 debe ser valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtDen1.requestFocusInWindow();
                txtDen1.selectAll();
                sw = 0;
            }
            try {
                entero2 = Integer.parseInt(txtEnt2.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "La parte entera de la fraccion número #2 debe ser valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtEnt2.requestFocusInWindow();
                txtEnt2.selectAll();
                sw = 0;
            }
            try {
                num2 = Integer.parseInt(txtNum2.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El numerador de la fracción número #2 debe ser valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtNum2.requestFocusInWindow();
                txtNum2.selectAll();
                sw = 0;
            }
            try {
                den2 = Integer.parseInt(txtDen2.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El denominador de la fracción número #2 debe ser valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtDen2.requestFocusInWindow();
                txtDen2.selectAll();
                sw = 0;
            }
            if (sw == 1) {
                operacion = cmbOperacion.getSelectedIndex();
                entero1 = Integer.parseInt(txtEnt1.getText());
                num1 = Integer.parseInt(txtNum1.getText());
                den1 = Integer.parseInt(txtDen1.getText());
                entero2 = Integer.parseInt(txtEnt2.getText());
                num2 = Integer.parseInt(txtNum2.getText());
                den2 = Integer.parseInt(txtDen2.getText());
                try {
                    f1 = new FraccionarioMixtos(entero1, num1, den1);
                    f2 = new FraccionarioMixtos(entero2, num2, den2);

                    switch (operacion) {
                        case 0:
                            f3 = f1.sumar(f2);
                            break;
                        case 1:
                            f3 = f1.restar(f2);
                            break;
                        case 2:
                            f3 = f1.multiplicar(f2);
                            break;
                        case 3:
                            f3 = f1.dividir(f2);
                            break;
                    }
                    txtEnt3.setText("" + f3.getEntero());
                    txtNum3.setText("" + f3.getNumerador());
                    txtDen3.setText("" + f3.getDenominador());
                    cmdConvertirFraccion.setEnabled(true);
                } catch (DenominadorCeroException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdConvertirFraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConvertirFraccionActionPerformed
        try {
            FraccionarioMixtos f3;
            FraccionarioMixtos f;
            int entero, num, den;
            entero = Integer.parseInt(txtEnt3.getText());
            num = Integer.parseInt(txtNum3.getText());
            den = Integer.parseInt(txtDen3.getText());
            f3 = new FraccionarioMixtos(entero, num, den);
            f = f3.covertirafraccion();
            txtEnt3.setText("");
            txtNum3.setText("" + f.getNumerador());
            txtDen3.setText("" + f.getDenominador());
            cmdConvertirFraccion.setEnabled(false);
        } catch (DenominadorCeroException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdConvertirFraccionActionPerformed

    private void txtEnt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnt1KeyTyped
    char c=evt.getKeyChar(); 
    if(!Character.isDigit(c)) { 
    getToolkit().beep(); 
    evt.consume(); 
    }
    }//GEN-LAST:event_txtEnt1KeyTyped

    private void txtNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyTyped
    char c=evt.getKeyChar(); 
    if(!Character.isDigit(c)) { 
    getToolkit().beep(); 
    evt.consume(); 
    }
    }//GEN-LAST:event_txtNum1KeyTyped

    private void txtDen1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDen1KeyTyped
    char c=evt.getKeyChar(); 
    if(!Character.isDigit(c)) { 
    getToolkit().beep(); 
    evt.consume(); 
    }
    }//GEN-LAST:event_txtDen1KeyTyped

    private void txtEnt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnt2KeyTyped
    char c=evt.getKeyChar(); 
    if(!Character.isDigit(c)) { 
    getToolkit().beep(); 
    evt.consume(); 
    }
    }//GEN-LAST:event_txtEnt2KeyTyped

    private void txtNum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyTyped
    char c=evt.getKeyChar(); 
    if(!Character.isDigit(c)) { 
    getToolkit().beep(); 
    evt.consume(); 
    }
    }//GEN-LAST:event_txtNum2KeyTyped

    private void txtDen2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDen2KeyTyped
    char c=evt.getKeyChar(); 
    if(!Character.isDigit(c)) { 
    getToolkit().beep(); 
    evt.consume(); 
    }
    }//GEN-LAST:event_txtDen2KeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdConvertirFraccion;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtDen1;
    private javax.swing.JTextField txtDen2;
    private javax.swing.JTextField txtDen3;
    private javax.swing.JTextField txtEnt1;
    private javax.swing.JTextField txtEnt2;
    private javax.swing.JTextField txtEnt3;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNum3;
    // End of variables declaration//GEN-END:variables
}
