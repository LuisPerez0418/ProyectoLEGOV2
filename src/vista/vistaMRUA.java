package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import vista.mrua.Aceleracion;
import vista.mrua.VelocidadFinal;
import vista.mrua.VelocidadInicial;

public class vistaMRUA extends javax.swing.JPanel {

    public vistaMRUA() {
        initComponents();
        mostrarVelocidadInicial();
        seleccionVelocidadInicial();
    }

    //----- Paleta de colores -----//
    Color letrasBase = new Color(0, 0, 0);
    Color letrasAlternativo = new Color(1, 1, 1);
    //----- conversión de colores a enteros -----//
    int numLetrasBase = letrasBase.getRGB();
    int numLetrasAlternativo = letrasAlternativo.getRGB();


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVelocidadInicial = new javax.swing.JPanel();
        labelVelocidadInicial = new javax.swing.JLabel();
        bgVelocidadInicial = new javax.swing.JLabel();
        btnVelocidadFinal = new javax.swing.JPanel();
        labelVelocidadFinal = new javax.swing.JLabel();
        bgVelocidadFinal = new javax.swing.JLabel();
        btnDistancia = new javax.swing.JPanel();
        labelDistancia = new javax.swing.JLabel();
        bgDistancia = new javax.swing.JLabel();
        btnTiempo = new javax.swing.JPanel();
        labelTiempo = new javax.swing.JLabel();
        bgTiempo = new javax.swing.JLabel();
        btnAceleracion = new javax.swing.JPanel();
        labelAceleracion = new javax.swing.JLabel();
        bgAceleracion = new javax.swing.JLabel();
        labelCuadro = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setMaximumSize(new java.awt.Dimension(144, 470));
        Menu.setMinimumSize(new java.awt.Dimension(144, 470));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calcular");
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, 140, -1));

        btnVelocidadInicial.setBackground(new java.awt.Color(231, 231, 231));
        btnVelocidadInicial.setMaximumSize(new java.awt.Dimension(135, 40));
        btnVelocidadInicial.setMinimumSize(new java.awt.Dimension(135, 40));
        btnVelocidadInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialMousePressed(evt);
            }
        });
        btnVelocidadInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVelocidadInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelVelocidadInicial.setForeground(new java.awt.Color(0, 0, 0));
        labelVelocidadInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVelocidadInicial.setText("Velocidad inicial");
        btnVelocidadInicial.add(labelVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        bgVelocidadInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png"))); // NOI18N
        btnVelocidadInicial.add(bgVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(btnVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, 152, 40));

        btnVelocidadFinal.setBackground(new java.awt.Color(231, 231, 231));
        btnVelocidadFinal.setMaximumSize(new java.awt.Dimension(135, 40));
        btnVelocidadFinal.setMinimumSize(new java.awt.Dimension(135, 40));
        btnVelocidadFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVelocidadFinalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVelocidadFinalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVelocidadFinalMousePressed(evt);
            }
        });
        btnVelocidadFinal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVelocidadFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelVelocidadFinal.setForeground(new java.awt.Color(0, 0, 0));
        labelVelocidadFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVelocidadFinal.setText("Velocidad final");
        btnVelocidadFinal.add(labelVelocidadFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        bgVelocidadFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png"))); // NOI18N
        btnVelocidadFinal.add(bgVelocidadFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(btnVelocidadFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, 152, 40));

        btnDistancia.setBackground(new java.awt.Color(231, 231, 231));
        btnDistancia.setMaximumSize(new java.awt.Dimension(135, 40));
        btnDistancia.setMinimumSize(new java.awt.Dimension(135, 40));
        btnDistancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDistanciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDistanciaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDistanciaMousePressed(evt);
            }
        });
        btnDistancia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDistancia.setBackground(new java.awt.Color(231, 231, 231));
        labelDistancia.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelDistancia.setForeground(new java.awt.Color(0, 0, 0));
        labelDistancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDistancia.setText("Distancia");
        btnDistancia.add(labelDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        bgDistancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png"))); // NOI18N
        btnDistancia.add(bgDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(btnDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 150, 152, 40));

        btnTiempo.setBackground(new java.awt.Color(231, 231, 231));
        btnTiempo.setMaximumSize(new java.awt.Dimension(135, 40));
        btnTiempo.setMinimumSize(new java.awt.Dimension(135, 40));
        btnTiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTiempoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTiempoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTiempoMousePressed(evt);
            }
        });
        btnTiempo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTiempo.setBackground(new java.awt.Color(231, 231, 231));
        labelTiempo.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelTiempo.setForeground(new java.awt.Color(0, 0, 0));
        labelTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTiempo.setText("Tiempo");
        btnTiempo.add(labelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        bgTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png"))); // NOI18N
        btnTiempo.add(bgTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(btnTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, 152, 40));

        btnAceleracion.setBackground(new java.awt.Color(231, 231, 231));
        btnAceleracion.setMaximumSize(new java.awt.Dimension(135, 40));
        btnAceleracion.setMinimumSize(new java.awt.Dimension(135, 40));
        btnAceleracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceleracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceleracionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAceleracionMousePressed(evt);
            }
        });
        btnAceleracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAceleracion.setBackground(new java.awt.Color(231, 231, 231));
        labelAceleracion.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelAceleracion.setForeground(new java.awt.Color(0, 0, 0));
        labelAceleracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAceleracion.setText("Aceleración");
        btnAceleracion.add(labelAceleracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        bgAceleracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png"))); // NOI18N
        btnAceleracion.add(bgAceleracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(btnAceleracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, 152, 40));

        labelCuadro.setBackground(new java.awt.Color(0, 0, 0));
        labelCuadro.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelCuadro.setForeground(new java.awt.Color(0, 0, 0));
        labelCuadro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuMRUA.png"))); // NOI18N
        labelCuadro.setMaximumSize(new java.awt.Dimension(135, 40));
        labelCuadro.setMinimumSize(new java.awt.Dimension(135, 40));
        labelCuadro.setPreferredSize(new java.awt.Dimension(135, 40));
        Menu.add(labelCuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 190, 510));

        contenido.setBackground(new java.awt.Color(51, 255, 255));
        contenido.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVelocidadInicialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialMouseEntered
        if (labelVelocidadInicial.getForeground().getRGB() == numLetrasBase)
            seleccionVelocidadInicial();
    }//GEN-LAST:event_btnVelocidadInicialMouseEntered

    private void btnVelocidadInicialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialMouseExited
        if (labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase
                || labelAceleracion.getForeground().getRGB() != numLetrasBase
                || labelVelocidadFinal.getForeground().getRGB() != numLetrasBase)
            resetearVelocidadInicial();
    }//GEN-LAST:event_btnVelocidadInicialMouseExited

    private void btnVelocidadInicialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialMousePressed
        mostrarVelocidadInicial();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionVelocidadInicial();
    }//GEN-LAST:event_btnVelocidadInicialMousePressed

    private void btnDistanciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMouseEntered
        if (labelDistancia.getForeground().getRGB() == numLetrasBase)
            seleccionDistancia();
    }//GEN-LAST:event_btnDistanciaMouseEntered

    private void btnDistanciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMouseExited
        if (labelVelocidadInicial.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase
                || labelAceleracion.getForeground().getRGB() != numLetrasBase
                || labelVelocidadFinal.getForeground().getRGB() != numLetrasBase)
            resetearDistancia();
    }//GEN-LAST:event_btnDistanciaMouseExited

    private void btnDistanciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMousePressed
        mostrarDistancia();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionDistancia();
    }//GEN-LAST:event_btnDistanciaMousePressed

    private void btnTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseEntered
        if (labelTiempo.getForeground().getRGB() == numLetrasBase)
            seleccionTiempo();
    }//GEN-LAST:event_btnTiempoMouseEntered

    private void btnTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseExited
        if (labelVelocidadInicial.getForeground().getRGB() != numLetrasBase
                || labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelAceleracion.getForeground().getRGB() != numLetrasBase
                || labelVelocidadFinal.getForeground().getRGB() != numLetrasBase)
            resetearTiempo();
    }//GEN-LAST:event_btnTiempoMouseExited

    private void btnTiempoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMousePressed
        mostrarTiempo();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionTiempo();
    }//GEN-LAST:event_btnTiempoMousePressed

    private void btnAceleracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceleracionMouseEntered
        if (labelAceleracion.getForeground().getRGB() == numLetrasBase)
            seleccionAceleracion();
    }//GEN-LAST:event_btnAceleracionMouseEntered

    private void btnAceleracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceleracionMouseExited
        if (labelVelocidadInicial.getForeground().getRGB() != numLetrasBase
                || labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase
                || labelVelocidadFinal.getForeground().getRGB() != numLetrasBase)
            resetearAceleracion();
    }//GEN-LAST:event_btnAceleracionMouseExited

    private void btnAceleracionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceleracionMousePressed
        mostrarAceleracion();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionAceleracion();
    }//GEN-LAST:event_btnAceleracionMousePressed

    private void btnVelocidadFinalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadFinalMouseEntered
        if (labelVelocidadFinal.getForeground().getRGB() == numLetrasBase)
            seleccionVelocidadFinal();
    }//GEN-LAST:event_btnVelocidadFinalMouseEntered

    private void btnVelocidadFinalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadFinalMouseExited
        if (labelVelocidadInicial.getForeground().getRGB() != numLetrasBase
                || labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase
                || labelAceleracion.getForeground().getRGB() != numLetrasBase)
            resetearVelocidadFinal();
    }//GEN-LAST:event_btnVelocidadFinalMouseExited

    private void btnVelocidadFinalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadFinalMousePressed
        mostrarVelocidadFinal();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionVelocidadFinal();
    }//GEN-LAST:event_btnVelocidadFinalMousePressed

    //----- Rellenar paneles ------//
    private void mostrarVelocidadInicial() {
        vista.mrua.VelocidadInicial vista = new VelocidadInicial();
        vista.setSize(720, 470);
        vista.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(vista, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
    
    private void mostrarVelocidadFinal() {
        vista.mrua.VelocidadFinal vista = new VelocidadFinal();
        vista.setSize(720, 470);
        vista.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(vista, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    private void mostrarDistancia() {
        vista.mrua.Distancia vista = new vista.mrua.Distancia();
        vista.setSize(720, 470);
        vista.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(vista, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    private void mostrarTiempo() {
        vista.mrua.Tiempo vista = new vista.mrua.Tiempo();
        vista.setSize(720, 470);
        vista.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(vista, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
    
    private void mostrarAceleracion() {
        vista.mrua.Aceleracion vista = new Aceleracion();
        vista.setSize(720, 470);
        vista.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(vista, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
    //----- Fin del relleno ------//

    //----- Variaciones al entrar y salir el mouse ------//
    private void seleccionVelocidadInicial() {
        bgVelocidadInicial.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelVelocidadInicial.setForeground(letrasAlternativo);
    }

    private void resetearVelocidadInicial() {
        bgVelocidadInicial.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelVelocidadInicial.setForeground(letrasBase);
    }

    private void seleccionVelocidadFinal() {
        bgVelocidadFinal.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelVelocidadFinal.setForeground(letrasAlternativo);
    }

    private void resetearVelocidadFinal() {
        bgVelocidadFinal.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelVelocidadFinal.setForeground(letrasBase);
    }
    
    private void seleccionDistancia() {
        bgDistancia.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelDistancia.setForeground(letrasAlternativo);
    }

    private void resetearDistancia() {
        bgDistancia.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelDistancia.setForeground(letrasBase);
    }

    private void seleccionTiempo() {
        bgTiempo.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelTiempo.setForeground(letrasAlternativo);
    }

    private void resetearTiempo() {
        bgTiempo.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelTiempo.setForeground(letrasBase);
    }

    private void seleccionAceleracion() {
        bgAceleracion.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelAceleracion.setForeground(letrasAlternativo);
    }

    private void resetearAceleracion() {
        bgAceleracion.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelAceleracion.setForeground(letrasBase);
    }
    //----- Fin de las variaciones ------//

    //----- Métodos de utilidad -----//
    private void resetearTodo() {
        resetearVelocidadInicial();
        resetearVelocidadFinal();
        resetearDistancia();
        resetearTiempo();
        resetearAceleracion();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel bgAceleracion;
    private javax.swing.JLabel bgDistancia;
    private javax.swing.JLabel bgTiempo;
    private javax.swing.JLabel bgVelocidadFinal;
    private javax.swing.JLabel bgVelocidadInicial;
    private javax.swing.JPanel btnAceleracion;
    private javax.swing.JPanel btnDistancia;
    private javax.swing.JPanel btnTiempo;
    private javax.swing.JPanel btnVelocidadFinal;
    private javax.swing.JPanel btnVelocidadInicial;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAceleracion;
    private javax.swing.JLabel labelCuadro;
    private javax.swing.JLabel labelDistancia;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JLabel labelVelocidadFinal;
    private javax.swing.JLabel labelVelocidadInicial;
    // End of variables declaration//GEN-END:variables
}
