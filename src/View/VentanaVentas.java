package View;

import Model.ListaDeProductos;
import Model.Producto;
import Model.Ventas;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres
 */

public class VentanaVentas extends javax.swing.JFrame implements ActionListener{

    private VentanaPrincipal root;
    public ListaDeProductos productos;
    public Producto products;
    public Ventas ventas;
    int precio = 0;
    int cantidad = 0;
    
    
    
    public VentanaVentas(ListaDeProductos productos) {
        this.productos = productos;
        initComponents();
        setTitle("Supermercado Univalle");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        DefaultTableModel model = new DefaultTableModel();
        ArrayList<Ventas> listaVentas = new ArrayList<Ventas>();
        
        
        //Gestión de imagenes

        ImageIcon banner = new ImageIcon(getClass().getResource("/Images/BannerUVM.png")) ;
        Icon iconBanner = new ImageIcon(banner.getImage().getScaledInstance(LabelBannerUV.getWidth(), LabelBannerUV.getHeight(), Image.SCALE_DEFAULT));
        LabelBannerUV.setIcon(iconBanner);
        
        ImageIcon add = new ImageIcon(getClass().getResource("/Images/Add.png")) ;
        Icon iconAdd = new ImageIcon(add.getImage().getScaledInstance(buttonAdd.getWidth(), buttonAdd.getHeight(), Image.SCALE_DEFAULT));
        buttonAdd.setIcon(iconAdd);
        
        ImageIcon gaseosa = new ImageIcon(getClass().getResource("/Images/Gaseosa.jpg")) ;
        Icon iconGaseosa = new ImageIcon(gaseosa.getImage().getScaledInstance(lGaseosa.getWidth(), lGaseosa.getHeight(), Image.SCALE_DEFAULT));
        lGaseosa.setIcon(iconGaseosa);
        
        ImageIcon cafe = new ImageIcon(getClass().getResource("/Images/Cafe.jpg")) ;
        Icon iconCafe = new ImageIcon(cafe.getImage().getScaledInstance(lCafe.getWidth(), lCafe.getHeight(), Image.SCALE_DEFAULT));
        lCafe.setIcon(iconCafe);
        
        ImageIcon cerveza = new ImageIcon(getClass().getResource("/Images/Cerveza.png")) ;
        Icon iconCerveza = new ImageIcon(cerveza.getImage().getScaledInstance(lCerveza.getWidth(), lCerveza.getHeight(), Image.SCALE_DEFAULT));
        lCerveza.setIcon(iconCerveza);
        
        ImageIcon manzana = new ImageIcon(getClass().getResource("/Images/Manzana.jpg")) ;
        Icon iconManzana = new ImageIcon(manzana.getImage().getScaledInstance(lManzana.getWidth(), lManzana.getHeight(), Image.SCALE_DEFAULT));
        lManzana.setIcon(iconManzana);
        
        ImageIcon almuerzo = new ImageIcon(getClass().getResource("/Images/Almuerzo.jpg")) ;
        Icon iconAlmuerzo = new ImageIcon(almuerzo.getImage().getScaledInstance(lAlmuerzo.getWidth(), lAlmuerzo.getHeight(), Image.SCALE_DEFAULT));
        lAlmuerzo.setIcon(iconAlmuerzo);
        
        ImageIcon pan = new ImageIcon(getClass().getResource("/Images/Pan.jpg")) ;
        Icon iconPan = new ImageIcon(pan.getImage().getScaledInstance(lPan.getWidth(), lPan.getHeight(), Image.SCALE_DEFAULT));
        lPan.setIcon(iconPan);
        
        ImageIcon jabon = new ImageIcon(getClass().getResource("/Images/Jabon.jpg")) ;
        Icon iconJabon = new ImageIcon(jabon.getImage().getScaledInstance(lJabon.getWidth(), lJabon.getHeight(), Image.SCALE_DEFAULT));
        lJabon.setIcon(iconJabon);
        
        ImageIcon crema = new ImageIcon(getClass().getResource("/Images/Crema.jpg")) ;
        Icon iconCrema = new ImageIcon(crema.getImage().getScaledInstance(lCrema.getWidth(), lCrema.getHeight(), Image.SCALE_DEFAULT));
        lCrema.setIcon(iconCrema);
        
        ImageIcon shampoo = new ImageIcon(getClass().getResource("/Images/Shampoo.jpg")) ;
        Icon iconShampoo = new ImageIcon(shampoo.getImage().getScaledInstance(lShampoo.getWidth(), lShampoo.getHeight(), Image.SCALE_DEFAULT));
        lShampoo.setIcon(iconShampoo);
        
        
        //Listeners
        
        lGaseosa.addActionListener(this);
        lCafe.addActionListener(this);
        lCerveza.addActionListener(this);
        lManzana.addActionListener(this);
        lAlmuerzo.addActionListener(this);
        lPan.addActionListener(this);
        lShampoo.addActionListener(this);
        lCrema.addActionListener(this);
        lJabon.addActionListener(this);

        
        //Desabilito que se puedan editar los campos.
        
        FieldPrecio.setEnabled(false);
        FieldIva.setEnabled(false);
        FieldProducto.setEnabled(false);
        FieldSubtotal.setEnabled(false);
        FieldTotal.setEnabled(false);
        FieldImporte.setEnabled(false);
        FieldCantidad.getEditor().getComponent(0).setBackground(new java.awt.Color(204, 153, 255));
        ((DefaultEditor)FieldCantidad.getEditor()).getTextField().setEditable(false);
               
        String producto = "vacio";
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana = new javax.swing.JPanel();
        buttonAtras = new javax.swing.JButton();
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
        ImagenA = new javax.swing.JLabel();
        lJabon = new javax.swing.JButton();
        imagenM = new javax.swing.JLabel();
        lCerveza = new javax.swing.JButton();
        lGaseosa = new javax.swing.JButton();
        lCafe = new javax.swing.JButton();
        lGaseosa3 = new javax.swing.JButton();
        lPan = new javax.swing.JButton();
        lAlmuerzo = new javax.swing.JButton();
        lManzana = new javax.swing.JButton();
        lCrema = new javax.swing.JButton();
        lShampoo = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        FieldImporte = new javax.swing.JTextField();
        LabelImporte = new javax.swing.JLabel();

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

        FieldCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        Ventana.add(FieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 200, -1));

