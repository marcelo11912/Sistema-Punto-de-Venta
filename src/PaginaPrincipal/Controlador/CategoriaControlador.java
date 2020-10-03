package PaginaPrincipal.Controlador;

import BaseDatos.BaseDatoControlador;
import Bean.Categoria;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class CategoriaControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();
    public ArrayList<Categoria> listaCategoria = new ArrayList<>();

    // INICIO -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    private int id() throws SQLException {
        String mysqlId = "SELECT MAX(idCategoria ) FROM categoria";
        return bdControlador.ConsultarIdMax(mysqlId);

    }
    // FIN -- ENCONTRAR EL MAXIMO ID DE UNA TABLA

    // INICIO -- METODOS PARA VALIDACIONES
    public void Vacio(JTextField cNombre) {
        cNombre.setText("");

    }

    private void Desbloquear(JTextField cNombre) {
        cNombre.setEditable(true);

    }

    private void Bloquear(JTextField cNombre) {
        cNombre.setEditable(false);
    }
    // FIN -- METODOS PARA VALIDACIONES

    // INICIO -- PASAR REGISTRO A LA TABLA
    public void DatosTabla() {
        ResultSet rs;
        String mysql = "SELECT * FROM categoria";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Categoria parroco = new Categoria();
                parroco.setIdCategoria(Integer.parseInt(rs.getString("IdCategoria")));
                parroco.setNombre(rs.getString("Nombres"));
                listaCategoria.add(parroco);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTabla(DefaultTableModel model, JTable tCategoria) {
        String[] titulos = {"ID", "CATEGORIA"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[2];
        for (int i = 0; i < listaCategoria.size(); i++) {
            fila[0] = listaCategoria.get(i).getIdCategoria() + "";
            fila[1] = listaCategoria.get(i).getNombre();
            model.addRow(fila);
        }
        TableColumnModel columnModel = tCategoria.getColumnModel();
        tCategoria.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tCategoria.doLayout();
        tCategoria.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(250);

    }

    public void PasarDatos(JTable tCategoria, JTextField cIdE, JTextField cNombre) {
        int rec = tCategoria.getSelectedRow();
        cIdE.setText((String) tCategoria.getValueAt(rec, 0));
        cNombre.setText((String) tCategoria.getValueAt(rec, 1));
    }
    // FIN -- PASAR REGISTRO A LA TABLA

    // INICIO -- REGISTRAR 
    public void RegistrarCategoria(JTextField cNombre) {
        String mysql = "INSERT INTO categoria (IdCategoria,Nombres)VALUES(?,?)";
        try {
            if (cNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, this.id());
            bdControlador.ps.setString(2, cNombre.getText());

            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");
            this.Vacio(cNombre);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    // FIN -- REGISTRAR 
    // INICIO -- MODIFICAR
    public void ModificarCategoria(JTextField cIdE, JTextField cNombre) {
        String mysql = "UPDATE categoria SET Nombres=? WHERE idCategoria=?";
        try {
            if (cNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setString(1, cNombre.getText());
            bdControlador.ps.setInt(2, Integer.parseInt(cIdE.getText()));

            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");
            this.Vacio(cNombre);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Modificar" + "\n" + e);
        }
    }

    // FIN -- MODIFICAR
    // INICIO -- ELIMINAR
    public void Eliminar(JTextField cIdE, JTextField cNombre) {
        String mysql = "DELETE FROM categoria WHERE idCategoria=?";

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
            this.Vacio(cNombre);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Eliminar" + "\n" + e);
        }

    }
    // FIN-- ELIMINAR
}


