package SupermercadoUV;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Andres
 */


public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaProductos productos;
    private VentanaClientes clientes;
    private VentanaProveedores proveedores;
    private VentanaVentas ventas;
    
    
    public VentanaPrincipal(VentanaProductos productos, VentanaClientes clientes, VentanaProveedores proveedores, VentanaVentas ventas) {
        initComponents();
        setTitle("Supermercado Univalle");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        productos.setRoot(this);
        clientes.setRoot(this);
        /*proveedores.setRoot(this);
        ventas.setRoot(this);*/

        
        this.productos = productos;
        this.clientes = clientes;
        this.proveedores = proveedores;
        this.ventas = ventas;
       
        
        //Gestión de imagenes
              
        ImageIcon banner = new ImageIcon(getClass().getResource("/Images/BannerUVM.png")) ;
        Icon iconBanner = new ImageIcon(banner.getImage().getScaledInstance(LabelBannerUV.getWidth(), LabelBannerUV.getHeight(), Image.SCALE_DEFAULT));
        LabelBannerUV.setIcon(iconBanner);
        
        
        
        repaint();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana = new javax.swing.JPanel();
        buttonProductos = new javax.swing.JButton();
        buttonClientes = new javax.swing.JButton();
        buttonProveedores = new javax.swing.JButton();
        buttonVentas = new javax.swing.JButton();
        LabelBannerUV = new javax.swing.JLabel();
        labeImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ventana.setBackground(new java.awt.Color(255, 255, 255));
        Ventana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonProductos.setBackground(new java.awt.Color(255, 153, 255));
        buttonProductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonProductos.setForeground(new java.awt.Color(0, 0, 0));
        buttonProductos.setText("PRODUCTOS");
        buttonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProductosActionPerformed(evt);
            }
        });
        Ventana.add(buttonProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, 50));

        buttonClientes.setBackground(new java.awt.Color(255, 153, 255));
        buttonClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonClientes.setForeground(new java.awt.Color(0, 0, 0));
        buttonClientes.setText("CLIENTES");
        buttonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClientesActionPerformed(evt);
            }
        });
        Ventana.add(buttonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 160, 50));

        buttonProveedores.setBackground(new java.awt.Color(255, 153, 255));
        buttonProveedores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonProveedores.setForeground(new java.awt.Color(0, 0, 0));
        buttonProveedores.setText("PROVEEDORES");
        buttonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProveedoresActionPerformed(evt);
            }
        });
        Ventana.add(buttonProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 160, 50));

        buttonVentas.setBackground(new java.awt.Color(255, 153, 255));
        buttonVentas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonVentas.setForeground(new java.awt.Color(0, 0, 0));
        buttonVentas.setText("VENTAS");
        buttonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVentasActionPerformed(evt);
            }
        });
        Ventana.add(buttonVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 160, 50));

        LabelBannerUV.setBackground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        LabelBannerUV.setForeground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBannerUV.setText(" ");
        Ventana.add(LabelBannerUV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -10, 450, 200));

        labeImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraPM.png"))); // NOI18N
        Ventana.add(labeImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProductosActionPerformed
        IniciarProductos();
    }//GEN-LAST:event_buttonProductosActionPerformed

    private void buttonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClientesActionPerformed
        IniciarClientes();
    }//GEN-LAST:event_buttonClientesActionPerformed

    private void buttonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProveedoresActionPerformed
        IniciarProveedores();
    }//GEN-LAST:event_buttonProveedoresActionPerformed

    private void buttonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVentasActionPerformed
        IniciarVentas();
    }//GEN-LAST:event_buttonVentasActionPerformed

    
    public void IniciarProductos() {
        this.productos.setVisible(true);
        this.setVisible(false);
    }
    
    
    public void IniciarClientes() {
        this.clientes.setVisible(true);
        this.setVisible(false);
    }
    
    
    public void IniciarProveedores() {
        this.proveedores.setVisible(true);
        this.setVisible(false);
    }
    
    
    public void IniciarVentas() {
        this.ventas.setVisible(true);
        this.setVisible(false);
    }
    
  
    public static void main(String args[]) {
        //--
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBannerUV;
    private javax.swing.JPanel Ventana;
    private javax.swing.JButton buttonClientes;
    private javax.swing.JButton buttonProductos;
    private javax.swing.JButton buttonProveedores;
    private javax.swing.JButton buttonVentas;
    private javax.swing.JLabel labeImagen;
    // End of variables declaration//GEN-END:variables
}
