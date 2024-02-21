package vista.mru;

import controlador.ControladorMovRecUni;
import controlador.Utilidades;
import controlador.VisualizarFormula;
import javax.swing.JOptionPane;
import controlador.convertidor.ControladorLongitud;
import controlador.convertidor.ControladorTiempo;

public class Velocidad extends javax.swing.JPanel {

    public Velocidad() {
        initComponents();
        VisualizarFormula vf = new VisualizarFormula("");
        vf.setFormula("V = \\frac{x_f-x_i}{t_f-  t_i}");
        labelBase.setIcon(vf.getIcon());
        rellenarCombo();
    }

    private controlador.ControladorMovRecUni mru = new ControladorMovRecUni();
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
        cmbPosicionFinal = new javax.swing.JComboBox<>();
        txtPosicionFinal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbTiempoInicial = new javax.swing.JComboBox<>();
        txtTiempoInicial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelBase = new javax.swing.JLabel();
        labelRemplazo = new javax.swing.JLabel();
        labelResta = new javax.swing.JLabel();
        labelRespuesta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbTiempoFinal.setBackground(new java.awt.Color(255, 255, 255));
        cmbTiempoFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbTiempoFinal.setForeground(new java.awt.Color(0, 0, 0));
        cmbTiempoFinal.setBorder(null);
        add(cmbTiempoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 336, 73, 32));

        txtTiempoFinal.setBackground(new java.awt.Color(255, 255, 255));
        txtTiempoFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtTiempoFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtTiempoFinal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtTiempoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 336, 195, 32));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Digite los datos");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 38, -1, -1));

        cmbPosicionInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbPosicionInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosicionInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosicionInicial.setBorder(null);
        add(cmbPosicionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 132, 73, 32));

        txtPosicionInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtPosicionInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtPosicionInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtPosicionInicial.setText("0");
        txtPosicionInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtPosicionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 132, 195, 32));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Posición inicial");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 108, -1, -1));

        cmbPosicionFinal.setBackground(new java.awt.Color(255, 255, 255));
        cmbPosicionFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosicionFinal.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosicionFinal.setBorder(null);
        add(cmbPosicionFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 73, 32));

        txtPosicionFinal.setBackground(new java.awt.Color(255, 255, 255));
        txtPosicionFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtPosicionFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtPosicionFinal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtPosicionFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 200, 195, 32));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Posición final");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 176, -1, -1));

        cmbTiempoInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbTiempoInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbTiempoInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbTiempoInicial.setBorder(null);
        add(cmbTiempoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 268, 73, 32));

        txtTiempoInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtTiempoInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtTiempoInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtTiempoInicial.setText("0");
        txtTiempoInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtTiempoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 268, 195, 32));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tiempo inicial");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 244, -1, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 27)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Respuesta");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 40, 390, -1));

        labelBase.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        labelBase.setForeground(new java.awt.Color(0, 0, 0));
        labelBase.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(labelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 360, 70));

        labelRemplazo.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        labelRemplazo.setForeground(new java.awt.Color(0, 0, 0));
        labelRemplazo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(labelRemplazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 360, 70));

        labelResta.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        labelResta.setForeground(new java.awt.Color(0, 0, 0));
        labelResta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(labelResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 360, 70));

        labelRespuesta.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        labelRespuesta.setForeground(new java.awt.Color(0, 0, 0));
        labelRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(labelRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 360, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        util.limpiarCampos(this);
        Utilidades.aCero(txtTiempoInicial);
        Utilidades.aCero(txtPosicionInicial);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double posInicial;
        double posFinal;
        double tiempoInicial;
        double tiempoFinal;
        try {
            //----- Recoger datos y convertirlos en S.I. -----//
            tiempoInicial = mt.convertirTiempo(Double.parseDouble(txtTiempoInicial.getText()),
                    cmbTiempoInicial.getSelectedItem().toString());
            tiempoFinal = mt.convertirTiempo(Double.parseDouble(txtTiempoFinal.getText()),
                    cmbTiempoFinal.getSelectedItem().toString());
            posInicial = ml.convertirLongitud(Double.parseDouble(txtPosicionInicial.getText()),
                    cmbPosicionInicial.getSelectedItem().toString());
            posFinal = ml.convertirLongitud(Double.parseDouble(txtPosicionFinal.getText()),
                    cmbPosicionFinal.getSelectedItem().toString());
            //----- Guardar datos -----//
            mru = new ControladorMovRecUni(tiempoInicial, tiempoFinal, 0, posInicial, posFinal);
            //----- Condición para mostrar cálculos -----//
            if (tiempoFinal > tiempoInicial) {
                double diferenciaPosicion = posFinal - posInicial;
                double diferenciaTiempo = tiempoFinal - tiempoInicial;
                VisualizarFormula vf = new VisualizarFormula("");
                vf.setFormula("V = \\frac{" + posFinal + "m - " + posInicial + " m} "
                        + "{" + tiempoFinal + "s - " + tiempoInicial + " s}");
                labelRemplazo.setIcon(vf.getIcon());
                vf.setFormula("V = \\frac{" + diferenciaPosicion + "m} {" + diferenciaTiempo + " s}");
                labelResta.setIcon(vf.getIcon());
                vf.setFormula("V = " + mru.calcularVelocidad() + " \\frac{m}{s}");
                labelRespuesta.setIcon(vf.getIcon());
                JOptionPane.showMessageDialog(this, "Velocidad calculada. \n" + mru.calcularVelocidad() + " m/s");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos "
                    + "los campos para continuar..", "Error", 0);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rellenarCombo(){
        ml.rellenarCombo(cmbPosicionInicial);
        ml.rellenarCombo(cmbPosicionFinal);
        mt.rellenarCombo(cmbTiempoInicial);
        mt.rellenarCombo(cmbTiempoFinal);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbPosicionFinal;
    private javax.swing.JComboBox<String> cmbPosicionInicial;
    private javax.swing.JComboBox<String> cmbTiempoFinal;
    private javax.swing.JComboBox<String> cmbTiempoInicial;
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
    private javax.swing.JTextField txtPosicionFinal;
    private javax.swing.JTextField txtPosicionInicial;
    private javax.swing.JTextField txtTiempoFinal;
    private javax.swing.JTextField txtTiempoInicial;
    // End of variables declaration//GEN-END:variables
}
