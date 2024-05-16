package DAO;

import Formato.*;
import Modelo.*;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class DAO_Transacciones extends ConectarDB{
    
    public DAO_Transacciones(){}
    
    //Método que muestra los datos de la tabla categorías en un JTable
    public void MostrarTransacciones(JTable tabla, JLabel etiqueta) {
        String[] titulos = {"Nro", "ID transaccion", "Fecha", "Tipo", "Monto", "Empleado", "Descripción"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        Transacciones tran = new Transacciones();
        int cantreg = 0;
        try {
            rs = st.executeQuery("CALL SP_DAO_MostrarTransacciones();");
            while (rs.next()) {
                cantreg++;
                tran.setIdtransaccion(rs.getInt(1));
                tran.setFecha(rs.getDate(2));
                tran.setTipo(rs.getString(3));
                tran.setMonto(rs.getDouble(4));
                tran.setEmpleado(rs.getString(5));
                tran.setDescripcion(rs.getString(6));
                modelo.addRow(tran.RegistroTransaccion(cantreg));
            }//fin while
            ManejadorTablas.FormatoTablaTransacciones(tabla);
            etiqueta.setText("Cantidad de Registros  : " + cantreg);
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se pueden mostrar las transacciones ...." + e);
        }
    }
    
    // método que inserta una categoria en tabla Categorias
    public void InsertarTransaccion(Transacciones tran) {
        try {
            //preparamos la consulta
            ps = conexion.prepareStatement("CALL SP_DAO_InsertarTransaccion(?,?,?,?,?);");
            //actualizando los parametros
            // Convertir java.util.Date a java.sql.Date
            java.util.Date fechaUtil = tran.getFecha();
            java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
            ps.setDate(1, fechaSql);
            ps.setString(2, tran.getTipo());
            ps.setDouble(3, tran.getMonto());
            ps.setString(4, tran.getEmpleado());
            ps.setString(5, tran.getDescripcion());
            ps.executeUpdate(); //actualizamos la consulta y ejecutamos
            Mensajes.M1("Datos insertados correctamente");
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede insertar la transaccion..." + e);
        }
    }
}
