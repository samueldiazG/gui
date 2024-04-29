package co.edu.unicolombo.pb.samueldiaz;

import java.awt.Color;

public class guia13 extends javax.swing.JFrame {


    public guia13() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuEmergente = new javax.swing.JPopupMenu();
        menuRojo = new javax.swing.JMenuItem();
        menuVerde = new javax.swing.JMenuItem();
        menuAzul = new javax.swing.JMenuItem();

        menuRojo.setText("Rojo");
        menuRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRojoActionPerformed(evt);
            }
        });
        menuEmergente.add(menuRojo);

        menuVerde.setText("Verde");
        menuVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerdeActionPerformed(evt);
            }
        });
        menuEmergente.add(menuVerde);

        menuAzul.setText("Azul");
        menuAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAzulActionPerformed(evt);
            }
        });
        menuEmergente.add(menuAzul);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
       menuEmergente.show(this,evt.getX(),evt.getY());
    }//GEN-LAST:event_formMouseClicked

    private void menuRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRojoActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.RED);
    }//GEN-LAST:event_menuRojoActionPerformed

    private void menuVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerdeActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.GREEN);
    }//GEN-LAST:event_menuVerdeActionPerformed

    private void menuAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAzulActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.BLUE);
    }//GEN-LAST:event_menuAzulActionPerformed

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
            java.util.logging.Logger.getLogger(guia13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guia13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guia13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guia13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guia13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem menuAzul;
    private javax.swing.JPopupMenu menuEmergente;
    private javax.swing.JMenuItem menuRojo;
    private javax.swing.JMenuItem menuVerde;
    // End of variables declaration//GEN-END:variables
}
