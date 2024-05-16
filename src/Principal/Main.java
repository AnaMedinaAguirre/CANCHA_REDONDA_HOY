package Principal;

import Vista.*;
import Controlador.*;

public class Main {
    
    public static ControladorMenu controladorMenu;
    public static Frm_Menu jifMenu;
    
    public static InterFrameGestionarTransaccion ifgt;
    public static ControladorFrmTransacciones controltran;
    
    public static V_Ventas_Registrar ifgv;
    public static C_Ventas_Registrar controlven;
    
    public static void main(String[] args) {
        
        FrmLogin frmLogin = new FrmLogin();
        ControladorLogin controladorLogin = new ControladorLogin(frmLogin);
        frmLogin.setVisible(true);
        
        ifgv.setVisible(true);
        
    }
    
}
