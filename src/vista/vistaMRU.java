package vista;

import java.awt.BorderLayout;
import vista.mru.Distancia;
import vista.mru.Tiempo;
import vista.mru.Velocidad;

public class vistaMRU extends javax.swing.JPanel {

    public vistaMRU() {
        initComponents();
        Velocidad pr = new Velocidad();
        pr.setSize(720, 470);
        pr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(pr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btnVelocidad = new javax.swing.JButton();
        btnDistancia = new javax.swing.JButton();
        btnTiempo = new javax.swing.JButton();
        contenido = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(153, 153, 153));
        bg.setForeground(new java.awt.Color(102, 102, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 235, -1, -1));

        Menu.setBackground(new java.awt.Color(204, 204, 255));

        btnVelocidad.setText("Velocidad");
        btnVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVelocidadActionPerformed(evt);
            }
        });

        btnDistancia.setText("Distancia");
        btnDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistanciaActionPerformed(evt);
            }
        });

        btnTiempo.setText("Tiempo");
        btnTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiempoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnVelocidad)
                .addGap(18, 18, 18)
                .addComponent(btnDistancia)
                .addGap(18, 18, 18)
                .addComponent(btnTiempo)
                .addContainerGap(336, Short.MAX_VALUE))
        );

        add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 720, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVelocidadActionPerformed
        Velocidad pr = new Velocidad();
        pr.setSize(720, 470);
        pr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(pr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnVelocidadActionPerformed

    private void btnDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistanciaActionPerformed
        Distancia pr = new Distancia();
        pr.setSize(720, 470);
        pr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(pr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnDistanciaActionPerformed

    private void btnTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiempoActionPerformed
        Tiempo pr = new Tiempo();
        pr.setSize(720, 470);
        pr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(pr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnTiempoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnDistancia;
    private javax.swing.JButton btnTiempo;
    private javax.swing.JButton btnVelocidad;
    private javax.swing.JPanel contenido;
    // End of variables declaration//GEN-END:variables
}
