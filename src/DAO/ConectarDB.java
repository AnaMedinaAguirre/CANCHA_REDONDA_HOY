package DAO;

import java.sql.*;
import Formato.*;

public class ConectarDB implements Parametros{
    
    public Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData mdata;
    
    public ConectarDB() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(RUTA, USUARIO, CLAVE);
            st = conexion.createStatement();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede conectar a la BD..." + ex);
        }
    }
}
