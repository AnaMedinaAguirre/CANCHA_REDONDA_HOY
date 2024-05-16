
package Procesos;
import Modelo.M_Ventas_Registrar;
import Vista.V_Ventas_Registrar;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ProcesosFrmVentas {
    public static Calendar cal = new GregorianCalendar();
    
        public static M_Ventas_Registrar LeerDatos(V_Ventas_Registrar if1) {
        M_Ventas_Registrar tran = new M_Ventas_Registrar();
        tran.setFecha_venta(if1.datecFecha_R_Venta.getDate());
        tran.setProducto_venta(if1.cbxAreaEmpleado_G_Transaccion.getSelectedItem().toString());
        tran.setCliente_venta(if1.txtCliente_R_Venta.getText());
        tran.setCantidad_venta(Integer.parseInt(if1.txtCantidad_R_Venta.getText()));
        tran.setDetalle_venta(if1.txaDetalle_R_Venta.getText());
        tran.setPrecio_unitario(Double.parseDouble(if1.txtPrecioU_R_Venta.getText()));
        tran.setTotal_venta(Double.parseDouble(if1.txtPrecioTotal_Venta.getText()));
        return tran;
    }
}
