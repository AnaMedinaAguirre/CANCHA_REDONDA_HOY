package Vista;

import Controlador.C_Ventas_Registrar;
import DAO.ConectarDB;
import Formato.Mensajes;
import Modelo.M_Ventas_Registrar;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class V_Ventas_Registrar extends javax.swing.JInternalFrame {
    ConectarDB cc = new ConectarDB();
    Connection con = cc.conexion;
    private DefaultTableModel tableTransaccion_R; 
    private M_Ventas_Registrar modeloVentas;
    private C_Ventas_Registrar controlVentas;
    
    public V_Ventas_Registrar(M_Ventas_Registrar modeloVentas, C_Ventas_Registrar controlVentas) {
    this.modeloVentas = modeloVentas;
    this.controlVentas = controlVentas;
}
public void setVistaVentas(C_Ventas_Registrar controlVentas) {
    this.controlVentas = controlVentas;
}
public void setModeloVentas(M_Ventas_Registrar modeloVentas) {
    this.modeloVentas = modeloVentas;
}

    public V_Ventas_Registrar()  {
        initComponents();
        tableTransaccion_R = new DefaultTableModel();
        tableTransaccion_R.addColumn("ID");
        tableTransaccion_R.addColumn("Fecha");
        tableTransaccion_R.addColumn("Producto");
        tableTransaccion_R.addColumn("Cliente");
        tableTransaccion_R.addColumn("Cantidad");
        tableTransaccion_R.addColumn("Detalle");
        tableTransaccion_R.addColumn("Precio Unit");
        tableTransaccion_R.addColumn("Total");
        tblResumen_R_Venta.setModel(tableTransaccion_R);
        mostrarVenta();
    }

    public DefaultTableModel getTblResumen_R_Venta() {
        return tableTransaccion_R;
    }

    public JTextArea getDetalle() {
        return txaDetalle_R_Venta;
    }

    public JTextField getCantidad() {
        return txtCantidad_R_Venta;
    }

    public JTextField getClient() {
        return txtCliente_R_Venta;
    }

    public JTextField getID() {
        return txtIDVenta_R_Venta;
    }

    public JTextField getPrecU() {
        return txtPrecioU_R_Venta;
    }

    public JComboBox<String> getProcuto() {
        return cbxAreaEmpleado_G_Transaccion;
    }

    public String getFecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaString = sdf.format(datecFecha_R_Venta.getDate());
        return fechaString;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResumen_R_Venta = new javax.swing.JTable();
        btnEliminar_Venta = new javax.swing.JButton();
        btnActualizar_Venta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datecFecha_R_Venta = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCliente_R_Venta = new javax.swing.JTextField();
        txtIDVenta_R_Venta = new javax.swing.JTextField();
        cbxAreaEmpleado_G_Transaccion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDetalle_R_Venta = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCantidad_R_Venta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPrecioU_R_Venta = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPrecioTotal_Venta = new javax.swing.JTextField();
        btnRegistrar_Venta = new javax.swing.JButton();
        btnConsultar_Venta = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Gestionar Transacción");
        setPreferredSize(new java.awt.Dimension(1015, 630));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR VENTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 290, 43));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblResumen_R_Venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblResumen_R_Venta);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 210));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 850, 230));

        btnEliminar_Venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar_Venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete.png"))); // NOI18N
        btnEliminar_Venta.setText("ELIMINAR");
        jPanel1.add(btnEliminar_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 160, 50));

        btnActualizar_Venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar_Venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/update.png"))); // NOI18N
        btnActualizar_Venta.setText("ACTUALIZAR");
        jPanel1.add(btnActualizar_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, 50));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("CLIENTE:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("DETALLE ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("CANTIDAD");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("ID VENTA:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel3.add(datecFecha_R_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 210, 40));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("VENTA");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("FECHA DE");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel3.add(txtCliente_R_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 190, 40));
        jPanel3.add(txtIDVenta_R_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 210, 40));

        cbxAreaEmpleado_G_Transaccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cbxAreaEmpleado_G_Transaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 210, 40));

        txaDetalle_R_Venta.setColumns(20);
        txaDetalle_R_Venta.setRows(5);
        jScrollPane1.setViewportView(txaDetalle_R_Venta);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 190, 80));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("VENTA");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("TOTAL");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));
        jPanel3.add(txtCantidad_R_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 190, 40));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("PRODUCTO");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel3.add(txtPrecioU_R_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 200, 40));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setText("P UNIT");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel3.add(txtPrecioTotal_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 200, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 670, 250));

        btnRegistrar_Venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar_Venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/register.png"))); // NOI18N
        btnRegistrar_Venta.setText("REGISTRAR");
        btnRegistrar_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_VentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 50));

        btnConsultar_Venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar_Venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/follow-up.png"))); // NOI18N
        btnConsultar_Venta.setText("CONSULTAR");
        btnConsultar_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar_VentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrar_VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_VentaActionPerformed
         registrarVenta();
    }//GEN-LAST:event_btnRegistrar_VentaActionPerformed

    private void btnConsultar_VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar_VentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultar_VentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar_Venta;
    public javax.swing.JButton btnConsultar_Venta;
    public javax.swing.JButton btnEliminar_Venta;
    public javax.swing.JButton btnRegistrar_Venta;
    public javax.swing.JComboBox<String> cbxAreaEmpleado_G_Transaccion;
    public com.toedter.calendar.JDateChooser datecFecha_R_Venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tblResumen_R_Venta;
    public javax.swing.JTextArea txaDetalle_R_Venta;
    public javax.swing.JTextField txtCantidad_R_Venta;
    public javax.swing.JTextField txtCliente_R_Venta;
    public javax.swing.JTextField txtIDVenta_R_Venta;
    public javax.swing.JTextField txtPrecioTotal_Venta;
    public javax.swing.JTextField txtPrecioU_R_Venta;
    // End of variables declaration//GEN-END:variables
