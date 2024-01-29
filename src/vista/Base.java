package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Base extends javax.swing.JFrame {

    public Base() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarMRU();
    }
    
    //----- Paleta de colores -----//
    Color letrasBase = new Color(0, 0, 0);
    Color letrasAlternativo = new Color(255, 255, 255);
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        btnMRU = new javax.swing.JPanel();
        labelMRU = new javax.swing.JLabel();
        bgMRU = new javax.swing.JLabel();
        btnMRUA = new javax.swing.JPanel();
        labelMRUA = new javax.swing.JLabel();
        bgMRUA = new javax.swing.JLabel();
        btnCaidaLibre = new javax.swing.JPanel();
        labelLibre = new javax.swing.JLabel();
        labelCaida = new javax.swing.JLabel();
        bgCaida = new javax.swing.JLabel();
        btnTiroVertical = new javax.swing.JPanel();
        labelTiro = new javax.swing.JLabel();
        labelVertical = new javax.swing.JLabel();
        bgTiro = new javax.swing.JLabel();
        btnMovParabolico = new javax.swing.JPanel();
        labelMovimiento = new javax.swing.JLabel();
        labelParabolico = new javax.swing.JLabel();
        bgParabolico = new javax.swing.JLabel();
        btnMCU = new javax.swing.JPanel();
        labelMCU = new javax.swing.JLabel();
        bgMCU = new javax.swing.JLabel();
        btnMCUA = new javax.swing.JPanel();
        labelMCUA = new javax.swing.JLabel();
        bgMCUA = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(230, 114, 106));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setBackground(new java.awt.Color(0, 0, 0));
        labelLogo.setFont(new java.awt.Font("Montserrat Black", 1, 18)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(0, 0, 0));
        labelLogo.setText("LEGO");
        header.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -7, -1, 70));

        btnMRU.setBackground(new java.awt.Color(230, 114, 106));
        btnMRU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMRUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMRUMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMRUMousePressed(evt);
            }
        });
        btnMRU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMRU.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelMRU.setForeground(new java.awt.Color(0, 0, 0));
        labelMRU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMRU.setText("M.R.U.");
        btnMRU.add(labelMRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 20));

        bgMRU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/headerColor.png"))); // NOI18N
        btnMRU.add(bgMRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.add(btnMRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 60));

        btnMRUA.setBackground(new java.awt.Color(230, 114, 106));
        btnMRUA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMRUAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMRUAMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMRUAMousePressed(evt);
            }
        });
        btnMRUA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMRUA.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelMRUA.setForeground(new java.awt.Color(0, 0, 0));
        labelMRUA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMRUA.setText("M.R.U.A.");
        btnMRUA.add(labelMRUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 20));

        bgMRUA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/headerColor.png"))); // NOI18N
        btnMRUA.add(bgMRUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.add(btnMRUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, 60));

        btnCaidaLibre.setBackground(new java.awt.Color(230, 114, 106));
        btnCaidaLibre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCaidaLibreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCaidaLibreMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCaidaLibreMousePressed(evt);
            }
        });
        btnCaidaLibre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLibre.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelLibre.setForeground(new java.awt.Color(0, 0, 0));
        labelLibre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLibre.setText("libre");
        btnCaidaLibre.add(labelLibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 20));

        labelCaida.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelCaida.setForeground(new java.awt.Color(0, 0, 0));
        labelCaida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCaida.setText("Caída");
        btnCaidaLibre.add(labelCaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 20));

        bgCaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/headerColor.png"))); // NOI18N
        btnCaidaLibre.add(bgCaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.add(btnCaidaLibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 60));

        btnTiroVertical.setBackground(new java.awt.Color(230, 114, 106));
        btnTiroVertical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTiroVerticalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTiroVerticalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTiroVerticalMousePressed(evt);
            }
        });
        btnTiroVertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTiro.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelTiro.setForeground(new java.awt.Color(0, 0, 0));
        labelTiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTiro.setText("vertical");
        btnTiroVertical.add(labelTiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 20));

        labelVertical.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelVertical.setForeground(new java.awt.Color(0, 0, 0));
        labelVertical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVertical.setText("Tiro");
        btnTiroVertical.add(labelVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 20));

        bgTiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/headerColor.png"))); // NOI18N
        btnTiroVertical.add(bgTiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.add(btnTiroVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, 60));

        btnMovParabolico.setBackground(new java.awt.Color(230, 114, 106));
        btnMovParabolico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMovParabolicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMovParabolicoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMovParabolicoMousePressed(evt);
            }
        });
        btnMovParabolico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMovimiento.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelMovimiento.setForeground(new java.awt.Color(0, 0, 0));
        labelMovimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMovimiento.setText("parabólico");
        btnMovParabolico.add(labelMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, 20));

        labelParabolico.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelParabolico.setForeground(new java.awt.Color(0, 0, 0));
        labelParabolico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelParabolico.setText("Movimiento");
        btnMovParabolico.add(labelParabolico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 20));

        bgParabolico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/headerSinColor.png"))); // NOI18N
        btnMovParabolico.add(bgParabolico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.add(btnMovParabolico, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 140, 60));

        btnMCU.setBackground(new java.awt.Color(230, 114, 106));
        btnMCU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMCUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMCUMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMCUMousePressed(evt);
            }
        });
        btnMCU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMCU.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelMCU.setForeground(new java.awt.Color(0, 0, 0));
        labelMCU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMCU.setText("M.C.U.");
        btnMCU.add(labelMCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 20));

        bgMCU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/headerColor.png"))); // NOI18N
        btnMCU.add(bgMCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.add(btnMCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, 60));

        btnMCUA.setBackground(new java.awt.Color(230, 114, 106));
        btnMCUA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMCUAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMCUAMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMCUAMousePressed(evt);
            }
        });
        btnMCUA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMCUA.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelMCUA.setForeground(new java.awt.Color(0, 0, 0));
        labelMCUA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMCUA.setText("M.C.U.A.");
        btnMCUA.add(labelMCUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 20));

        bgMCUA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/headerColor.png"))); // NOI18N
        btnMCUA.add(bgMCUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.add(btnMCUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, 60));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 860, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMRUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMRUMouseEntered
        seleccionMRU();
    }//GEN-LAST:event_btnMRUMouseEntered

    private void btnMRUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMRUMouseExited
        resetearMRU();
    }//GEN-LAST:event_btnMRUMouseExited

    private void btnMRUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMRUMousePressed
        mostrarMRU();
    }//GEN-LAST:event_btnMRUMousePressed

    private void btnMRUAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMRUAMousePressed
        vistaMRUA pr = new vistaMRUA();
        pr.setSize(860, 470);
        pr.setLocation(0,0);
        bg.removeAll();
        bg.add(pr, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }//GEN-LAST:event_btnMRUAMousePressed

    private void btnCaidaLibreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaidaLibreMouseEntered
        seleccionCaida();
    }//GEN-LAST:event_btnCaidaLibreMouseEntered

    private void btnCaidaLibreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaidaLibreMouseExited
        resetearCaida();
    }//GEN-LAST:event_btnCaidaLibreMouseExited

    private void btnCaidaLibreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaidaLibreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaidaLibreMousePressed

    private void btnTiroVerticalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiroVerticalMouseEntered
        seleccionDisparo();
    }//GEN-LAST:event_btnTiroVerticalMouseEntered

    private void btnTiroVerticalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiroVerticalMouseExited
        resetearDisparo();
    }//GEN-LAST:event_btnTiroVerticalMouseExited

    private void btnTiroVerticalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiroVerticalMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTiroVerticalMousePressed

    private void btnMovParabolicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMovParabolicoMouseEntered
       seleccionParabolico();
    }//GEN-LAST:event_btnMovParabolicoMouseEntered

    private void btnMovParabolicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMovParabolicoMouseExited
        resetearParabolico();
    }//GEN-LAST:event_btnMovParabolicoMouseExited

    private void btnMovParabolicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMovParabolicoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMovParabolicoMousePressed

    private void btnMCUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCUMouseEntered
        seleccionMCU();
    }//GEN-LAST:event_btnMCUMouseEntered

    private void btnMCUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCUMouseExited
        resetearMCU();
    }//GEN-LAST:event_btnMCUMouseExited

    private void btnMCUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCUMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMCUMousePressed

    private void btnMCUAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCUAMouseEntered
        seleccionMCUA();
    }//GEN-LAST:event_btnMCUAMouseEntered

    private void btnMCUAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCUAMouseExited
        resetearMCUA();
    }//GEN-LAST:event_btnMCUAMouseExited

    private void btnMCUAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCUAMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMCUAMousePressed

    private void btnMRUAMouseEntered(java.awt.event.MouseEvent evt) {                                    
        seleccionMRUA();
    }                                   

    private void btnMRUAMouseExited(java.awt.event.MouseEvent evt) {                                   
        resetearMRUA();
    }    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Base().setVisible(true);
            }
        });
    }
    
    

    private void mostrarMRU(){
        vistaMRU pr = new vistaMRU();
        pr.setSize(860, 470);
        pr.setLocation(0,0);
        
        bg.removeAll();
        bg.add(pr, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }
    //----- Variaciones al entrar y salir el mouse ------//
    private void seleccionMRU(){
        bgMRU.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerClick.png")));
        labelMRU.setForeground(letrasAlternativo);
    }
    
    private void resetearMRU(){
        bgMRU.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerColor.png")));
        labelMRU.setForeground(letrasBase);
    }
    
    private void seleccionMRUA(){
        bgMRUA.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerClick.png")));
        labelMRUA.setForeground(letrasAlternativo);
    }
    
    private void resetearMRUA(){
        bgMRUA.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerColor.png")));
        labelMRUA.setForeground(letrasBase);
    }
    
    private void seleccionCaida(){
        bgCaida.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerClick.png")));
        labelCaida.setForeground(letrasAlternativo);
        labelLibre.setForeground(letrasAlternativo);
    }
    
    private void resetearCaida(){
        bgCaida.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerColor.png")));
        labelCaida.setForeground(letrasBase);
        labelLibre.setForeground(letrasBase);
    }
    
    private void seleccionDisparo(){
        bgTiro.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerClick.png")));
        labelTiro.setForeground(letrasAlternativo);
        labelVertical.setForeground(letrasAlternativo);
    }
    
    private void resetearDisparo(){
        bgTiro.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerColor.png")));
        labelTiro.setForeground(letrasBase);
        labelVertical.setForeground(letrasBase);
    }
    
    private void seleccionParabolico(){
        bgParabolico.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerClickBig.png")));
        labelMovimiento.setForeground(letrasAlternativo);
        labelParabolico.setForeground(letrasAlternativo);
    }
    
    private void resetearParabolico(){
        bgParabolico.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerSinColor.png")));
        labelMovimiento.setForeground(letrasBase);
        labelParabolico.setForeground(letrasBase);
    }
    
    private void seleccionMCU(){
        bgMCU.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerClick.png")));
        labelMCU.setForeground(letrasAlternativo);
    }
    
    private void resetearMCU(){
        bgMCU.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerColor.png")));
        labelMCU.setForeground(letrasBase);
    }
    
    private void seleccionMCUA(){
        bgMCUA.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerClick.png")));
        labelMCUA.setForeground(letrasAlternativo);
    }
    
    private void resetearMCUA(){
        bgMCUA.setIcon(new ImageIcon(getClass().getResource("/imagenes/utiliarios/headerColor.png")));
        labelMCUA.setForeground(letrasBase);
    }
    //----- Fin de las variaciones ------//
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgCaida;
    private javax.swing.JLabel bgMCU;
    private javax.swing.JLabel bgMCUA;
    private javax.swing.JLabel bgMRU;
    private javax.swing.JLabel bgMRUA;
    private javax.swing.JLabel bgParabolico;
    private javax.swing.JLabel bgTiro;
    private javax.swing.JPanel btnCaidaLibre;
    private javax.swing.JPanel btnMCU;
    private javax.swing.JPanel btnMCUA;
    private javax.swing.JPanel btnMRU;
    private javax.swing.JPanel btnMRUA;
    private javax.swing.JPanel btnMovParabolico;
    private javax.swing.JPanel btnTiroVertical;
    private javax.swing.JPanel header;
    private javax.swing.JLabel labelCaida;
    private javax.swing.JLabel labelLibre;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMCU;
    private javax.swing.JLabel labelMCUA;
    private javax.swing.JLabel labelMRU;
    private javax.swing.JLabel labelMRUA;
    private javax.swing.JLabel labelMovimiento;
    private javax.swing.JLabel labelParabolico;
    private javax.swing.JLabel labelTiro;
    private javax.swing.JLabel labelVertical;
    // End of variables declaration//GEN-END:variables
}
