package PaginaPrincipal.Paneles;

import AccionEspecial.Accion;
import PaginaPrincipal.Controlador.ProductoControlador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelProducto extends javax.swing.JPanel {

    Accion accion = new Accion();
    ProductoControlador productoControlador = new ProductoControlador();

    DefaultTableModel modelo;

    public PanelProducto() {
        initComponents();
        this.cIdE.setVisible(false);
        cCantidadG.setVisible(false);
       
        productoControlador.Categoria(cbCategoria);
        productoControlador.Categoria(cbCategoriaE);
        productoControlador.listaProducto.clear();
        productoControlador.DatosTabla();
        productoControlador.LlenarTabla(modelo, tProducto);

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
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cPrecioC = new javax.swing.JTextField();
        cPrecioV = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        cCantidad = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox<>();
        bNuevo = new rojeru_san.rsbutton.RSButtonEffect();
        bRegistrar = new rojeru_san.rsbutton.RSButtonEffect();
        pEditar = new javax.swing.JPanel();
        pBuscarDoctor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProducto = new javax.swing.JTable();
        cBuscar = new javax.swing.JTextField();
        cIdE = new javax.swing.JTextField();
        bEditar = new rojeru_san.rsbutton.RSButtonEffect();
        bEliminar = new rojeru_san.rsbutton.RSButtonEffect();
        pDatos2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cNombreE = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        cPrecioCE = new javax.swing.JTextField();
        cPrecioVE = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        cCantidadE = new javax.swing.JTextField();
        cbCategoriaE = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        cCantidadNueva = new javax.swing.JTextField();
        cCantidadG = new javax.swing.JTextField();
        pDatos3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cCantidadMas = new javax.swing.JTextField();
        bListoAl = new rojeru_san.rsbutton.RSButtonEffect();
        jLabel17 = new javax.swing.JLabel();
        cCantidadMenos = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        pRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pRegistrar.setLayout(null);

        pDatos.setBackground(new java.awt.Color(255, 255, 255));
        pDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Producto"));
        pDatos.setAutoscrolls(true);

        jLabel13.setText("NOMBRE");

        cNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreKeyTyped(evt);
            }
        });

        jLabel29.setText("PRECIO DE COMPRA");

        jLabel30.setText("CANTIDAD");

        jLabel33.setText("PRECIO DE VENTA");

        cPrecioC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPrecioCKeyTyped(evt);
            }
        });

        cPrecioV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPrecioVKeyTyped(evt);
            }
        });

        jLabel34.setText("CATEGORIA");

        cCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCantidadKeyTyped(evt);
            }
        });

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));

        javax.swing.GroupLayout pDatosLayout = new javax.swing.GroupLayout(pDatos);
        pDatos.setLayout(pDatosLayout);
        pDatosLayout.setHorizontalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cPrecioC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cPrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pDatosLayout.setVerticalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPrecioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos);
        pDatos.setBounds(40, 40, 530, 200);

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
        pBuscarDoctor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Producto"));

        tProducto = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tProducto.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tProducto);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(cBuscar))
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
        pBuscarDoctor.setBounds(10, 40, 360, 380);

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
        pDatos2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Producto"));
        pDatos2.setAutoscrolls(true);

        jLabel15.setText("NOMBRE");

        cNombreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNombreEActionPerformed(evt);
            }
        });
        cNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreEKeyTyped(evt);
            }
        });

        jLabel35.setText("PRECIO DE COMPRA");

        jLabel36.setText("CANTIDAD ACTUAL");

        jLabel37.setText("PRECIO DE VENTA");

        cPrecioCE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPrecioCEKeyTyped(evt);
            }
        });

        cPrecioVE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPrecioVEKeyTyped(evt);
            }
        });

        jLabel38.setText("CATEGORIA");

        cCantidadE.setEditable(false);
        cCantidadE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCantidadEKeyTyped(evt);
            }
        });

        cbCategoriaE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));

        jLabel39.setText("CANTIDAD NUEVA");

        cCantidadNueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCantidadNuevaKeyTyped(evt);
            }
        });

        cCantidadG.setEditable(false);
        cCantidadG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCantidadGKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos2Layout = new javax.swing.GroupLayout(pDatos2);
        pDatos2.setLayout(pDatos2Layout);
        pDatos2Layout.setHorizontalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos2Layout.createSequentialGroup()
                        .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pDatos2Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(pDatos2Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)))
                        .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cCantidadE, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(cPrecioVE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDatos2Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cCantidadNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDatos2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cCantidadG, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pDatos2Layout.createSequentialGroup()
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbCategoriaE, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pDatos2Layout.createSequentialGroup()
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cPrecioCE)
                            .addGap(201, 201, 201))
                        .addGroup(pDatos2Layout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pDatos2Layout.setVerticalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPrecioCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPrecioVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCantidadG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCantidadE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCantidadNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCategoriaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pEditar.add(pDatos2);
        pDatos2.setBounds(390, 40, 470, 200);

        pDatos3.setBackground(new java.awt.Color(255, 255, 255));
        pDatos3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Bodega"));
        pDatos3.setAutoscrolls(true);

        jLabel16.setText("INGRESO");

        cCantidadMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCantidadMasActionPerformed(evt);
            }
        });
        cCantidadMas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCantidadMasKeyTyped(evt);
            }
        });

        bListoAl.setBackground(new java.awt.Color(204, 51, 255));
        bListoAl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoAl.setColorHover(new java.awt.Color(204, 153, 255));
        bListoAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoAlActionPerformed(evt);
            }
        });

        jLabel17.setText("EGRESO");

        cCantidadMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCantidadMenosActionPerformed(evt);
            }
        });
        cCantidadMenos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCantidadMenosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos3Layout = new javax.swing.GroupLayout(pDatos3);
        pDatos3.setLayout(pDatos3Layout);
        pDatos3Layout.setHorizontalGroup(
            pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cCantidadMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cCantidadMas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(bListoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pDatos3Layout.setVerticalGroup(
            pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bListoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cCantidadMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCantidadMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pEditar.add(pDatos3);
        pDatos3.setBounds(390, 260, 310, 100);

        jTabbedPane1.addTab("ADMINISTRAR", pEditar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 880, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void cNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cNombreKeyTyped

    private void cBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cBuscarKeyTyped

    private void cBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyReleased
        this.accion.filtro(this.cBuscar.getText(), tProducto);
    }//GEN-LAST:event_cBuscarKeyReleased

    private void cIdEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdEKeyTyped

    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed
        productoControlador.RegistrarProducto(cNombre, cPrecioV, cPrecioC, cCantidad, cbCategoria);
        productoControlador.listaProducto.clear();
        productoControlador.DatosTabla();
        productoControlador.LlenarTabla(modelo, tProducto);
    }//GEN-LAST:event_bRegistrarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        productoControlador.Modificar(cIdE, cNombreE, cPrecioVE, cPrecioCE, cCantidadNueva, cbCategoriaE);
        cCantidadG.setText("");
        cCantidadNueva.setText("");
        productoControlador.listaProducto.clear();
        productoControlador.DatosTabla();
        productoControlador.LlenarTabla(modelo, tProducto);
    }//GEN-LAST:event_bEditarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "¿Desea eliminar ?", "Confirmación ", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            productoControlador.Eliminar(cIdE, cNombreE, cPrecioVE, cPrecioCE, cCantidadE, cbCategoriaE);
            productoControlador.listaProducto.clear();
            productoControlador.DatosTabla();
            productoControlador.LlenarTabla(modelo, tProducto);
        } else {
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        productoControlador.Vacio(cNombre, cPrecioVE, cPrecioCE, cCantidad, cbCategoria);
    }//GEN-LAST:event_bNuevoActionPerformed

    private void cPrecioCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPrecioCKeyTyped
        this.accion.Numeros(evt);
    }//GEN-LAST:event_cPrecioCKeyTyped

    private void cPrecioVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPrecioVKeyTyped
        this.accion.Numeros(evt);
    }//GEN-LAST:event_cPrecioVKeyTyped

    private void cCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCantidadKeyTyped
        this.accion.Numeros(evt);
    }//GEN-LAST:event_cCantidadKeyTyped

    private void cNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreEKeyTyped
        accion.Mayuscula(evt);

    }//GEN-LAST:event_cNombreEKeyTyped

    private void cPrecioCEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPrecioCEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cPrecioCEKeyTyped

    private void cPrecioVEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPrecioVEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cPrecioVEKeyTyped

    private void cCantidadEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCantidadEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cCantidadEKeyTyped

    private void cCantidadMasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCantidadMasKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cCantidadMasKeyTyped

    private void bListoAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoAlActionPerformed
        this.productoControlador.Calcular(cCantidadE,cCantidadG, cCantidadMas, cCantidadMenos, cCantidadNueva);
        cCantidadMas.setText("");
        cCantidadMenos.setText("");


    }//GEN-LAST:event_bListoAlActionPerformed

    private void cCantidadNuevaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCantidadNuevaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cCantidadNuevaKeyTyped

    private void cCantidadMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCantidadMasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCantidadMasActionPerformed

    private void cCantidadMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCantidadMenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCantidadMenosActionPerformed

    private void cCantidadMenosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCantidadMenosKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cCantidadMenosKeyTyped

    private void tProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProductoMouseClicked
        this.productoControlador.PasarDatos(tProducto, cIdE, cNombreE, cPrecioVE, cPrecioCE, cCantidadE,cCantidadG, cbCategoriaE);
         cCantidadNueva.setText(cCantidadE.getText());
    }//GEN-LAST:event_tProductoMouseClicked

    private void cNombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreEActionPerformed

    private void cCantidadGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCantidadGKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cCantidadGKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonEffect bEditar;
    private rojeru_san.rsbutton.RSButtonEffect bEliminar;
    private rojeru_san.rsbutton.RSButtonEffect bListoAl;
    private rojeru_san.rsbutton.RSButtonEffect bNuevo;
    private rojeru_san.rsbutton.RSButtonEffect bRegistrar;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField cBuscar;
    private javax.swing.JTextField cCantidad;
    private javax.swing.JTextField cCantidadE;
    private javax.swing.JTextField cCantidadG;
    private javax.swing.JTextField cCantidadMas;
    private javax.swing.JTextField cCantidadMenos;
    private javax.swing.JTextField cCantidadNueva;
    private javax.swing.JTextField cIdE;
    private javax.swing.JTextField cNombre;
    private javax.swing.JTextField cNombreE;
    private javax.swing.JTextField cPrecioC;
    private javax.swing.JTextField cPrecioCE;
    private javax.swing.JTextField cPrecioV;
    private javax.swing.JTextField cPrecioVE;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbCategoriaE;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pBuscarDoctor;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pDatos2;
    private javax.swing.JPanel pDatos3;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pRegistrar;
    private javax.swing.JTable tProducto;
    // End of variables declaration//GEN-END:variables
}
