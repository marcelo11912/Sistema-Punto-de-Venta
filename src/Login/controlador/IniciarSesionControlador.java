package Login.controlador;

import Conexion.Conexion;
import Ingresar.Ventana.IniciarSesion;
import PaginaPrincipal.PaginaPrincipal;

import java.sql.*;
import javax.swing.*;

public class IniciarSesionControlador {

    Conexion conexionBD = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public void Ingresar(JTextField cUsuario, JPasswordField cContrasena, IniciarSesion ingresar) {
        String usuario = cUsuario.getText();
        String contrasena = cContrasena.getText();

        Connection coneccion = null;
        try {
            coneccion = conexionBD.Conexion();
            String mysql = "SELECT  * FROM usuario";
            ps = coneccion.prepareStatement(mysql);
            rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt(1);
                String usuarioBD = rs.getString(2);
                String contrasenaBD = rs.getString(3);
                

                if (usuarioBD.equalsIgnoreCase(usuario)) {
                    if (contrasenaBD.equalsIgnoreCase(contrasena)) {
                        PaginaPrincipal pg = new PaginaPrincipal();
                        pg.setVisible(true);
                        ingresar.dispose();
                        return;
                    }
                }

            }
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");

            coneccion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error. No existe conexión a la base de datos");
        }

    }

}




