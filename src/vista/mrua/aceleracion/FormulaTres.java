package vista.mrua.aceleracion;

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
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        txtPosInicial = new javax.swing.JTextField();
        cmbPosInicial = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPosFinal = new javax.swing.JTextField();
        cmbPosFinal = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtVelocidadInicial = new javax.swing.JTextField();
        cmbVelocidadInicial = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbVelocidadFinal = new javax.swing.JComboBox<>();
        txtVelocidadFinal = new javax.swing.JTextField();

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
        add(txtPosInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 195, 32));

        cmbPosInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbPosInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosInicial.setBorder(null);
        add(cmbPosInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 73, 32));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Posición inicial");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtPosFinal.setBackground(new java.awt.Color(255, 255, 255));
        txtPosFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtPosFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtPosFinal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtPosFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosFinalActionPerformed(evt);
            }
        });
        add(txtPosFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 195, 32));

        cmbPosFinal.setBackground(new java.awt.Color(255, 255, 255));
        cmbPosFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosFinal.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosFinal.setBorder(null);
        add(cmbPosFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 73, 32));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Posición final");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

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

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Velocidad final");
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        util.limpiarCampos(this);
        txtPosInicial.setText("0");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double velocidadInicial;
        double velocidadFinal;
        double posInicial;
        double posFinal;
        try {
            velocidadInicial = mv.convertirVelocidad(Double.parseDouble(txtVelocidadInicial.getText()),
                cmbVelocidadInicial.getSelectedItem().toString());
            velocidadFinal = mv.convertirVelocidad(Double.parseDouble(txtVelocidadFinal.getText()),
                cmbVelocidadFinal.getSelectedItem().toString());
            posInicial = ml.convertirLongitud(Double.parseDouble(txtPosInicial.getText()),
                    cmbPosInicial.getSelectedItem().toString());
            posFinal = ml.convertirLongitud(Double.parseDouble(txtPosFinal.getText()),
                    cmbPosFinal.getSelectedItem().toString());
            mrua = new ControladorMovRecUniAce(0, 0, posInicial, posFinal, 0, velocidadInicial, velocidadFinal);
            //------ Mostrar cálculos -----//
                JOptionPane.showMessageDialog(this,
                        "Distancia calculada. \n" + mrua.calcularAceleracionFTres()+ " m/s²");
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

    private void rellenarCombo(){
        ml.rellenarCombo(cmbPosInicial);
        ml.rellenarCombo(cmbPosFinal);
        mv.rellenarCombo(cmbVelocidadInicial);
        mv.rellenarCombo(cmbVelocidadFinal);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbPosFinal;
    private javax.swing.JComboBox<String> cmbPosInicial;
    private javax.swing.JComboBox<String> cmbVelocidadFinal;
    private javax.swing.JComboBox<String> cmbVelocidadInicial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtPosFinal;
    private javax.swing.JTextField txtPosInicial;
    private javax.swing.JTextField txtVelocidadFinal;
    private javax.swing.JTextField txtVelocidadInicial;
    // End of variables declaration//GEN-END:variables
}
