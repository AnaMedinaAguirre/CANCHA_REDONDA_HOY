package Modelo;

import java.util.Date;

public class Transacciones {
    
    private int idtransaccion;
    private Date fecha;
    private String tipo;
    private double monto;
    private String empleado;
    private String descripcion;
    private String indicador;
    
    public Transacciones(){}

    public int getIdtransaccion() {return idtransaccion;}
    public void setIdtransaccion(int idtransaccion) {this.idtransaccion = idtransaccion;}

    public Date getFecha() {return fecha;}
    public void setFecha(Date fecha) {this.fecha = fecha;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public double getMonto() {return monto;}
    public void setMonto(double monto) {this.monto = monto;}

    public String getEmpleado() {return empleado;}
    public void setEmpleado(String empleado) {this.empleado = empleado;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getIndicador() {return indicador;}
    public void setIndicador(String indicador) {this.indicador = indicador;}
    
    public Object[] RegistroTransaccion(int numeracion){
        Object[] fila = {numeracion, idtransaccion, fecha, tipo, monto, empleado, descripcion};
        return fila;
    }
    
}
