package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;

public class vistaMovParabolico extends javax.swing.JPanel {

    public vistaMovParabolico() {
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
        btnVelocidadInicialX = new javax.swing.JPanel();
        labelVelocidadInicialX = new javax.swing.JLabel();
        bgVelocidadInicialX = new javax.swing.JLabel();
        btnVelocidadInicialY = new javax.swing.JPanel();
        labelVelocidadInicialY = new javax.swing.JLabel();
        bgVelocidadInicialY = new javax.swing.JLabel();
        btnAltura = new javax.swing.JPanel();
        labelAltura = new javax.swing.JLabel();
        bgAltura = new javax.swing.JLabel();
        btnDistancia = new javax.swing.JPanel();
        labelDistancia = new javax.swing.JLabel();
        bgDistancia = new javax.swing.JLabel();
        btnAlcanceHorizontal = new javax.swing.JPanel();
        labelAlcanceHorizontal = new javax.swing.JLabel();
        bgAlcanceHorizontal = new javax.swing.JLabel();
        btnTiempo = new javax.swing.JPanel();
        labelTiempo = new javax.swing.JLabel();
        bgTiempo = new javax.swing.JLabel();
        btnTiempoVuelo = new javax.swing.JPanel();
        labelTiempoVuelo = new javax.swing.JLabel();
        bgTiempoVuelo = new javax.swing.JLabel();
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

        btnVelocidadInicialX.setBackground(new java.awt.Color(231, 231, 231));
        btnVelocidadInicialX.setMaximumSize(new java.awt.Dimension(135, 40));
        btnVelocidadInicialX.setMinimumSize(new java.awt.Dimension(135, 40));
        btnVelocidadInicialX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialXMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialXMousePressed(evt);
            }
        });
        btnVelocidadInicialX.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVelocidadInicialX.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelVelocidadInicialX.setForeground(new java.awt.Color(0, 0, 0));
        labelVelocidadInicialX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVelocidadInicialX.setText("Velocidad inicial x");
        btnVelocidadInicialX.add(labelVelocidadInicialX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        bgVelocidadInicialX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png"))); // NOI18N
        btnVelocidadInicialX.add(bgVelocidadInicialX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(btnVelocidadInicialX, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, 152, 40));

        btnVelocidadInicialY.setBackground(new java.awt.Color(231, 231, 231));
        btnVelocidadInicialY.setMaximumSize(new java.awt.Dimension(135, 40));
        btnVelocidadInicialY.setMinimumSize(new java.awt.Dimension(135, 40));
        btnVelocidadInicialY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialYMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialYMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialYMousePressed(evt);
            }
        });
        btnVelocidadInicialY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVelocidadInicialY.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelVelocidadInicialY.setForeground(new java.awt.Color(0, 0, 0));
        labelVelocidadInicialY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVelocidadInicialY.setText("Velocidad inicial y");
        btnVelocidadInicialY.add(labelVelocidadInicialY, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        bgVelocidadInicialY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png"))); // NOI18N
        btnVelocidadInicialY.add(bgVelocidadInicialY, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(btnVelocidadInicialY, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 150, 152, 40));

        btnAltura.setBackground(new java.awt.Color(231, 231, 231));
        btnAltura.setMaximumSize(new java.awt.Dimension(135, 40));
        btnAltura.setMinimumSize(new java.awt.Dimension(135, 40));
        btnAltura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlturaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlturaMousePressed(evt);
            }
        });
        btnAltura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAltura.setBackground(new java.awt.Color(231, 231, 231));
        labelAltura.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelAltura.setForeground(new java.awt.Color(0, 0, 0));
        labelAltura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAltura.setText("Altura");
        btnAltura.add(labelAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        bgAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png"))); // NOI18N
        btnAltura.add(bgAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(btnAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, 152, 40));

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

        Menu.add(btnDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, 152, 40));

        btnAlcanceHorizontal.setBackground(new java.awt.Color(231, 231, 231));
        btnAlcanceHorizontal.setMaximumSize(new java.awt.Dimension(135, 40));
        btnAlcanceHorizontal.setMinimumSize(new java.awt.Dimension(135, 40));
        btnAlcanceHorizontal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlcanceHorizontalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlcanceHorizontalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlcanceHorizontalMousePressed(evt);
            }
        });
        btnAlcanceHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAlcanceHorizontal.setBackground(new java.awt.Color(231, 231, 231));
        labelAlcanceHorizontal.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelAlcanceHorizontal.setForeground(new java.awt.Color(0, 0, 0));
        labelAlcanceHorizontal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAlcanceHorizontal.setText("Alcance horizontal");
        btnAlcanceHorizontal.add(labelAlcanceHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        bgAlcanceHorizontal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png"))); // NOI18N
        btnAlcanceHorizontal.add(bgAlcanceHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(btnAlcanceHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 270, 152, 40));

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

        Menu.add(btnTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 310, 152, 40));

        btnTiempoVuelo.setBackground(new java.awt.Color(231, 231, 231));
        btnTiempoVuelo.setMaximumSize(new java.awt.Dimension(135, 40));
        btnTiempoVuelo.setMinimumSize(new java.awt.Dimension(135, 40));
        btnTiempoVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTiempoVueloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTiempoVueloMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTiempoVueloMousePressed(evt);
            }
        });
        btnTiempoVuelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTiempoVuelo.setBackground(new java.awt.Color(231, 231, 231));
        labelTiempoVuelo.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelTiempoVuelo.setForeground(new java.awt.Color(0, 0, 0));
        labelTiempoVuelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTiempoVuelo.setText("Tiempo vuelo");
        btnTiempoVuelo.add(labelTiempoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        bgTiempoVuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png"))); // NOI18N
        btnTiempoVuelo.add(bgTiempoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(btnTiempoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 350, 152, 40));

        labelCuadro.setBackground(new java.awt.Color(0, 0, 0));
        labelCuadro.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelCuadro.setForeground(new java.awt.Color(0, 0, 0));
        labelCuadro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuMovParabolico.png"))); // NOI18N
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
        if (labelVelocidadInicialX.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicialY.getForeground().getRGB() != numLetrasBase
                || labelAltura.getForeground().getRGB() != numLetrasBase
                || labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelAlcanceHorizontal.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase
                || labelTiempoVuelo.getForeground().getRGB() != numLetrasBase)
            resetearVelocidadInicial();
    }//GEN-LAST:event_btnVelocidadInicialMouseExited

    private void btnVelocidadInicialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialMousePressed
        mostrarVelocidadInicial();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionVelocidadInicial();
    }//GEN-LAST:event_btnVelocidadInicialMousePressed

    private void btnAlturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlturaMouseEntered
        if (labelAltura.getForeground().getRGB() == numLetrasBase)
            seleccionAltura();
    }//GEN-LAST:event_btnAlturaMouseEntered

    private void btnAlturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlturaMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicialY.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicial.getForeground().getRGB() != numLetrasBase
                || labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelAlcanceHorizontal.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase
                || labelTiempoVuelo.getForeground().getRGB() != numLetrasBase)
            resetearAltura();
    }//GEN-LAST:event_btnAlturaMouseExited

    private void btnAlturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlturaMousePressed
        mostrarAltura();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionAltura();
    }//GEN-LAST:event_btnAlturaMousePressed

    private void btnDistanciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMouseEntered
        if (labelDistancia.getForeground().getRGB() == numLetrasBase)
            seleccionDistancia();
    }//GEN-LAST:event_btnDistanciaMouseEntered

    private void btnDistanciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicialY.getForeground().getRGB() != numLetrasBase
                || labelAltura.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicial.getForeground().getRGB() != numLetrasBase
                || labelAlcanceHorizontal.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase
                || labelTiempoVuelo.getForeground().getRGB() != numLetrasBase)
            resetearDistancia();
    }//GEN-LAST:event_btnDistanciaMouseExited

    private void btnDistanciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMousePressed
        mostrarDistancia();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionDistancia();
    }//GEN-LAST:event_btnDistanciaMousePressed

    private void btnAlcanceHorizontalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlcanceHorizontalMouseEntered
        if (labelAlcanceHorizontal.getForeground().getRGB() == numLetrasBase)
            seleccionAlcHorizontal();
    }//GEN-LAST:event_btnAlcanceHorizontalMouseEntered

    private void btnAlcanceHorizontalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlcanceHorizontalMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicialY.getForeground().getRGB() != numLetrasBase
                || labelAltura.getForeground().getRGB() != numLetrasBase
                || labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicial.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase
                || labelTiempoVuelo.getForeground().getRGB() != numLetrasBase)
            resetearAlcHorizontal();
    }//GEN-LAST:event_btnAlcanceHorizontalMouseExited

    private void btnAlcanceHorizontalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlcanceHorizontalMousePressed
        mostrarAlcHorizontal();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionAlcHorizontal();
    }//GEN-LAST:event_btnAlcanceHorizontalMousePressed

    private void btnVelocidadInicialYMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialYMouseEntered
        if (labelVelocidadInicialY.getForeground().getRGB() == numLetrasBase)
            seleccionVelocidadInicialY();
    }//GEN-LAST:event_btnVelocidadInicialYMouseEntered

    private void btnVelocidadInicialYMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialYMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicial.getForeground().getRGB() != numLetrasBase
                || labelAltura.getForeground().getRGB() != numLetrasBase
                || labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelAlcanceHorizontal.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase
                || labelTiempoVuelo.getForeground().getRGB() != numLetrasBase)
            resetearVelocidadInicialY();
    }//GEN-LAST:event_btnVelocidadInicialYMouseExited

    private void btnVelocidadInicialYMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialYMousePressed
        mostrarVelocidadInicialY();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionVelocidadInicialY();
    }//GEN-LAST:event_btnVelocidadInicialYMousePressed

    private void btnVelocidadInicialXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialXMouseEntered
        if (labelVelocidadInicialX.getForeground().getRGB() == numLetrasBase)
            seleccionVelocidadInicialX();
    }//GEN-LAST:event_btnVelocidadInicialXMouseEntered

    private void btnVelocidadInicialXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialXMouseExited
        if (labelVelocidadInicial.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicialY.getForeground().getRGB() != numLetrasBase
                || labelAltura.getForeground().getRGB() != numLetrasBase
                || labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelAlcanceHorizontal.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase
                || labelTiempoVuelo.getForeground().getRGB() != numLetrasBase)
            resetearVelocidadInicialX();
    }//GEN-LAST:event_btnVelocidadInicialXMouseExited

    private void btnVelocidadInicialXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialXMousePressed
        mostrarVelocidadInicialX();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionVelocidadInicialX();
    }//GEN-LAST:event_btnVelocidadInicialXMousePressed

    private void btnTiempoVueloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoVueloMouseEntered
        if (labelTiempoVuelo.getForeground().getRGB() == numLetrasBase)
            seleccionTiempoVuelo();
    }//GEN-LAST:event_btnTiempoVueloMouseEntered

    private void btnTiempoVueloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoVueloMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicialY.getForeground().getRGB() != numLetrasBase
                || labelAltura.getForeground().getRGB() != numLetrasBase
                || labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelAlcanceHorizontal.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicial.getForeground().getRGB() != numLetrasBase)
            resetearTiempoVuelo();
    }//GEN-LAST:event_btnTiempoVueloMouseExited

    private void btnTiempoVueloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoVueloMousePressed
        mostrarTiempoVuelo();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionTiempoVuelo();
    }//GEN-LAST:event_btnTiempoVueloMousePressed

    private void btnTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseEntered
        if (labelTiempo.getForeground().getRGB() == numLetrasBase)
            seleccionTiempo();
    }//GEN-LAST:event_btnTiempoMouseEntered

    private void btnTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicialY.getForeground().getRGB() != numLetrasBase
                || labelAltura.getForeground().getRGB() != numLetrasBase
                || labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelAlcanceHorizontal.getForeground().getRGB() != numLetrasBase
                || labelVelocidadInicial.getForeground().getRGB() != numLetrasBase
                || labelTiempoVuelo.getForeground().getRGB() != numLetrasBase)
            resetearTiempo();
    }//GEN-LAST:event_btnTiempoMouseExited

    private void btnTiempoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMousePressed
        mostrarTiempo();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        seleccionTiempo();
    }//GEN-LAST:event_btnTiempoMousePressed

    //----- Rellenar paneles ------//
    private void mostrarVelocidadInicial() {
        vista.MovParabolico.VelocidadInicial vista = new vista.MovParabolico.VelocidadInicial();
        vista.setSize(720, 470);
        vista.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(vista, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    private void mostrarVelocidadInicialX() {

    }

    private void mostrarVelocidadInicialY() {

    }

    private void mostrarAltura() {

    }

    private void mostrarDistancia() {

    }

    private void mostrarAlcHorizontal() {

    }

    private void mostrarTiempo() {

    }

    private void mostrarTiempoVuelo() {

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

    private void seleccionVelocidadInicialX() {
        bgVelocidadInicialX.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelVelocidadInicialX.setForeground(letrasAlternativo);
    }

    private void resetearVelocidadInicialX() {
        bgVelocidadInicialX.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelVelocidadInicialX.setForeground(letrasBase);
    }

    private void seleccionVelocidadInicialY() {
        bgVelocidadInicialY.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelVelocidadInicialY.setForeground(letrasAlternativo);
    }

    private void resetearVelocidadInicialY() {
        bgVelocidadInicialY.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelVelocidadInicialY.setForeground(letrasBase);
    }

    private void seleccionAltura() {
        bgAltura.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelAltura.setForeground(letrasAlternativo);
    }

    private void resetearAltura() {
        bgAltura.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelAltura.setForeground(letrasBase);
    }

    private void seleccionDistancia() {
        bgDistancia.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelDistancia.setForeground(letrasAlternativo);
    }

    private void resetearDistancia() {
        bgDistancia.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelDistancia.setForeground(letrasBase);
    }

    private void seleccionAlcHorizontal() {
        bgAlcanceHorizontal.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelAlcanceHorizontal.setForeground(letrasAlternativo);
    }

    private void resetearAlcHorizontal() {
        bgAlcanceHorizontal.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelAlcanceHorizontal.setForeground(letrasBase);
    }

    private void seleccionTiempo() {
        bgTiempo.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelTiempo.setForeground(letrasAlternativo);
    }

    private void resetearTiempo() {
        bgTiempo.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelTiempo.setForeground(letrasBase);
    }

    private void seleccionTiempoVuelo() {
        bgTiempoVuelo.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuClick.png")));
        labelTiempoVuelo.setForeground(letrasAlternativo);
    }

    private void resetearTiempoVuelo() {
        bgTiempoVuelo.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/menuSinColor.png")));
        labelTiempoVuelo.setForeground(letrasBase);
    }
    //----- Fin de las variaciones ------//

    //----- Métodos de utilidad -----//
    private void resetearTodo() {
        resetearVelocidadInicial();
        resetearVelocidadInicialX();
        resetearVelocidadInicialY();
        resetearAltura();
        resetearDistancia();
        resetearAlcHorizontal();
        resetearTiempo();
        resetearTiempoVuelo();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel bgAlcanceHorizontal;
    private javax.swing.JLabel bgAltura;
    private javax.swing.JLabel bgDistancia;
    private javax.swing.JLabel bgTiempo;
    private javax.swing.JLabel bgTiempoVuelo;
    private javax.swing.JLabel bgVelocidadInicial;
    private javax.swing.JLabel bgVelocidadInicialX;
    private javax.swing.JLabel bgVelocidadInicialY;
    private javax.swing.JPanel btnAlcanceHorizontal;
    private javax.swing.JPanel btnAltura;
    private javax.swing.JPanel btnDistancia;
    private javax.swing.JPanel btnTiempo;
    private javax.swing.JPanel btnTiempoVuelo;
    private javax.swing.JPanel btnVelocidadInicial;
    private javax.swing.JPanel btnVelocidadInicialX;
    private javax.swing.JPanel btnVelocidadInicialY;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAlcanceHorizontal;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelCuadro;
    private javax.swing.JLabel labelDistancia;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JLabel labelTiempoVuelo;
    private javax.swing.JLabel labelVelocidadInicial;
    private javax.swing.JLabel labelVelocidadInicialX;
    private javax.swing.JLabel labelVelocidadInicialY;
    // End of variables declaration//GEN-END:variables
}
