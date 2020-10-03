package PaginaPrincipal.Controlador;

import BaseDatos.BaseDatoControlador;
import Bean.Producto;
import java.math.RoundingMode;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ProductoControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();
    public ArrayList<Producto> listaProducto = new ArrayList<>();

    // INICIO -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    private int id() throws SQLException {
        String mysqlId = "SELECT MAX(idProducto) FROM producto";
        return bdControlador.ConsultarIdMax(mysqlId);

    }
    // FIN -- ENCONTRAR EL MAXIMO ID DE UNA TABLA

    // INICIO -- LLENAR COMBOBOX 
    public void Categoria(JComboBox cbComunidad) {
        String nombreRegistro = "nombres";
        String mysql = "SELECT * FROM categoria";
        bdControlador.LlenarCombo(cbComunidad, mysql, nombreRegistro);

    }
    // FIN -- LLENAR COMBOBOX 

    // INICIO -- METODOS PARA VALIDACIONES
    public void Vacio(JTextField cNombre, JTextField cPrecioC, JTextField cPrecioV, JTextField cCantidad, JComboBox cbCategoria) {
        cNombre.setText("");
        cPrecioC.setText("");
        cPrecioV.setText("");
        cCantidad.setText("");
        cbCategoria.setSelectedIndex(0);
        

    }

    public void Calcular(JTextField cCantidad, JTextField cCantidadG, JTextField cCantidadMas, JTextField cCantidadMenos, JTextField cCantidadNueva) {
        double cActual;
        if (cCantidadMas.getText().equals("")) {
            cCantidadNueva.setText(cCantidad.getText());

        } else {
            cActual = Double.parseDouble(cCantidad.getText()) + Double.parseDouble(cCantidadMas.getText());
            cCantidadNueva.setText(String.valueOf(cActual));
            cCantidadG.setText(String.valueOf(cActual));
            return;
        }

        if (cCantidadMenos.getText().equals("")) {
            cCantidadNueva.setText(cCantidad.getText());
        } else {
            cActual = Double.parseDouble(cCantidad.getText()) - Double.parseDouble(cCantidadMenos.getText());
            cCantidadNueva.setText(String.valueOf(cActual));
            cCantidadG.setText(String.valueOf(cActual));
        }

    }

    private void Desbloquear(JTextField cNombre, JTextField cPrecioC, JTextField cPrecioV, JTextField cCantidad, JComboBox cbCategoria) {
        cNombre.setEditable(true);
        cPrecioC.setEditable(true);
        cPrecioV.setEditable(true);
        cCantidad.setEditable(true);
        cbCategoria.setEditable(true);
    }

    // FIN -- METODOS PARA VALIDACIONES
    // INICIO -- PASAR REGISTRO A LA TABLA
    public void DatosTabla() {
        ResultSet rs;
        String mysql = "SELECT IdProducto, producto.nombres,precioVenta,precioCompra,cantidad,categoria.Nombres as Categoria \n"
                + "FROM producto\n"
                + "INNER JOIN categoria ON categoria.IdCategoria = producto.IdCategoria";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(Integer.parseInt(rs.getString("IdProducto")));
                producto.setNombres(rs.getString("Nombres"));
                producto.setPrecioVenta(rs.getBigDecimal("precioVenta"));
                producto.setPrecioCompra(rs.getBigDecimal("precioCompra"));
                producto.setCantidad(Double.parseDouble(rs.getString("cantidad")));
                producto.setCategoria(rs.getString("Categoria"));
                listaProducto.add(producto);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTabla(DefaultTableModel model, JTable tProducto) {
        String[] titulos = {"ID", "NOMBRES", "P.VENTA", "P.COMPRA", "CANTIDAD", "CATEGORIA"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[7];
        for (int i = 0; i < listaProducto.size(); i++) {
            fila[0] = listaProducto.get(i).getIdProducto() + "";
            fila[1] = listaProducto.get(i).getNombres();
            fila[2] = listaProducto.get(i).getPrecioVenta() + "";
            fila[3] = listaProducto.get(i).getPrecioCompra() + "";
            fila[4] = listaProducto.get(i).getCantidad() + "";
            fila[5] = listaProducto.get(i).getCategoria();

            model.addRow(fila);
        }
        TableColumnModel columnModel = tProducto.getColumnModel();
        tProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tProducto.doLayout();
        tProducto.setModel(model);
        columnModel.getColumn(0).setMinWidth(0);
        columnModel.getColumn(0).setMaxWidth(0);
        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(50);
        columnModel.getColumn(5).setPreferredWidth(150);

    }

    public void PasarDatos(JTable tProducto, JTextField cId, JTextField cNombre, JTextField cPrecioC,
            JTextField cPrecioV, JTextField cCantidad, JTextField cCantidadG, JComboBox cbCategoria) {
        int rec = tProducto.getSelectedRow();
        cId.setText((String) tProducto.getValueAt(rec, 0));
        cNombre.setText((String) tProducto.getValueAt(rec, 1));
        cPrecioC.setText((String) tProducto.getValueAt(rec, 2));
        cPrecioV.setText((String) tProducto.getValueAt(rec, 3));
        cCantidad.setText((String) tProducto.getValueAt(rec, 4));
        cCantidadG.setText((String) tProducto.getValueAt(rec, 4));
        cbCategoria.setSelectedItem(tProducto.getValueAt(rec, 5));
        

    }
    // FIN -- PASAR REGISTRO A LA TABLA

    // INICIO -- REGISTRAR 
    public void RegistrarProducto(JTextField cNombre, JTextField cPrecioC,
            JTextField cPrecioV, JTextField cCantidad, JComboBox cbCategoria) {
        String mysql = "INSERT INTO producto(IdProducto,Nombres,PrecioVenta,PrecioCompra,cantidad,IdCategoria)"
                + "VALUES(?,?,?,?,?,?)";
        try {
            if (cNombre.getText().isEmpty() && cPrecioC.getText().isEmpty() && cPrecioV.getText().isEmpty()
                    && cCantidad.getText().isEmpty() && cbCategoria.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, this.id());
            bdControlador.ps.setString(2, cNombre.getText());
            bdControlador.ps.setDouble(3, Double.parseDouble(cPrecioC.getText()));
            bdControlador.ps.setDouble(4, Double.parseDouble(cPrecioV.getText()));
            bdControlador.ps.setDouble(5, Double.parseDouble(cCantidad.getText()));
            bdControlador.ps.setInt(6, cbCategoria.getSelectedIndex());

            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");
            this.Vacio(cNombre, cPrecioC, cPrecioV, cCantidad, cbCategoria);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    // FIN -- REGISTRAR 
    // INICIO -- MODIFICAR
    public void Modificar(JTextField cIdE, JTextField cNombre, JTextField cPrecioC,
            JTextField cPrecioV, JTextField cCantidad, JComboBox cbCategoria) {
        String mysql = "UPDATE producto SET Nombres=?,PrecioVenta=?,PrecioCompra=?, "
                + "cantidad=?,IdCategoria=? WHERE IdProducto=?";
        try {
            if (cNombre.getText().isEmpty() && cPrecioC.getText().isEmpty() && cPrecioV.getText().isEmpty()
                    && cCantidad.getText().isEmpty() && cbCategoria.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setString(1, cNombre.getText());
            bdControlador.ps.setDouble(2, Double.parseDouble(cPrecioC.getText()));
            bdControlador.ps.setDouble(3, Double.parseDouble(cPrecioV.getText()));
            bdControlador.ps.setDouble(4, Double.parseDouble(cCantidad.getText()));
            bdControlador.ps.setInt(5, cbCategoria.getSelectedIndex());
            bdControlador.ps.setInt(6, Integer.parseInt(cIdE.getText()));

            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Modificar" + "\n" + e);
        }
    }

    // FIN -- MODIFICAR
    // INICIO -- ELIMINAR
    public void Eliminar(JTextField cIdE, JTextField cNombre, JTextField cPrecioC,
            JTextField cPrecioV, JTextField cCantidad, JComboBox cbCategoria) {
        String mysql = "DELETE FROM producto WHERE idproducto=?";

        try {
            if (cIdE.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Eliminar(mysql);
            bdControlador.ps.setInt(1, Integer.parseInt(cIdE.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Eliminó Correctamente");
            this.Vacio(cNombre, cPrecioC, cPrecioV, cCantidad, cbCategoria);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Eliminar" + "\n" + e);
        }

    }

    // FIN-- ELIMINAR
    //FIN-- PASAR DATOS A FORMULARIO
}












