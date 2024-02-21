package vista.mrua.distancia;

import controlador.Utilidades;
import controlador.ControladorMovRecUniAce;
import controlador.convertidor.ControladorLongitud;
import controlador.convertidor.ControladorTiempo;
import controlador.convertidor.ControladorVelocidad;
import javax.swing.JOptionPane;

public class FormulaUno extends javax.swing.JPanel {

    public FormulaUno() {
        initComponents();
        rellenarCombo();
    }

    private ControladorMovRecUniAce mrua = new ControladorMovRecUniAce();
    private ControladorVelocidad mv = new ControladorVelocidad();
    private ControladorTiempo mt = new ControladorTiempo();
    private ControladorLongitud ml = new ControladorLongitud();
    private Utilidades util = new Utilidades();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtTiempoFinal = new javax.swing.JTextField();
        cmbTiempoFinal = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbPosicionInicial = new javax.swing.JComboBox<>();
        txtPosicionInicial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtVelocidadInicial = new javax.swing.JTextField();
        cmbVelocidadInicial = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtTiempoInicial = new javax.swing.JTextField();
        cmbTiempoInicial = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbAceleracion = new javax.swing.JComboBox<>();
        txtAceleracion = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(720, 470));
        setMinimumSize(new java.awt.Dimension(720, 470));
        setPreferredSize(new java.awt.Dimension(720, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        cmbTiempoFinal.setBorder(null);
        add(cmbTiempoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 73, 32));

        jLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Digite los datos");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        cmbPosicionInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbPosicionInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosicionInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosicionInicial.setBorder(null);
        add(cmbPosicionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 73, 32));

        txtPosicionInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtPosicionInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtPosicionInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtPosicionInicial.setText("0");
        txtPosicionInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtPosicionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 195, 32));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Posición inicial");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtVelocidadInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtVelocidadInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtVelocidadInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtVelocidadInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 195, 32));

        cmbVelocidadInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbVelocidadInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbVelocidadInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbVelocidadInicial.setBorder(null);
        add(cmbVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 73, 32));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Velocidad inicial");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        txtTiempoInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtTiempoInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtTiempoInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtTiempoInicial.setText("0");
        txtTiempoInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtTiempoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 195, 32));

        cmbTiempoInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbTiempoInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbTiempoInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbTiempoInicial.setBorder(null);
        add(cmbTiempoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 73, 32));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tiempo inicial");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Aceleración");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        cmbAceleracion.setBackground(new java.awt.Color(255, 255, 255));
        cmbAceleracion.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbAceleracion.setForeground(new java.awt.Color(0, 0, 0));
        cmbAceleracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s²" }));
        cmbAceleracion.setBorder(null);
        add(cmbAceleracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 73, 32));

        txtAceleracion.setBackground(new java.awt.Color(255, 255, 255));
        txtAceleracion.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtAceleracion.setForeground(new java.awt.Color(0, 0, 0));
        txtAceleracion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtAceleracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 195, 32));

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        util.limpiarCampos(this);
        txtPosicionInicial.setText("0");
        txtTiempoInicial.setText("0");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double posInicial;
        double velocidadInicial;
        double tiempoInicial;
        double tiempoFinal;
        double aceleracion;
        try {
            posInicial = ml.convertirLongitud(Double.parseDouble(txtPosicionInicial.getText()),
                    cmbPosicionInicial.getSelectedItem().toString());
            velocidadInicial = mv.convertirVelocidad(Double.parseDouble(txtVelocidadInicial.getText()),
                    cmbVelocidadInicial.getSelectedItem().toString());
            tiempoInicial = mt.convertirTiempo(Double.parseDouble(txtTiempoInicial.getText()),
                    cmbTiempoInicial.getSelectedItem().toString());
            tiempoFinal = mt.convertirTiempo(Double.parseDouble(txtTiempoFinal.getText()),
                    cmbTiempoFinal.getSelectedItem().toString());
            aceleracion = Double.parseDouble(txtAceleracion.getText());
            //------ Mostrar cálculos -----//
            if (tiempoFinal > tiempoInicial) {
                JOptionPane.showMessageDialog(this,
                        "Distancia calculada. \n" + mrua.calcularDistanciaFUno() + " m");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Debe rellenar todos los campos para continuar.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rellenarCombo() {
        ml.rellenarCombo(cmbPosicionInicial);
        mt.rellenarCombo(cmbTiempoInicial);
        mt.rellenarCombo(cmbTiempoFinal);
        mv.rellenarCombo(cmbVelocidadInicial);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAceleracion;
    private javax.swing.JComboBox<String> cmbPosicionInicial;
    private javax.swing.JComboBox<String> cmbTiempoFinal;
    private javax.swing.JComboBox<String> cmbTiempoInicial;
    private javax.swing.JComboBox<String> cmbVelocidadInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAceleracion;
    private javax.swing.JTextField txtPosicionInicial;
    private javax.swing.JTextField txtTiempoFinal;
    private javax.swing.JTextField txtTiempoInicial;
    private javax.swing.JTextField txtVelocidadInicial;
    // End of variables declaration//GEN-END:variables
}
