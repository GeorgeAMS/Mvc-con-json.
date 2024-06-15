package vista;

import javax.swing.JFrame;
import modelo.mdCliente;

public class menuDeluxe extends javax.swing.JFrame {

    private mdCliente usuario;

    public menuDeluxe(mdCliente usuario) {
        initComponents();
        this.usuario = usuario;
        configurarMenuAdministrador();
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        menuItemCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirCatalogo(evt);
            }
        });
        menuItemPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirPerfilUsuario(evt);
            }
        });
    }

    private void configurarMenuAdministrador() {
        boolean esAdministrador = usuario.getNivelUsuario().equals("Nivel Administrador");
        menuAdministrador.setVisible(esAdministrador);
    }

    private void abrirCatalogo(java.awt.event.ActionEvent evt) {
        catalogoDeluxe catalogo = new catalogoDeluxe();
        catalogo.setVisible(true);
    }

    private void abrirPerfilUsuario(java.awt.event.ActionEvent evt) {
        mdCliente usuario = this.usuario; // Obtener el objeto mdCliente del usuario actual
        perfilUsuario perfilUsuarioVista = new perfilUsuario(usuario);
        perfilUsuarioVista.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProductos = new javax.swing.JMenu();
        menuItemCatalogo = new javax.swing.JMenuItem();
        menuItemWebcams = new javax.swing.JMenuItem();
        menuPerfil = new javax.swing.JMenu();
        menuItemPerfil = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        menuItemSalir = new javax.swing.JMenuItem();
        menuAdministrador = new javax.swing.JMenu();
        menuItemProveedor = new javax.swing.JMenuItem();
        menuItemInventario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deluxeFondo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(77, 77, 77)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuProductos.setText("Productos");

        menuItemCatalogo.setText("Catalogo");
        menuProductos.add(menuItemCatalogo);

        menuItemWebcams.setText("Webcams");
        menuProductos.add(menuItemWebcams);

        jMenuBar1.add(menuProductos);

        menuPerfil.setText("Perfil");

        menuItemPerfil.setText("Mi Perfil");
        menuPerfil.add(menuItemPerfil);

        jMenuBar1.add(menuPerfil);

        menuSalir.setText("Salir");

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuSalir.add(menuItemSalir);

        jMenuBar1.add(menuSalir);

        menuAdministrador.setText("Administrador");

        menuItemProveedor.setText("Proveedor");
        menuAdministrador.add(menuItemProveedor);

        menuItemInventario.setText("Inventario");
        menuAdministrador.add(menuItemInventario);

        jMenuBar1.add(menuAdministrador);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemSalirActionPerformed

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
            java.util.logging.Logger.getLogger(menuDeluxe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuDeluxe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuDeluxe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuDeluxe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAdministrador;
    private javax.swing.JMenuItem menuItemCatalogo;
    private javax.swing.JMenuItem menuItemInventario;
    private javax.swing.JMenuItem menuItemPerfil;
    private javax.swing.JMenuItem menuItemProveedor;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenuItem menuItemWebcams;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
