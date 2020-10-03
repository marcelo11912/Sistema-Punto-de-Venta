package PaginaPrincipal.Paneles;

import AccionEspecial.Accion;
import Bean.Temporal;
import PaginaPrincipal.Buscar.BuscarCliente;
import PaginaPrincipal.Buscar.BuscarComprobante;

import PaginaPrincipal.Controlador.VentaControlador;
import PaginaPrincipal.PaginaPrincipal;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PanelVenta extends javax.swing.JPanel {

    Accion accion = new Accion();
    Temporal temporal = new Temporal();
    VentaControlador ventaControlador = new VentaControlador();
    DefaultTableModel modelo;
    PaginaPrincipal PaginaPrincipal = new PaginaPrincipal();

    public PanelVenta() {
        try {
            initComponents();
            this.cFecha.setText(formatDate(new java.util.Date()));
            cIdProducto.setVisible(false);
            cCantidadA.setVisible(false);

            ventaControlador.DatosTablaProdu();
            ventaControlador.LlenarTablaProd(modelo, tProducto);
            cNumCompr.setText(String.valueOf(ventaControlador.id()));
        } catch (SQLException ex) {
            Logger.getLogger(PanelVenta.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        jLabel14 = new javax.swing.JLabel();
        cCedula = new javax.swing.JTextField();
        bListoAl1 = new rojeru_san.rsbutton.RSButtonEffect();
        bBuscarAl1 = new rojeru_san.rsbutton.RSButtonEffect();
        bRegistrar = new rojeru_san.rsbutton.RSButtonEffect();
        bComprobante = new rojeru_san.rsbutton.RSButtonEffect();
        cIdProducto = new javax.swing.JTextField();
        pDatos10 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        cNumCompr = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        cFecha = new javax.swing.JTextField();
        pBuscarDoctor2 = new javax.swing.JPanel();
        cBuscar = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tProducto = new javax.swing.JTable();
        pDatos11 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        cNombreP = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        cPrecioP = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        cCantidadP = new javax.swing.JTextField();
        bListoAl4 = new rojeru_san.rsbutton.RSButtonEffect();
        bEliminar = new rojeru_san.rsbutton.RSButtonEffect();
        jScrollPane3 = new javax.swing.JScrollPane();
        tOrden = new javax.swing.JTable();
        lTotal = new javax.swing.JLabel();
        pDatos12 = new javax.swing.JPanel();
        bBuscarAl = new rojeru_san.rsbutton.RSButtonEffect();
        bListoAl = new rojeru_san.rsbutton.RSButtonEffect();
        cCantidadA = new javax.swing.JTextField();
        bNuevo = new rojeru_san.rsbutton.RSButtonEffect();
        bEditar2 = new rojeru_san.rsbutton.RSButtonEffect();
        pDatos1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cNombre1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cCedula1 = new javax.swing.JTextField();
        pDatos13 = new javax.swing.JPanel();
        cbPago = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        pRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pRegistrar.setLayout(null);

        pDatos.setBackground(new java.awt.Color(255, 255, 255));
        pDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Cliente"));
        pDatos.setAutoscrolls(true);

        jLabel13.setText("NOMBRES");

        cNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNombreActionPerformed(evt);
            }
        });
        cNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreKeyTyped(evt);
            }
        });

        jLabel14.setText("CEDULA");

        cCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCedulaActionPerformed(evt);
            }
        });
        cCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCedulaKeyTyped(evt);
            }
        });

        bListoAl1.setBackground(new java.awt.Color(204, 51, 255));
        bListoAl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoAl1.setColorHover(new java.awt.Color(204, 153, 255));
        bListoAl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoAl1ActionPerformed(evt);
            }
        });

        bBuscarAl1.setBackground(new java.awt.Color(204, 51, 255));
        bBuscarAl1.setText("Buscar");
        bBuscarAl1.setColorHover(new java.awt.Color(204, 153, 255));
        bBuscarAl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarAl1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDatosLayout = new javax.swing.GroupLayout(pDatos);
        pDatos.setLayout(pDatosLayout);
        pDatosLayout.setHorizontalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(bBuscarAl1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bListoAl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pDatosLayout.setVerticalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cNombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bBuscarAl1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bListoAl1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos);
        pDatos.setBounds(10, 10, 440, 101);

        bRegistrar.setBackground(new java.awt.Color(0, 204, 102));
        bRegistrar.setText("REGISTRAR");
        bRegistrar.setColorHover(new java.awt.Color(0, 255, 102));
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });
        pRegistrar.add(bRegistrar);
        bRegistrar.setBounds(300, 500, 120, 40);

        bComprobante.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante.setText("COMPROBANTE");
        bComprobante.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobanteActionPerformed(evt);
            }
        });
        pRegistrar.add(bComprobante);
        bComprobante.setBounds(540, 500, 140, 40);

        cIdProducto.setEditable(false);
        cIdProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdProductoKeyTyped(evt);
            }
        });
        pRegistrar.add(cIdProducto);
        cIdProducto.setBounds(50, 450, 20, 20);

        pDatos10.setBackground(new java.awt.Color(255, 255, 255));
        pDatos10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Comprobante"));
        pDatos10.setAutoscrolls(true);

        jLabel33.setText(" N.º");

        cNumCompr.setEditable(false);
        cNumCompr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNumComprActionPerformed(evt);
            }
        });
        cNumCompr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNumComprKeyTyped(evt);
            }
        });

        jLabel34.setText(" FECHA:");

        cFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFechaActionPerformed(evt);
            }
        });
        cFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cFechaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos10Layout = new javax.swing.GroupLayout(pDatos10);
        pDatos10.setLayout(pDatos10Layout);
        pDatos10Layout.setHorizontalGroup(
            pDatos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pDatos10Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cNumCompr, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos10Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cFecha)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pDatos10Layout.setVerticalGroup(
            pDatos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNumCompr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pRegistrar.add(pDatos10);
        pDatos10.setBounds(470, 10, 190, 95);

        pBuscarDoctor2.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Productos Disponibles"));

        cBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cBuscarKeyTyped(evt);
            }
        });

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
        jScrollPane4.setViewportView(tProducto);

        javax.swing.GroupLayout pBuscarDoctor2Layout = new javax.swing.GroupLayout(pBuscarDoctor2);
        pBuscarDoctor2.setLayout(pBuscarDoctor2Layout);
        pBuscarDoctor2Layout.setHorizontalGroup(
            pBuscarDoctor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pBuscarDoctor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pBuscarDoctor2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pBuscarDoctor2Layout.setVerticalGroup(
            pBuscarDoctor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(pBuscarDoctor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor2Layout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pRegistrar.add(pBuscarDoctor2);
        pBuscarDoctor2.setBounds(10, 180, 220, 240);

        pDatos11.setBackground(new java.awt.Color(255, 255, 255));
        pDatos11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Detalles del Producto"));
        pDatos11.setAutoscrolls(true);

        jLabel35.setText("NOMBRE:");

        cNombreP.setEditable(false);
        cNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNombrePActionPerformed(evt);
            }
        });
        cNombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombrePKeyTyped(evt);
            }
        });

        jLabel37.setText("PRECIO");

        cPrecioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPrecioPActionPerformed(evt);
            }
        });
        cPrecioP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPrecioPKeyTyped(evt);
            }
        });

        jLabel39.setText("CANTIDAD:");

        cCantidadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCantidadPActionPerformed(evt);
            }
        });
        cCantidadP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCantidadPKeyTyped(evt);
            }
        });

        bListoAl4.setBackground(new java.awt.Color(0, 204, 102));
        bListoAl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de agregar.png"))); // NOI18N
        bListoAl4.setColorHover(new java.awt.Color(0, 255, 102));
        bListoAl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoAl4ActionPerformed(evt);
            }
        });
        bListoAl4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bListoAl4KeyReleased(evt);
            }
        });

        bEliminar.setBackground(new java.awt.Color(153, 0, 0));
        bEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de elim.png"))); // NOI18N
        bEliminar.setColorHover(new java.awt.Color(255, 0, 0));
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        bEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bEliminarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pDatos11Layout = new javax.swing.GroupLayout(pDatos11);
        pDatos11.setLayout(pDatos11Layout);
        pDatos11Layout.setHorizontalGroup(
            pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addGap(12, 12, 12)
                .addComponent(cPrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(bListoAl4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pDatos11Layout.setVerticalGroup(
            pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos11Layout.createSequentialGroup()
                        .addGroup(pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cPrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cCantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bListoAl4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pRegistrar.add(pDatos11);
        pDatos11.setBounds(240, 110, 610, 66);

        tOrden = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tOrden.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tOrdenMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tOrden);

        pRegistrar.add(jScrollPane3);
        jScrollPane3.setBounds(240, 190, 610, 240);

        lTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pRegistrar.add(lTotal);
        lTotal.setBounds(790, 440, 60, 23);

        pDatos12.setBackground(new java.awt.Color(255, 255, 255));
        pDatos12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Comprobante"));
        pDatos12.setAutoscrolls(true);

        bBuscarAl.setBackground(new java.awt.Color(204, 51, 255));
        bBuscarAl.setText("Buscar");
        bBuscarAl.setColorHover(new java.awt.Color(204, 153, 255));
        bBuscarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarAlActionPerformed(evt);
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

        javax.swing.GroupLayout pDatos12Layout = new javax.swing.GroupLayout(pDatos12);
        pDatos12.setLayout(pDatos12Layout);
        pDatos12Layout.setHorizontalGroup(
            pDatos12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bBuscarAl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bListoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pDatos12Layout.setVerticalGroup(
            pDatos12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pDatos12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBuscarAl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bListoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos12);
        pDatos12.setBounds(670, 10, 180, 95);

        cCantidadA.setEditable(false);
        cCantidadA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCantidadAActionPerformed(evt);
            }
        });
        cCantidadA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCantidadAKeyTyped(evt);
            }
        });
        pRegistrar.add(cCantidadA);
        cCantidadA.setBounds(120, 450, 20, 20);

        bNuevo.setBackground(new java.awt.Color(102, 102, 255));
        bNuevo.setText("NUEVO");
        bNuevo.setColorHover(new java.awt.Color(153, 153, 255));
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });
        pRegistrar.add(bNuevo);
        bNuevo.setBounds(170, 500, 120, 40);

        bEditar2.setBackground(new java.awt.Color(255, 204, 0));
        bEditar2.setText("EDITAR");
        bEditar2.setColorHover(new java.awt.Color(255, 204, 51));
        bEditar2.setEnabled(false);
        bEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditar2ActionPerformed(evt);
            }
        });
        pRegistrar.add(bEditar2);
        bEditar2.setBounds(430, 500, 100, 40);

        pDatos1.setBackground(new java.awt.Color(255, 255, 255));
        pDatos1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Cliente"));
        pDatos1.setAutoscrolls(true);

        jLabel15.setText("NOMBRES");

        cNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNombre1ActionPerformed(evt);
            }
        });
        cNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombre1KeyTyped(evt);
            }
        });

        jLabel16.setText("CEDULA");

        cCedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCedula1ActionPerformed(evt);
            }
        });
        cCedula1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCedula1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos1Layout = new javax.swing.GroupLayout(pDatos1);
        pDatos1.setLayout(pDatos1Layout);
        pDatos1Layout.setHorizontalGroup(
            pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pDatos1Layout.setVerticalGroup(
            pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pDatos1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cNombre1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos1);
        pDatos1.setBounds(10, 10, 440, 95);

        pDatos13.setBackground(new java.awt.Color(255, 255, 255));
        pDatos13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Forma de Pago\n"));
        pDatos13.setAutoscrolls(true);

        cbPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EFECTIVO", "CREDITO" }));
        cbPago.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPagoItemStateChanged(evt);
            }
        });
        cbPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbPagoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbPagoMousePressed(evt);
            }
        });
        cbPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDatos13Layout = new javax.swing.GroupLayout(pDatos13);
        pDatos13.setLayout(pDatos13Layout);
        pDatos13Layout.setHorizontalGroup(
            pDatos13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbPago, 0, 190, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDatos13Layout.setVerticalGroup(
            pDatos13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos13);
        pDatos13.setBounds(10, 110, 220, 60);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("TOTAL:");
        pRegistrar.add(jLabel41);
        jLabel41.setBounds(730, 440, 56, 23);

        jTabbedPane1.addTab("VENTA", pRegistrar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 880, 580);
    }// </editor-fold>//GEN-END:initComponents
