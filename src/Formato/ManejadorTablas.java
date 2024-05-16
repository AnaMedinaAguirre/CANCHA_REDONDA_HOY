
package Formato;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
public class ManejadorTablas {
    
    //Metodo que especifica un ancho de las columnas de tabla    
    public static void AnchoColumnas(JTable t, int numcolumna,int ancho) {
        TableColumn column;
        column = t.getColumnModel().getColumn(numcolumna);
        column.setPreferredWidth(ancho);       
    }
    
    //metodo que justifica los datos de una columna
   public static void JustificarCelda(JTable t,int numcolumna){
       DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
       modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
       t.getColumnModel().getColumn(numcolumna).setCellRenderer(modelocentrar);       
   }
   
   //metodo que da formato al JTable de la tabla Transacciones
   public static void FormatoTablaTransacciones(JTable tabla){
       AnchoColumnas(tabla,0,80);
       JustificarCelda(tabla,0);
       AnchoColumnas(tabla,1,80);
       JustificarCelda(tabla,1);
       AnchoColumnas(tabla,2,100);
       AnchoColumnas(tabla,3,250);  
       AnchoColumnas(tabla,4,500);  
       AnchoColumnas(tabla,5,250);  
       JustificarCelda(tabla,5);
   }
   
   
}