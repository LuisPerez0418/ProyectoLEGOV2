package vista.mru;

import controlador.ControladorMovRecUni;
import controlador.Utilidades;
import controlador.VisualizarFormula;
import javax.swing.JOptionPane;
import modelo.ModeloMovHorizontal;
import controlador.convertidor.ControladorLongitud;
import controlador.convertidor.ControladorVelocidad;

public class Tiempo extends javax.swing.JPanel {

    public Tiempo() {
        initComponents();
        VisualizarFormula vf = new VisualizarFormula("");
        vf.setFormula("T = \\frac{X_f - X_i}{V}");
        labelBase.setIcon(vf.getIcon());
        rellenarCombo();
    }

    private modelo.ModeloMovHorizontal mru = new ModeloMovHorizontal();
    private controlador.ControladorMovRecUni mruc = new ControladorMovRecUni();
    private ControladorVelocidad mv = new ControladorVelocidad();
    private ControladorLongitud ml = new ControladorLongitud();
    private Utilidades util = new Utilidades();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        cmbPosicionInicial = new javax.swing.JComboBox<>();
        txtPosicionInicial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbPosicionFinal = new javax.swing.JComboBox<>();
        txtPosicionFinal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbVelocidad = new javax.swing.JComboBox<>();
        txtVelocidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        labelBase = new javax.swing.JLabel();
        labelRemplazo = new javax.swing.JLabel();
        labelRespuesta = new javax.swing.JLabel();
        labelResta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Digite los datos");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 38, -1, -1));

        cmbPosicionInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosicionInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosicionInicial.setBorder(null);
        add(cmbPosicionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 132, 73, 32));

        txtPosicionInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtPosicionInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtPosicionInicial.setText("0");
        txtPosicionInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtPosicionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 132, 195, 32));

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Posición inicial");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 108, -1, -1));

        cmbPosicionFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosicionFinal.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosicionFinal.setBorder(null);
        add(cmbPosicionFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 73, 32));

        txtPosicionFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtPosicionFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtPosicionFinal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtPosicionFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 200, 195, 32));

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Posición final");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 176, -1, -1));

        cmbVelocidad.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbVelocidad.setForeground(new java.awt.Color(0, 0, 0));
        cmbVelocidad.setBorder(null);
        add(cmbVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 268, 73, 32));

        txtVelocidad.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtVelocidad.setForeground(new java.awt.Color(0, 0, 0));
        txtVelocidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 268, 195, 32));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Velocidad");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 244, -1, -1));

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
        add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 318, 195, 32));

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
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 318, 73, 32));

        jLabel6.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 27)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Respuesta");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 410, -1));

        labelBase.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        labelBase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        double posFinal;
        double velocidad;
        try {
            //----- Recoger datos y convertirlos en S.I. -----//
            posInicial = ml.convertirLongitud(Double.parseDouble(txtPosicionInicial.getText()),
                    cmbPosicionInicial.getSelectedItem().toString());
            posFinal = ml.convertirLongitud(Double.parseDouble(txtPosicionFinal.getText()),
                    cmbPosicionFinal.getSelectedItem().toString());
            velocidad = mv.convertirVelocidad(Double.parseDouble(txtVelocidad.getText()),
                    cmbVelocidad.getSelectedItem().toString());
            //----- Guardar datos -----//        
            mruc = new ControladorMovRecUni(0, 0, velocidad, posInicial, posFinal);
            //----- Mostrar cálculos -----//
            VisualizarFormula vf = new VisualizarFormula("");
            vf.setFormula("V = (" + posFinal + " m - "+ posInicial + " m) * "
                    + velocidad + " m/s");
            labelRemplazo.setIcon(vf.getIcon());
            vf.setFormula("V = " + (posFinal - posInicial) + " m * "
                    + velocidad + " m/s");
            labelResta.setIcon(vf.getIcon());
            vf.setFormula(mruc.calcularTiempo() + " s"); 
            labelRespuesta.setIcon(vf.getIcon());
            JOptionPane.showMessageDialog(this,
                    "Tiempo calculado. \n" + mruc.calcularTiempo() + " s");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos "
                    + "los campos para continuar..", "Error", 0);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        util.limpiarCampos(this);
        Utilidades.aCero(txtPosicionInicial);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void rellenarCombo(){
        ml.rellenarCombo(cmbPosicionInicial);
        ml.rellenarCombo(cmbPosicionFinal);
        mv.rellenarCombo(cmbVelocidad);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbPosicionFinal;
    private javax.swing.JComboBox<String> cmbPosicionInicial;
    private javax.swing.JComboBox<String> cmbVelocidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelBase;
    private javax.swing.JLabel labelRemplazo;
    private javax.swing.JLabel labelRespuesta;
    private javax.swing.JLabel labelResta;
    private javax.swing.JTextField txtPosicionFinal;
    private javax.swing.JTextField txtPosicionInicial;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables
}
