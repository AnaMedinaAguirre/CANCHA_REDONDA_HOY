package Controlador;

import Procesos.ProcesosFrmTransacciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formato.*;
import Modelo.Transacciones;
import Vista.InterFrameGestionarTransaccion;
import DAO.*;

public class ControladorFrmTransacciones implements ActionListener{
    
    InterFrameGestionarTransaccion vista;
    DAO_Transacciones crud; // c: create r:read  u:update   d=delete    
    Transacciones tran;
    
    public ControladorFrmTransacciones(InterFrameGestionarTransaccion if1){
        vista = if1;
        vista.btnRegistrar.addActionListener(this);
        ProcesosFrmTransacciones.Presentacion(if1);
        ActualizarForma();
        ProcesosFrmTransacciones.CargarCombos(if1);
    }//fin del constructor
    
    void ActualizarForma() {
        crud = new DAO_Transacciones();
        crud.MostrarTransacciones(vista.tblTransaccion, vista.jlblCantidadregistros);
        ProcesosFrmTransacciones.Estado1(vista);
        ProcesosFrmTransacciones.LimpiarEntradas(vista);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            tran = ProcesosFrmTransacciones.LeerDatos(vista);
            crud = new DAO_Transacciones();
            crud.InsertarTransaccion(tran);
            ActualizarForma();
        }
    }
    
}//fin del class
