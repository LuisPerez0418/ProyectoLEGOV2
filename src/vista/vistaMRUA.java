package vista;

import java.awt.BorderLayout;
import vista.mrua.Distancia;

public class vistaMRUA extends javax.swing.JPanel {

    public vistaMRUA() {
        initComponents();
        Distancia pr = new Distancia();
        pr.setSize(720, 470);
        pr.setLocation(0,0);

        contenido.removeAll();
        contenido.add(pr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu1 = new javax.swing.JPanel();
        buttonVelocidad1 = new javax.swing.JButton();
        btnDistancia = new javax.swing.JButton();
        btnTiempo = new javax.swing.JButton();
        btnAceleracion = new javax.swing.JButton();
        btnVelocidadFinal = new javax.swing.JButton();
        contenido = new javax.swing.JPanel();

        Menu1.setBackground(new java.awt.Color(204, 204, 255));

        buttonVelocidad1.setText("Velocidad inicial");
        buttonVelocidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVelocidad1ActionPerformed(evt);
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

        btnAceleracion.setText("Acelaracion");
        btnAceleracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceleracionActionPerformed(evt);
            }
        });

        btnVelocidadFinal.setText("Velocidad final");
        btnVelocidadFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVelocidadFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu1Layout = new javax.swing.GroupLayout(Menu1);
        Menu1.setLayout(Menu1Layout);
        Menu1Layout.setHorizontalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVelocidadFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceleracion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVelocidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        Menu1Layout.setVerticalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(buttonVelocidad1)
                .addGap(18, 18, 18)
                .addComponent(btnVelocidadFinal)
                .addGap(18, 18, 18)
                .addComponent(btnDistancia)
                .addGap(18, 18, 18)
                .addComponent(btnTiempo)
                .addGap(18, 18, 18)
                .addComponent(btnAceleracion)
                .addContainerGap(252, Short.MAX_VALUE))
        );

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
            .addGap(0, 860, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVelocidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVelocidad1ActionPerformed
 
    }//GEN-LAST:event_buttonVelocidad1ActionPerformed

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

    }//GEN-LAST:event_btnTiempoActionPerformed

    private void btnAceleracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceleracionActionPerformed

    }//GEN-LAST:event_btnAceleracionActionPerformed

    private void btnVelocidadFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVelocidadFinalActionPerformed

    }//GEN-LAST:event_btnVelocidadFinalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Menu1;
    private javax.swing.JButton btnAceleracion;
    private javax.swing.JButton btnDistancia;
    private javax.swing.JButton btnTiempo;
    private javax.swing.JButton btnVelocidadFinal;
    private javax.swing.JButton buttonVelocidad;
    private javax.swing.JButton buttonVelocidad1;
    private javax.swing.JPanel contenido;
    // End of variables declaration//GEN-END:variables
}
