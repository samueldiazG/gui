package co.edu.unicolombo.pb.samueldiaz;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class guia21 extends javax.swing.JFrame {

    JLabel etiNum1;
    JLabel etiNum2;
    JTextField txtNum1;
    JTextField txtNum2;
    JButton btnSumar;
    JButton btnRestar;

    public guia21() {
        initComponents();
        CreacionVentana();
    }
    
    public void CreacionVentana(){
        
        this.setTitle("");
        this.setSize(500,300);
        this.setLocation(100,100);
        
        etiNum1 = new JLabel();
        etiNum1.setText("Número 1: ");
        etiNum1.setBounds(10,10,100,20);
        this.getContentPane().add(etiNum1);
        
        etiNum2 = new JLabel();
        etiNum2.setText("Número 2: ");
        etiNum2.setBounds(10,60,100,20);
        this.getContentPane().add(etiNum2);
        
        txtNum1 = new JTextField();
        txtNum1.setText("0");
        txtNum1.setBounds(110,10,100,20);
        this.getContentPane().add(txtNum1);
        
        txtNum2 = new JTextField();
        txtNum2.setText("0");
        txtNum2.setBounds(110,60,100,20);
        this.getContentPane().add(txtNum2);
        
        btnSumar = new JButton();
        btnSumar.setText("Sumar");
        btnSumar.setBounds(10,120,100,20);
        this.getContentPane().add(btnSumar);
        
        btnRestar = new JButton();
        btnRestar.setText("Restar");
        btnRestar.setBounds(150,120,100,20);
        this.getContentPane().add(btnRestar);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            java.util.logging.Logger.getLogger(guia21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guia21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guia21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guia21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guia21().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