        TablaProductos.setBackground(new java.awt.Color(204, 204, 255));
        TablaProductos.setForeground(new java.awt.Color(0, 0, 0));
        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaProductos.setGridColor(new java.awt.Color(102, 102, 102));
        TablaProductos.setSelectionBackground(new java.awt.Color(255, 204, 255));
        TablaProductos.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(TablaProductos);

        Ventana.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 260));

        LabelCantidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelCantidad.setForeground(new java.awt.Color(0, 0, 0));
        LabelCantidad.setText("CANTIDAD:");
        Ventana.add(LabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        LabelSubtotal.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        LabelSubtotal.setText("SUBTOTAL:");
        Ventana.add(LabelSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        LabelIva.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelIva.setForeground(new java.awt.Color(0, 0, 0));
        LabelIva.setText("IVA:");
        Ventana.add(LabelIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, -1, -1));

        FieldPrecio.setBackground(new java.awt.Color(204, 153, 255));
        FieldPrecio.setForeground(new java.awt.Color(0, 0, 0));
        FieldPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        FieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPrecioActionPerformed(evt);
            }
        });
        Ventana.add(FieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 200, -1));

        FieldTotal.setBackground(new java.awt.Color(204, 153, 255));
        FieldTotal.setForeground(new java.awt.Color(0, 0, 0));
        FieldTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        FieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTotalActionPerformed(evt);
            }
        });
        Ventana.add(FieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 572, 210, 30));

        FieldProducto.setBackground(new java.awt.Color(204, 153, 255));
        FieldProducto.setForeground(new java.awt.Color(0, 0, 0));
        FieldProducto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        FieldProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldProductoActionPerformed(evt);
            }
        });
        Ventana.add(FieldProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, -1));

        FieldSubtotal.setBackground(new java.awt.Color(204, 153, 255));
        FieldSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        FieldSubtotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        FieldSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldSubtotalActionPerformed(evt);
            }
        });
        Ventana.add(FieldSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 200, -1));

        FieldIva.setBackground(new java.awt.Color(204, 153, 255));
        FieldIva.setForeground(new java.awt.Color(0, 0, 0));
        FieldIva.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        FieldIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldIvaActionPerformed(evt);
            }
        });
        Ventana.add(FieldIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, 200, -1));

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

        ImagenA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraPA.png"))); // NOI18N
        Ventana.add(ImagenA, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 190, 270));

        lJabon.setBorder(null);
        lJabon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lJabonActionPerformed(evt);
            }
        });
        Ventana.add(lJabon, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 100, 120));

        imagenM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraPM.png"))); // NOI18N
        Ventana.add(imagenM, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 360, 280));

        lCerveza.setBackground(new java.awt.Color(255, 255, 255));
        lCerveza.setBorder(null);
        lCerveza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lCervezaActionPerformed(evt);
            }
        });
        Ventana.add(lCerveza, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 100, 120));

        lGaseosa.setBorder(null);
        lGaseosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lGaseosaActionPerformed(evt);
            }
        });
        Ventana.add(lGaseosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 70, 120));

        lCafe.setBorder(null);
        lCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lCafeActionPerformed(evt);
            }
        });
        Ventana.add(lCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 100, 120));

        lGaseosa3.setBorder(null);
        Ventana.add(lGaseosa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 100, 120));

        lPan.setBorder(null);
        lPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lPanActionPerformed(evt);
            }
        });
        Ventana.add(lPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 100, 120));

        lAlmuerzo.setBorder(null);
        lAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lAlmuerzoActionPerformed(evt);
            }
        });
        Ventana.add(lAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 100, 120));

        lManzana.setBorder(null);
        lManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lManzanaActionPerformed(evt);
            }
        });
        Ventana.add(lManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 100, 120));

        lCrema.setBorder(null);
        lCrema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lCremaActionPerformed(evt);
            }
        });
        Ventana.add(lCrema, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 100, 120));

        lShampoo.setBorder(null);
        lShampoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lShampooActionPerformed(evt);
            }
        });
        Ventana.add(lShampoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 100, 120));

        buttonAdd.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdd.setBorder(null);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        Ventana.add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 90, 100));

        FieldImporte.setBackground(new java.awt.Color(204, 153, 255));
        FieldImporte.setForeground(new java.awt.Color(0, 0, 0));
        FieldImporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        FieldImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldImporteActionPerformed(evt);
            }
        });
        Ventana.add(FieldImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 200, -1));

        LabelImporte.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelImporte.setForeground(new java.awt.Color(0, 0, 0));
        LabelImporte.setText("IMPORTE:");
        Ventana.add(LabelImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 20));

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
        
    }//GEN-LAST:event_FieldPrecioActionPerformed

    private void FieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTotalActionPerformed
        // 
    }//GEN-LAST:event_FieldTotalActionPerformed

    private void FieldProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldProductoActionPerformed
        // 
    }//GEN-LAST:event_FieldProductoActionPerformed

    private void FieldSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldSubtotalActionPerformed
        // 
    }//GEN-LAST:event_FieldSubtotalActionPerformed

    private void FieldIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldIvaActionPerformed
        // 
    }//GEN-LAST:event_FieldIvaActionPerformed

    private void lGaseosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lGaseosaActionPerformed
        //
    }//GEN-LAST:event_lGaseosaActionPerformed

    private void lCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lCafeActionPerformed
    }//GEN-LAST:event_lCafeActionPerformed

    private void lCervezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lCervezaActionPerformed
    }//GEN-LAST:event_lCervezaActionPerformed

    private void lManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lManzanaActionPerformed
    }//GEN-LAST:event_lManzanaActionPerformed

    private void lAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lAlmuerzoActionPerformed
    }//GEN-LAST:event_lAlmuerzoActionPerformed

    private void lPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lPanActionPerformed
    }//GEN-LAST:event_lPanActionPerformed

    private void lShampooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lShampooActionPerformed
    }//GEN-LAST:event_lShampooActionPerformed

    private void lCremaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lCremaActionPerformed
    }//GEN-LAST:event_lCremaActionPerformed

    private void lJabonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lJabonActionPerformed
    }//GEN-LAST:event_lJabonActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        Ventas venta = new Ventas();
        CalcularPrecio();
        int precio = Integer.parseInt(FieldPrecio.getText());
        int cantidad = Integer.parseInt(FieldCantidad.getValue().toString());
        venta.setNombre(FieldProducto.getText());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        //venta.set
    }//GEN-LAST:event_buttonAddActionPerformed

    private void FieldImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldImporteActionPerformed

    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == lGaseosa){
            FieldProducto.setText("Gaseosa");
            añadirPrecio(productos.getProductos().get(0)); 
        } else if(evento.getSource() == lCafe){
            FieldProducto.setText("Cafe");
            añadirPrecio(productos.getProductos().get(1)); 
        } else if(evento.getSource() == lCerveza){
            FieldProducto.setText("Cerveza");
            añadirPrecio(productos.getProductos().get(2));
        } else if(evento.getSource() == lManzana){
            FieldProducto.setText("Manzana");
            añadirPrecio(productos.getProductos().get(3));
        } else if(evento.getSource() == lAlmuerzo){
            FieldProducto.setText("Almuerzo");
            añadirPrecio(productos.getProductos().get(4));
        } else if(evento.getSource() == lPan){
            FieldProducto.setText("Pan");
            añadirPrecio(productos.getProductos().get(5));
        } else if(evento.getSource() == lShampoo){
            FieldProducto.setText("Shampoo");
            añadirPrecio(productos.getProductos().get(6));
        } else if(evento.getSource() == lCrema){
            FieldProducto.setText("Crema");
            añadirPrecio(productos.getProductos().get(07));
        } else if(evento.getSource() == lJabon){
            FieldProducto.setText("Jabon");
            añadirPrecio(productos.getProductos().get(8));
        } else {
           FieldProducto.setText(""); 
        } 
    }

    public void añadirPrecio(Producto products){
        String textoField = FieldProducto.getText();
        if (textoField.equals(products.getNombre())){
            FieldPrecio.setText(String.valueOf(products.getPrecio()));
        }
    }
    
    public void CalcularPrecio(){
        precio = Integer.parseInt(FieldPrecio.getText());
        cantidad = Integer.parseInt(FieldCantidad.getValue().toString());
        int importe = (precio*cantidad);
        FieldImporte.setText(String.valueOf(importe));
        System.out.println(precio);
        System.out.println(cantidad);        
        
    }
    
    public void setRoot(VentanaPrincipal root) {
        this.root = root;
    }
    
    public static void main(String args[]) {
      //--
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner FieldCantidad;
    private javax.swing.JTextField FieldImporte;
    private javax.swing.JTextField FieldIva;
    private javax.swing.JTextField FieldPrecio;
    private javax.swing.JTextField FieldProducto;
    private javax.swing.JTextField FieldSubtotal;
    private javax.swing.JTextField FieldTotal;
    private javax.swing.JLabel ImagenA;
    private javax.swing.JLabel LabelBannerUV;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelCop;
    private javax.swing.JLabel LabelImporte;
    private javax.swing.JLabel LabelIva;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JLabel LabelProducto;
    private javax.swing.JLabel LabelSubtotal;
    private javax.swing.JLabel LabelTotal1;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JPanel Ventana;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAtras;
    private javax.swing.JLabel imagenM;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lAlmuerzo;
    private javax.swing.JButton lCafe;
    private javax.swing.JButton lCerveza;
    private javax.swing.JButton lCrema;
    private javax.swing.JButton lGaseosa;
    private javax.swing.JButton lGaseosa3;
    private javax.swing.JButton lJabon;
    private javax.swing.JButton lManzana;
    private javax.swing.JButton lPan;
    private javax.swing.JButton lShampoo;
    // End of variables declaration//GEN-END:variables
}
