package PaginaPrincipal.Controlador;

import BaseDatos.BaseDatoControlador;
import Bean.Comprobante;
import Bean.Producto;
import Conexion.Conexion;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;

public class ReporteControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();
    public ArrayList<Producto> listaProductoStock = new ArrayList<>();
    public ArrayList<Producto> listaProductoVendido = new ArrayList<>();
    public ArrayList<Comprobante> listaDiario = new ArrayList<>();
    public ArrayList<Comprobante> listaMensual = new ArrayList<>();
    public ArrayList<Comprobante> listaFechas = new ArrayList<>();
    public ArrayList<Comprobante> listaAnual = new ArrayList<>();
    public ArrayList<Comprobante> listaCredito = new ArrayList<>();
    public ArrayList<Producto> listaDetalleVentas = new ArrayList<>();
    public ArrayList<Comprobante> listaHistorial = new ArrayList<>();

    // INICIO -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    // FIN -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    // INICIO -- LLENAR COMBOBOX 
    // FIN -- LLENAR COMBOBOX 
    // INICIO -- METODOS PARA VALIDACIONES
    // FIN -- METODOS PARA VALIDACIONES
    // INICIO -- PASAR REGISTRO A LA TABLA
    public void DatosTablaStock() {
        ResultSet rs;
        String mysql = "SELECT nombres, SUM(detallecomprobante.Cantidad)+producto.Cantidad as Ingreso, \n"
                + " SUM(detallecomprobante.Cantidad) as Egreso, producto.cantidad as Stock, producto.cantidad*producto.PrecioCompra as total\n"
                + "FROM producto\n"
                + "INNER JOIN detallecomprobante ON detallecomprobante.IdProducto = producto.IdProducto\n"
                + "group by nombres ;";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setNombres(rs.getString("Nombres"));
                producto.setIngreso(Double.parseDouble(rs.getString("Ingreso")));
                producto.setEgreso(Double.parseDouble(rs.getString("Egreso")));
                producto.setCantidad((Double.parseDouble(rs.getString("stock"))));
                producto.setTotal(rs.getBigDecimal("Total").setScale(2, RoundingMode.HALF_EVEN));
                listaProductoStock.add(producto);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTablaStock(DefaultTableModel model, JTable tProducto) {
        String[] titulos = {"PRODUCTO", "ENTRADA", "SALIDA", "STOCK", "TOTAL"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[5];
        for (int i = 0; i < listaProductoStock.size(); i++) {
            fila[0] = listaProductoStock.get(i).getNombres();
            fila[1] = listaProductoStock.get(i).getIngreso() + "";
            fila[2] = listaProductoStock.get(i).getEgreso() + "";
            fila[3] = listaProductoStock.get(i).getCantidad() + "";
            fila[4] = listaProductoStock.get(i).getTotal() + "";

            model.addRow(fila);
        }
        TableColumnModel columnModel = tProducto.getColumnModel();
        tProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tProducto.doLayout();
        tProducto.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(98);
    }

    public void DatosTablaVendi() {
        ResultSet rs;
        String mysql = "SELECT nombres,sum(detallecomprobante.cantidad) AS cantidad\n"
                + "FROM producto \n"
                + "INNER JOIN detallecomprobante On producto.IdProducto=detallecomprobante.IdProducto\n"
                + "group by detallecomprobante.IdProducto order by cantidad DESC ;";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setNombres(rs.getString("Nombres"));
                producto.setCantidad(Double.parseDouble(rs.getString("cantidad")));
                listaProductoVendido.add(producto);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTablaVendi(DefaultTableModel model, JTable tProducto) {
        String[] titulos = {"PRODUCTO ", "CANTIDAD"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[2];
        for (int i = 0; i < listaProductoVendido.size(); i++) {
            fila[0] = listaProductoVendido.get(i).getNombres();
            fila[1] = listaProductoVendido.get(i).getCantidad() + "";

            model.addRow(fila);
        }
        TableColumnModel columnModel = tProducto.getColumnModel();
        tProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tProducto.doLayout();
        tProducto.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(250);
        columnModel.getColumn(1).setPreferredWidth(98);
    }

    public void DatosTablaDiaria(JTextField cFechaD) {
        ResultSet rs;
        String mysql = "SELECT * from v_listadiaria"
                + " WHERE Fecha= " + "'" + cFechaD.getText() + "'";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Comprobante comprobante = new Comprobante();
                comprobante.setIdComprobante(Integer.parseInt(rs.getString("IdComprobante")));
                comprobante.setNombre(rs.getString("NombresP"));
                comprobante.setCedula(rs.getString("Cedula"));
                comprobante.setFecha(rs.getString("Fecha"));
                comprobante.setTotal(rs.getBigDecimal("Total").setScale(2, RoundingMode.HALF_EVEN));
                comprobante.setGanancia(rs.getBigDecimal("Ganancia").setScale(2, RoundingMode.HALF_EVEN));
                listaDiario.add(comprobante);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTablaDiaria(DefaultTableModel model, JTable tProducto) {
        String[] titulos = {"Nº", "CLIENTE", "CEDULA", "FECHA", "TOTAL", "GANACIA"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[6];
        for (int i = 0; i < listaDiario.size(); i++) {
            fila[0] = listaDiario.get(i).getIdComprobante() + "";
            fila[1] = listaDiario.get(i).getNombre();
            fila[2] = listaDiario.get(i).getCedula();
            fila[3] = listaDiario.get(i).getFecha();
            fila[4] = listaDiario.get(i).getTotal() + "";
            fila[5] = listaDiario.get(i).getGanancia() + "";

            model.addRow(fila);
        }
        TableColumnModel columnModel = tProducto.getColumnModel();
        tProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tProducto.doLayout();
        tProducto.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(111);
        columnModel.getColumn(3).setPreferredWidth(115);
        columnModel.getColumn(4).setPreferredWidth(115);
        columnModel.getColumn(5).setPreferredWidth(115);
    }

    public void DatosTablaDiariaDetalle(JTextField cDesdeDD, JTextField cHastaDD) {
        ResultSet rs;
        String mysql = "SELECT v_clientedetalle.pago,v_clientedetalle.nombresP, v_clientedetalle.nombres,sum(v_clientedetalle.cantidad) as Cantidad,v_clientedetalle.precio, sum(v_clientedetalle.total) as Total,\n"
                + "(v_clientedetalle.precio - producto.PrecioCompra)*sum(v_clientedetalle.cantidad) as Ganancia \n"
                + "FROM v_clientedetalle\n"
                + "INNER JOIN producto ON producto.IdProducto = v_clientedetalle.IdProducto\n"
                + "WHERE fecha Between " + "'" + cDesdeDD.getText() + "'" + " AND " + "'" + cHastaDD.getText() + "'\n"
                + "group by v_clientedetalle.nombresP ,v_clientedetalle.nombres, v_clientedetalle.precio ORDER BY v_clientedetalle.nombresP";

        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setPago(rs.getString("v_clientedetalle.pago"));
                producto.setCliente(rs.getString("v_clientedetalle.NombresP"));
                producto.setNombres(rs.getString("Nombres"));
                producto.setCantidad((Double.parseDouble(rs.getString("Cantidad"))));
                producto.setPrecioVenta(rs.getBigDecimal("v_clientedetalle.precio").setScale(2, RoundingMode.HALF_EVEN));
                producto.setTotal(rs.getBigDecimal("Total").setScale(2, RoundingMode.HALF_EVEN));
                producto.setGanancia(rs.getBigDecimal("Ganancia").setScale(2, RoundingMode.HALF_EVEN));
                listaDetalleVentas.add(producto);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTablaDiariaDetalle(DefaultTableModel model, JTable tDiariaD) {
        String[] titulos = {"PAGO","CLIENTE", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL", "GANANCIA"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[7];
        for (int i = 0; i < listaDetalleVentas.size(); i++) {
            fila[0] = listaDetalleVentas.get(i).getPago();
            fila[1] = listaDetalleVentas.get(i).getCliente();
            fila[2] = listaDetalleVentas.get(i).getNombres();
            fila[3] = listaDetalleVentas.get(i).getCantidad() + "";
            fila[4] = listaDetalleVentas.get(i).getPrecioVenta() + "";
            fila[5] = listaDetalleVentas.get(i).getTotal() + "";
            fila[6] = listaDetalleVentas.get(i).getGanancia() + "";

            model.addRow(fila);
        }
        TableColumnModel columnModel = tDiariaD.getColumnModel();
        tDiariaD.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tDiariaD.doLayout();
        tDiariaD.setModel(model);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(98);
        columnModel.getColumn(3).setPreferredWidth(100);
    }

    public void PasarDatos(JTable tCliente, JTextField cNombre, JTextField cCedula) {
        int rec = tCliente.getSelectedRow();
        cNombre.setText((String) tCliente.getValueAt(rec, 0));
        cCedula.setText((String) tCliente.getValueAt(rec, 1));

    }

    public void DatosTablaMensual(JTextField cAnoM, JComboBox cbMes) {
        ResultSet rs;
        String mysql = "SELECT * FROM v_listadiaria where \n"
                + "MONTH(fecha)= " + cbMes.getSelectedIndex() + " AND YEAR(fecha) =" + cAnoM.getText();
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Comprobante comprobante = new Comprobante();
                comprobante.setIdComprobante(Integer.parseInt(rs.getString("IdComprobante")));
                comprobante.setNombre(rs.getString("NombresP"));
                comprobante.setCedula(rs.getString("Cedula"));
                comprobante.setFecha(rs.getString("Fecha"));
                comprobante.setTotal(rs.getBigDecimal(("Total")).setScale(2, RoundingMode.HALF_EVEN));
                comprobante.setGanancia(rs.getBigDecimal("Ganancia").setScale(2, RoundingMode.HALF_EVEN));
                listaMensual.add(comprobante);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTablaMensual(DefaultTableModel model, JTable tProducto) {
        String[] titulos = {"Nº", "CLIENTE", "CEDULA", "FECHA", "TOTAL", "GANACIA"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[6];
        for (int i = 0; i < listaMensual.size(); i++) {
            fila[0] = listaMensual.get(i).getIdComprobante() + "";
            fila[1] = listaMensual.get(i).getNombre();
            fila[2] = listaMensual.get(i).getCedula();
            fila[3] = listaMensual.get(i).getFecha();
            fila[4] = listaMensual.get(i).getTotal() + "";
            fila[5] = listaMensual.get(i).getGanancia() + "";

            model.addRow(fila);
        }
        TableColumnModel columnModel = tProducto.getColumnModel();
        tProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tProducto.doLayout();
        tProducto.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(111);
        columnModel.getColumn(3).setPreferredWidth(115);
        columnModel.getColumn(4).setPreferredWidth(115);

    }

    public void DatosTablaFechas(JTextField cDesdeF, JTextField cHastaF) {
        ResultSet rs;
        String mysql = "SELECT * FROM v_listadiaria \n"
                + "WHERE fecha Between " + "'" + cDesdeF.getText() + "'" + " AND " + "'" + cHastaF.getText() + "'";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Comprobante comprobante = new Comprobante();
                comprobante.setIdComprobante(Integer.parseInt(rs.getString("IdComprobante")));
                comprobante.setNombre(rs.getString("NombresP"));
                comprobante.setCedula(rs.getString("Cedula"));
                comprobante.setFecha(rs.getString("Fecha"));
                comprobante.setTotal(rs.getBigDecimal(("Total")).setScale(2, RoundingMode.HALF_EVEN));
                comprobante.setGanancia(rs.getBigDecimal("Ganancia").setScale(2, RoundingMode.HALF_EVEN));
                listaFechas.add(comprobante);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTablaFechas(DefaultTableModel model, JTable tProducto) {
        String[] titulos = {"Nº", "CLIENTE", "CEDULA", "FECHA", "TOTAL", "GANACIA"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[6];
        for (int i = 0; i < listaFechas.size(); i++) {
            fila[0] = listaFechas.get(i).getIdComprobante() + "";
            fila[1] = listaFechas.get(i).getNombre();
            fila[2] = listaFechas.get(i).getCedula();
            fila[3] = listaFechas.get(i).getFecha();
            fila[4] = listaFechas.get(i).getTotal() + "";
            fila[5] = listaFechas.get(i).getGanancia() + "";

            model.addRow(fila);
        }
        TableColumnModel columnModel = tProducto.getColumnModel();
        tProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tProducto.doLayout();
        tProducto.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(111);
        columnModel.getColumn(3).setPreferredWidth(115);
        columnModel.getColumn(4).setPreferredWidth(115);
    }

    public void DatosTablaCredito(JTextField cDesdeC, JTextField cHastaC) {
        ResultSet rs;
        String mysql = "SELECT * FROM v_listaCredito \n"
                + "WHERE fecha Between " + "'" + cDesdeC.getText() + "'" + " AND " + "'" + cHastaC.getText() + "'";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Comprobante comprobante = new Comprobante();
                comprobante.setIdComprobante(Integer.parseInt(rs.getString("IdComprobante")));
                comprobante.setNombre(rs.getString("NombresP"));
                comprobante.setCedula(rs.getString("Cedula"));
                comprobante.setFecha(rs.getString("Fecha"));
                comprobante.setTotal(rs.getBigDecimal(("Total")).setScale(2, RoundingMode.HALF_EVEN));

                listaCredito.add(comprobante);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTablaCredito(DefaultTableModel model, JTable tProducto) {
        String[] titulos = {"Nº", "CLIENTE", "CEDULA", "FECHA", "TOTAL"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[5];
        for (int i = 0; i < listaCredito.size(); i++) {
            fila[0] = listaCredito.get(i).getIdComprobante() + "";
            fila[1] = listaCredito.get(i).getNombre();
            fila[2] = listaCredito.get(i).getCedula();
            fila[3] = listaCredito.get(i).getFecha();
            fila[4] = listaCredito.get(i).getTotal() + "";

            model.addRow(fila);
        }
        TableColumnModel columnModel = tProducto.getColumnModel();
        tProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tProducto.doLayout();
        tProducto.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(111);
        columnModel.getColumn(3).setPreferredWidth(115);

    }

    public void DatosTablaAnual(JTextField cAnoA) {
        ResultSet rs;
        String mysql = " SELECT ELT(MONTH(fecha), 'Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre','Octubre', 'Noviembre', 'Diciembre')  as Mes, sum(total) as Total,sum(ganancia) as ganancia  FROM v_listadiaria \n"
                + "WHERE YEAR(fecha)=" + cAnoA.getText() + "\n"
                + "GROUP BY MONTH(fecha) ORDER BY MONTH(fecha) ";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Comprobante comprobante = new Comprobante();
                comprobante.setFecha(rs.getString("Mes").toUpperCase());
                comprobante.setTotal(rs.getBigDecimal(("Total")).setScale(2, RoundingMode.HALF_EVEN));
                comprobante.setGanancia(rs.getBigDecimal("Ganancia").setScale(2, RoundingMode.HALF_EVEN));
                listaAnual.add(comprobante);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTablaAnual(DefaultTableModel model, JTable tProducto) {
        String[] titulos = {"MES", "TOTAL", "GANANCIA"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[3];
        for (int i = 0; i < listaAnual.size(); i++) {
            fila[0] = listaAnual.get(i).getFecha();
            fila[1] = listaAnual.get(i).getTotal() + "";
            fila[2] = listaAnual.get(i).getGanancia() + "";

            model.addRow(fila);
        }
        TableColumnModel columnModel = tProducto.getColumnModel();
        tProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tProducto.doLayout();
        tProducto.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(140);
        columnModel.getColumn(1).setPreferredWidth(106);
        columnModel.getColumn(2).setPreferredWidth(106);
    }

    public void DatosTablaHistorial(JTextField cNombre, JTextField cCedula) {
        ResultSet rs;
        String mysql = "SELECT fecha, total, pago FROM comprobante\n"
                + "WHERE cedula =" + "'" + cCedula.getText() + "'" + "  and NombresP=" + "'" + cNombre.getText() + "'" + ";";

        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Comprobante comprobante = new Comprobante();
                comprobante.setFecha(rs.getString("fecha"));
                comprobante.setTotal(rs.getBigDecimal("Total").setScale(2, RoundingMode.HALF_EVEN));
                comprobante.setPago(rs.getString("pago"));

                listaHistorial.add(comprobante);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTablaHistorial(DefaultTableModel model, JTable tHistorial) {
        String[] titulos = {"FECHA", "TOTAL", "PAGO"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[3];
        for (int i = 0; i < listaHistorial.size(); i++) {
            fila[0] = listaHistorial.get(i).getFecha();
            fila[1] = listaHistorial.get(i).getTotal() + "";
            fila[2] = listaHistorial.get(i).getPago();

            model.addRow(fila);
        }
        TableColumnModel columnModel = tHistorial.getColumnModel();
        tHistorial.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tHistorial.doLayout();
        model.fireTableDataChanged();
        tHistorial.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(98);
        columnModel.getColumn(1).setPreferredWidth(98);
        columnModel.getColumn(2).setPreferredWidth(100);

    }
//INICIO -- TOTAL

    public BigDecimal Total(JTable tTableOrden, JLabel cTotal, int posicion) {
        int num = tTableOrden.getRowCount();
        BigDecimal sumSubTotal = BigDecimal.ZERO;

        for (int i = 0; i < num; i++) {
            sumSubTotal = sumSubTotal.add(new BigDecimal(((String) tTableOrden.getValueAt(i, posicion))));

        }
        cTotal.setText("" + sumSubTotal.setScale(2, RoundingMode.HALF_EVEN));
        return sumSubTotal;

    }

    //FIN  -- TOTAL
    //INICIO -- OBTENER ANO
    public void ano(JTextField cAnoM) {
        Calendar fecha = Calendar.getInstance();
        int año = fecha.get(Calendar.YEAR);
        cAnoM.setText(año + "");
    }

    //FIN -- OBTENER ANO
    // FIN -- PASAR REGISTRO A LA TABLA
    // INICIO -- REGISTRAR 
    // FIN-- ELIMINAR
    //FIN-- PASAR DATOS A FORMULARIO
    public void ReporteStock(JLabel lTotal) {
        Map parametro = new HashMap();
        parametro.put("plogo", this.getClass().getResourceAsStream("/iconos/iKefish.png"));
        parametro.put("ptipo", "REPORTE DE PRODUCTOS EN STOCK (INVERSION)");
        parametro.put("ptotal", "$ " + lTotal.getText());

        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/ListaProductoStock.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(listaProductoStock)); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Productos Stock ");
            viewer.setVisible(true); //Se vizualiza el reporte
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }

    public void ReporteProVendi() {
        Map parametro = new HashMap();
        parametro.put("plogo", this.getClass().getResourceAsStream("/iconos/iKefish.png"));
        parametro.put("ptipo", "REPORTE DE PRODUCTOS MÁS VENDIDOS");

        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/ListaProducto.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(listaProductoVendido)); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Productos Stock ");
            viewer.setVisible(true); //Se vizualiza el reporte
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }

    public void ReporteDiario(JTextField cFechaD, JLabel lTotal, JLabel lGananciaD) {
        Map parametro = new HashMap();
        parametro.put("plogo", this.getClass().getResourceAsStream("/iconos/iKefish.png"));
        parametro.put("ptipo", "REPORTE DE VENTAS DIARIO " + cFechaD.getText());
        parametro.put("ptotal", "$ " + lTotal.getText());
        parametro.put("pGanancia", "$ " + lGananciaD.getText());

        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/ListaDiaria.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(this.listaDiario)); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Ventas");
            viewer.setVisible(true); //Se vizualiza el reporte
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }

    public void ReporteDiarioDetalle(JTextField cDesdeD, JTextField cHastaD, JLabel lTotal, JLabel lGananciaD) {
        Map parametro = new HashMap();
        parametro.put("plogo", this.getClass().getResourceAsStream("/iconos/iKefish.png"));
        parametro.put("ptipo", "REPORTE DE VENTAS DETALLADAS " + cDesdeD.getText() + " HASTA " + cHastaD.getText());
        parametro.put("ptotal", "$ " + lTotal.getText());
        parametro.put("pGanancia", "$ " + lGananciaD.getText());
        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/ListaDiariaDetallada.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(this.listaDetalleVentas)); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Ventas Detalles");
            viewer.setVisible(true); //Se vizualiza el reporte
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }

    public void ReporteMensual(JComboBox cbMes, JLabel lTotal, JLabel lGananciaM) {
        Map parametro = new HashMap();
        parametro.put("plogo", this.getClass().getResourceAsStream("/iconos/iKefish.png"));
        parametro.put("ptipo", "REPORTE DE VENTAS MENSUALES " + cbMes.getSelectedItem());
        parametro.put("ptotal", "$ " + lTotal.getText());
        parametro.put("pGanancia", "$ " + lGananciaM.getText());

        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/ListaDiaria.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(this.listaMensual)); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Ventas");
            viewer.setVisible(true); //Se vizualiza el reporte
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }

    public void ReporteFechas(JTextField cDesdeF, JTextField cHastaF, JLabel lTotal, JLabel lGananciaF) {
        Map parametro = new HashMap();
        parametro.put("plogo", this.getClass().getResourceAsStream("/iconos/iKefish.png"));
        parametro.put("ptipo", "REPORTE DE VENTAS FECHAS " + cDesdeF.getText() + " - " + cHastaF.getText());
        parametro.put("ptotal", "$ " + lTotal.getText());
        parametro.put("pGanancia", "$ " + lGananciaF.getText());

        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/ListaDiaria.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(this.listaFechas)); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Ventas");
            viewer.setVisible(true); //Se vizualiza el reporte
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }

    public void ReporteCreditos(JTextField cDesdeC, JTextField cHastaC, JLabel lTotalC) {
        Map parametro = new HashMap();
        parametro.put("plogo", this.getClass().getResourceAsStream("/iconos/iKefish.png"));
        parametro.put("ptipo", "REPORTE DE CREDITOS " + cDesdeC.getText() + " - " + cHastaC.getText());
        parametro.put("ptotal", "$ " + lTotalC.getText());

        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/ListaCredito.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(this.listaCredito)); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Creditos");
            viewer.setVisible(true); //Se vizualiza el reporte
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }

    public void ReporteAnual(JTextField cAnoA, JLabel lTotal, JLabel lGananciaA) {
        Map parametro = new HashMap();
        parametro.put("plogo", this.getClass().getResourceAsStream("/iconos/iKefish.png"));
        parametro.put("ptipo", "REPORTE DE VENTAS ANUALES " + cAnoA.getText());
        parametro.put("ptotal", "$ " + lTotal.getText());
        parametro.put("pGanancia", "$ " + lGananciaA.getText());

        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/ListaAnual.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(this.listaAnual)); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Ventas");
            viewer.setVisible(true); //Se vizualiza el reporte
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }

    public void ReporteClienteDetalle(JTextField cCedula, JTextField cCliente, JTextField cDesdeD, JTextField cHastaD) {
        Map parametro = new HashMap();
        parametro.put("plogo", this.getClass().getResourceAsStream("/iconos/iKefish.png"));
        parametro.put("pCedula", cCedula.getText());
        parametro.put("pCliente", cCliente.getText());
        parametro.put("pDesde", cDesdeD.getText());
        parametro.put("pHasta", cHastaD.getText());
        parametro.put("pFecha", cDesdeD.getText() + " HASTA " + cHastaD.getText());
        Conexion con = new Conexion();

        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/ClienteDetalle.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, con.Conexion()); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Creditos");
            viewer.setVisible(true); //Se vizualiza el reporte
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }
}



