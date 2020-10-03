package PaginaPrincipal.Paneles;

import AccionEspecial.Accion;
import PaginaPrincipal.Controlador.CategoriaControlador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelCategoria extends javax.swing.JPanel {

    Accion accion = new Accion();
    CategoriaControlador parrocoControlador = new CategoriaControlador();

    DefaultTableModel modelo;

    public PanelCategoria() {
        initComponents();
        this.cIdE.setVisible(false);
        parrocoControlador.DatosTabla();
        parrocoControlador.LlenarTabla(modelo, tCategoria);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pRegistrar = new javax.swing.JPanel();
        pDatos = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cNombre = new javax.swing.JTextField();
        bNuevo = new rojeru_san.rsbutton.RSButtonEffect();
        bRegistrar = new rojeru_san.rsbutton.RSButtonEffect();
        pEditar = new javax.swing.JPanel();
        pBuscarDoctor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCategoria = new javax.swing.JTable();
        cBuscar = new javax.swing.JTextField();
        cIdE = new javax.swing.JTextField();
        bEditar = new rojeru_san.rsbutton.RSButtonEffect();
        bEliminar = new rojeru_san.rsbutton.RSButtonEffect();
        pDatos2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cNombreE = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        pRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pRegistrar.setLayout(null);

        pDatos.setBackground(new java.awt.Color(255, 255, 255));
        pDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Categoria"));
        pDatos.setAutoscrolls(true);

        jLabel13.setText("NOMBRE");

        cNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatosLayout = new javax.swing.GroupLayout(pDatos);
        pDatos.setLayout(pDatosLayout);
        pDatosLayout.setHorizontalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pDatosLayout.setVerticalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos);
        pDatos.setBounds(40, 40, 530, 80);

        bNuevo.setBackground(new java.awt.Color(102, 102, 255));
        bNuevo.setText("NUEVO");
        bNuevo.setColorHover(new java.awt.Color(153, 153, 255));
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });
        pRegistrar.add(bNuevo);
        bNuevo.setBounds(340, 360, 120, 40);

        bRegistrar.setBackground(new java.awt.Color(0, 204, 102));
        bRegistrar.setText("REGISTRAR");
        bRegistrar.setColorHover(new java.awt.Color(0, 255, 102));
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });
        pRegistrar.add(bRegistrar);
        bRegistrar.setBounds(480, 360, 120, 40);

        jTabbedPane1.addTab("REGISTRAR", pRegistrar);

        pEditar.setBackground(new java.awt.Color(255, 255, 255));
        pEditar.setLayout(null);

        pBuscarDoctor.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Categoria"));

        tCategoria = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tCategoria.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCategoria);

        cBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cBuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pBuscarDoctorLayout = new javax.swing.GroupLayout(pBuscarDoctor);
        pBuscarDoctor.setLayout(pBuscarDoctorLayout);
        pBuscarDoctorLayout.setHorizontalGroup(
            pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addGroup(pBuscarDoctorLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pBuscarDoctorLayout.setVerticalGroup(
            pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );

        pEditar.add(pBuscarDoctor);
        pBuscarDoctor.setBounds(10, 40, 340, 380);

        cIdE.setEditable(false);
        cIdE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdEKeyTyped(evt);
            }
        });
        pEditar.add(cIdE);
        cIdE.setBounds(410, 10, 50, 20);

        bEditar.setBackground(new java.awt.Color(255, 204, 0));
        bEditar.setText("EDITAR");
        bEditar.setColorHover(new java.awt.Color(255, 204, 51));
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        pEditar.add(bEditar);
        bEditar.setBounds(490, 440, 100, 40);

        bEliminar.setBackground(new java.awt.Color(221, 87, 76));
        bEliminar.setText("ELIMINAR");
        bEliminar.setColorHover(new java.awt.Color(248, 133, 124));
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        pEditar.add(bEliminar);
        bEliminar.setBounds(620, 440, 100, 40);

        pDatos2.setBackground(new java.awt.Color(255, 255, 255));
        pDatos2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Categoria"));
        pDatos2.setAutoscrolls(true);

        jLabel15.setText("Nombre");

        cNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos2Layout = new javax.swing.GroupLayout(pDatos2);
        pDatos2.setLayout(pDatos2Layout);
        pDatos2Layout.setHorizontalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pDatos2Layout.setVerticalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pEditar.add(pDatos2);
        pDatos2.setBounds(380, 60, 480, 80);

        jTabbedPane1.addTab("ADMINISTRAR", pEditar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 880, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void cNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cNombreKeyTyped

    private void cBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cBuscarKeyTyped

    private void cBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyReleased
        this.accion.filtro(this.cBuscar.getText(), tCategoria);
    }//GEN-LAST:event_cBuscarKeyReleased

    private void cIdEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdEKeyTyped

    private void tCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCategoriaMouseClicked
        parrocoControlador.PasarDatos(tCategoria, cIdE, cNombreE);
    }//GEN-LAST:event_tCategoriaMouseClicked

    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed

        parrocoControlador.RegistrarCategoria(cNombre);
        parrocoControlador.listaCategoria.clear();
        parrocoControlador.DatosTabla();
        parrocoControlador.LlenarTabla(modelo, tCategoria);
    }//GEN-LAST:event_bRegistrarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        parrocoControlador.ModificarCategoria(cIdE, cNombreE);
        parrocoControlador.listaCategoria.clear();
        parrocoControlador.DatosTabla();
        parrocoControlador.LlenarTabla(modelo, tCategoria);
    }//GEN-LAST:event_bEditarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "¿Desea eliminar ?", "Confirmación ", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            parrocoControlador.Eliminar(cIdE, cNombreE);
            cBuscar.setText("");
            parrocoControlador.listaCategoria.clear();
            parrocoControlador.DatosTabla();
            parrocoControlador.LlenarTabla(modelo, tCategoria);

        } else {
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        parrocoControlador.Vacio(cNombre);
    }//GEN-LAST:event_bNuevoActionPerformed

    private void cNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreEKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cNombreEKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonEffect bEditar;
    private rojeru_san.rsbutton.RSButtonEffect bEliminar;
    private rojeru_san.rsbutton.RSButtonEffect bNuevo;
    private rojeru_san.rsbutton.RSButtonEffect bRegistrar;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField cBuscar;
    private javax.swing.JTextField cIdE;
    private javax.swing.JTextField cNombre;
    private javax.swing.JTextField cNombreE;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pBuscarDoctor;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pDatos2;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pRegistrar;
    private javax.swing.JTable tCategoria;
    // End of variables declaration//GEN-END:variables
}
