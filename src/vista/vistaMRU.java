package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import vista.mru.Distancia;
import vista.mru.Tiempo;
import vista.mru.Velocidad;

public class vistaMRU extends javax.swing.JPanel {

    public vistaMRU() {
        initComponents();
        mostrarVelocidad();
        seleccionVelocidad();
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
        btnVelocidad = new javax.swing.JPanel();
        labelVelocidad = new javax.swing.JLabel();
        bgVelocidad = new javax.swing.JLabel();
        btnDistancia = new javax.swing.JPanel();
        labelDistancia = new javax.swing.JLabel();
        bgDistancia = new javax.swing.JLabel();
        btnTiempo = new javax.swing.JPanel();
        labelTiempo = new javax.swing.JLabel();
        bgTiempo = new javax.swing.JLabel();
        labelCuadro = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setMaximumSize(new java.awt.Dimension(144, 470));
        Menu.setMinimumSize(new java.awt.Dimension(144, 470));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calcular");
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 140, -1));

        btnVelocidad.setBackground(new java.awt.Color(231, 231, 231));
        btnVelocidad.setMaximumSize(new java.awt.Dimension(135, 40));
        btnVelocidad.setMinimumSize(new java.awt.Dimension(135, 40));
        btnVelocidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVelocidadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVelocidadMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVelocidadMousePressed(evt);
            }
        });
        btnVelocidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVelocidad.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelVelocidad.setForeground(new java.awt.Color(0, 0, 0));
        labelVelocidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVelocidad.setText("Velocidad");
        btnVelocidad.add(labelVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        bgVelocidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png"))); // NOI18N
        btnVelocidad.add(bgVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(btnVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 80, 152, 40));

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

        Menu.add(btnDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 152, 40));

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

        Menu.add(btnTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, 152, 40));

        labelCuadro.setBackground(new java.awt.Color(0, 0, 0));
        labelCuadro.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelCuadro.setForeground(new java.awt.Color(0, 0, 0));
        labelCuadro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuBase.png"))); // NOI18N
        labelCuadro.setMaximumSize(new java.awt.Dimension(135, 40));
        labelCuadro.setMinimumSize(new java.awt.Dimension(135, 40));
        labelCuadro.setPreferredSize(new java.awt.Dimension(135, 40));
        Menu.add(labelCuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 190, 310));

        add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 470));

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

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 720, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnVelocidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadMousePressed
        mostrarVelocidad();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionVelocidad();
    }//GEN-LAST:event_btnVelocidadMousePressed

    private void btnVelocidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadMouseExited
        if (labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase)
            resetearVelocidad();
    }//GEN-LAST:event_btnVelocidadMouseExited

    private void btnVelocidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadMouseEntered
        if (labelVelocidad.getForeground().getRGB() == numLetrasBase)
            seleccionVelocidad();
    }//GEN-LAST:event_btnVelocidadMouseEntered

    private void btnDistanciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMouseEntered
        if (labelDistancia.getForeground().getRGB() == numLetrasBase)
            seleccionDistancia();
    }//GEN-LAST:event_btnDistanciaMouseEntered

    private void btnDistanciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMouseExited
        if (labelVelocidad.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase)
            resetearDistancia();
    }//GEN-LAST:event_btnDistanciaMouseExited

    private void btnDistanciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMousePressed
        mostrarDistancia();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionDistancia();
    }//GEN-LAST:event_btnDistanciaMousePressed

    private void btnTiempoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMousePressed
        mostrarTiempo();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionTiempo();
    }//GEN-LAST:event_btnTiempoMousePressed

    private void btnTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseExited
        if (labelVelocidad.getForeground().getRGB() != numLetrasBase
                || labelDistancia.getForeground().getRGB() != numLetrasBase)
            resetearTiempo();
    }//GEN-LAST:event_btnTiempoMouseExited

    private void btnTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseEntered
        if (labelTiempo.getForeground().getRGB() == numLetrasBase)
            seleccionTiempo();
    }//GEN-LAST:event_btnTiempoMouseEntered

    //----- Rellenar paneles ------//
    private void mostrarVelocidad() {
        Velocidad vista = new Velocidad();
        vista.setSize(720, 470);
        vista.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(vista, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    private void mostrarDistancia() {
        Distancia vista = new Distancia();
        vista.setSize(720, 470);
        vista.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(vista, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    private void mostrarTiempo() {
        Tiempo vista = new Tiempo();
        vista.setSize(720, 470);
        vista.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(vista, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
    //----- Fin del relleno ------//

    //----- Variaciones al entrar y salir el mouse ------//
    private void seleccionVelocidad() {
        bgVelocidad.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelVelocidad.setForeground(letrasAlternativo);
    }

    private void resetearVelocidad() {
        bgVelocidad.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelVelocidad.setForeground(letrasBase);
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
    //----- Fin de las variaciones ------//

    //----- Métodos de utilidad -----//
    private void resetearTodo() {
        resetearVelocidad();
        resetearDistancia();
        resetearTiempo();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel bgDistancia;
    private javax.swing.JLabel bgTiempo;
    private javax.swing.JLabel bgVelocidad;
    private javax.swing.JPanel btnDistancia;
    private javax.swing.JPanel btnTiempo;
    private javax.swing.JPanel btnVelocidad;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCuadro;
    private javax.swing.JLabel labelDistancia;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JLabel labelVelocidad;
    // End of variables declaration//GEN-END:variables
}