public void registrarVenta(){
    int id = Integer.parseInt(getID().getText());
    String fechaString = getFecha();
    String producto = getProcuto().getSelectedItem().toString();
    String cliente = getClient().getText();
    int cantidad = Integer.parseInt(getCantidad().getText());
    String detalle = getDetalle().getText();
    double precU = Double.parseDouble(getPrecU().getText());
    double total = cantidad * precU; 
    Object[] data = new Object[]{id,fechaString, producto, cliente, cantidad, detalle, precU, total};getTblResumen_R_Venta().addRow(data); JOptionPane.showMessageDialog(this, "Transacción registrada correctamente");
    if (con != null){
    String SQL = "CALL SP_DAO_RegistrarVenta(?,?,?,?,?,?,?)";
    try {
        PreparedStatement obtener = con.prepareStatement(SQL);
        obtener.setString(1, getFecha());
        obtener.setString(2, producto);
        obtener.setString(3, detalle);
        obtener.setString(4, cliente);
        obtener.setInt(5, cantidad);
        obtener.setFloat(6, (float) precU);
        obtener.setFloat(7, (float) total);
        obtener.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro exitoso");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error de registro: " + e.getMessage());
    }
}}
public void mostrarVenta() {
    try {
        DefaultTableModel modelo = (DefaultTableModel) tblResumen_R_Venta.getModel();

        if (con != null) {
            String SQL = "CALL SP_DAO_MostrarVentas()";
            PreparedStatement obtener = con.prepareStatement(SQL);
            ResultSet rs = obtener.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                String fechaString = rs.getString(2);
                String producto = rs.getString(3);
                String detalle = rs.getString(4);
                String cliente = rs.getString(5);
                int cantidad = rs.getInt(6);
                double precU = rs.getDouble(7);
                double total = rs.getDouble(8);

                Object[] data = {id, fechaString, producto, cliente, cantidad, detalle, precU, total};
                modelo.addRow(data);
            }

            //JOptionPane.showMessageDialog(null, "Transacciones mostradas correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error: No se pudo conectar a la base de datos");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al mostrar transacciones: " + e.getMessage());
    }
}

/*public void MostrarVentas(JTable tblResumen_R_Venta) {
    String[] titulos = {"id", "fechaString", "producto", "detalle", "cliente", "cantidad", "precU", "total"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos);
    tblResumen_R_Venta.setModel(modelo);
    
    try {
        PreparedStatement obtener = con.prepareStatement("CALL SP_DAO_MostrarVentas()");
        ResultSet rs = obtener.executeQuery();
        
        while (rs.next()) {
            Object[] data = {
                rs.getInt(1), // id
                rs.getString(2), // fechaString
                rs.getString(3), // producto
                rs.getString(4), // detalle
                rs.getString(5), // cliente
                rs.getInt(6), // cantidad
                rs.getDouble(7), // precU
                rs.getDouble(8) // total
            };
            modelo.addRow(data);
        }
        
        JOptionPane.showMessageDialog(null, "Transacciones mostradas correctamente");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al mostrar transacciones: " + e.getMessage());
    }
}*/
}

