package vista.movParabolico.velocidadInicial;

import controlador.ControladorMovParabolico;
import controlador.Utilidades;
import controlador.convertidor.ControladorAngulo;
import controlador.convertidor.ControladorLongitud;
import controlador.convertidor.ControladorTiempo;
import javax.swing.JOptionPane;

public class FormulaTres extends javax.swing.JPanel {

    public FormulaTres() {
        initComponents();
        rellenarCombo();
    }

    private ControladorMovParabolico mp = new ControladorMovParabolico();
    private ControladorLongitud ml = new ControladorLongitud();
    private ControladorAngulo ma = new ControladorAngulo();
    private ControladorTiempo mt = new ControladorTiempo();
    private Utilidades util = new Utilidades();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbAlcanceHorizontal = new javax.swing.JComboBox<>();
        txtAlcanceHorizontal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbAngulo = new javax.swing.JComboBox<>();
        txtAngulo = new javax.swing.JTextField();
        txtGravedad = new javax.swing.JTextField();
        cmbGravedad = new javax.swing.JComboBox<>();
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
        jLabel7.setText("Alcance horizontal");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        cmbAlcanceHorizontal.setBackground(new java.awt.Color(255, 255, 255));
        cmbAlcanceHorizontal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbAlcanceHorizontal.setForeground(new java.awt.Color(0, 0, 0));
        cmbAlcanceHorizontal.setBorder(null);
        add(cmbAlcanceHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 73, 32));

        txtAlcanceHorizontal.setBackground(new java.awt.Color(255, 255, 255));
        txtAlcanceHorizontal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtAlcanceHorizontal.setForeground(new java.awt.Color(0, 0, 0));
        txtAlcanceHorizontal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtAlcanceHorizontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlcanceHorizontalActionPerformed(evt);
            }
        });
        add(txtAlcanceHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 195, 32));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ángulo");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        cmbAngulo.setBackground(new java.awt.Color(255, 255, 255));
        cmbAngulo.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbAngulo.setForeground(new java.awt.Color(0, 0, 0));
        cmbAngulo.setBorder(null);
        add(cmbAngulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 73, 32));

        txtAngulo.setBackground(new java.awt.Color(255, 255, 255));
        txtAngulo.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtAngulo.setForeground(new java.awt.Color(0, 0, 0));
        txtAngulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtAngulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 195, 32));

        txtGravedad.setBackground(new java.awt.Color(255, 255, 255));
        txtGravedad.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtGravedad.setForeground(new java.awt.Color(0, 0, 0));
        txtGravedad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtGravedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGravedadActionPerformed(evt);
            }
        });
        add(txtGravedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 195, 32));

        cmbGravedad.setBackground(new java.awt.Color(255, 255, 255));
        cmbGravedad.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbGravedad.setForeground(new java.awt.Color(0, 0, 0));
        cmbGravedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s²" }));
        cmbGravedad.setBorder(null);
        add(cmbGravedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 73, 32));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Gravedad");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        util.limpiarCampos(this);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double alcanceHorizontal;
        double angulo;
        double gravedad;
        try {
            alcanceHorizontal = ml.convertirLongitud(Double.parseDouble(txtAlcanceHorizontal.getText()),
                    cmbAlcanceHorizontal.getSelectedItem().toString());
            angulo = ma.convertirAngulo(Double.parseDouble(txtAngulo.getText()),
                    cmbAngulo.getSelectedItem().toString());
            gravedad = Double.parseDouble(txtGravedad.getText());
            mp = new ControladorMovParabolico(0, 0, 0, gravedad,
                    alcanceHorizontal, 0, 0, 0, angulo, 0, 0, 0);
            //------ Mostrar cálculos -----//
            JOptionPane.showMessageDialog(this,
                    "Altura calculada. \n" + mp.calcularVelocidadInicialFTres()+ " m/s");
            util.limpiarCampos(this);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Debe rellenar todos los campos para continuar.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtAlcanceHorizontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlcanceHorizontalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlcanceHorizontalActionPerformed

    private void txtGravedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGravedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGravedadActionPerformed

    private void rellenarCombo() {
        ma.rellenarCombo(cmbAngulo);
        ml.rellenarCombo(cmbAlcanceHorizontal);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlcanceHorizontal;
    private javax.swing.JComboBox<String> cmbAngulo;
    private javax.swing.JComboBox<String> cmbGravedad;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAlcanceHorizontal;
    private javax.swing.JTextField txtAngulo;
    private javax.swing.JTextField txtGravedad;
    // End of variables declaration//GEN-END:variables
}
