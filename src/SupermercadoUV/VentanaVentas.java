package SupermercadoUV;

import java.awt.Color;
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
        
        ImageIcon gaseosa = new ImageIcon(getClass().getResource("/Images/Gaseosa.jpg")) ;
        Icon iconGaseosa = new ImageIcon(gaseosa.getImage().getScaledInstance(lGaseosa.getWidth(), lGaseosa.getHeight(), Image.SCALE_DEFAULT));
        lGaseosa.setIcon(iconGaseosa);
        
        ImageIcon cafe = new ImageIcon(getClass().getResource("/Images/Cafe.png")) ;
        Icon iconCafe = new ImageIcon(cafe.getImage().getScaledInstance(lCafe.getWidth(), lCafe.getHeight(), Image.SCALE_DEFAULT));
        lCafe.setIcon(iconCafe);
        
 
        
        
        
        
        //Desabilito que se puedan editar los campos.
        
        FieldPrecio.setEnabled(false);
        FieldIva.setEnabled(false);
        FieldProducto.setEnabled(false);
        FieldSubtotal.setEnabled(false);
        FieldTotal.setEnabled(false);
        FieldCantidad.getEditor().getComponent(0).setBackground(new java.awt.Color(204, 153, 255));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana = new javax.swing.JPanel();
        buttonAtras = new javax.swing.JButton();
        lCrema = new javax.swing.JLabel();
        imageAdd = new javax.swing.JLabel();
        lCafe = new javax.swing.JLabel();
        lCerveza = new javax.swing.JLabel();
        lManzana = new javax.swing.JLabel();
        lAlmuerzo = new javax.swing.JLabel();
        lPan = new javax.swing.JLabel();
        lShampoo = new javax.swing.JLabel();
        lJabon = new javax.swing.JLabel();
        LabelCop = new javax.swing.JLabel();
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
        lGaseosa = new javax.swing.JLabel();
        ImagenA = new javax.swing.JLabel();
        imagenM = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ventana.setBackground(new java.awt.Color(255, 255, 255));
        Ventana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAtras.setBackground(new java.awt.Color(153, 255, 204));
        buttonAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAtras.setForeground(new java.awt.Color(0, 0, 0));
        buttonAtras.setText("ATRAS");
        buttonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtrasActionPerformed(evt);
            }
        });
        Ventana.add(buttonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 100, 30));

        lCrema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ventana.add(lCrema, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 100, 120));
        Ventana.add(imageAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 100, 100));

        lCafe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ventana.add(lCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 100, 120));

        lCerveza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ventana.add(lCerveza, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 100, 120));

        lManzana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ventana.add(lManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 100, 120));

        lAlmuerzo.setText(" ");
        lAlmuerzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ventana.add(lAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 100, 120));

        lPan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ventana.add(lPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 100, 120));

        lShampoo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ventana.add(lShampoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 100, 120));

        lJabon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ventana.add(lJabon, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 100, 120));

        LabelCop.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelCop.setForeground(new java.awt.Color(0, 0, 0));
        LabelCop.setText("$ COP");
        Ventana.add(LabelCop, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 560, 90, 60));

        LabelProducto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelProducto.setForeground(new java.awt.Color(0, 0, 0));
        LabelProducto.setText("PRODUCTO:");
        Ventana.add(LabelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        LabelPrecio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelPrecio.setForeground(new java.awt.Color(0, 0, 0));
        LabelPrecio.setText("PRECIO:");
        Ventana.add(LabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        Ventana.add(FieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 200, -1));

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

        Ventana.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 280));

        LabelCantidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelCantidad.setForeground(new java.awt.Color(0, 0, 0));
        LabelCantidad.setText("CANTIDAD:");
        Ventana.add(LabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        LabelSubtotal.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        LabelSubtotal.setText("SUBTOTAL:");
        Ventana.add(LabelSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        LabelIva.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelIva.setForeground(new java.awt.Color(0, 0, 0));
        LabelIva.setText("IVA:");
        Ventana.add(LabelIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, -1, -1));

        FieldPrecio.setBackground(new java.awt.Color(204, 153, 255));
        FieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPrecioActionPerformed(evt);
            }
        });
        Ventana.add(FieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 200, -1));

        FieldTotal.setBackground(new java.awt.Color(204, 153, 255));
        FieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTotalActionPerformed(evt);
            }
        });
        Ventana.add(FieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 572, 210, 30));

        FieldProducto.setBackground(new java.awt.Color(204, 153, 255));
        FieldProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldProductoActionPerformed(evt);
            }
        });
        Ventana.add(FieldProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, -1));

        FieldSubtotal.setBackground(new java.awt.Color(204, 153, 255));
        FieldSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldSubtotalActionPerformed(evt);
            }
        });
        Ventana.add(FieldSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 200, -1));

        FieldIva.setBackground(new java.awt.Color(204, 153, 255));
        FieldIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldIvaActionPerformed(evt);
            }
        });
        Ventana.add(FieldIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 650, 200, -1));

        LabelBannerUV.setBackground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        LabelBannerUV.setForeground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBannerUV.setText(" ");
        Ventana.add(LabelBannerUV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 280, 150));

        LabelTotal1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 28)); // NOI18N
        LabelTotal1.setForeground(new java.awt.Color(0, 0, 0));
        LabelTotal1.setText("TOTAL:");
        Ventana.add(LabelTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 90, 60));

        lGaseosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cerveza.png"))); // NOI18N
        lGaseosa.setText(" ");
        lGaseosa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ventana.add(lGaseosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 70, 120));

        ImagenA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraPA.png"))); // NOI18N
        Ventana.add(ImagenA, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 190, 270));

        imagenM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraPM.png"))); // NOI18N
        Ventana.add(imagenM, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 360, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JLabel ImagenA;
    private javax.swing.JLabel LabelBannerUV;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelCop;
    private javax.swing.JLabel LabelIva;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JLabel LabelProducto;
    private javax.swing.JLabel LabelSubtotal;
    private javax.swing.JLabel LabelTotal1;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JPanel Ventana;
    private javax.swing.JButton buttonAtras;
    private javax.swing.JLabel imageAdd;
    private javax.swing.JLabel imagenM;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lAlmuerzo;
    private javax.swing.JLabel lCafe;
    private javax.swing.JLabel lCerveza;
    private javax.swing.JLabel lCrema;
    private javax.swing.JLabel lGaseosa;
    private javax.swing.JLabel lJabon;
    private javax.swing.JLabel lManzana;
    private javax.swing.JLabel lPan;
    private javax.swing.JLabel lShampoo;
    // End of variables declaration//GEN-END:variables
}
