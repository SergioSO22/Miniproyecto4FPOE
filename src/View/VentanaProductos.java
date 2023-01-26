package View;

import Control.TablaProductos;
import Model.ListaDeProductos;
import Model.Producto;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres
 */


public class VentanaProductos extends javax.swing.JFrame {
    
    private VentanaPrincipal root;
    public ListaDeProductos productos;
    public Producto product;
    private TablaProductos model;
   
    public VentanaProductos(ListaDeProductos productos) {
        
        this.productos = productos;
        initComponents();
        setTitle("Supermercado Univalle");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        model = new TablaProductos(productos.getProductos());
        TableProductos.setModel(model);
        
        //Gestión de imagenes
        
        ImageIcon banner = new ImageIcon(getClass().getResource("/Images/BannerUVA.png")) ;
        Icon iconBanner = new ImageIcon(banner.getImage().getScaledInstance(LabelBannerUV.getWidth(), LabelBannerUV.getHeight(), Image.SCALE_DEFAULT));
        LabelBannerUV.setIcon(iconBanner);
        
 
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProductos = new javax.swing.JTable();
        buttonAtras = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LabelBannerUV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(153, 255, 204));

        TableProductos.setBackground(new java.awt.Color(153, 255, 204));
        TableProductos.setForeground(new java.awt.Color(0, 0, 0));
        TableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableProductos.setGridColor(new java.awt.Color(255, 153, 255));
        TableProductos.setSelectionBackground(new java.awt.Color(204, 255, 204));
        TableProductos.setSelectionForeground(new java.awt.Color(255, 102, 204));
        jScrollPane1.setViewportView(TableProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 170));

        buttonAtras.setBackground(new java.awt.Color(153, 255, 255));
        buttonAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAtras.setForeground(new java.awt.Color(0, 0, 0));
        buttonAtras.setText("ATRAS");
        buttonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 130, 50));

        buttonGuardar.setBackground(new java.awt.Color(153, 255, 255));
        buttonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        buttonGuardar.setText("GUARDAR");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraPA.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 380, -1));

        LabelBannerUV.setBackground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        LabelBannerUV.setForeground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBannerUV.setText(" ");
        jPanel1.add(LabelBannerUV, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 450, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtrasActionPerformed
        this.root.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonAtrasActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        //
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        Guardar();
    }//GEN-LAST:event_buttonGuardarActionPerformed

    public void Guardar(){
        int fila = TableProductos.getSelectedRow();
        
        String producto = TableProductos.getValueAt(fila, 0).toString();
        int precio = Integer.parseInt(this.TableProductos.getValueAt(fila, 1).toString());
        int cantidad = Integer.parseInt(this.TableProductos.getValueAt(fila, 2).toString());
        String categoria = TableProductos.getValueAt(fila, 3).toString();

        Producto p = new Producto(producto, precio,cantidad,categoria);
        System.out.println(p);
    }
    
    
    public static void main(String args[]) {
    }
    
    
    public void setRoot(VentanaPrincipal root) {
        this.root = root;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBannerUV;
    private javax.swing.JTable TableProductos;
    private javax.swing.JButton buttonAtras;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
