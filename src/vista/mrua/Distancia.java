package vista.mrua;

import controlador.Utilidades;
import controlador.ControladorMovRecUniAce;
import controlador.convertidor.ControladorLongitud;
import controlador.convertidor.ControladorTiempo;
import controlador.convertidor.ControladorVelocidad;
import java.awt.BorderLayout;
import vista.mrua.distancia.FormulaUno;


public class Distancia extends javax.swing.JPanel {

    public Distancia() {
        initComponents();
    }

    private ControladorMovRecUniAce mrua = new ControladorMovRecUniAce();
    private ControladorVelocidad mv = new ControladorVelocidad();
    private ControladorTiempo mt = new ControladorTiempo();
    private ControladorLongitud ml = new ControladorLongitud();
    private Utilidades util = new Utilidades();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        btnFormulaUno = new javax.swing.JButton();
        btnFormulaDos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(720, 470));
        setMinimumSize(new java.awt.Dimension(720, 470));
        setPreferredSize(new java.awt.Dimension(720, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFormulaUno.setText("X = v0 * t +  1/2 * a * t²");
        btnFormulaUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormulaUnoActionPerformed(evt);
            }
        });
        header.add(btnFormulaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 40));

        btnFormulaDos.setText("xxx");
        btnFormulaDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormulaDosActionPerformed(evt);
            }
        });
        header.add(btnFormulaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 260, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/headerFormulas.png"))); // NOI18N
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 80));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFormulaUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormulaUnoActionPerformed
        vista.mrua.distancia.FormulaUno vista = new FormulaUno();
        vista.setSize(860, 470);
        vista.setLocation(0, 0);
        bg.removeAll();
        bg.add(vista, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }//GEN-LAST:event_btnFormulaUnoActionPerformed

    private void btnFormulaDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormulaDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFormulaDosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnFormulaDos;
    private javax.swing.JButton btnFormulaUno;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
