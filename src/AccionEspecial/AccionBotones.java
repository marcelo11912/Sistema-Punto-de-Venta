package AccionEspecial;


import PaginaPrincipal.Paneles.PanelProducto;
import PaginaPrincipal.Paneles.PanelVenta;
import PaginaPrincipal.Paneles.PanelCategoria;
import PaginaPrincipal.Paneles.PanelReporte;
import java.sql.SQLException;
import javax.swing.JPanel;

public class AccionBotones {

    public void botonCategoria(JPanel PanelCambio) {
        PanelCategoria panelCategoria = new PanelCategoria();
        panelCategoria.setVisible(true);
        panelCategoria.setSize(1000, 589);
        panelCategoria.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelCategoria);
        PanelCambio.revalidate();
        PanelCambio.repaint();

    }

    public void botonProducto(JPanel PanelCambio) {
        PanelProducto panelProducto = new PanelProducto();
        panelProducto.setVisible(true);
        panelProducto.setSize(1000, 589);
        panelProducto.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelProducto);
        PanelCambio.revalidate();
        PanelCambio.repaint();

    }

    public void botonVenta(JPanel PanelCambio) {
        PanelVenta panelVenta = new PanelVenta();
        panelVenta.setVisible(true);
        panelVenta.setSize(1000, 589);
        panelVenta.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelVenta);
        PanelCambio.revalidate();
        PanelCambio.repaint();
    }

    
    public void botonReporte(JPanel PanelCambio) {
        PanelReporte panelReporte = new PanelReporte();
        panelReporte.setVisible(true);
        panelReporte.setSize(1000, 589);
        panelReporte.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelReporte);
        PanelCambio.revalidate();
        PanelCambio.repaint();
    }

}





