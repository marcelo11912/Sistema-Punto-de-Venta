package BaseDatos;

import Conexion.Conexion;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JOptionPane;

public class BaseDatoControlador {

    Conexion conexionBD = new Conexion();
    public PreparedStatement ps;
          


    public void Registrar(String mysql) {

        Connection conexion = null;

        try {
            conexion = conexionBD.Conexion();
            ps = (PreparedStatement) conexion.prepareStatement(mysql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);

        }
    }
    
     public void Eliminar(String mysql) {

        Connection conexion = null;

        try {
            conexion = conexionBD.Conexion();
            ps = (PreparedStatement) conexion.prepareStatement(mysql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);

        }
    }

    public ResultSet Buscar(String mysql) {
        ResultSet rs = null;
        Statement st;
        Connection conexion = null;

        try {
            conexion = conexionBD.Conexion();
            st = conexion.createStatement();
            rs = st.executeQuery(mysql);
            
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }
        return rs;

    }

    public int ConsultarIdMax(String mysql) throws SQLException {
        PreparedStatement ps;
        ResultSet rs;
        Connection conexion;
        int id = 0;
        conexion = conexionBD.Conexion();
        ps = (PreparedStatement) conexion.prepareStatement(mysql);
        rs = ps.executeQuery();
        while (rs.next()) {
            id = rs.getInt(1);
        }

        if (id > 0) {

            return id + 1;
        } else {

            return 1;
        }

    }

    public void LlenarCombo(JComboBox cbTipoSangre, String mysql, String nombreRegistro) {
        PreparedStatement ps;
        ResultSet rs;
        Connection conexion = null;

        try {
            conexion = conexionBD.Conexion();
            ps = (PreparedStatement) conexion.prepareStatement(mysql);
            rs = ps.executeQuery();

            while (rs.next()) {
                cbTipoSangre.addItem(rs.getString(nombreRegistro));
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

}









