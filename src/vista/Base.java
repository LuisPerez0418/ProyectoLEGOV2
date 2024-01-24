package vista;

import java.awt.BorderLayout;

public class Base extends javax.swing.JFrame {

    public Base() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonMRU = new javax.swing.JButton();
        buttonMRUA = new javax.swing.JButton();
        bg = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(153, 153, 153));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Montserrat Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LEGO");
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -7, -1, 70));

        buttonMRU.setText("MRU");
        buttonMRU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMRUActionPerformed(evt);
            }
        });
        header.add(buttonMRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        buttonMRUA.setText("MRUA");
        buttonMRUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMRUAActionPerformed(evt);
            }
        });
        header.add(buttonMRUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

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

    private void buttonMRUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMRUActionPerformed
        vistaMRU pr = new vistaMRU();
        pr.setSize(860, 470);
        pr.setLocation(0,0);
        
        bg.removeAll();
        bg.add(pr, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }//GEN-LAST:event_buttonMRUActionPerformed

    private void buttonMRUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMRUAActionPerformed
        vistaMRUA pr = new vistaMRUA();
        pr.setSize(860, 470);
        pr.setLocation(0,0);
        
        bg.removeAll();
        bg.add(pr, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }//GEN-LAST:event_buttonMRUAActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton buttonMRU;
    private javax.swing.JButton buttonMRUA;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
