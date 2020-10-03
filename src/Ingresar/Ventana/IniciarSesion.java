
package Ingresar.Ventana;

import AccionEspecial.Accion;
import Login.controlador.IniciarSesionControlador;

public class IniciarSesion extends javax.swing.JFrame {

    Accion accion = new Accion();
    IniciarSesionControlador ingresar = new IniciarSesionControlador();

    public IniciarSesion() {
        initComponents();
        this.setTitle("Iniciar Sesión");
        this.setSize(750, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelIngreso = new javax.swing.JPanel();
        Inicio = new javax.swing.JLabel();
        cUsuario = new javax.swing.JTextField();
        cContrasena = new javax.swing.JPasswordField();
        Clave = new javax.swing.JButton();
        MiniClave = new javax.swing.JLabel();
        BarraGris1 = new javax.swing.JLabel();
        BarraGris = new javax.swing.JLabel();
        rSButtonMetro2 = new rojeru_san.rsbutton.RSButtonMetro();
        rSButtonEffect1 = new rojeru_san.rsbutton.RSButtonEffect();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        PanelFondo.setBackground(new java.awt.Color(221, 87, 76));
        PanelFondo.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KEFISH KOREA - ECUADOR");
        PanelFondo.add(jLabel3);
        jLabel3.setBounds(10, 60, 347, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/KefishFondo.png"))); // NOI18N
        PanelFondo.add(jLabel2);
        jLabel2.setBounds(20, 120, 320, 310);

        getContentPane().add(PanelFondo);
        PanelFondo.setBounds(0, 0, 370, 470);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 20, 150, 145);

        PanelIngreso.setBackground(new java.awt.Color(255, 255, 255));
        PanelIngreso.setLayout(null);

        Inicio.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20)); // NOI18N
        Inicio.setForeground(new java.awt.Color(102, 102, 102));
        Inicio.setText("Inicio de sesión");
        PanelIngreso.add(Inicio);
        Inicio.setBounds(70, 60, 160, 50);

        cUsuario.setBackground(new java.awt.Color(214, 217, 223));
        cUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cUsuario.setForeground(new java.awt.Color(102, 102, 102));
        cUsuario.setBorder(null);
        cUsuario.setOpaque(false);
        PanelIngreso.add(cUsuario);
        cUsuario.setBounds(30, 130, 210, 30);

        cContrasena.setBackground(new java.awt.Color(214, 217, 223));
        cContrasena.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cContrasena.setForeground(new java.awt.Color(102, 102, 102));
        cContrasena.setBorder(null);
        cContrasena.setOpaque(false);
        cContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cContrasenaActionPerformed(evt);
            }
        });
        PanelIngreso.add(cContrasena);
        cContrasena.setBounds(30, 180, 210, 30);

        Clave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoojo.png"))); // NOI18N
        Clave.setContentAreaFilled(false);
        Clave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaveActionPerformed(evt);
            }
        });
        PanelIngreso.add(Clave);
        Clave.setBounds(240, 180, 30, 30);

        MiniClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de id.png"))); // NOI18N
        PanelIngreso.add(MiniClave);
        MiniClave.setBounds(240, 130, 30, 30);

        BarraGris1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/barra gris.png"))); // NOI18N
        BarraGris1.setText("jLabel2");
        PanelIngreso.add(BarraGris1);
        BarraGris1.setBounds(10, 120, 270, 50);

        BarraGris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/barra gris.png"))); // NOI18N
        BarraGris.setText("jLabel2");
        PanelIngreso.add(BarraGris);
        BarraGris.setBounds(10, 170, 270, 50);

        rSButtonMetro2.setText("rSButtonMetro2");
        PanelIngreso.add(rSButtonMetro2);
        rSButtonMetro2.setBounds(80, 180, 100, 30);

        rSButtonEffect1.setBackground(new java.awt.Color(221, 87, 76));
        rSButtonEffect1.setText("INGRESAR");
        rSButtonEffect1.setColorHover(new java.awt.Color(248, 133, 124));
        rSButtonEffect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonEffect1ActionPerformed(evt);
            }
        });
        PanelIngreso.add(rSButtonEffect1);
        rSButtonEffect1.setBounds(10, 240, 280, 40);

        getContentPane().add(PanelIngreso);
        PanelIngreso.setBounds(410, 110, 300, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cContrasenaActionPerformed

    }//GEN-LAST:event_cContrasenaActionPerformed

    private void ClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaveActionPerformed
        accion.MostrarOcultar(cContrasena);
    }//GEN-LAST:event_ClaveActionPerformed

    private void bIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarActionPerformed

    }//GEN-LAST:event_bIniciarActionPerformed

    private void bCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCitaActionPerformed
       
    }//GEN-LAST:event_bCitaActionPerformed

    private void rSButtonEffect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonEffect1ActionPerformed
       ingresar.Ingresar(cUsuario, cContrasena, this);
    }//GEN-LAST:event_rSButtonEffect1ActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraGris;
    private javax.swing.JLabel BarraGris1;
    private javax.swing.JButton Clave;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel MiniClave;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelIngreso;
    private javax.swing.JPasswordField cContrasena;
    private javax.swing.JTextField cUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private rojeru_san.rsbutton.RSButtonEffect rSButtonEffect1;
    private rojeru_san.rsbutton.RSButtonMetro rSButtonMetro2;
    // End of variables declaration//GEN-END:variables
}
