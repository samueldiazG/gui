package co.edu.unicolombo.pb.SamuelDiaz;

import java.awt.Color;

public class guia11 extends javax.swing.JFrame {


    public guia11() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemAbrir = new javax.swing.JMenuItem();
        menuItemGuardar = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();
        menuColores = new javax.swing.JMenu();
        menuItemRojo = new javax.swing.JMenuItem();
        menuItemVerde = new javax.swing.JMenuItem();
        menuItemAzul = new javax.swing.JMenuItem();
        menuInsertar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArchivo.setText("Archivo");

        menuItemAbrir.setText("Abrir");
        menuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemAbrir);

        menuItemGuardar.setText("Guardar");
        menuArchivo.add(menuItemGuardar);
        menuArchivo.add(separador1);

        menuSalir.setText("Salir");
        menuArchivo.add(menuSalir);

        barraMenus.add(menuArchivo);

        menuEdicion.setText("Edición");

        menuColores.setText("Colores");

        menuItemRojo.setText("Rojo");
        menuItemRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRojoActionPerformed(evt);
            }
        });
        menuColores.add(menuItemRojo);

        menuItemVerde.setText("Verde");
        menuItemVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerdeActionPerformed(evt);
            }
        });
        menuColores.add(menuItemVerde);

        menuItemAzul.setText("Azul");
        menuItemAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAzulActionPerformed(evt);
            }
        });
        menuColores.add(menuItemAzul);

        menuEdicion.add(menuColores);

        barraMenus.add(menuEdicion);

        menuInsertar.setText("Insertar");
        barraMenus.add(menuInsertar);

        setJMenuBar(barraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemAbrirActionPerformed

    private void menuItemRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRojoActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.RED);
    }//GEN-LAST:event_menuItemRojoActionPerformed

    private void menuItemVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerdeActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.GREEN);
    }//GEN-LAST:event_menuItemVerdeActionPerformed

    private void menuItemAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAzulActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.BLUE);
    }//GEN-LAST:event_menuItemAzulActionPerformed

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
            java.util.logging.Logger.getLogger(guia11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guia11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guia11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guia11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guia11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuColores;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JMenu menuInsertar;
    private javax.swing.JMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemAzul;
    private javax.swing.JMenuItem menuItemGuardar;
    private javax.swing.JMenuItem menuItemRojo;
    private javax.swing.JMenuItem menuItemVerde;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JPopupMenu.Separator separador1;
    // End of variables declaration//GEN-END:variables
}
