package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formato.*;
import Vista.*;
import DAO.*;
import Principal.Main;
import java.awt.Image;


public class ControladorLogin implements ActionListener{

    FrmLogin vista;
    
    public ControladorLogin(FrmLogin f1){
        vista = f1;
        vista.btnIniciarSesion.addActionListener(this);
        vista.setLocationRelativeTo(null);
        vista.setTitle("Login - La Redonda");
        vista.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnIniciarSesion) {
            Frm_Menu menu = new Frm_Menu();
            Main.controladorMenu = new ControladorMenu(menu); // Almacena el controlador del menú principal en Main
            menu.setVisible(true);
            vista.dispose();
        
    }
    }

    
}
