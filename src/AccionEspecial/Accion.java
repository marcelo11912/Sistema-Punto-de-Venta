/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccionEspecial;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author marce
 */
public class Accion {

    public void MostrarOcultar(JPasswordField Contrasena) {
        char i = '*';
        if (Contrasena.getEchoChar() == i) {
            Contrasena.setEchoChar((char) 0);
        } else {
            Contrasena.setEchoChar('*');
        }
    }

    public void Numeros(KeyEvent evt) {
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
        }
    }

    public void Letras(KeyEvent evt) {
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            evt.consume();
        }
    }
    public void Mayuscula(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cadena = ("" + c).toUpperCase();

            c = cadena.charAt(0);
            evt.setKeyChar(c);

        }
    }

    public void NumCaracteres(JTextField caja, KeyEvent evt, int limite) {

        {
            if (caja.getText().length() == limite) {
                evt.consume();
            }
        }
    }
     public void filtro(String consulta, JTable jtableBuscar) {
        DefaultTableModel dm;
        dm = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));

    }

    
}





