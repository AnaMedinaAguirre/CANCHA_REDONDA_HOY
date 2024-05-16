
package Modelo;

import java.util.Date;

public class M_Ventas_Registrar {
    private int ID_venta;
    private Date Fecha_venta;
    private String producto_venta;
    private String cliente_venta;
    private int cantidad_venta;
    private String detalle_venta;
    private double precio_unitario;
    private double total_venta;

    
    public M_Ventas_Registrar(){}
    
    public double getTotal_venta(){
        return total_venta;
    }
    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }
    public double getPrecio_unitario() {
        return precio_unitario;
    }
    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }
    public int getID_venta() {
        return ID_venta;
    }
    public void setID_venta(int ID_venta) {
        this.ID_venta = ID_venta;
    }
    public String getProducto_venta() {
        return producto_venta;
    }
    public void setProducto_venta(String producto_venta) {
        this.producto_venta = producto_venta;
    }
    public String getCliente_venta() {
        return cliente_venta;
    }
    public void setCliente_venta(String cliente_venta) {
        this.cliente_venta = cliente_venta;
    }
    public int getCantidad_venta() {
        return cantidad_venta;
    }
    public void setCantidad_venta(int cantidad_venta) {
        this.cantidad_venta = cantidad_venta;
    }
    public String getDetalle_venta() {
        return detalle_venta;
    }
    public void setDetalle_venta(String detalle_venta) {
        this.detalle_venta = detalle_venta;
    }
    public Date getFecha_venta() {
        return Fecha_venta;
    }
    public void setFecha_venta(Date Fecha_venta) {
        this.Fecha_venta = Fecha_venta;
    }
        public Object[] RegistroTransaccion(int numeracion){
        Object[] fila = {numeracion, ID_venta, Fecha_venta, producto_venta, cliente_venta, cantidad_venta, detalle_venta, precio_unitario,total_venta};
        return fila;
    }
}
