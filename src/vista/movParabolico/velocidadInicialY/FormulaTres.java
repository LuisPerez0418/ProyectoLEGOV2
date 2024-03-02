package vista.movParabolico.velocidadInicialY;

import controlador.ControladorMovParabolico;
import controlador.Utilidades;
import controlador.convertidor.ControladorLongitud;
import controlador.convertidor.ControladorTiempo;
import controlador.convertidor.ControladorVelocidad;
import javax.swing.JOptionPane;

public class FormulaTres extends javax.swing.JPanel {

    public FormulaTres() {
        initComponents();
        rellenarCombo();
    }

    private ControladorMovParabolico mp = new ControladorMovParabolico();
    private ControladorLongitud ml = new ControladorLongitud();
    private ControladorVelocidad mv = new ControladorVelocidad();
    private ControladorTiempo mt = new ControladorTiempo();
    private Utilidades util = new Utilidades();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbAltura = new javax.swing.JComboBox<>();
        txtAltura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbVelocidadFinal = new javax.swing.JComboBox<>();
        txtVelocidadFinal = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        cmbTiempo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(720, 470));
        setMinimumSize(new java.awt.Dimension(720, 470));
        setPreferredSize(new java.awt.Dimension(720, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Digite los datos");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 73, 32));

        btnCalcular.setBackground(new java.awt.Color(204, 204, 204));
        btnCalcular.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(null);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 195, 32));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Altura");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        cmbAltura.setBackground(new java.awt.Color(255, 255, 255));
        cmbAltura.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbAltura.setForeground(new java.awt.Color(0, 0, 0));
        cmbAltura.setBorder(null);
        add(cmbAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 73, 32));

        txtAltura.setBackground(new java.awt.Color(255, 255, 255));
        txtAltura.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtAltura.setForeground(new java.awt.Color(0, 0, 0));
        txtAltura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });
        add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 195, 32));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Velocidad final en y");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        cmbVelocidadFinal.setBackground(new java.awt.Color(255, 255, 255));
        cmbVelocidadFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbVelocidadFinal.setForeground(new java.awt.Color(0, 0, 0));
        cmbVelocidadFinal.setBorder(null);
        add(cmbVelocidadFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 73, 32));

        txtVelocidadFinal.setBackground(new java.awt.Color(255, 255, 255));
        txtVelocidadFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtVelocidadFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtVelocidadFinal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtVelocidadFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 195, 32));

        txtTiempo.setBackground(new java.awt.Color(255, 255, 255));
        txtTiempo.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(0, 0, 0));
        txtTiempo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoActionPerformed(evt);
            }
        });
        add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 195, 32));

        cmbTiempo.setBackground(new java.awt.Color(255, 255, 255));
        cmbTiempo.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbTiempo.setForeground(new java.awt.Color(0, 0, 0));
        cmbTiempo.setBorder(null);
        add(cmbTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 73, 32));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tiempo");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        util.limpiarCampos(this);
        txtTiempo.setText("0");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double altura;
        double velocidadFinalY;
        double tiempo;
        try {
            altura = ml.convertirLongitud(Double.parseDouble(txtAltura.getText()),
                    cmbAltura.getSelectedItem().toString());
            velocidadFinalY = mv.convertirVelocidad(Double.parseDouble(txtVelocidadFinal.getText()),
                    cmbVelocidadFinal.getSelectedItem().toString());
            tiempo = mt.convertirTiempo(Double.parseDouble(txtTiempo.getText()),
                    cmbTiempo.getSelectedItem().toString());
            mp = new ControladorMovParabolico(0, 0, 0, 0,
                    0, altura, 0, 0, 0, tiempo, 0, velocidadFinalY);
            //------ Mostrar cálculos -----//
            JOptionPane.showMessageDialog(this,
                    "Altura calculada. \n" + mp.calcularVelocidadInicialFUno() + " m/s");
            util.limpiarCampos(this);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Debe rellenar todos los campos para continuar.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void txtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoActionPerformed

    private void rellenarCombo() {
        ml.rellenarCombo(cmbAltura);
        mv.rellenarCombo(cmbVelocidadFinal);
        mt.rellenarCombo(cmbTiempo);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAltura;
    private javax.swing.JComboBox<String> cmbTiempo;
    private javax.swing.JComboBox<String> cmbVelocidadFinal;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtVelocidadFinal;
    // End of variables declaration//GEN-END:variables
}
