package PaginaPrincipal.Controlador;

import BaseDatos.BaseDatoControlador;
import Bean.Comprobante;
import Bean.Temporal;
import Bean.Producto;
import static PaginaPrincipal.Paneles.PanelVenta.formatDate;
import java.awt.print.PrinterJob;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.HashPrintServiceAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.PrinterName;
import javax.swing.*;
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

public class VentaControlador {

    int conta;
    BaseDatoControlador bdControlador = new BaseDatoControlador();
    public ArrayList<Producto> listaProducto = new ArrayList<>();
    public ArrayList<Comprobante> listaComprobante = new ArrayList<>();
    public ArrayList<Comprobante> listaCliente = new ArrayList<>();
    public ArrayList<Producto> listaProductoTa = new ArrayList<>();

    // INICIO -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    public int id() throws SQLException {
        String mysqlId = "SELECT MAX(idComprobante) FROM Comprobante";
        return bdControlador.ConsultarIdMax(mysqlId);

    }

    public int idDetalle() throws SQLException {
        String mysqlId = "SELECT MAX(idDetalle) FROM detallecomprobante";
        return bdControlador.ConsultarIdMax(mysqlId);

    }
    // FIN -- ENCONTRAR EL MAXIMO ID DE UNA TABLA

    // INICIO -- LLENAR COMBOBOX 
    // FIN -- LLENAR COMBOBOX 
    // INICIO -- METODOS PARA VALIDACIONES
    public void Vacio(JTable tableOrden, JTextField cNombre, JTextField cCantidad, JTextField cPrecio, JTextField cIdProcuto, JTextField cNombreP, JLabel ITotal, JTextField cCedula) {
        cNombre.setText("");
        ITotal.setText("");
        cCedula.setText("");
        this.limpiarServicio(cCantidad, cPrecio, cIdProcuto, cNombreP);
        this.listaProductoTa.clear();
        this.mostrar(tableOrden);

    }

    public void accionCombobox(String temporal, rojeru_san.rsbutton.RSButtonEffect bEditar2, JComboBox cbPago, JTextField cFecha) {
        if (bEditar2.isEnabled()) {
            if (cbPago.getSelectedItem() == "EFECTIVO") {
                cFecha.setText(formatDate(new java.util.Date()));
            } else {
                cFecha.setText(temporal);;
            }

        }
    }

    // FIN -- METODOS PARA VALIDACIONES
    // INICIO -- PASAR REGISTRO A LA TABLA
    public String nombreImpresora() {
        ResultSet rs;
        String impresora = "";
        String mysql = "SELECT nombre from impresora";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                impresora = rs.getString("nombre");
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de mostrar" + "\n" + e);
        }
        return impresora;

    }

    public void DatosTablaBd(String idComprobante) {
        ResultSet rs;
        String mysql = "SELECT producto.IdProducto, producto.nombres, detallecomprobante.cantidad, detalleComprobante.precio,total \n"
                + "FROM detalleComprobante\n"
                + "INNER JOIN producto ON producto.IdProducto= detalleComprobante.IdProducto\n"
                + "WHERE idComprobante = " + Integer.parseInt(idComprobante);
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("producto.IdProducto"));
                producto.setNombres(rs.getString("producto.nombres"));
                producto.setCantidad(rs.getDouble("detallecomprobante.cantidad"));
                producto.setPrecioVenta(rs.getBigDecimal("detalleComprobante.precio").setScale(2, RoundingMode.HALF_EVEN));
                producto.setTotal(rs.getBigDecimal("total").setScale(2, RoundingMode.HALF_EVEN));
                System.out.println(rs.getBigDecimal("total").setScale(2, RoundingMode.HALF_EVEN));
                listaProductoTa.add(producto);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de mostrar" + "\n" + e);
        }

    }

    public void DatosTablaProdu() {
        ResultSet rs;
        String mysql = "SELECT IdProducto, Nombres, PrecioVenta, cantidad\n"
                + "FROM producto ; ";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(Integer.parseInt(rs.getString("IdProducto")));
                producto.setNombres(rs.getString("Nombres"));
                producto.setPrecioVenta(rs.getBigDecimal(("precioVenta")));
                producto.setCantidad(Double.parseDouble(rs.getString("cantidad")));
                listaProducto.add(producto);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de mostrar" + "\n" + e);
        }

    }

    public void DatosTablaCompro() {
        ResultSet rs;
        String mysql = "SELECT * FROM comprobante ";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Comprobante comprobante = new Comprobante();
                comprobante.setIdComprobante(Integer.parseInt(rs.getString("IdComprobante")));
                comprobante.setNombre(rs.getString("NombresP"));
                comprobante.setCedula(rs.getString("Cedula"));
                comprobante.setPago(rs.getString("Pago"));
                comprobante.setFecha(rs.getString("Fecha"));
                comprobante.setTotal(rs.getBigDecimal("Total").setScale(2, RoundingMode.HALF_EVEN));

                listaComprobante.add(comprobante);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de mostrar" + "\n" + e);
        }

    }

    public void LlenarTablaCompro(DefaultTableModel model, JTable tComprobante) {
        String[] titulos = {"N.COMP.", "CLIENTE", "CEDULA", "PAGO", "FECHA", "TOTAL"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[6];
        for (int i = 0; i < listaComprobante.size(); i++) {
            fila[0] = listaComprobante.get(i).getIdComprobante() + "";
            fila[1] = listaComprobante.get(i).getNombre();
            fila[2] = listaComprobante.get(i).getCedula();
            fila[3] = listaComprobante.get(i).getPago();
            fila[4] = listaComprobante.get(i).getFecha();
            fila[5] = listaComprobante.get(i).getTotal() + "";
            model.addRow(fila);
        }
        TableColumnModel columnModel = tComprobante.getColumnModel();
        tComprobante.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tComprobante.doLayout();
        model.fireTableDataChanged();

        tComprobante.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(90);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(90);
        columnModel.getColumn(5).setPreferredWidth(90);

    }

    public void DatosTablaCliente() {
        ResultSet rs;
        String mysql = "SELECT DISTINCT NombresP, cedula From comprobante ";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Comprobante comprobante = new Comprobante();
                comprobante.setNombre(rs.getString("NombresP"));
                comprobante.setCedula(rs.getString("Cedula"));
                listaCliente.add(comprobante);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de mostrar" + "\n" + e);
        }

    }

    public void LlenarTablaCliente(DefaultTableModel model, JTable tComprobante) {
        String[] titulos = {"CLIENTE", "CEDULA"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[2];
        for (int i = 0; i < listaCliente.size(); i++) {
            fila[0] = listaCliente.get(i).getNombre();
            fila[1] = listaCliente.get(i).getCedula();
            model.addRow(fila);
        }
        TableColumnModel columnModel = tComprobante.getColumnModel();
        tComprobante.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tComprobante.doLayout();
        model.fireTableDataChanged();

        tComprobante.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(180);
        columnModel.getColumn(1).setPreferredWidth(180);

    }

    public void LlenarTablaProd(DefaultTableModel model, JTable tProducto) {
        String[] titulos = {"", "NOMBRE", "P.VENTA", "CANTIDAD"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[4];
        for (int i = 0; i < listaProducto.size(); i++) {
            fila[0] = listaProducto.get(i).getIdProducto() + "";
            fila[1] = listaProducto.get(i).getNombres();
            fila[2] = listaProducto.get(i).getPrecioVenta() + "";
            fila[3] = listaProducto.get(i).getCantidad() + "";
            model.addRow(fila);
        }
        TableColumnModel columnModel = tProducto.getColumnModel();
        tProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tProducto.doLayout();
        model.fireTableDataChanged();

        tProducto.setModel(model);
        columnModel.getColumn(0).setMinWidth(0);
        columnModel.getColumn(0).setMaxWidth(0);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(2).setMinWidth(0);
        columnModel.getColumn(2).setMaxWidth(0);

    }

    public void PasarDatosPro(JTable tProducto, JTextField cIdProcuto, JTextField cNombreP, JTextField cPrecioC, JTextField cCantidadA) {
        int rec = tProducto.getSelectedRow();
        cIdProcuto.setText((String) tProducto.getValueAt(rec, 0));
        cNombreP.setText((String) tProducto.getValueAt(rec, 1));
        cPrecioC.setText((String) tProducto.getValueAt(rec, 2));
        cCantidadA.setText((String) tProducto.getValueAt(rec, 3));

    }
    // FIN -- PASAR REGISTRO A LA TABLA

    //INICIO -- PROCEDIMIENTOS PARA AGREGAR PRODUCTOS A LA TABLA
    public void limpiarServicio(JTextField cCantidad, JTextField cPrecio, JTextField cIdProducto, JTextField cNombreP) {
        cCantidad.setText("");
        cPrecio.setText("");
        cIdProducto.setText("");
        cNombreP.setText("");
    }

    private boolean Igual(JTable tOrden, JTextField fId, JTextField fCantidad) {
        int num = tOrden.getRowCount();
        double sumCantidad = 0;
        BigDecimal sumTotal = BigDecimal.ZERO;
        boolean v = false;
        for (int i = 0; i < num; i++) {
            int id = Integer.parseInt((String) tOrden.getValueAt(i, 0));
            if (Integer.parseInt(fId.getText()) == id) {
                if (conta < 1) {
                    sumCantidad = (Double.parseDouble((String) tOrden.getValueAt(i, 2))) + (Double.parseDouble(fCantidad.getText()));
                    String cantidad = Double.toString(sumCantidad);
                    tOrden.setValueAt(cantidad, i, 2);
                    BigDecimal cant = new BigDecimal((String) tOrden.getValueAt(i, 2));
                    BigDecimal prec = new BigDecimal(((String) tOrden.getValueAt(i, 3)));

                    sumTotal = cant.multiply(prec).setScale(2, RoundingMode.HALF_EVEN);
                    String total = (sumTotal.toString());

                    tOrden.setValueAt(total, i, 4);
                    for (int x = 0; x < listaProductoTa.size(); x++) {
                        Producto producto = listaProductoTa.get(x);
                        if (producto.getIdProducto() == Integer.parseInt(fId.getText())) {
                            producto.setCantidad(sumCantidad);
                            producto.setTotal(sumTotal);

                        }
                    }
                    conta++;
                } else {
                    conta = 0;

                }

                v = true;
            }

        }

        return v;

    }

    public void mostrar(JTable tableOrden) {
        String matriz[][] = new String[listaProductoTa.size()][5];

        for (int i = 0; i < listaProductoTa.size(); i++) {
            matriz[i][0] = listaProductoTa.get(i).getIdProducto() + "";
            matriz[i][1] = listaProductoTa.get(i).getNombres();
            matriz[i][2] = listaProductoTa.get(i).getCantidad() + "";
            matriz[i][3] = listaProductoTa.get(i).getPrecioVenta().setScale(2, RoundingMode.HALF_EVEN) + "";
            matriz[i][4] = listaProductoTa.get(i).getTotal().setScale(2, RoundingMode.HALF_EVEN) + "";

        }

        tableOrden.setModel(new DefaultTableModel(
                matriz,
                new String[]{
                    "CÓDIGO", "PRODUCTO", "CANTIDAD", "PRECIO UNITARIO", "PRECIO TOTAL"
                }
        ));
        TableColumnModel columnModel = tableOrden.getColumnModel();
        tableOrden.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableOrden.doLayout();
        columnModel.getColumn(0).setPreferredWidth(90);
        columnModel.getColumn(1).setPreferredWidth(212);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(100);

    }

    public BigDecimal Total(JTable tTableOrden, JLabel cTotal) {
        int num = tTableOrden.getRowCount();
        BigDecimal sumSubTotal = BigDecimal.ZERO;

        for (int i = 0; i < num; i++) {
            sumSubTotal = sumSubTotal.add(new BigDecimal(((String) tTableOrden.getValueAt(i, 4))));

        }
        cTotal.setText("" + sumSubTotal);
        return sumSubTotal;

    }

    private void AgregarOrden(JLabel cTotal, JTextField cCantidad, JTextField cPrecio, JTextField cIdProducto, JTextField cNombreP, JTable tOrden) {
        double precioTotal = (Double.parseDouble(cCantidad.getText())) * Double.parseDouble(cPrecio.getText());
        Producto producto = new Producto();
        producto.setIdProducto(Integer.parseInt(cIdProducto.getText()));
        producto.setNombres(cNombreP.getText());
        producto.setCantidad(Double.parseDouble(cCantidad.getText()));
        producto.setPrecioVenta(BigDecimal.valueOf(Double.parseDouble(cPrecio.getText())));
        producto.setTotal(BigDecimal.valueOf(precioTotal));

        if (Double.parseDouble(cCantidad.getText()) > 0) {
            if (this.Igual(tOrden, cIdProducto, cCantidad) == false) {
                listaProductoTa.add(producto);
                mostrar(tOrden);
                cantidadProAg(cCantidad, cIdProducto);
                this.limpiarServicio(cCantidad, cPrecio, cIdProducto, cNombreP);
            } else {

                this.Igual(tOrden, cIdProducto, cCantidad);
                cantidadProAg(cCantidad, cIdProducto);
                this.limpiarServicio(cCantidad, cPrecio, cIdProducto, cNombreP);
            }

            this.Total(tOrden, cTotal);

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad mayor de 0");
        }

    }

    private void cantidadProAg(JTextField cCantidad, JTextField cIdProducto) {
        if (listaProducto.size() == 0) {
            return;
        }
        for (int i = 0; i < listaProducto.size(); i++) {

            if (listaProducto.get(i).getIdProducto() == (Integer.parseInt(cIdProducto.getText()))) {
                double cantidad = listaProducto.get(i).getCantidad() - Double.parseDouble(cCantidad.getText());
                listaProducto.get(i).setCantidad(cantidad);
            }

        }

    }

    private void cantidadProEl(double cantidadP, int Idproducto) {

        if (listaProducto.size() == 0) {
            return;
        }

        for (int i = 0; i < listaProducto.size(); i++) {

            if (listaProducto.get(i).getIdProducto() == Idproducto) {
                double cantidad = listaProducto.get(i).getCantidad() + cantidadP;
                listaProducto.get(i).setCantidad(cantidad);

            }

        }

    }

    public void Agregar(JLabel cTotal, JTextField cCantidad, JTextField cNombreP, JTextField cPrecio, JTextField cIdProducto, JTable tOrden, JTextField cCantidadA) {

        if (!cCantidad.getText().isEmpty() && !cNombreP.getText().isEmpty() && !cPrecio.getText().isEmpty()) {
            if (Double.parseDouble(cCantidad.getText()) <= (Double.parseDouble(cCantidadA.getText()))) {
                this.AgregarOrden(cTotal, cCantidad, cPrecio, cIdProducto, cNombreP, tOrden);
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad ingresada es mayor al stock del producto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Existen campos vacios");
        }
    }

    public void EliminarFila(JTable tableOrden, JLabel cTotal) {
        DefaultTableModel dtm = (DefaultTableModel) tableOrden.getModel();
        int indFil = tableOrden.getSelectedRow();
        if (indFil >= 0) {
            dtm.removeRow(indFil);

            this.cantidadProEl(listaProductoTa.get(indFil).getCantidad(), listaProductoTa.get(indFil).getIdProducto());
            listaProductoTa.remove(indFil);
            this.Total(tableOrden, cTotal);

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila ");
        }
    }
    //FINN --

    // INICIO -- REGISTRAR 
    public void RegistrarDetalleC(JTextField cIdComprobante, JTextField cNombres, JTextField cFecha, JLabel cTotal, JTextField cCedula, JComboBox cbPago) {
        String mysql = "INSERT INTO comprobante (idComprobante,nombresP,fecha,total,cedula,pago) VALUES(?,?,?,?,?,?)";
        try {
            if (cIdComprobante.getText().isEmpty() || cNombres.getText().isEmpty() || cFecha.getText().isEmpty() || cTotal.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;
            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, Integer.parseInt(cIdComprobante.getText()));
            bdControlador.ps.setString(2, cNombres.getText());
            bdControlador.ps.setString(3, cFecha.getText());
            bdControlador.ps.setString(4, cTotal.getText());
            bdControlador.ps.setString(5, cCedula.getText());
            bdControlador.ps.setString(6, (String) cbPago.getSelectedItem());
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            //JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar los datos del comprobante" + "\n" + e);
        }

    }

    public void RegistrarComprobante(JTextField cIdComprobante) {
        String mysql = "INSERT INTO detallecomprobante(idDetalle,idComprobante,idProducto,precio,cantidad,total) VALUES(?,?,?,?,?,?)";
        try {
            if (listaProductoTa.size() == 0) {
                JOptionPane.showMessageDialog(null, "No existen productos");
                return;
            }
            bdControlador.Registrar(mysql);
            for (int i = 0; i < listaProductoTa.size(); i++) {
                bdControlador.ps.setInt(1, this.idDetalle());
                System.out.println(cIdComprobante.getText() + "hola");
                bdControlador.ps.setInt(2, Integer.parseInt(cIdComprobante.getText()));
                bdControlador.ps.setInt(3, listaProductoTa.get(i).getIdProducto());
                bdControlador.ps.setBigDecimal(4, listaProductoTa.get(i).getPrecioVenta());
                bdControlador.ps.setDouble(5, listaProductoTa.get(i).getCantidad());
                bdControlador.ps.setBigDecimal(6, listaProductoTa.get(i).getTotal());
                bdControlador.ps.executeUpdate();

            }
            ModificarProductos();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar los detalles del comprobante" + "\n" + e);
        }

    }

    // FIN -- REGISTRAR 
    // INICIO -- MODIFICAR
    public void ModificarDetalleC(JTextField cIdComprobante, JLabel cTotal) {
        String mysql = "UPDATE comprobante SET total= ? where idComprobante = ?";
        try {

            bdControlador.Registrar(mysql);
            bdControlador.ps.setString(1, cTotal.getText());
            bdControlador.ps.setInt(2, Integer.parseInt(cIdComprobante.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar los datos del comprobante" + "\n" + e);
        }

    }

    public void ModificarDetalleCA(JTextField cIdComprobante, JTextField cNombres, JTextField cFecha, JLabel cTotal, JTextField cCedula, JComboBox cbPago) {
        String mysql = "UPDATE comprobante SET nombresP =?,fecha =?,total=?,cedula=?,pago=? WHERE idComprobante=? ";
        try {
            if (cIdComprobante.getText().isEmpty() || cNombres.getText().isEmpty() || cFecha.getText().isEmpty() || cTotal.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;
            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setString(1, cNombres.getText());
            bdControlador.ps.setString(2, cFecha.getText());
            bdControlador.ps.setString(3, cTotal.getText());
            bdControlador.ps.setString(4, cCedula.getText());
            bdControlador.ps.setString(5, (String) cbPago.getSelectedItem());
            bdControlador.ps.setInt(6, Integer.parseInt(cIdComprobante.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            //JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar los datos del comprobante" + "\n" + e);
        }

    }

    public void ModificarProductos() {
        String mysql = "UPDATE producto SET cantidad =? WHERE idProducto=?";
        try {
            if (listaProducto.size() == 0) {
                JOptionPane.showMessageDialog(null, "No existen productos disponibles");
                return;
            }
            bdControlador.Registrar(mysql);
            for (int i = 0; i < listaProducto.size(); i++) {
                bdControlador.ps.setDouble(1, listaProducto.get(i).getCantidad());
                bdControlador.ps.setInt(2, listaProducto.get(i).getIdProducto());
                bdControlador.ps.executeUpdate();

            }
            bdControlador.ps.close();
            // JOptionPane.showMessageDialog(null, "Se Modificó Correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    // FIN -- MODIFICAR
    // INICIO -- ELIMINAR
    public void Eliminar(JTextField cIdComprobante) {
        String mysql = "DELETE FROM DETALLECOMPROBANTE WHERE idcomprobante=?";

        try {
            bdControlador.Eliminar(mysql);
            bdControlador.ps.setInt(1, Integer.parseInt(cIdComprobante.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error" + "\n" + e);
        }

    }
    // FIN-- ELIMINAR

    //INICIO-- PASAR DATOS A FORMULARIO
    public void DatosFormulario(JTable tComprobante, JDialog form) throws SQLException {
        Temporal tp = new Temporal();

        if (tComprobante.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila");
            return;
        }
        int num = tComprobante.getRowCount();

        for (int i = 0; i < num; i++) {
            if (tComprobante.isRowSelected(i)) {
                tp.setIdComprobante((String) (tComprobante.getValueAt(i, 0)));
                tp.setNombreCliente((String) (tComprobante.getValueAt(i, 1)));
                tp.setCedula((String) (tComprobante.getValueAt(i, 2)));
                tp.setPago((String) (tComprobante.getValueAt(i, 3)));
                tp.setFecha((String) (tComprobante.getValueAt(i, 4)));
                tp.setTotal((String) (tComprobante.getValueAt(i, 5)));

                return;
            }
        }

    }

    public void DatosFormularioCliente(JTable tCliente, JDialog form) throws SQLException {
        Temporal tp = new Temporal();

        if (tCliente.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila");
            return;
        }
        int num = tCliente.getRowCount();

        for (int i = 0; i < num; i++) {
            if (tCliente.isRowSelected(i)) {
                tp.setNombreCliente((String) (tCliente.getValueAt(i, 0)));
                tp.setCedula((String) (tCliente.getValueAt(i, 1)));
                return;
            }
        }

    }

    //LLAMAR IMPRESORA
    private void PrintReportToPrinter(JasperPrint jp) throws JRException {
        // TODO Auto-generated method stub
        PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
        // printRequestAttributeSet.add(MediaSizeName.ISO_A4); //setting page size
        printRequestAttributeSet.add(new Copies(1));

        PrinterName printerName = new PrinterName(nombreImpresora(), null); //gets printer 

        PrintServiceAttributeSet printServiceAttributeSet = new HashPrintServiceAttributeSet();
        printServiceAttributeSet.add(printerName);

        JRPrintServiceExporter exporter = new JRPrintServiceExporter();

        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jp);
        exporter.setParameter(JRPrintServiceExporterParameter.PRINT_REQUEST_ATTRIBUTE_SET, printRequestAttributeSet);
        exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, printServiceAttributeSet);
        exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
        exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, Boolean.FALSE);
        exporter.exportReport();
    }
    //FIN LLAMAR IMPRESORA

    public void ReporteComprobante(JTextField cNombre, JTextField cFecha, JTextField cNumCompr, JLabel lTotal, JTextField cCedula, JComboBox cbPago) {
        Map parametro = new HashMap();
        parametro.put("plogo", this.getClass().getResourceAsStream("/iconos/iKefish.png"));
        parametro.put("pCliente", cNombre.getText());
        parametro.put("pcedula", cCedula.getText());
        parametro.put("pPago", cbPago.getSelectedItem());
        parametro.put("pTotalCom", "$ " + lTotal.getText());
        parametro.put("pidComprobante", cNumCompr.getText());
        parametro.put("pfecha", cFecha.getText());

        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/ComprobantePago.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(this.listaProductoTa)); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Comprobante de Pago ");
            viewer.setVisible(true); //Se vizualiza el reporte
            PrintReportToPrinter(jprint);//call method

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }
    //FIN-- PASAR DATOS A FORMULARIO
}


