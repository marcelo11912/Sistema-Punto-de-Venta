package Bean;

public class Temporal {

    public static String idComprobante;
    public static String NombreCliente;
    public static String cedula;
    public static String pago;
    public static String fecha;
    public static String total;

    public static String getCedula() {
        return cedula;
    }

    public static void setCedula(String cedula) {
        Temporal.cedula = cedula;
    }

    public static String getPago() {
        return pago;
    }

    public static void setPago(String pago) {
        Temporal.pago = pago;
    }

    public static String getIdComprobante() {
        return idComprobante;
    }

    public static void setIdComprobante(String idComprobante) {
        Temporal.idComprobante = idComprobante;
    }

    public static String getNombreCliente() {
        return NombreCliente;
    }

    public static void setNombreCliente(String NombreCliente) {
        Temporal.NombreCliente = NombreCliente;
    }

    

    public static String getFecha() {
        return fecha;
    }

    public static void setFecha(String fecha) {
        Temporal.fecha = fecha;
    }

    public static String getTotal() {
        return total;
    }

    public static void setTotal(String total) {
        Temporal.total = total;
    }

}



