package PaginaPrincipal.Paneles;

import AccionEspecial.Accion;
import PaginaPrincipal.Controlador.ReporteControlador;
import PaginaPrincipal.Controlador.VentaControlador;
import static PaginaPrincipal.Paneles.PanelVenta.formatDate;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

public class PanelReporte extends javax.swing.JPanel {

    Accion accion = new Accion();
    ReporteControlador reporteControlador = new ReporteControlador();
    VentaControlador ventaControlador = new VentaControlador();
    DefaultTableModel modelo;

    public PanelReporte() {
        initComponents();
        this.cFechaD.setText(formatDate(new java.util.Date()));
        this.cDesdeDD.setText(formatDate(new java.util.Date()));
        cHastaDD.setText(formatDate(new java.util.Date()));
        this.reporteControlador.DatosTablaStock();
        this.reporteControlador.LlenarTablaStock(modelo, tStock);
        this.reporteControlador.Total(tStock, lTotalP, 4);
        this.reporteControlador.DatosTablaVendi();
        this.reporteControlador.LlenarTablaVendi(modelo, tVendido);
        this.reporteControlador.DatosTablaDiaria(cFechaD);
        this.reporteControlador.LlenarTablaDiaria(modelo, tDiaria);
        this.reporteControlador.Total(tDiaria, lTotal, 4);
        this.reporteControlador.Total(tDiaria, lGananciaD, 5);
        this.reporteControlador.ano(cAnoM);
        this.reporteControlador.ano(cAnoA);
        ventaControlador.DatosTablaCliente();
        ventaControlador.LlenarTablaCliente(modelo, tCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pEditar = new javax.swing.JPanel();
        pBuscarDoctor = new javax.swing.JPanel();
        bComprobante = new rojeru_san.rsbutton.RSButtonEffect();
        jScrollPane4 = new javax.swing.JScrollPane();
        tStock = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        lTotalP = new javax.swing.JLabel();
        pBuscarDoctor2 = new javax.swing.JPanel();
        bComprobante1 = new rojeru_san.rsbutton.RSButtonEffect();
        jScrollPane3 = new javax.swing.JScrollPane();
        tVendido = new javax.swing.JTable();
        pEditar3 = new javax.swing.JPanel();
        bComprobante4 = new rojeru_san.rsbutton.RSButtonEffect();
        pBuscarDoctor5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tFechas = new javax.swing.JTable();
        lTotalF = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        lGananciaF = new javax.swing.JLabel();
        pDatos3 = new javax.swing.JPanel();
        bListoD2 = new rojeru_san.rsbutton.RSButtonEffect();
        jLabel3 = new javax.swing.JLabel();
        cDesdeF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cHastaF = new javax.swing.JTextField();
        pEditar1 = new javax.swing.JPanel();
        bComprobante2 = new rojeru_san.rsbutton.RSButtonEffect();
        pBuscarDoctor3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tDiaria = new javax.swing.JTable();
        lTotal = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lGananciaD = new javax.swing.JLabel();
        pDatos1 = new javax.swing.JPanel();
        cFechaD = new javax.swing.JTextField();
        bEditarD = new rojeru_san.rsbutton.RSButtonEffect();
        bListoD = new rojeru_san.rsbutton.RSButtonEffect();
        pEditar7 = new javax.swing.JPanel();
        bComprobante8 = new rojeru_san.rsbutton.RSButtonEffect();
        pBuscarDoctor9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tDiariaD = new javax.swing.JTable();
        lTotalDD = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        lGananciaDD = new javax.swing.JLabel();
        pDatos8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cDesdeDD = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cHastaDD = new javax.swing.JTextField();
        bListoD7 = new rojeru_san.rsbutton.RSButtonEffect();
        pEditar2 = new javax.swing.JPanel();
        bComprobante3 = new rojeru_san.rsbutton.RSButtonEffect();
        pBuscarDoctor4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tMensual = new javax.swing.JTable();
        lTotalM = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lGananciaM = new javax.swing.JLabel();
        pDatos2 = new javax.swing.JPanel();
        bListoD1 = new rojeru_san.rsbutton.RSButtonEffect();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbMesM = new javax.swing.JComboBox<>();
        cAnoM = new javax.swing.JTextField();
        pEditar4 = new javax.swing.JPanel();
        bComprobante5 = new rojeru_san.rsbutton.RSButtonEffect();
        pBuscarDoctor6 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tAnual = new javax.swing.JTable();
        lTotalA = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lGananciaA = new javax.swing.JLabel();
        pDatos4 = new javax.swing.JPanel();
        bListoD3 = new rojeru_san.rsbutton.RSButtonEffect();
        jLabel6 = new javax.swing.JLabel();
        cAnoA = new javax.swing.JTextField();
        pEditar5 = new javax.swing.JPanel();
        bComprobante6 = new rojeru_san.rsbutton.RSButtonEffect();
        pBuscarDoctor7 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tCredito = new javax.swing.JTable();
        lTotalC = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        cBuscar = new javax.swing.JTextField();
        pDatos5 = new javax.swing.JPanel();
        bListoD4 = new rojeru_san.rsbutton.RSButtonEffect();
        jLabel4 = new javax.swing.JLabel();
        cDesdeC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cHastaC = new javax.swing.JTextField();
        pEditar6 = new javax.swing.JPanel();
        bComprobante7 = new rojeru_san.rsbutton.RSButtonEffect();
        pBuscarDoctor8 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tCliente = new javax.swing.JTable();
        cBuscarC = new javax.swing.JTextField();
        pDatos6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cDesdeCD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cHastaCD = new javax.swing.JTextField();
        pDatos7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cNombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cCedula = new javax.swing.JTextField();
        pBuscarDoctor10 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tHistorial = new javax.swing.JTable();
        cBuscarH = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        pEditar.setBackground(new java.awt.Color(255, 255, 255));
        pEditar.setLayout(null);

        pBuscarDoctor.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Productos en Stock"));

        bComprobante.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante.setText("REPORTE");
        bComprobante.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobanteActionPerformed(evt);
            }
        });

        tStock  = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tStock.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tStockMouseClicked(evt);
            }
        });
        tStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tStockKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(tStock);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("Total:");

        lTotalP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pBuscarDoctorLayout = new javax.swing.GroupLayout(pBuscarDoctor);
        pBuscarDoctor.setLayout(pBuscarDoctorLayout);
        pBuscarDoctorLayout.setHorizontalGroup(
            pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctorLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(bComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctorLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pBuscarDoctorLayout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lTotalP, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        pBuscarDoctorLayout.setVerticalGroup(
            pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTotalP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(bComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pEditar.add(pBuscarDoctor);
        pBuscarDoctor.setBounds(10, 20, 420, 430);

        pBuscarDoctor2.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Producto mas vendido"));

        bComprobante1.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante1.setText("REPORTE");
        bComprobante1.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobante1ActionPerformed(evt);
            }
        });

        tVendido = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tVendido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tVendido.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tVendido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tVendidoMouseClicked(evt);
            }
        });
        tVendido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tVendidoKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(tVendido);

        javax.swing.GroupLayout pBuscarDoctor2Layout = new javax.swing.GroupLayout(pBuscarDoctor2);
        pBuscarDoctor2.setLayout(pBuscarDoctor2Layout);
        pBuscarDoctor2Layout.setHorizontalGroup(
            pBuscarDoctor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(pBuscarDoctor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor2Layout.createSequentialGroup()
                        .addComponent(bComprobante1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        pBuscarDoctor2Layout.setVerticalGroup(
            pBuscarDoctor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(bComprobante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pEditar.add(pBuscarDoctor2);
        pBuscarDoctor2.setBounds(440, 20, 430, 430);

        jTabbedPane1.addTab("PRODUCTO", pEditar);

        pEditar3.setBackground(new java.awt.Color(255, 255, 255));
        pEditar3.setLayout(null);

        bComprobante4.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante4.setText("REPORTE");
        bComprobante4.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobante4ActionPerformed(evt);
            }
        });
        pEditar3.add(bComprobante4);
        bComprobante4.setBounds(440, 480, 140, 40);

        pBuscarDoctor5.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ventas por Fechas"));

        tFechas  = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tFechas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tFechas.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tFechas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tFechasMouseClicked(evt);
            }
        });
        tFechas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tFechasKeyTyped(evt);
            }
        });
        jScrollPane7.setViewportView(tFechas);

        lTotalF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Total:");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setText("Ganancia:");

        lGananciaF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pBuscarDoctor5Layout = new javax.swing.GroupLayout(pBuscarDoctor5);
        pBuscarDoctor5.setLayout(pBuscarDoctor5Layout);
        pBuscarDoctor5Layout.setHorizontalGroup(
            pBuscarDoctor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor5Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(pBuscarDoctor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pBuscarDoctor5Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lGananciaF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pBuscarDoctor5Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lTotalF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        pBuscarDoctor5Layout.setVerticalGroup(
            pBuscarDoctor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarDoctor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTotalF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarDoctor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lGananciaF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pEditar3.add(pBuscarDoctor5);
        pBuscarDoctor5.setBounds(20, 20, 510, 450);

        pDatos3.setBackground(new java.awt.Color(255, 255, 255));
        pDatos3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fecha"));
        pDatos3.setAutoscrolls(true);

        bListoD2.setBackground(new java.awt.Color(204, 51, 255));
        bListoD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoD2.setColorHover(new java.awt.Color(204, 153, 255));
        bListoD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoD2ActionPerformed(evt);
            }
        });
        bListoD2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bListoD2KeyReleased(evt);
            }
        });

        jLabel3.setText("Desde");

        cDesdeF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDesdeFActionPerformed(evt);
            }
        });
        cDesdeF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cDesdeFKeyTyped(evt);
            }
        });

        jLabel5.setText("Hasta");

        cHastaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cHastaFActionPerformed(evt);
            }
        });
        cHastaF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cHastaFKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos3Layout = new javax.swing.GroupLayout(pDatos3);
        pDatos3.setLayout(pDatos3Layout);
        pDatos3Layout.setHorizontalGroup(
            pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cHastaF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDesdeF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatos3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bListoD2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        pDatos3Layout.setVerticalGroup(
            pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cDesdeF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cHastaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bListoD2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pEditar3.add(pDatos3);
        pDatos3.setBounds(590, 20, 170, 130);

        jTabbedPane1.addTab("FECHAS", pEditar3);

        pEditar1.setBackground(new java.awt.Color(255, 255, 255));
        pEditar1.setLayout(null);

        bComprobante2.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante2.setText("REPORTE");
        bComprobante2.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobante2ActionPerformed(evt);
            }
        });
        pEditar1.add(bComprobante2);
        bComprobante2.setBounds(440, 480, 140, 40);

        pBuscarDoctor3.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ventas Diaria"));

        tDiaria  = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tDiaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tDiaria.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tDiaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDiariaMouseClicked(evt);
            }
        });
        tDiaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tDiariaKeyTyped(evt);
            }
        });
        jScrollPane5.setViewportView(tDiaria);

        lTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("Total:");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("Ganancia:");

        lGananciaD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pBuscarDoctor3Layout = new javax.swing.GroupLayout(pBuscarDoctor3);
        pBuscarDoctor3.setLayout(pBuscarDoctor3Layout);
        pBuscarDoctor3Layout.setHorizontalGroup(
            pBuscarDoctor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(pBuscarDoctor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pBuscarDoctor3Layout.createSequentialGroup()
                        .addGroup(pBuscarDoctor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pBuscarDoctor3Layout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(pBuscarDoctor3Layout.createSequentialGroup()
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(pBuscarDoctor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lGananciaD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        pBuscarDoctor3Layout.setVerticalGroup(
            pBuscarDoctor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarDoctor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarDoctor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lGananciaD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pEditar1.add(pBuscarDoctor3);
        pBuscarDoctor3.setBounds(20, 20, 510, 440);

        pDatos1.setBackground(new java.awt.Color(255, 255, 255));
        pDatos1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fecha"));
        pDatos1.setAutoscrolls(true);

        cFechaD.setEditable(false);
        cFechaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFechaDActionPerformed(evt);
            }
        });
        cFechaD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cFechaDKeyTyped(evt);
            }
        });

        bEditarD.setBackground(new java.awt.Color(255, 204, 0));
        bEditarD.setText("Editar ");
        bEditarD.setColorHover(new java.awt.Color(255, 204, 51));
        bEditarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarDActionPerformed(evt);
            }
        });

        bListoD.setBackground(new java.awt.Color(204, 51, 255));
        bListoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoD.setColorHover(new java.awt.Color(204, 153, 255));
        bListoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoDActionPerformed(evt);
            }
        });
        bListoD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bListoDKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pDatos1Layout = new javax.swing.GroupLayout(pDatos1);
        pDatos1.setLayout(pDatos1Layout);
        pDatos1Layout.setHorizontalGroup(
            pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cFechaD)
                    .addGroup(pDatos1Layout.createSequentialGroup()
                        .addComponent(bEditarD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bListoD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pDatos1Layout.setVerticalGroup(
            pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cFechaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEditarD, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(bListoD, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pEditar1.add(pDatos1);
        pDatos1.setBounds(610, 20, 200, 110);

        jTabbedPane1.addTab("DIARIO", pEditar1);

        pEditar7.setBackground(new java.awt.Color(255, 255, 255));
        pEditar7.setLayout(null);

        bComprobante8.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante8.setText("REPORTE");
        bComprobante8.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobante8ActionPerformed(evt);
            }
        });
        pEditar7.add(bComprobante8);
        bComprobante8.setBounds(440, 480, 140, 40);

        pBuscarDoctor9.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ventas Detalles x Fechas"));

        tDiariaD  = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tDiariaD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tDiariaD.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tDiariaD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDiariaDMouseClicked(evt);
            }
        });
        tDiariaD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tDiariaDKeyTyped(evt);
            }
        });
        jScrollPane11.setViewportView(tDiariaD);

        lTotalDD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Total:");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("Ganancia:");

        lGananciaDD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pBuscarDoctor9Layout = new javax.swing.GroupLayout(pBuscarDoctor9);
        pBuscarDoctor9.setLayout(pBuscarDoctor9Layout);
        pBuscarDoctor9Layout.setHorizontalGroup(
            pBuscarDoctor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor9Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(pBuscarDoctor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pBuscarDoctor9Layout.createSequentialGroup()
                        .addGroup(pBuscarDoctor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pBuscarDoctor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lGananciaDD, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lTotalDD, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        pBuscarDoctor9Layout.setVerticalGroup(
            pBuscarDoctor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarDoctor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTotalDD, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarDoctor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lGananciaDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pEditar7.add(pBuscarDoctor9);
        pBuscarDoctor9.setBounds(20, 20, 510, 440);

        pDatos8.setBackground(new java.awt.Color(255, 255, 255));
        pDatos8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fecha"));
        pDatos8.setAutoscrolls(true);

        jLabel10.setText("Desde");

        cDesdeDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDesdeDDActionPerformed(evt);
            }
        });
        cDesdeDD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cDesdeDDKeyTyped(evt);
            }
        });

        jLabel11.setText("Hasta");

        cHastaDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cHastaDDActionPerformed(evt);
            }
        });
        cHastaDD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cHastaDDKeyTyped(evt);
            }
        });

        bListoD7.setBackground(new java.awt.Color(204, 51, 255));
        bListoD7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoD7.setColorHover(new java.awt.Color(204, 153, 255));
        bListoD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoD7ActionPerformed(evt);
            }
        });
        bListoD7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bListoD7KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pDatos8Layout = new javax.swing.GroupLayout(pDatos8);
        pDatos8.setLayout(pDatos8Layout);
        pDatos8Layout.setHorizontalGroup(
            pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cHastaDD, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDesdeDD, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pDatos8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bListoD7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pDatos8Layout.setVerticalGroup(
            pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cDesdeDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cHastaDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bListoD7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pEditar7.add(pDatos8);
        pDatos8.setBounds(590, 20, 170, 120);

        jTabbedPane1.addTab("DIARIO DETALLE", pEditar7);

        pEditar2.setBackground(new java.awt.Color(255, 255, 255));
        pEditar2.setLayout(null);

        bComprobante3.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante3.setText("REPORTE");
        bComprobante3.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobante3ActionPerformed(evt);
            }
        });
        pEditar2.add(bComprobante3);
        bComprobante3.setBounds(440, 480, 140, 40);

        pBuscarDoctor4.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ventas Mensuales"));

        tMensual  = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tMensual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tMensual.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tMensual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMensualMouseClicked(evt);
            }
        });
        tMensual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tMensualKeyTyped(evt);
            }
        });
        jScrollPane6.setViewportView(tMensual);

        lTotalM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("Total:");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("Ganancia:");

        lGananciaM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pBuscarDoctor4Layout = new javax.swing.GroupLayout(pBuscarDoctor4);
        pBuscarDoctor4.setLayout(pBuscarDoctor4Layout);
        pBuscarDoctor4Layout.setHorizontalGroup(
            pBuscarDoctor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(pBuscarDoctor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pBuscarDoctor4Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lGananciaM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pBuscarDoctor4Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lTotalM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        pBuscarDoctor4Layout.setVerticalGroup(
            pBuscarDoctor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarDoctor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTotalM, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBuscarDoctor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lGananciaM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pEditar2.add(pBuscarDoctor4);
        pBuscarDoctor4.setBounds(20, 20, 510, 440);

        pDatos2.setBackground(new java.awt.Color(255, 255, 255));
        pDatos2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fecha"));
        pDatos2.setAutoscrolls(true);

        bListoD1.setBackground(new java.awt.Color(204, 51, 255));
        bListoD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoD1.setColorHover(new java.awt.Color(204, 153, 255));
        bListoD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoD1ActionPerformed(evt);
            }
        });
        bListoD1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bListoD1KeyReleased(evt);
            }
        });

        jLabel1.setText("Mes");

        jLabel2.setText("Año");

        cbMesM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));

        cAnoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoMActionPerformed(evt);
            }
        });
        cAnoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoMKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos2Layout = new javax.swing.GroupLayout(pDatos2);
        pDatos2.setLayout(pDatos2Layout);
        pDatos2Layout.setHorizontalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cAnoM, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbMesM, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatos2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bListoD1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        pDatos2Layout.setVerticalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbMesM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cAnoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bListoD1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pEditar2.add(pDatos2);
        pDatos2.setBounds(590, 20, 240, 130);

        jTabbedPane1.addTab("MENSUAL", pEditar2);

        pEditar4.setBackground(new java.awt.Color(255, 255, 255));
        pEditar4.setLayout(null);

        bComprobante5.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante5.setText("REPORTE");
        bComprobante5.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobante5ActionPerformed(evt);
            }
        });
        pEditar4.add(bComprobante5);
        bComprobante5.setBounds(440, 480, 140, 40);

        pBuscarDoctor6.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ventas Anual"));

        tAnual  = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tAnual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tAnual.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tAnual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tAnualMouseClicked(evt);
            }
        });
        tAnual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tAnualKeyTyped(evt);
            }
        });
        jScrollPane8.setViewportView(tAnual);

        lTotalA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("Total:");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText("Ganancia:");

        lGananciaA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pBuscarDoctor6Layout = new javax.swing.GroupLayout(pBuscarDoctor6);
        pBuscarDoctor6.setLayout(pBuscarDoctor6Layout);
        pBuscarDoctor6Layout.setHorizontalGroup(
            pBuscarDoctor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor6Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(pBuscarDoctor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pBuscarDoctor6Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lTotalA, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lGananciaA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        pBuscarDoctor6Layout.setVerticalGroup(
            pBuscarDoctor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarDoctor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTotalA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lGananciaA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pEditar4.add(pBuscarDoctor6);
        pBuscarDoctor6.setBounds(20, 20, 510, 430);

        pDatos4.setBackground(new java.awt.Color(255, 255, 255));
        pDatos4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fecha"));
        pDatos4.setAutoscrolls(true);

        bListoD3.setBackground(new java.awt.Color(204, 51, 255));
        bListoD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoD3.setColorHover(new java.awt.Color(204, 153, 255));
        bListoD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoD3ActionPerformed(evt);
            }
        });
        bListoD3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bListoD3KeyReleased(evt);
            }
        });

        jLabel6.setText("Año");

        cAnoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoAActionPerformed(evt);
            }
        });
        cAnoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoAKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos4Layout = new javax.swing.GroupLayout(pDatos4);
        pDatos4.setLayout(pDatos4Layout);
        pDatos4Layout.setHorizontalGroup(
            pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos4Layout.createSequentialGroup()
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cAnoA, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(bListoD3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pDatos4Layout.setVerticalGroup(
            pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cAnoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bListoD3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pEditar4.add(pDatos4);
        pDatos4.setBounds(590, 20, 160, 120);

        jTabbedPane1.addTab("ANUAL", pEditar4);

        pEditar5.setBackground(new java.awt.Color(255, 255, 255));
        pEditar5.setLayout(null);

        bComprobante6.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante6.setText("REPORTE");
        bComprobante6.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobante6ActionPerformed(evt);
            }
        });
        pEditar5.add(bComprobante6);
        bComprobante6.setBounds(440, 480, 140, 40);

        pBuscarDoctor7.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ventas de Credito\n"));

        tCredito  = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tCredito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tCredito.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tCredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCreditoMouseClicked(evt);
            }
        });
        tCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tCreditoKeyTyped(evt);
            }
        });
        jScrollPane9.setViewportView(tCredito);

        lTotalC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setText("Total:");

        cBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cBuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pBuscarDoctor7Layout = new javax.swing.GroupLayout(pBuscarDoctor7);
        pBuscarDoctor7.setLayout(pBuscarDoctor7Layout);
        pBuscarDoctor7Layout.setHorizontalGroup(
            pBuscarDoctor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor7Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(pBuscarDoctor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pBuscarDoctor7Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lTotalC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(pBuscarDoctor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pBuscarDoctor7Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(cBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );
        pBuscarDoctor7Layout.setVerticalGroup(
            pBuscarDoctor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor7Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarDoctor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTotalC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(pBuscarDoctor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pBuscarDoctor7Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(cBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(385, Short.MAX_VALUE)))
        );

        pEditar5.add(pBuscarDoctor7);
        pBuscarDoctor7.setBounds(20, 20, 510, 450);

        pDatos5.setBackground(new java.awt.Color(255, 255, 255));
        pDatos5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fecha"));
        pDatos5.setAutoscrolls(true);

        bListoD4.setBackground(new java.awt.Color(204, 51, 255));
        bListoD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoD4.setColorHover(new java.awt.Color(204, 153, 255));
        bListoD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoD4ActionPerformed(evt);
            }
        });
        bListoD4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bListoD4KeyReleased(evt);
            }
        });

        jLabel4.setText("Desde");

        cDesdeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDesdeCActionPerformed(evt);
            }
        });
        cDesdeC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cDesdeCKeyTyped(evt);
            }
        });

        jLabel7.setText("Hasta");

        cHastaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cHastaCActionPerformed(evt);
            }
        });
        cHastaC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cHastaCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos5Layout = new javax.swing.GroupLayout(pDatos5);
        pDatos5.setLayout(pDatos5Layout);
        pDatos5Layout.setHorizontalGroup(
            pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cHastaC, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDesdeC, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatos5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bListoD4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        pDatos5Layout.setVerticalGroup(
            pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cDesdeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cHastaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bListoD4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pEditar5.add(pDatos5);
        pDatos5.setBounds(590, 20, 170, 130);

        jTabbedPane1.addTab("CREDITO", pEditar5);

        pEditar6.setBackground(new java.awt.Color(255, 255, 255));
        pEditar6.setLayout(null);

        bComprobante7.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante7.setText("REPORTE");
        bComprobante7.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobante7ActionPerformed(evt);
            }
        });
        pEditar6.add(bComprobante7);
        bComprobante7.setBounds(440, 480, 140, 40);

        pBuscarDoctor8.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ventas Clientes Detalle"));

        tCliente  = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tCliente.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tClienteMouseClicked(evt);
            }
        });
        tCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tClienteKeyTyped(evt);
            }
        });
        jScrollPane10.setViewportView(tCliente);

        cBuscarC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cBuscarCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cBuscarCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pBuscarDoctor8Layout = new javax.swing.GroupLayout(pBuscarDoctor8);
        pBuscarDoctor8.setLayout(pBuscarDoctor8Layout);
        pBuscarDoctor8Layout.setHorizontalGroup(
            pBuscarDoctor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor8Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pBuscarDoctor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        pBuscarDoctor8Layout.setVerticalGroup(
            pBuscarDoctor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor8Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(cBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pEditar6.add(pBuscarDoctor8);
        pBuscarDoctor8.setBounds(20, 20, 490, 410);

        pDatos6.setBackground(new java.awt.Color(255, 255, 255));
        pDatos6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fecha"));
        pDatos6.setAutoscrolls(true);

        jLabel8.setText("Desde");

        cDesdeCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDesdeCDActionPerformed(evt);
            }
        });
        cDesdeCD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cDesdeCDKeyTyped(evt);
            }
        });

        jLabel9.setText("Hasta");

        cHastaCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cHastaCDActionPerformed(evt);
            }
        });
        cHastaCD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cHastaCDKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos6Layout = new javax.swing.GroupLayout(pDatos6);
        pDatos6.setLayout(pDatos6Layout);
        pDatos6Layout.setHorizontalGroup(
            pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cDesdeCD, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(cHastaCD, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pDatos6Layout.setVerticalGroup(
            pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cDesdeCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cHastaCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pEditar6.add(pDatos6);
        pDatos6.setBounds(540, 100, 320, 70);

        pDatos7.setBackground(new java.awt.Color(255, 255, 255));
        pDatos7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Cliente"));
        pDatos7.setAutoscrolls(true);

        jLabel12.setText("Nombres");

        cNombre.setEditable(false);
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

        jLabel13.setText("Cedula");

        cCedula.setEditable(false);
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

        javax.swing.GroupLayout pDatos7Layout = new javax.swing.GroupLayout(pDatos7);
        pDatos7.setLayout(pDatos7Layout);
        pDatos7Layout.setHorizontalGroup(
            pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                    .addGroup(pDatos7Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(cCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pDatos7Layout.setVerticalGroup(
            pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos7Layout.createSequentialGroup()
                .addGroup(pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pEditar6.add(pDatos7);
        pDatos7.setBounds(540, 0, 320, 90);

        pBuscarDoctor10.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Historial de Compras"));

        tHistorial = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tHistorial.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tHistorialMouseClicked(evt);
            }
        });
        tHistorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tHistorialKeyTyped(evt);
            }
        });
        jScrollPane12.setViewportView(tHistorial);

        cBuscarH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cBuscarHKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cBuscarHKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cBuscarHKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pBuscarDoctor10Layout = new javax.swing.GroupLayout(pBuscarDoctor10);
        pBuscarDoctor10.setLayout(pBuscarDoctor10Layout);
        pBuscarDoctor10Layout.setHorizontalGroup(
            pBuscarDoctor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBuscarDoctor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cBuscarH, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pBuscarDoctor10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(330, 330, 330))
        );
        pBuscarDoctor10Layout.setVerticalGroup(
            pBuscarDoctor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cBuscarH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pEditar6.add(pBuscarDoctor10);
        pBuscarDoctor10.setBounds(540, 185, 330, 250);

        jTabbedPane1.addTab("CLIENTE DETALLE", pEditar6);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 880, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void bComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobanteActionPerformed
        this.reporteControlador.ReporteStock(lTotalP);
    }//GEN-LAST:event_bComprobanteActionPerformed

    private void bComprobante2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobante2ActionPerformed
        this.reporteControlador.ReporteDiario(cFechaD, this.lTotal, this.lGananciaD);
    }//GEN-LAST:event_bComprobante2ActionPerformed

    private void tVendidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tVendidoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tVendidoMouseClicked

    private void tVendidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tVendidoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tVendidoKeyTyped

    private void bComprobante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobante1ActionPerformed
        this.reporteControlador.ReporteProVendi();
    }//GEN-LAST:event_bComprobante1ActionPerformed

    private void tStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tStockMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tStockMouseClicked

    private void tStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tStockKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tStockKeyTyped

    private void tDiariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDiariaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tDiariaMouseClicked

    private void tDiariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tDiariaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tDiariaKeyTyped

    private void cFechaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cFechaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cFechaDActionPerformed

    private void cFechaDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cFechaDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cFechaDKeyTyped

    private void bEditarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarDActionPerformed
        this.cFechaD.setEditable(true);
    }//GEN-LAST:event_bEditarDActionPerformed

    private void bListoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoDActionPerformed
        this.reporteControlador.listaDiario.clear();
        this.reporteControlador.DatosTablaDiaria(cFechaD);
        this.reporteControlador.LlenarTablaDiaria(modelo, tDiaria);
        this.reporteControlador.Total(tDiaria, lTotal, 4);
        this.reporteControlador.Total(tDiaria, lGananciaD, 5);
    }//GEN-LAST:event_bListoDActionPerformed

    private void bListoDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bListoDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bListoDKeyReleased

    private void bComprobante3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobante3ActionPerformed
        this.reporteControlador.ReporteMensual(cbMesM, lTotalM, lGananciaM);
    }//GEN-LAST:event_bComprobante3ActionPerformed

    private void tMensualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMensualMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tMensualMouseClicked

    private void tMensualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tMensualKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tMensualKeyTyped

    private void cAnoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoMActionPerformed

    private void cAnoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoMKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoMKeyTyped

    private void bListoD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoD1ActionPerformed
        this.reporteControlador.listaMensual.clear();
        this.reporteControlador.DatosTablaMensual(cAnoM, cbMesM);
        this.reporteControlador.LlenarTablaMensual(modelo, tMensual);
        this.reporteControlador.Total(tMensual, lTotalM, 4);
        this.reporteControlador.Total(tMensual, lGananciaM, 5);
    }//GEN-LAST:event_bListoD1ActionPerformed

    private void bListoD1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bListoD1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bListoD1KeyReleased

    private void bComprobante4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobante4ActionPerformed
        this.reporteControlador.ReporteFechas(cDesdeF, cHastaF, lTotalF, lGananciaF);
    }//GEN-LAST:event_bComprobante4ActionPerformed

    private void tFechasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tFechasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tFechasMouseClicked

    private void tFechasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFechasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tFechasKeyTyped

    private void bListoD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoD2ActionPerformed
        this.reporteControlador.listaFechas.clear();
        this.reporteControlador.DatosTablaFechas(cDesdeF, cHastaF);
        this.reporteControlador.LlenarTablaFechas(modelo, tFechas);
        this.reporteControlador.Total(tFechas, lTotalF, 4);
        this.reporteControlador.Total(tFechas, lGananciaF, 5);
    }//GEN-LAST:event_bListoD2ActionPerformed

    private void bListoD2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bListoD2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bListoD2KeyReleased

    private void cDesdeFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDesdeFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDesdeFActionPerformed

    private void cDesdeFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDesdeFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cDesdeFKeyTyped

    private void cHastaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cHastaFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cHastaFActionPerformed

    private void cHastaFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cHastaFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cHastaFKeyTyped

    private void bComprobante5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobante5ActionPerformed
        this.reporteControlador.ReporteAnual(cAnoA, lTotalA, lGananciaA);
    }//GEN-LAST:event_bComprobante5ActionPerformed

    private void tAnualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tAnualMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tAnualMouseClicked

    private void tAnualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tAnualKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tAnualKeyTyped

    private void bListoD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoD3ActionPerformed
        this.reporteControlador.listaAnual.clear();
        this.reporteControlador.DatosTablaAnual(cAnoA);
        this.reporteControlador.LlenarTablaAnual(modelo, tAnual);
        this.reporteControlador.Total(tAnual, lTotalA, 1);
        this.reporteControlador.Total(tAnual, lGananciaA, 2);
    }//GEN-LAST:event_bListoD3ActionPerformed

    private void bListoD3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bListoD3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bListoD3KeyReleased

    private void cAnoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoAActionPerformed

    private void cAnoAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoAKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoAKeyTyped

    private void bComprobante6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobante6ActionPerformed
        this.reporteControlador.ReporteCreditos(cDesdeC, cHastaC, lTotalC);
    }//GEN-LAST:event_bComprobante6ActionPerformed

    private void tCreditoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCreditoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tCreditoMouseClicked

    private void tCreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCreditoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tCreditoKeyTyped

    private void bListoD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoD4ActionPerformed
        this.reporteControlador.listaCredito.clear();
        this.reporteControlador.DatosTablaCredito(cDesdeC, cHastaC);
        this.reporteControlador.LlenarTablaCredito(modelo, tCredito);
        this.reporteControlador.Total(tCredito, lTotalC, 4);
    }//GEN-LAST:event_bListoD4ActionPerformed

    private void bListoD4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bListoD4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bListoD4KeyReleased

    private void cDesdeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDesdeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDesdeCActionPerformed

    private void cDesdeCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDesdeCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cDesdeCKeyTyped

    private void cHastaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cHastaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cHastaCActionPerformed

    private void cHastaCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cHastaCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cHastaCKeyTyped

    private void cBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyReleased
        this.accion.filtro(this.cBuscar.getText(), tCredito);
    }//GEN-LAST:event_cBuscarKeyReleased

    private void cBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cBuscarKeyTyped

    private void bComprobante7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobante7ActionPerformed
        this.reporteControlador.ReporteClienteDetalle(cCedula, cNombre, cDesdeCD, cHastaCD);
    }//GEN-LAST:event_bComprobante7ActionPerformed

    private void tClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tClienteMouseClicked
        this.reporteControlador.listaHistorial.clear();  
        this.reporteControlador.PasarDatos(tCliente, cNombre, cCedula);
        this.reporteControlador.DatosTablaHistorial(cNombre, cCedula);
        this.reporteControlador.LlenarTablaHistorial(modelo, tHistorial);

    }//GEN-LAST:event_tClienteMouseClicked

    private void tClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tClienteKeyTyped

    private void cBuscarCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarCKeyReleased
        this.accion.filtro(this.cBuscarC.getText(), tCliente);
    }//GEN-LAST:event_cBuscarCKeyReleased

    private void cBuscarCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarCKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cBuscarCKeyTyped

    private void cDesdeCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDesdeCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDesdeCDActionPerformed

    private void cDesdeCDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDesdeCDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cDesdeCDKeyTyped

    private void cHastaCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cHastaCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cHastaCDActionPerformed

    private void cHastaCDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cHastaCDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cHastaCDKeyTyped

    private void bComprobante8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobante8ActionPerformed
        this.reporteControlador.ReporteDiarioDetalle(cDesdeDD, cHastaDD, lTotalDD, lGananciaDD);
    }//GEN-LAST:event_bComprobante8ActionPerformed

    private void tDiariaDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDiariaDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tDiariaDMouseClicked

    private void tDiariaDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tDiariaDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tDiariaDKeyTyped

    private void bListoD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoD7ActionPerformed
        this.reporteControlador.listaDetalleVentas.clear();
        this.reporteControlador.DatosTablaDiariaDetalle(cDesdeDD, cHastaDD);
        this.reporteControlador.LlenarTablaDiariaDetalle(modelo, tDiariaD);
        this.reporteControlador.Total(tDiariaD, lTotalDD, 5);
        this.reporteControlador.Total(tDiariaD, lGananciaDD, 6);
    }//GEN-LAST:event_bListoD7ActionPerformed

    private void bListoD7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bListoD7KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bListoD7KeyReleased

    private void cDesdeDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDesdeDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDesdeDDActionPerformed

    private void cDesdeDDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDesdeDDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cDesdeDDKeyTyped

    private void cHastaDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cHastaDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cHastaDDActionPerformed

    private void cHastaDDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cHastaDDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cHastaDDKeyTyped

    private void cNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreActionPerformed

    private void cNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreKeyTyped

    private void cCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCedulaActionPerformed

    private void cCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCedulaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cCedulaKeyTyped

    private void tHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tHistorialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tHistorialMouseClicked

    private void tHistorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tHistorialKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tHistorialKeyTyped

    private void cBuscarHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarHKeyReleased
        this.accion.filtro(this.cBuscarH.getText(), tHistorial);
       
        
    }//GEN-LAST:event_cBuscarHKeyReleased

    private void cBuscarHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarHKeyTyped
      accion.Mayuscula(evt);
    }//GEN-LAST:event_cBuscarHKeyTyped

    private void cBuscarHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarHKeyPressed

    }//GEN-LAST:event_cBuscarHKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonEffect bComprobante;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante1;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante2;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante3;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante4;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante5;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante6;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante7;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante8;
    private rojeru_san.rsbutton.RSButtonEffect bEditarD;
    private rojeru_san.rsbutton.RSButtonEffect bListoD;
    private rojeru_san.rsbutton.RSButtonEffect bListoD1;
    private rojeru_san.rsbutton.RSButtonEffect bListoD2;
    private rojeru_san.rsbutton.RSButtonEffect bListoD3;
    private rojeru_san.rsbutton.RSButtonEffect bListoD4;
    private rojeru_san.rsbutton.RSButtonEffect bListoD7;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField cAnoA;
    private javax.swing.JTextField cAnoM;
    private javax.swing.JTextField cBuscar;
    private javax.swing.JTextField cBuscarC;
    private javax.swing.JTextField cBuscarH;
    private javax.swing.JTextField cCedula;
    private javax.swing.JTextField cDesdeC;
    private javax.swing.JTextField cDesdeCD;
    private javax.swing.JTextField cDesdeDD;
    private javax.swing.JTextField cDesdeF;
    private javax.swing.JTextField cFechaD;
    private javax.swing.JTextField cHastaC;
    private javax.swing.JTextField cHastaCD;
    private javax.swing.JTextField cHastaDD;
    private javax.swing.JTextField cHastaF;
    private javax.swing.JTextField cNombre;
    private javax.swing.JComboBox<String> cbMesM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lGananciaA;
    private javax.swing.JLabel lGananciaD;
    private javax.swing.JLabel lGananciaDD;
    private javax.swing.JLabel lGananciaF;
    private javax.swing.JLabel lGananciaM;
    private javax.swing.JLabel lTotal;
    private javax.swing.JLabel lTotalA;
    private javax.swing.JLabel lTotalC;
    private javax.swing.JLabel lTotalDD;
    private javax.swing.JLabel lTotalF;
    private javax.swing.JLabel lTotalM;
    private javax.swing.JLabel lTotalP;
    private javax.swing.JPanel pBuscarDoctor;
    private javax.swing.JPanel pBuscarDoctor10;
    private javax.swing.JPanel pBuscarDoctor2;
    private javax.swing.JPanel pBuscarDoctor3;
    private javax.swing.JPanel pBuscarDoctor4;
    private javax.swing.JPanel pBuscarDoctor5;
    private javax.swing.JPanel pBuscarDoctor6;
    private javax.swing.JPanel pBuscarDoctor7;
    private javax.swing.JPanel pBuscarDoctor8;
    private javax.swing.JPanel pBuscarDoctor9;
    private javax.swing.JPanel pDatos1;
    private javax.swing.JPanel pDatos2;
    private javax.swing.JPanel pDatos3;
    private javax.swing.JPanel pDatos4;
    private javax.swing.JPanel pDatos5;
    private javax.swing.JPanel pDatos6;
    private javax.swing.JPanel pDatos7;
    private javax.swing.JPanel pDatos8;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pEditar1;
    private javax.swing.JPanel pEditar2;
    private javax.swing.JPanel pEditar3;
    private javax.swing.JPanel pEditar4;
    private javax.swing.JPanel pEditar5;
    private javax.swing.JPanel pEditar6;
    private javax.swing.JPanel pEditar7;
    private javax.swing.JTable tAnual;
    private javax.swing.JTable tCliente;
    private javax.swing.JTable tCredito;
    private javax.swing.JTable tDiaria;
    private javax.swing.JTable tDiariaD;
    private javax.swing.JTable tFechas;
    private javax.swing.JTable tHistorial;
    private javax.swing.JTable tMensual;
    private javax.swing.JTable tStock;
    private javax.swing.JTable tVendido;
    // End of variables declaration//GEN-END:variables
}
