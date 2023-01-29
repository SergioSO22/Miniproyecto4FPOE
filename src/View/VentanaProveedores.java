/*
    @Proyecto: 
    MiniProyecto #4 - Supermercado Univalle
    @Author: 
    Wilson Andrés Mosquera.
    Sergio André Sanchez.
    @Profesor:
    Luis Yovany Romo Portilla
*/

package View;

import Control.Save;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Control.TxtProveedor;
import Model.Proveedor;
import Model.ListaDeProveedores;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Andres
 */

public class VentanaProveedores extends javax.swing.JFrame {

    private VentanaPrincipal root;
    private GestionProductos gestion;
    private ListaDeProveedores model;
    private Save save;
    


    public VentanaProveedores(GestionProductos gestion, ListaDeProveedores model ) {
        
        this.model = model;
        gestion.setRoot(this);
        this.gestion = gestion;
        
        initComponents();
        setTitle("Supermercado Univalle");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Gestión de imagenes
              
        ImageIcon banner = new ImageIcon(getClass().getResource("/Images/BannerUVA.png")) ;
        Icon iconBanner = new ImageIcon(banner.getImage().getScaledInstance(LabelBannerUV.getWidth(), LabelBannerUV.getHeight(), Image.SCALE_DEFAULT));
        LabelBannerUV.setIcon(iconBanner);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Ventana = new javax.swing.JPanel();
        TITULO = new javax.swing.JLabel();
        buttonAtras = new javax.swing.JButton();
        Labelnombre = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        LabelTelefono = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FieldTelefono = new javax.swing.JTextField();
        Labelid = new javax.swing.JLabel();
        FieldID = new javax.swing.JTextField();
        LabelTelefono1 = new javax.swing.JLabel();
        LabelBannerUV = new javax.swing.JLabel();
        BoxCategoria = new javax.swing.JComboBox<>();
        buttonGuardar = new javax.swing.JButton();
        buttonGuardar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ventana.setBackground(new java.awt.Color(255, 255, 255));
        Ventana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITULO.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        TITULO.setForeground(new java.awt.Color(0, 0, 0));
        TITULO.setText("AÑADIR PROVEEDORES");
        Ventana.add(TITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        buttonAtras.setBackground(new java.awt.Color(204, 255, 204));
        buttonAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAtras.setForeground(new java.awt.Color(0, 0, 0));
        buttonAtras.setText("ATRAS");
        buttonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtrasActionPerformed(evt);
            }
        });
        Ventana.add(buttonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 130, 50));

        Labelnombre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Labelnombre.setForeground(new java.awt.Color(0, 0, 0));
        Labelnombre.setText("NOMBRE:");
        Ventana.add(Labelnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        FieldNombre.setBackground(new java.awt.Color(102, 255, 204));
        FieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNombreActionPerformed(evt);
            }
        });
        FieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldNombreKeyTyped(evt);
            }
        });
        Ventana.add(FieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 200, -1));

        LabelTelefono.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelTelefono.setForeground(new java.awt.Color(0, 0, 0));
        LabelTelefono.setText("CATEGORIA:");
        Ventana.add(LabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraGA.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        Ventana.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -50, 410, 310));

        FieldTelefono.setBackground(new java.awt.Color(102, 255, 204));
        FieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTelefonoActionPerformed(evt);
            }
        });
        FieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldTelefonoKeyTyped(evt);
            }
        });
        Ventana.add(FieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 200, -1));

        Labelid.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Labelid.setForeground(new java.awt.Color(0, 0, 0));
        Labelid.setText("CÓDIGO:");
        Ventana.add(Labelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        FieldID.setBackground(new java.awt.Color(102, 255, 204));
        FieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldIDActionPerformed(evt);
            }
        });
        FieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldIDKeyTyped(evt);
            }
        });
        Ventana.add(FieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 200, -1));

        LabelTelefono1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelTelefono1.setForeground(new java.awt.Color(0, 0, 0));
        LabelTelefono1.setText("TELEFONO: ");
        Ventana.add(LabelTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        LabelBannerUV.setBackground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        LabelBannerUV.setForeground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBannerUV.setText(" ");
        Ventana.add(LabelBannerUV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 450, 200));

        BoxCategoria.setBackground(new java.awt.Color(102, 255, 204));
        BoxCategoria.setForeground(new java.awt.Color(0, 0, 0));
        BoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Comidas", "Ropa", "Aseo" }));
        Ventana.add(BoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 200, -1));

        buttonGuardar.setBackground(new java.awt.Color(204, 255, 204));
        buttonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        buttonGuardar.setText("GUARDAR");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });
        Ventana.add(buttonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 130, 50));

        buttonGuardar1.setBackground(new java.awt.Color(204, 255, 204));
        buttonGuardar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGuardar1.setForeground(new java.awt.Color(0, 0, 0));
        buttonGuardar1.setText("PRODUCTOS");
        buttonGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardar1ActionPerformed(evt);
            }
        });
        Ventana.add(buttonGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 130, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraGA.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        Ventana.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNombreActionPerformed
        //
    }//GEN-LAST:event_FieldNombreActionPerformed

    private void FieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldNombreKeyTyped
        //
        char dato = evt.getKeyChar();

        if (Character.isDigit(dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO TEXTO");
        }
    }//GEN-LAST:event_FieldNombreKeyTyped

    private void FieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTelefonoActionPerformed
        //
    }//GEN-LAST:event_FieldTelefonoActionPerformed

    private void FieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldTelefonoKeyTyped
        char dato = evt.getKeyChar();

        if (Character.isLetter(dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NÚMEROS");
        }
    }//GEN-LAST:event_FieldTelefonoKeyTyped

    private void FieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldIDActionPerformed
        // 
    }//GEN-LAST:event_FieldIDActionPerformed

    private void FieldIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldIDKeyTyped
        char dato = evt.getKeyChar();

        if (Character.isLetter(dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NÚMEROS");
        }
    }//GEN-LAST:event_FieldIDKeyTyped

    private void buttonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtrasActionPerformed
        this.root.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonAtrasActionPerformed

  
    public boolean userExist(String Id) {
        boolean user = false;
        try {
            FileReader fileReaderLeer = new FileReader("src/Persistencia/Proveedores.txt");
            BufferedReader write = new BufferedReader(fileReaderLeer);
            String place = "";
            
            while ((place = write.readLine()) != null) {
                if (place.indexOf(Id) != -1) {
                    user = true;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return user;
    }

    


    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        if (evt.getSource() == buttonGuardar){
        try{
            TxtProveedor  archivo = new TxtProveedor();
            archivo.inicializarTextoProveedor();
            
            String codigo = (FieldID.getText());
            String nombre = FieldNombre.getText();
            String telefono = (FieldTelefono.getText());
            String categoria = BoxCategoria.getSelectedItem().toString();
                

            if ("".equals(codigo)){
                JOptionPane.showMessageDialog(null,"DEBES LLENAR TODOS LOS CAMPOS");
            }else if ("".equals(nombre)){
                JOptionPane.showMessageDialog(null,"DEBES LLENAR TODOS LOS CAMPOS");
            }else if ("".equals(telefono)){
                JOptionPane.showMessageDialog(null,"DEBES LLENAR TODOS LOS CAMPOS");
            }else if ("".equals(categoria)){
                JOptionPane.showMessageDialog(null,"DEBES LLENAR TODOS LOS CAMPOS");
            }else if (userExist(FieldID.getText())){
                JOptionPane.showMessageDialog(rootPane, "ESTE NÚMERO DE CODIGO YA EXISTE");
            }else{
                Proveedor proveedor = new Proveedor(codigo, nombre, telefono, categoria);
                model.añadirProveedor(proveedor);
                archivo.escribirProveedor(proveedor);
                save.getProveedor().add(proveedor);
                JOptionPane.showMessageDialog(rootPane, "PROVEEDOR CREADO");
            }     
        } catch (NullPointerException ex){
               FieldID.setText("");
               FieldNombre.setText("");
               FieldTelefono.setText("");
        }
    }
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardar1ActionPerformed
        iniciarGestionProductos();
    }//GEN-LAST:event_buttonGuardar1ActionPerformed

    
    public void iniciarGestionProductos() {
        this.gestion.setVisible(true);
        this.setVisible(false);
    }

    public void setRoot(VentanaPrincipal root) {
        this.root = root;
    }
    
    public static void main(String args[]) {
       //--
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxCategoria;
    private javax.swing.JTextField FieldID;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldTelefono;
    private javax.swing.JLabel LabelBannerUV;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel LabelTelefono1;
    private javax.swing.JLabel Labelid;
    private javax.swing.JLabel Labelnombre;
    private javax.swing.JLabel TITULO;
    private javax.swing.JPanel Ventana;
    private javax.swing.JButton buttonAtras;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonGuardar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
