package SupermercadoUV;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Andres
 */

public class VentanaVentas extends javax.swing.JFrame {

    private VentanaPrincipal root;    
    
    public VentanaVentas() {
        initComponents();
        setTitle("Supermercado Univalle");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        
        
        //Gestión de imagenes

        ImageIcon banner = new ImageIcon(getClass().getResource("/Images/BannerUVM.png")) ;
        Icon iconBanner = new ImageIcon(banner.getImage().getScaledInstance(LabelBannerUV.getWidth(), LabelBannerUV.getHeight(), Image.SCALE_DEFAULT));
        LabelBannerUV.setIcon(iconBanner);
        
        ImageIcon add = new ImageIcon(getClass().getResource("/Images/Add.png")) ;
        Icon iconAdd = new ImageIcon(add.getImage().getScaledInstance(imageAdd.getWidth(), imageAdd.getHeight(), Image.SCALE_DEFAULT));
        imageAdd.setIcon(iconAdd);
        
        FieldPrecio.setEnabled(false);
        FieldIva.setEnabled(false);
        FieldProducto.setEnabled(false);
        FieldSubtotal.setEnabled(false);
        FieldTotal.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imageAdd = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LabelTotal = new javax.swing.JLabel();
        LabelProducto = new javax.swing.JLabel();
        LabelPrecio = new javax.swing.JLabel();
        FieldCantidad = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        LabelCantidad = new javax.swing.JLabel();
        LabelSubtotal = new javax.swing.JLabel();
        LabelIva = new javax.swing.JLabel();
        FieldPrecio = new javax.swing.JTextField();
        FieldTotal = new javax.swing.JTextField();
        FieldProducto = new javax.swing.JTextField();
        FieldSubtotal = new javax.swing.JTextField();
        FieldIva = new javax.swing.JTextField();
        LabelBannerUV = new javax.swing.JLabel();
        LabelTotal1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAtras.setBackground(new java.awt.Color(153, 255, 204));
        buttonAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAtras.setForeground(new java.awt.Color(0, 0, 0));
        buttonAtras.setText("ATRAS");
        buttonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 100, 30));

        jLabel1.setText("Producto ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 100, 120));
        jPanel1.add(imageAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 100, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gaseosa.png"))); // NOI18N
        jLabel4.setText("Producto ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 100, 120));

        jLabel5.setText("Producto ");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 100, 120));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Almuerzo.png"))); // NOI18N
        jLabel6.setText("Producto ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 100, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Manzana.png"))); // NOI18N
        jLabel7.setText("Producto ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 100, 120));

        jLabel8.setText("Producto ");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 100, 120));

        jLabel9.setText("Producto ");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 100, 120));

        jLabel10.setText("Producto ");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 100, 120));

        LabelTotal.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelTotal.setForeground(new java.awt.Color(0, 0, 0));
        LabelTotal.setText("$ COP");
        jPanel1.add(LabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 560, 90, 60));

        LabelProducto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelProducto.setForeground(new java.awt.Color(0, 0, 0));
        LabelProducto.setText("PRODUCTO:");
        jPanel1.add(LabelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        LabelPrecio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelPrecio.setForeground(new java.awt.Color(0, 0, 0));
        LabelPrecio.setText("PRECIO:");
        jPanel1.add(LabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        jPanel1.add(FieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 200, -1));

        TablaProductos.setBackground(new java.awt.Color(204, 204, 255));
        TablaProductos.setForeground(new java.awt.Color(0, 0, 0));
        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCTOS", "PRECIO C/U", "CANTIDAD", "SUBTOTAL"
            }
        ));
        TablaProductos.setGridColor(new java.awt.Color(102, 102, 102));
        TablaProductos.setSelectionBackground(new java.awt.Color(255, 204, 255));
        TablaProductos.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(TablaProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 280));

        LabelCantidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelCantidad.setForeground(new java.awt.Color(0, 0, 0));
        LabelCantidad.setText("CANTIDAD:");
        jPanel1.add(LabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        LabelSubtotal.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        LabelSubtotal.setText("SUBTOTAL:");
        jPanel1.add(LabelSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        LabelIva.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelIva.setForeground(new java.awt.Color(0, 0, 0));
        LabelIva.setText("IVA:");
        jPanel1.add(LabelIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, -1, -1));

        FieldPrecio.setBackground(new java.awt.Color(204, 153, 255));
        FieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(FieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 200, -1));

        FieldTotal.setBackground(new java.awt.Color(204, 153, 255));
        FieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTotalActionPerformed(evt);
            }
        });
        jPanel1.add(FieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 572, 210, 30));

        FieldProducto.setBackground(new java.awt.Color(204, 153, 255));
        FieldProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldProductoActionPerformed(evt);
            }
        });
        jPanel1.add(FieldProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, -1));

        FieldSubtotal.setBackground(new java.awt.Color(204, 153, 255));
        FieldSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldSubtotalActionPerformed(evt);
            }
        });
        jPanel1.add(FieldSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 200, -1));

        FieldIva.setBackground(new java.awt.Color(204, 153, 255));
        FieldIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldIvaActionPerformed(evt);
            }
        });
        jPanel1.add(FieldIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 650, 200, -1));

        LabelBannerUV.setBackground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        LabelBannerUV.setForeground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBannerUV.setText(" ");
        jPanel1.add(LabelBannerUV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 280, 150));

        LabelTotal1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 28)); // NOI18N
        LabelTotal1.setForeground(new java.awt.Color(0, 0, 0));
        LabelTotal1.setText("TOTAL:");
        jPanel1.add(LabelTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 90, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cafe.png"))); // NOI18N
        jLabel11.setText("Producto ");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 110, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraPA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 190, 270));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraPM.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 360, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtrasActionPerformed
        this.root.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonAtrasActionPerformed

    private void FieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPrecioActionPerformed

    private void FieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldTotalActionPerformed

    private void FieldProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldProductoActionPerformed

    private void FieldSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldSubtotalActionPerformed

    private void FieldIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldIvaActionPerformed

    public void setRoot(VentanaPrincipal root) {
        this.root = root;
    }
    
    public static void main(String args[]) {
      //--
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner FieldCantidad;
    private javax.swing.JTextField FieldIva;
    private javax.swing.JTextField FieldPrecio;
    private javax.swing.JTextField FieldProducto;
    private javax.swing.JTextField FieldSubtotal;
    private javax.swing.JTextField FieldTotal;
    private javax.swing.JLabel LabelBannerUV;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelIva;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JLabel LabelProducto;
    private javax.swing.JLabel LabelSubtotal;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JLabel LabelTotal1;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton buttonAtras;
    private javax.swing.JLabel imageAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
