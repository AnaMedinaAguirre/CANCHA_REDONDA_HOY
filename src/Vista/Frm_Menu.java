package Vista;
import Principal.Main;
import static Principal.Main.jifMenu;
import javax.swing.JInternalFrame;

public class Frm_Menu extends javax.swing.JFrame {
    private JInternalFrame currentFrame;

    public Frm_Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemNuevoEmpleado = new javax.swing.JMenuItem();
        MenuItemGestionarTransaccion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItemGestionarVenta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        MenuItemCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 630));

        jMenu1.setBackground(new java.awt.Color(204, 204, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TRANSACCIOON.png"))); // NOI18N
        jMenu1.setText("Transacción");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(210, 50));

        MenuItemNuevoEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuItemNuevoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/newEmployee.png"))); // NOI18N
        MenuItemNuevoEmpleado.setText("Nueva Transacción");
        MenuItemNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevoEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemNuevoEmpleado);

        MenuItemGestionarTransaccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuItemGestionarTransaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gestion.png"))); // NOI18N
        MenuItemGestionarTransaccion.setText("Gestionar Transacción");
        MenuItemGestionarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGestionarTransaccionActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemGestionarTransaccion);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(204, 204, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/export.png"))); // NOI18N
        jMenu2.setText("Inventario");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(210, 50));

        MenuItemGestionarVenta.setText("Registrar Venta");
        MenuItemGestionarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGestionarVentaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemGestionarVenta);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(204, 204, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf.png"))); // NOI18N
        jMenu3.setText("Reporte");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(210, 50));
        jMenuBar1.add(jMenu3);

        jMenu9.setBackground(new java.awt.Color(204, 204, 255));
        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tipoIncidencia.png"))); // NOI18N
        jMenu9.setText("Gestión");
        jMenu9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu9.setPreferredSize(new java.awt.Dimension(210, 50));
        jMenuBar1.add(jMenu9);

        jMenu10.setBackground(new java.awt.Color(204, 204, 255));
        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logout.png"))); // NOI18N
        jMenu10.setText("Cerrar Sesión");
        jMenu10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu10.setPreferredSize(new java.awt.Dimension(210, 50));

        MenuItemCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuItemCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logout2.png"))); // NOI18N
        MenuItemCerrar.setText("Cerrar Sesión");
        MenuItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCerrarActionPerformed(evt);
            }
        });
        jMenu10.add(MenuItemCerrar);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuItemCerrarActionPerformed

    private void MenuItemNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevoEmpleadoActionPerformed

    }//GEN-LAST:event_MenuItemNuevoEmpleadoActionPerformed

    private void MenuItemGestionarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGestionarTransaccionActionPerformed

    }//GEN-LAST:event_MenuItemGestionarTransaccionActionPerformed

    private void MenuItemGestionarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGestionarVentaActionPerformed
        Main.ifgv = new V_Ventas_Registrar();
        Escritorio.add(Main.ifgv);
        Main.ifgv.setVisible(true);
    }//GEN-LAST:event_MenuItemGestionarVentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem MenuItemCerrar;
    public javax.swing.JMenuItem MenuItemGestionarTransaccion;
    public javax.swing.JMenuItem MenuItemGestionarVenta;
    public javax.swing.JMenuItem MenuItemNuevoEmpleado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    public javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
