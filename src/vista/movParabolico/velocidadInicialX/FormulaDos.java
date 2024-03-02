package vista.movParabolico.velocidadInicialX;

import controlador.ControladorMovParabolico;
import controlador.Utilidades;
import controlador.convertidor.ControladorLongitud;
import controlador.convertidor.ControladorTiempo;
import javax.swing.JOptionPane;

public class FormulaDos extends javax.swing.JPanel {

    public FormulaDos() {
        initComponents();
        rellenarCombo();
    }

    private ControladorMovParabolico mp = new ControladorMovParabolico();
    private ControladorLongitud ml = new ControladorLongitud();
    private ControladorTiempo mt = new ControladorTiempo();
    private Utilidades util = new Utilidades();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbDistancia = new javax.swing.JComboBox<>();
        txDistancia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbTiempo = new javax.swing.JComboBox<>();
        txtTiempo = new javax.swing.JTextField();

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
        jLabel7.setText("Distancia");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        cmbDistancia.setBackground(new java.awt.Color(255, 255, 255));
        cmbDistancia.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbDistancia.setForeground(new java.awt.Color(0, 0, 0));
        cmbDistancia.setBorder(null);
        add(cmbDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 73, 32));

        txDistancia.setBackground(new java.awt.Color(255, 255, 255));
        txDistancia.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txDistancia.setForeground(new java.awt.Color(0, 0, 0));
        txDistancia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDistanciaActionPerformed(evt);
            }
        });
        add(txDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 195, 32));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tiempo");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        cmbTiempo.setBackground(new java.awt.Color(255, 255, 255));
        cmbTiempo.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbTiempo.setForeground(new java.awt.Color(0, 0, 0));
        cmbTiempo.setBorder(null);
        add(cmbTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 73, 32));

        txtTiempo.setBackground(new java.awt.Color(255, 255, 255));
        txtTiempo.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(0, 0, 0));
        txtTiempo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 195, 32));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        util.limpiarCampos(this);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double distancia;
        double tiempo;
        try {
            distancia = ml.convertirLongitud(Double.parseDouble(txDistancia.getText()),
                    cmbDistancia.getSelectedItem().toString());
            tiempo = mt.convertirTiempo(Double.parseDouble(txtTiempo.getText()),
                    cmbTiempo.getSelectedItem().toString());
            mp = new ControladorMovParabolico(0, 0, 0, 0,
                    distancia, 0, 0, 0, 0, tiempo, 0, 0);
            //------ Mostrar cálculos -----//
            JOptionPane.showMessageDialog(this,
                    "Velocidad inicial en x calculada. \n" + mp.calcularVelocidadInicialXFDos()+ " m/s");
            util.limpiarCampos(this);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Debe rellenar todos los campos para continuar.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDistanciaActionPerformed

    private void rellenarCombo() {
        mt.rellenarCombo(cmbTiempo);
        ml.rellenarCombo(cmbDistancia);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbDistancia;
    private javax.swing.JComboBox<String> cmbTiempo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txDistancia;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
