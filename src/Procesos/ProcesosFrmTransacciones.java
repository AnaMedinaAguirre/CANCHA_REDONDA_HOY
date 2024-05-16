package Procesos;

//librerias
import Modelo.Transacciones;
import Vista.InterFrameGestionarTransaccion;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class ProcesosFrmTransacciones {
    
    public static Calendar cal = new GregorianCalendar();
    
    public static void Presentacion(InterFrameGestionarTransaccion if1) {
        if1.setTitle("Mantenimiento de Transacciones");
        if1.txtIDTransaccion.setEnabled(false);
        if1.datecFechaTransaccion.setCalendar(cal);
        if1.setVisible(true);
    }

    public static void Estado1(InterFrameGestionarTransaccion if1) {
        if1.btnRegistrar.setEnabled(true);
        if1.btnConsultar.setEnabled(true);
        if1.btnActualizar.setEnabled(false);
        if1.btnEliminar.setEnabled(false);
    }

    public static void Estado2(InterFrameGestionarTransaccion if1) {
        if1.btnRegistrar.setEnabled(false);
        if1.btnConsultar.setEnabled(true);
        if1.btnActualizar.setEnabled(true);
        if1.btnEliminar.setEnabled(true);
    }

    public static void LimpiarEntradas(InterFrameGestionarTransaccion if1) {
        if1.txtIDTransaccion.setText("");
        if1.datecFechaTransaccion.setCalendar(cal);
        if1.cbxTipo.setSelectedIndex(0);
        if1.txtMonto.setText("");
        if1.txtEmpleado.setText("");
        if1.txaDescripcion.setText("");
        if1.datecFechaTransaccion.requestFocus();
    }

    //metodo que la categoria
    public static Transacciones LeerDatos(InterFrameGestionarTransaccion if1) {
        Transacciones tran = new Transacciones();
        tran.setFecha(if1.datecFechaTransaccion.getDate());
        tran.setTipo(if1.cbxTipo.getSelectedItem().toString());
        tran.setMonto(Double.parseDouble(if1.txtMonto.getText()));
        tran.setEmpleado(if1.txtEmpleado.getText());
        tran.setDescripcion(if1.txaDescripcion.getText());
        return tran;
    }
    
    public static void CargarCombos(InterFrameGestionarTransaccion if1){
        if1.cbxTipo.addItem("Ingresos");
        if1.cbxTipo.addItem("Egresos");
    }
    
}//fin del class
