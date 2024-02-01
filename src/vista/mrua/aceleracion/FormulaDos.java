package vista.mrua.aceleracion;

import controlador.Utilidades;
import controlador.ControladorMovRecUniAce;
import controlador.convertidor.ControladorLongitud;
import controlador.convertidor.ControladorTiempo;
import controlador.convertidor.ControladorVelocidad;
import javax.swing.JOptionPane;

public class FormulaDos extends javax.swing.JPanel {

    public FormulaDos() {
        initComponents();
    }

    private ControladorMovRecUniAce mrua = new ControladorMovRecUniAce();
    private ControladorVelocidad mv = new ControladorVelocidad();
    private ControladorTiempo mt = new ControladorTiempo();
    private ControladorLongitud ml = new ControladorLongitud();
    private Utilidades util = new Utilidades();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        txtPosInicial = new javax.swing.JTextField();
        cmbPosInicial = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPosFinal = new javax.swing.JTextField();
        cmbPosFinal = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbVelocidadInicial = new javax.swing.JComboBox<>();
        txtVelocidadInicial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTiempoFinal = new javax.swing.JTextField();
        cmbTiempoFinal = new javax.swing.JComboBox<>();
        txtTiempoInicial = new javax.swing.JTextField();
        cmbTiempoInicial = new javax.swing.JComboBox<>();
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
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 73, 32));

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
        add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 195, 32));

        txtPosInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtPosInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtPosInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtPosInicial.setText("0");
        txtPosInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtPosInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosInicialActionPerformed(evt);
            }
        });
        add(txtPosInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 195, 32));

        cmbPosInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbPosInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cm", "m", "km", "mi", " " }));
        cmbPosInicial.setBorder(null);
        add(cmbPosInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 73, 32));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Posición inicial");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtPosFinal.setBackground(new java.awt.Color(255, 255, 255));
        txtPosFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtPosFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtPosFinal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtPosFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosFinalActionPerformed(evt);
            }
        });
        add(txtPosFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 195, 32));

        cmbPosFinal.setBackground(new java.awt.Color(255, 255, 255));
        cmbPosFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosFinal.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cm", "m", "km", "mi", " " }));
        cmbPosFinal.setBorder(null);
        add(cmbPosFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 73, 32));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Posición final");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Velocidad inicial");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        cmbVelocidadInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbVelocidadInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbVelocidadInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbVelocidadInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h", "mi/h" }));
        cmbVelocidadInicial.setBorder(null);
        add(cmbVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 73, 32));

        txtVelocidadInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtVelocidadInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtVelocidadInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtVelocidadInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtVelocidadInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVelocidadInicialActionPerformed(evt);
            }
        });
        add(txtVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 195, 32));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tiempo Final");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        txtTiempoFinal.setBackground(new java.awt.Color(255, 255, 255));
        txtTiempoFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtTiempoFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtTiempoFinal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtTiempoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 195, 32));

        cmbTiempoFinal.setBackground(new java.awt.Color(255, 255, 255));
        cmbTiempoFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbTiempoFinal.setForeground(new java.awt.Color(0, 0, 0));
        cmbTiempoFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "s", "min", "h" }));
        cmbTiempoFinal.setBorder(null);
        add(cmbTiempoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 73, 32));

        txtTiempoInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtTiempoInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtTiempoInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtTiempoInicial.setText("0");
        txtTiempoInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtTiempoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 195, 32));

        cmbTiempoInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbTiempoInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbTiempoInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbTiempoInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "s", "min", "h" }));
        cmbTiempoInicial.setBorder(null);
        add(cmbTiempoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 73, 32));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tiempo inicial");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        util.limpiarCampos(this);
        txtPosInicial.setText("0");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double posInicial;
        double posFinal;
        double tiempoFinal;
        double tiempoInicial;
        double velocidadInicial;
        try {
            posInicial = ml.convertirLongitud(Double.parseDouble(txtPosInicial.getText()),
                    cmbPosInicial.getSelectedItem().toString());
            posFinal = ml.convertirLongitud(Double.parseDouble(txtPosFinal.getText()),
                    cmbPosFinal.getSelectedItem().toString());
            tiempoInicial = mt.convertirTiempo(Double.parseDouble(txtTiempoInicial.getText()),
                cmbTiempoInicial.getSelectedItem().toString());
            tiempoFinal = mt.convertirTiempo(Double.parseDouble(txtTiempoFinal.getText()),
                cmbTiempoFinal.getSelectedItem().toString());
            velocidadInicial = mv.convertirVelocidad(Double.parseDouble(txtVelocidadInicial.getText()),
                    cmbVelocidadInicial.getSelectedItem().toString());
            mrua = new ControladorMovRecUniAce(tiempoInicial, tiempoFinal, posInicial, posFinal, 0, velocidadInicial, 0);
            //------ Mostrar cálculos -----//
                JOptionPane.showMessageDialog(this,
                        "Distancia calculada. \n" + mrua.calcularAceleracionFDos()+ " m/s²");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Debe rellenar todos los campos para continuar.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtPosInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosInicialActionPerformed

    private void txtPosFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosFinalActionPerformed

    private void txtVelocidadInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVelocidadInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVelocidadInicialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbPosFinal;
    private javax.swing.JComboBox<String> cmbPosInicial;
    private javax.swing.JComboBox<String> cmbTiempoFinal;
    private javax.swing.JComboBox<String> cmbTiempoInicial;
    private javax.swing.JComboBox<String> cmbVelocidadInicial;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtPosFinal;
    private javax.swing.JTextField txtPosInicial;
    private javax.swing.JTextField txtTiempoFinal;
    private javax.swing.JTextField txtTiempoInicial;
    private javax.swing.JTextField txtVelocidadInicial;
    // End of variables declaration//GEN-END:variables
}