public static String formatDate(Date fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        return formatoDelTexto.format(fecha);

    }
    private void cNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cNombreKeyTyped

    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed

        int reply = JOptionPane.showConfirmDialog(null, "¿Imprimió el comprobante?", "Confirmación ", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            this.ventaControlador.RegistrarDetalleC(cNumCompr, cNombre, cFecha, lTotal, cCedula, cbPago);
            this.ventaControlador.RegistrarComprobante(cNumCompr);
            ventaControlador.Vacio(tOrden, cNombre, cCantidadA, cPrecioP, cIdProducto, cNombreP, lTotal, cCedula);
            ventaControlador.listaProducto.clear();
            ventaControlador.DatosTablaProdu();
            ventaControlador.LlenarTablaProd(modelo, tProducto);
            try {
                cNumCompr.setText(String.valueOf(ventaControlador.id()));
            } catch (SQLException ex) {
                Logger.getLogger(PanelVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

        }


    }//GEN-LAST:event_bRegistrarActionPerformed

    private void cNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreActionPerformed

    private void bComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobanteActionPerformed
        this.ventaControlador.ReporteComprobante(cNombre, cFecha, cNumCompr, lTotal, cCedula, cbPago);
    }//GEN-LAST:event_bComprobanteActionPerformed

    private void cIdProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdProductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdProductoKeyTyped

    private void cNumComprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNumComprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNumComprActionPerformed

    private void cNumComprKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNumComprKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNumComprKeyTyped

    private void cFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cFechaActionPerformed

    private void cFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cFechaKeyTyped

    private void tOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tOrdenMouseClicked
    }//GEN-LAST:event_tOrdenMouseClicked

    private void cBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyReleased
        this.accion.filtro(this.cBuscar.getText(), tProducto);
    }//GEN-LAST:event_cBuscarKeyReleased

    private void cBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cBuscarKeyTyped

    private void cNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombrePActionPerformed

    private void cNombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombrePKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombrePKeyTyped

    private void cPrecioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPrecioPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPrecioPActionPerformed

    private void cPrecioPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPrecioPKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cPrecioPKeyTyped

    private void tProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProductoMouseClicked
        this.ventaControlador.PasarDatosPro(tProducto, cIdProducto, cNombreP, cPrecioP, cCantidadA);
    }//GEN-LAST:event_tProductoMouseClicked

    private void cCantidadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCantidadPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCantidadPActionPerformed

    private void cCantidadPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCantidadPKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cCantidadPKeyTyped

    private void bListoAl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoAl4ActionPerformed
        this.ventaControlador.Agregar(lTotal, cCantidadP, cNombreP, cPrecioP, cIdProducto, tOrden, cCantidadA);
        ventaControlador.LlenarTablaProd(modelo, tProducto);
    }//GEN-LAST:event_bListoAl4ActionPerformed

    private void bListoAl4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bListoAl4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bListoAl4KeyReleased

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        this.ventaControlador.EliminarFila(tOrden, lTotal);
        ventaControlador.LlenarTablaProd(modelo, tProducto);
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bEliminarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bEliminarKeyReleased

    private void bBuscarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarAlActionPerformed

        BuscarComprobante buscarComprobante = new BuscarComprobante(PaginaPrincipal, false);
        buscarComprobante.setVisible(true);


    }//GEN-LAST:event_bBuscarAlActionPerformed

    private void bListoAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoAlActionPerformed
        this.cNumCompr.setText(temporal.getIdComprobante());
        this.cFecha.setText(temporal.getFecha());
        this.cCedula.setText(temporal.getCedula());
        this.cbPago.setSelectedItem(temporal.getPago());
        this.cNombre.setText(temporal.getNombreCliente());
        this.lTotal.setText(temporal.getTotal());
        this.ventaControlador.listaProductoTa.clear();
        this.ventaControlador.DatosTablaBd(temporal.getIdComprobante());
        this.ventaControlador.mostrar(tOrden);
        ventaControlador.listaProducto.clear();
        ventaControlador.DatosTablaProdu();
        ventaControlador.LlenarTablaProd(modelo, tProducto);
        this.bRegistrar.setEnabled(false);
        this.bEditar2.setEnabled(true);


    }//GEN-LAST:event_bListoAlActionPerformed

    private void cCantidadAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCantidadAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCantidadAActionPerformed

    private void cCantidadAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCantidadAKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cCantidadAKeyTyped

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        ventaControlador.Vacio(tOrden, cNombre, cCantidadA, cPrecioP, cIdProducto, cNombreP, lTotal, cCedula);
        ventaControlador.listaProducto.clear();
        ventaControlador.DatosTablaProdu();
        ventaControlador.LlenarTablaProd(modelo, tProducto);

        try {
            cNumCompr.setText(String.valueOf(ventaControlador.id()));
            this.bRegistrar.setEnabled(true);
            this.bEditar2.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(PanelVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditar2ActionPerformed
        this.ventaControlador.ModificarDetalleCA(cNumCompr, cNombre, cFecha, lTotal, cCedula, cbPago);
        ventaControlador.Eliminar(cNumCompr);
        this.ventaControlador.RegistrarComprobante(cNumCompr);


    }//GEN-LAST:event_bEditar2ActionPerformed

    private void cCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCedulaKeyTyped
        accion.NumCaracteres(cCedula, evt, 10);
    }//GEN-LAST:event_cCedulaKeyTyped

    private void cCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCedulaActionPerformed

    private void cNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombre1ActionPerformed

    private void cNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombre1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombre1KeyTyped

    private void cCedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCedula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCedula1ActionPerformed

    private void cCedula1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCedula1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cCedula1KeyTyped

    private void cbPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPagoActionPerformed

    }//GEN-LAST:event_cbPagoActionPerformed

    private void bListoAl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoAl1ActionPerformed
        this.cCedula.setText(temporal.getCedula());
        this.cNombre.setText(temporal.getNombreCliente());
    }//GEN-LAST:event_bListoAl1ActionPerformed

    private void bBuscarAl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarAl1ActionPerformed
        BuscarCliente buscarCliente = new BuscarCliente(PaginaPrincipal, false);
        buscarCliente.setVisible(true);
    }//GEN-LAST:event_bBuscarAl1ActionPerformed

    private void cbPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPagoMouseClicked

    }//GEN-LAST:event_cbPagoMouseClicked

    private void cbPagoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPagoItemStateChanged
        this.ventaControlador.accionCombobox(temporal.getFecha(),bEditar2,cbPago, cFecha);
    }//GEN-LAST:event_cbPagoItemStateChanged

    private void cbPagoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPagoMousePressed

    }//GEN-LAST:event_cbPagoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonEffect bBuscarAl;
    private rojeru_san.rsbutton.RSButtonEffect bBuscarAl1;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante;
    private rojeru_san.rsbutton.RSButtonEffect bEditar2;
    private rojeru_san.rsbutton.RSButtonEffect bEliminar;
    private rojeru_san.rsbutton.RSButtonEffect bListoAl;
    private rojeru_san.rsbutton.RSButtonEffect bListoAl1;
    private rojeru_san.rsbutton.RSButtonEffect bListoAl4;
    private rojeru_san.rsbutton.RSButtonEffect bNuevo;
    private rojeru_san.rsbutton.RSButtonEffect bRegistrar;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField cBuscar;
    private javax.swing.JTextField cCantidadA;
    private javax.swing.JTextField cCantidadP;
    private javax.swing.JTextField cCedula;
    private javax.swing.JTextField cCedula1;
    private javax.swing.JTextField cFecha;
    private javax.swing.JTextField cIdProducto;
    private javax.swing.JTextField cNombre;
    private javax.swing.JTextField cNombre1;
    private javax.swing.JTextField cNombreP;
    private javax.swing.JTextField cNumCompr;
    private javax.swing.JTextField cPrecioP;
    private javax.swing.JComboBox<String> cbPago;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lTotal;
    private javax.swing.JPanel pBuscarDoctor2;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pDatos1;
    private javax.swing.JPanel pDatos10;
    private javax.swing.JPanel pDatos11;
    private javax.swing.JPanel pDatos12;
    private javax.swing.JPanel pDatos13;
    private javax.swing.JPanel pRegistrar;
    private javax.swing.JTable tOrden;
    private javax.swing.JTable tProducto;
    // End of variables declaration//GEN-END:variables
}
