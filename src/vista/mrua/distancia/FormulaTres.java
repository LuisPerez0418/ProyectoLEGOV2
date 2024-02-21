package vista.mrua.distancia;

import controlador.Utilidades;
import controlador.ControladorMovRecUniAce;
import controlador.convertidor.ControladorLongitud;
import controlador.convertidor.ControladorVelocidad;
import javax.swing.JOptionPane;

public class FormulaTres extends javax.swing.JPanel {

    public FormulaTres() {
        initComponents();
        rellenarCombo();
    }

    private ControladorMovRecUniAce mrua = new ControladorMovRecUniAce();
    private ControladorVelocidad mv = new ControladorVelocidad();
    private ControladorLongitud ml = new ControladorLongitud();
    private Utilidades util = new Utilidades();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtVelocidadInicial = new javax.swing.JTextField();
        cmbVelocidadInicial = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbVelocidadFinal = new javax.swing.JComboBox<>();
        txtVelocidadFinal = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmbAceleracion = new javax.swing.JComboBox<>();
        txtAceleracion = new javax.swing.JTextField();
        cmbPosicionInicial = new javax.swing.JComboBox<>();
        txtPosicionInicial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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

        txtVelocidadInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtVelocidadInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtVelocidadInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtVelocidadInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 195, 32));

        cmbVelocidadInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbVelocidadInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbVelocidadInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbVelocidadInicial.setBorder(null);
        add(cmbVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 73, 32));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Velocidad inicial");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Velocidad final");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

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

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Aceleración");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        cmbAceleracion.setBackground(new java.awt.Color(255, 255, 255));
        cmbAceleracion.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbAceleracion.setForeground(new java.awt.Color(0, 0, 0));
        cmbAceleracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s²" }));
        cmbAceleracion.setBorder(null);
        add(cmbAceleracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 73, 32));

        txtAceleracion.setBackground(new java.awt.Color(255, 255, 255));
        txtAceleracion.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtAceleracion.setForeground(new java.awt.Color(0, 0, 0));
        txtAceleracion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtAceleracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 195, 32));

        cmbPosicionInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbPosicionInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosicionInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosicionInicial.setBorder(null);
        add(cmbPosicionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 73, 32));

        txtPosicionInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtPosicionInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtPosicionInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtPosicionInicial.setText("0");
        txtPosicionInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtPosicionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 195, 32));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Posición inicial");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        util.limpiarCampos(this);
        txtPosicionInicial.setText("0");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double velocidadInicial;
        double velocidadFinal;
        double aceleracion;
        double posInicial;
        try {
            velocidadInicial = mv.convertirVelocidad(Double.parseDouble(txtVelocidadInicial.getText()),
                    cmbVelocidadInicial.getSelectedItem().toString());
            velocidadFinal = mv.convertirVelocidad(Double.parseDouble(txtVelocidadFinal.getText()),
                    cmbVelocidadFinal.getSelectedItem().toString());
            aceleracion = Double.parseDouble(txtAceleracion.getText());
            posInicial = ml.convertirLongitud(Double.parseDouble(txtPosicionInicial.getText()),
                    cmbPosicionInicial.getSelectedItem().toString());
            mrua = new ControladorMovRecUniAce(0, 0, posInicial, 0, aceleracion, velocidadInicial, velocidadFinal);
            //------ Mostrar cálculos -----//
            JOptionPane.showMessageDialog(this,
                    "Distancia calculada. \n" + mrua.calcularDistanciaFTres() + " m");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Debe rellenar todos los campos para continuar.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rellenarCombo() {
        ml.rellenarCombo(cmbPosicionInicial);
        mv.rellenarCombo(cmbVelocidadInicial);
        mv.rellenarCombo(cmbVelocidadFinal);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAceleracion;
    private javax.swing.JComboBox<String> cmbPosicionInicial;
    private javax.swing.JComboBox<String> cmbVelocidadFinal;
    private javax.swing.JComboBox<String> cmbVelocidadInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAceleracion;
    private javax.swing.JTextField txtPosicionInicial;
    private javax.swing.JTextField txtVelocidadFinal;
    private javax.swing.JTextField txtVelocidadInicial;
    // End of variables declaration//GEN-END:variables
}
