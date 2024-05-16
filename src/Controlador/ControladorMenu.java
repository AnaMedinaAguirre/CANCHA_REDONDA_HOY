package Controlador;

//librerias
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Formato.*;
import Principal.*;
import javax.swing.JFrame;

public class ControladorMenu implements ActionListener{

    Frm_Menu vista;
    
    public ControladorMenu(Frm_Menu fm){
        vista = fm;
        vista.MenuItemGestionarVenta.addActionListener(this);
        vista.MenuItemGestionarTransaccion.addActionListener(this);
        fm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fm.setDefaultCloseOperation(fm.EXIT_ON_CLOSE);
        fm.setVisible(true);
        fm.setTitle("Aplicación de Gestión de Inventario");  
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()== vista.MenuItemGestionarTransaccion){
          Main.ifgt = new InterFrameGestionarTransaccion();
          Main.controltran = new ControladorFrmTransacciones(Main.ifgt);          
          vista.Escritorio.add(Main.ifgt);          
          CentrarForma.CPanel(vista.Escritorio,Main.ifgt);
      }
      if(e.getSource()== vista.MenuItemGestionarVenta){
          Main.ifgv = new V_Ventas_Registrar();
          Main.controlven = new C_Ventas_Registrar(Main.ifgv);
          //Main.controlven = new C_Ventas_Registrar(Main.ifgv);          
          vista.Escritorio.add(Main.ifgv);          
          CentrarForma.CPanel(vista.Escritorio,Main.ifgv);
      }
    }
    
    
}
