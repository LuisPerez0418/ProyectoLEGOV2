package vista.movParabolico.velocidadInicialX;

import controlador.ControladorMovParabolico;
import controlador.Utilidades;
import controlador.convertidor.ControladorTiempo;
import controlador.convertidor.ControladorVelocidad;
import javax.swing.JOptionPane;

public class FormulaTres extends javax.swing.JPanel {

    public FormulaTres() {
        initComponents();
        rellenarCombo();
    }

    private ControladorMovParabolico mp = new ControladorMovParabolico();
    private ControladorVelocidad mv = new ControladorVelocidad();
    private ControladorTiempo mt = new ControladorTiempo();
    private Utilidades util = new Utilidades();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbVelocidadInicial = new javax.swing.JComboBox<>();
        txtVelocidadInicial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbVelocidadInicialY = new javax.swing.JComboBox<>();
        txtVelocidadInicialY = new javax.swing.JTextField();

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
        jLabel7.setText("Velocidad inicial");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        cmbVelocidadInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbVelocidadInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbVelocidadInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbVelocidadInicial.setBorder(null);
        add(cmbVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 73, 32));

        txtVelocidadInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtVelocidadInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtVelocidadInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtVelocidadInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtVelocidadInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVelocidadInicialActionPerformed(evt);
            }
        });
        add(txtVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 195, 32));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Velocidad inicial en y");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        cmbVelocidadInicialY.setBackground(new java.awt.Color(255, 255, 255));
        cmbVelocidadInicialY.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbVelocidadInicialY.setForeground(new java.awt.Color(0, 0, 0));
        cmbVelocidadInicialY.setBorder(null);
        add(cmbVelocidadInicialY, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 73, 32));

        txtVelocidadInicialY.setBackground(new java.awt.Color(255, 255, 255));
        txtVelocidadInicialY.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtVelocidadInicialY.setForeground(new java.awt.Color(0, 0, 0));
        txtVelocidadInicialY.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtVelocidadInicialY, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 195, 32));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        util.limpiarCampos(this);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double velocidadInicialy;
        double velocidadIncial;
        try {
            velocidadInicialy = mv.convertirVelocidad(Double.parseDouble(txtVelocidadInicialY.getText()),
                    cmbVelocidadInicialY.getSelectedItem().toString());
            velocidadIncial = mv.convertirVelocidad(Double.parseDouble(txtVelocidadInicial.getText()),
                    cmbVelocidadInicial.getSelectedItem().toString());
            mp = new ControladorMovParabolico(velocidadIncial, 0, velocidadInicialy, 0,
                    0, 0, 0, 0, 0, 0, 0, 0);
            //------ Mostrar cálculos -----//
            JOptionPane.showMessageDialog(this,
                    "Velocidad inicial en x calculada. \n" + mp.calcularAlturaFTres()+ " m/s");
            util.limpiarCampos(this);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Debe rellenar todos los campos para continuar.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtVelocidadInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVelocidadInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVelocidadInicialActionPerformed

    private void rellenarCombo() {
        mv.rellenarCombo(cmbVelocidadInicial);
        mv.rellenarCombo(cmbVelocidadInicialY);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbVelocidadInicial;
    private javax.swing.JComboBox<String> cmbVelocidadInicialY;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtVelocidadInicial;
    private javax.swing.JTextField txtVelocidadInicialY;
    // End of variables declaration//GEN-END:variables
}
