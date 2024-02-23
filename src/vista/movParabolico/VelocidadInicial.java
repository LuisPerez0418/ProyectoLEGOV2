package vista.movParabolico;

import controlador.Utilidades;
import controlador.VisualizarFormula;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;

public class VelocidadInicial extends javax.swing.JPanel {

    public VelocidadInicial() {
        initComponents(); 
        vf = new VisualizarFormula("v_i = \\sqrt{\\frac{2 * g * h} "
                + "{sen(θ)^2}}");
        labelFUno.setIcon(vf.getIconTitulos());
        vf = new VisualizarFormula("v_i = \\frac{g * t_{vuelo}} {2 * sen(θ)}");
        labelFDos.setIcon(vf.getIconTitulos());
        vf = new VisualizarFormula("v_i = \\sqrt{\\frac{g * R} {sen(2 * θ)}}");
        labelFTres.setIcon(vf.getIconTitulos());
        seleccionFUno();
        mostrarFUno();
    }
    private VisualizarFormula vf;
    private Utilidades ul;

    //----- Paleta de colores -----//
    Color letrasBase = new Color(0, 0, 0);
    Color letrasAlternativo = new Color(1, 1, 1);
    //----- conversión de colores a enteros -----//
    int numLetrasBase = letrasBase.getRGB();
    int numLetrasAlternativo = letrasAlternativo.getRGB();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        btnFUno = new javax.swing.JPanel();
        labelFUno = new javax.swing.JLabel();
        bgFUno = new javax.swing.JLabel();
        btnFDos = new javax.swing.JPanel();
        labelFDos = new javax.swing.JLabel();
        bgFDos = new javax.swing.JLabel();
        btnFTres = new javax.swing.JPanel();
        labelFTres = new javax.swing.JLabel();
        bgFTres = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(720, 470));
        setMinimumSize(new java.awt.Dimension(720, 470));
        setPreferredSize(new java.awt.Dimension(720, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFUno.setBackground(new java.awt.Color(231, 231, 231));
        btnFUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFUnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFUnoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFUnoMousePressed(evt);
            }
        });
        btnFUno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFUno.add(labelFUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        bgFUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/seleccionFormulaSinColor.png"))); // NOI18N
        btnFUno.add(bgFUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.add(btnFUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 150, 40));

        btnFDos.setBackground(new java.awt.Color(231, 231, 231));
        btnFDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFDosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFDosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFDosMousePressed(evt);
            }
        });
        btnFDos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFDos.add(labelFDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        bgFDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/seleccionFormulaSinColor.png"))); // NOI18N
        btnFDos.add(bgFDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.add(btnFDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 150, 40));

        btnFTres.setBackground(new java.awt.Color(231, 231, 231));
        btnFTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFTresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFTresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFTresMousePressed(evt);
            }
        });
        btnFTres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFTres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFTres.add(labelFTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        bgFTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/seleccionFormulaSinColor.png"))); // NOI18N
        btnFTres.add(bgFTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.add(btnFTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 150, 40));

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fórmulas");
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 9, -1, 60));

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

    private void btnFUnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFUnoMouseEntered
        if (labelFUno.getForeground().getRGB() == numLetrasBase)
            seleccionFUno();
    }//GEN-LAST:event_btnFUnoMouseEntered

    private void btnFUnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFUnoMouseExited
        if (labelFDos.getForeground().getRGB() != numLetrasBase
                || labelFTres.getForeground().getRGB() != numLetrasBase)
            resetearFUno();
    }//GEN-LAST:event_btnFUnoMouseExited

    private void btnFUnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFUnoMousePressed
        mostrarFUno();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionFUno();
    }//GEN-LAST:event_btnFUnoMousePressed

    private void btnFDosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFDosMouseEntered
        if (labelFDos.getForeground().getRGB() == numLetrasBase)
            seleccionFDos();
    }//GEN-LAST:event_btnFDosMouseEntered

    private void btnFDosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFDosMouseExited
        if (labelFUno.getForeground().getRGB() != numLetrasBase
                || labelFTres.getForeground().getRGB() != numLetrasBase)
            resetearFDos();
    }//GEN-LAST:event_btnFDosMouseExited

    private void btnFDosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFDosMousePressed
        mostrarFDos();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionFDos();
    }//GEN-LAST:event_btnFDosMousePressed

    private void btnFTresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFTresMouseEntered
        if (labelFTres.getForeground().getRGB() == numLetrasBase)
            seleccionFTres();
    }//GEN-LAST:event_btnFTresMouseEntered

    private void btnFTresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFTresMouseExited
        if (labelFUno.getForeground().getRGB() != numLetrasBase
                || labelFDos.getForeground().getRGB() != numLetrasBase)
            resetearFTres();
    }//GEN-LAST:event_btnFTresMouseExited

    private void btnFTresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFTresMousePressed
        mostrarFTres();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionFTres();
    }//GEN-LAST:event_btnFTresMousePressed

    //----- Rellenar paneles ------//
    public void mostrarFUno() {
      /*  vista.mrua.aceleracion.FormulaUno vista = new vista.mrua.aceleracion.FormulaUno();
        vista.setSize(860, 470);
        vista.setLocation(0, 0);
        bg.removeAll();
        bg.add(vista, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
        */
    }
    
    public void mostrarFDos() {

    }
    
    public void mostrarFTres() {

    }
    //----- Fin del relleno ------//
    
    //----- Variaciones al entrar y salir el mouse ------//
    private void seleccionFUno() {
        bgFUno.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/seleccionFormulaColor.png")));
        labelFUno.setForeground(letrasAlternativo);
    }

    private void resetearFUno() {
        bgFUno.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/seleccionFormulaSinColor.png")));
        labelFUno.setForeground(letrasBase);
    }

    private void seleccionFDos() {
        bgFDos.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/seleccionFormulaColor.png")));
        labelFDos.setForeground(letrasAlternativo);
    }

    private void resetearFDos() {
        bgFDos.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/seleccionFormulaSinColor.png")));
        labelFDos.setForeground(letrasBase);
    }

    private void seleccionFTres() {
        bgFTres.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/seleccionFormulaColor.png")));
        labelFTres.setForeground(letrasAlternativo);
    }

    private void resetearFTres() {
        bgFTres.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/seleccionFormulaSinColor.png")));
        labelFTres.setForeground(letrasBase);
    }
    //----- Fin de las variaciones ------//

    //----- Métodos de utilidad -----//
    private void resetearTodo() {
        resetearFUno();
        resetearFDos();
        resetearFTres();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgFDos;
    private javax.swing.JLabel bgFTres;
    private javax.swing.JLabel bgFUno;
    private javax.swing.JPanel btnFDos;
    private javax.swing.JPanel btnFTres;
    private javax.swing.JPanel btnFUno;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelFDos;
    private javax.swing.JLabel labelFTres;
    private javax.swing.JLabel labelFUno;
    // End of variables declaration//GEN-END:variables
}
