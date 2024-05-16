
package DAO;
import Controlador.C_Ventas_Registrar;
import Formato.*;
import Modelo.*;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class DAO_Venta extends ConectarDB{
    
public DAO_Venta(){}
public void MostrarVentas(JTable tblResumen_R_Venta) {
        String[] titulos = {"id","fechaString", "producto", "cliente", "cantidad", "detalle", "precU", "total"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tblResumen_R_Venta.setModel(modelo);
        M_Ventas_Registrar tran = new M_Ventas_Registrar();
        int cantreg = 0;
        try {
            rs = st.executeQuery("CALL SP_DAO_MostrarVentas()");
            while (rs.next()) {
                cantreg++;
                tran.setID_venta(rs.getInt(1));
                tran.setFecha_venta(rs.getDate(2));
                tran.setProducto_venta(rs.getString(3));
                tran.setDetalle_venta(rs.getString(4));
                tran.setCliente_venta(rs.getString(5));
                tran.setCantidad_venta(rs.getInt(6));
                tran.setPrecio_unitario(rs.getDouble(7));
                tran.setTotal_venta(rs.getDouble(8));
                modelo.addRow(tran.RegistroTransaccion(cantreg));
            }//fin while
            //ManejadorTablas.FormatoTablaTransacciones(tblResumen_R_Venta);
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se pueden mostrar las transacciones ...." + e);
        }
    }
    
    // método que inserta una categoria en tabla Categorias
    public void InsertarVenta(M_Ventas_Registrar tran) {
        try {
            //preparamos la consulta
            ps = conexion.prepareStatement("CALL SP_DAO_RegistrarVenta(?,?,?,?,?,?,?)");
            //actualizando los parametros
            // Convertir java.util.Date a java.sql.Date
            java.util.Date fechaUtil = tran.getFecha_venta();
            java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
            ps.setDate(1, fechaSql);
            ps.setString(2, tran.getProducto_venta());
            ps.setString(3, tran.getCliente_venta());
            ps.setInt(4, tran.getCantidad_venta());
            ps.setString(5, tran.getDetalle_venta());
            ps.setDouble(6, tran.getPrecio_unitario());
            ps.setDouble(7, tran.getTotal_venta());
            ps.executeUpdate(); //actualizamos la consulta y ejecutamos
            Mensajes.M1("Datos insertados correctamente");
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede insertar la transaccion..." + e);
        }
    }
    
}
