
package Controlador;

import DAO.DAO_Venta;
import Modelo.M_Ventas_Registrar;
import Procesos.ProcesosFrmVentas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.V_Ventas_Registrar;
import java.util.Date;
import javax.swing.JOptionPane;

public class C_Ventas_Registrar implements ActionListener {

    V_Ventas_Registrar vista;  
    DAO_Venta crud;
    M_Ventas_Registrar tran;
    
public C_Ventas_Registrar(V_Ventas_Registrar if2){
        vista = if2;
        vista.btnRegistrar_Venta.addActionListener(this);
        ActualizarForma();
    }//fin del constructor


    void ActualizarForma() {
        crud = new DAO_Venta();
        crud.MostrarVentas(vista.tblResumen_R_Venta);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar_Venta) {
            tran = ProcesosFrmVentas.LeerDatos(vista);
            crud = new DAO_Venta();
            crud.InsertarVenta(tran);
        }
}
}
    
