package vista.mru;

import controlador.ControladorMovRecUni;
import controlador.Utilidades;
import javax.swing.JOptionPane;
import controlador.convertidor.ControladorLongitud;
import controlador.convertidor.ControladorTiempo;
import controlador.convertidor.ControladorVelocidad;

public class Distancia extends javax.swing.JPanel {

    public Distancia() {
        initComponents();
    }

    private controlador.ControladorMovRecUni mru = new ControladorMovRecUni();
    private ControladorVelocidad mv = new ControladorVelocidad();
    private ControladorTiempo mt = new ControladorTiempo();
    private ControladorLongitud ml = new ControladorLongitud();
    private Utilidades util = new Utilidades();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbTiempoFinal = new javax.swing.JComboBox<>();
        txtTiempoFinal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbPosicionInicial = new javax.swing.JComboBox<>();
        txtPosicionInicial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbVelocidad = new javax.swing.JComboBox<>();
        txtVelocidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbTiempoInicial = new javax.swing.JComboBox<>();
        txtTiempoInicial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelBase = new javax.swing.JLabel();
        labelRemplazo = new javax.swing.JLabel();
        labelRespuesta = new javax.swing.JLabel();
        labelResta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(720, 470));
        setMinimumSize(new java.awt.Dimension(720, 470));
        setPreferredSize(new java.awt.Dimension(720, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbTiempoFinal.setBackground(null);
        cmbTiempoFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbTiempoFinal.setForeground(new java.awt.Color(0, 0, 0));
        cmbTiempoFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "s", "min", "h" }));
        cmbTiempoFinal.setBorder(null);
        add(cmbTiempoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 336, 73, 32));

        txtTiempoFinal.setBackground(null);
        txtTiempoFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtTiempoFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtTiempoFinal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtTiempoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 336, 195, 32));

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tiempo Final");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 312, -1, -1));

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
        add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 386, 195, 32));

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
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 386, 73, 32));

        jLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Digite los datos");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 38, -1, -1));

        cmbPosicionInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbPosicionInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosicionInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosicionInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cm", "m", "km", "mi" }));
        cmbPosicionInicial.setBorder(null);
        add(cmbPosicionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 132, 73, 32));

        txtPosicionInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtPosicionInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtPosicionInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtPosicionInicial.setText("0");
        txtPosicionInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtPosicionInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPosicionInicialMouseClicked(evt);
            }
        });
        txtPosicionInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosicionInicialActionPerformed(evt);
            }
        });
        add(txtPosicionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 132, 195, 32));

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Posición inicial");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 108, -1, -1));

        cmbVelocidad.setBackground(new java.awt.Color(255, 255, 255));
        cmbVelocidad.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbVelocidad.setForeground(new java.awt.Color(0, 0, 0));
        cmbVelocidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h", "mi/h" }));
        cmbVelocidad.setBorder(null);
        add(cmbVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 73, 32));

        txtVelocidad.setBackground(new java.awt.Color(255, 255, 255));
        txtVelocidad.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtVelocidad.setForeground(new java.awt.Color(0, 0, 0));
        txtVelocidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 200, 195, 32));

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Velocidad");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 176, -1, -1));

        cmbTiempoInicial.setBackground(null);
        cmbTiempoInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbTiempoInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbTiempoInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "s", "min", "h" }));
        cmbTiempoInicial.setBorder(null);
        add(cmbTiempoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 268, 73, 32));

        txtTiempoInicial.setBackground(null);
        txtTiempoInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtTiempoInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtTiempoInicial.setText("0");
        txtTiempoInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtTiempoInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTiempoInicialMouseClicked(evt);
            }
        });
        add(txtTiempoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 268, 195, 32));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tiempo inicial");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 244, -1, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 27)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Respuesta");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 410, -1));

        labelBase.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        labelBase.setForeground(new java.awt.Color(0, 0, 0));
        labelBase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBase.setText("X = V * (tf - ti) + Xi");
        add(labelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 130, 390, -1));

        labelRemplazo.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        labelRemplazo.setForeground(new java.awt.Color(0, 0, 0));
        labelRemplazo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRemplazo.setText(" ");
        add(labelRemplazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 170, 390, -1));

        labelRespuesta.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        labelRespuesta.setForeground(new java.awt.Color(0, 0, 0));
        labelRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRespuesta.setText(" ");
        add(labelRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 250, 390, -1));

        labelResta.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        labelResta.setForeground(new java.awt.Color(0, 0, 0));
        labelResta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResta.setText(" ");
        add(labelResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 210, 390, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double posInicial;
        double velocidad;
        double tiempoFinal;
        double tiempoInicial;
        try {
            
            tiempoInicial = mt.convertirTiempo(Double.parseDouble(txtTiempoInicial.getText()),
                    cmbTiempoInicial.getSelectedItem().toString());
            tiempoFinal = mt.convertirTiempo(Double.parseDouble(txtTiempoFinal.getText()),
                    cmbTiempoFinal.getSelectedItem().toString());
            posInicial = ml.convertirLongitud(Double.parseDouble(txtPosicionInicial.getText()),
                    cmbPosicionInicial.getSelectedItem().toString());
            velocidad = mv.convertirVelocidad(Double.parseDouble(txtVelocidad.getText()),
                    cmbVelocidad.getSelectedItem().toString());
            //----- Guardar datos -----//
            mru = new ControladorMovRecUni(tiempoInicial, tiempoFinal, velocidad, posInicial, 0);
            //----- Condición para mostrar cálculos -----//
            if (tiempoFinal > tiempoInicial) {
                labelRemplazo.setText("X = " + velocidad + " m/s * (" + tiempoFinal
                        + " s - " + tiempoInicial + " s) + " + posInicial + " m");
                labelResta.setText("X = " + velocidad + " m/s * "
                        + (tiempoFinal - tiempoInicial) + " s + " + posInicial + " m");
                labelRespuesta.setText("X = " + mru.calcularPosicion() + " m");
                JOptionPane.showMessageDialog(this,
                        "Distancia calculada. \n" + mru.calcularPosicion() + "m");
            } else {
                limpiarLabel();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos "
                    + "los campos para continuar..", "Error", 0);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        util.limpiarCampos(this);
        Utilidades.aCero(txtTiempoInicial);
        Utilidades.aCero(txtPosicionInicial);
        limpiarLabel();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtPosicionInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosicionInicialActionPerformed

    }//GEN-LAST:event_txtPosicionInicialActionPerformed

    private void txtPosicionInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPosicionInicialMouseClicked

    }//GEN-LAST:event_txtPosicionInicialMouseClicked

    private void txtTiempoInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTiempoInicialMouseClicked

    }//GEN-LAST:event_txtTiempoInicialMouseClicked

    private void limpiarLabel() {
        labelRemplazo.setText("");
        labelRemplazo.setText("");
        labelResta.setText("");
        labelRespuesta.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbPosicionInicial;
    private javax.swing.JComboBox<String> cmbTiempoFinal;
    private javax.swing.JComboBox<String> cmbTiempoInicial;
    private javax.swing.JComboBox<String> cmbVelocidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelBase;
    private javax.swing.JLabel labelRemplazo;
    private javax.swing.JLabel labelRespuesta;
    private javax.swing.JLabel labelResta;
    private javax.swing.JTextField txtPosicionInicial;
    private javax.swing.JTextField txtTiempoFinal;
    private javax.swing.JTextField txtTiempoInicial;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables
}
