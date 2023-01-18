package SupermercadoUV;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Andres
 */


public class VentanaClientes extends javax.swing.JFrame {
 
    private VentanaPrincipal root;
    
    public VentanaClientes() {
        initComponents();
        setTitle("upermercado Univalle");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ImageIcon banner = new ImageIcon(getClass().getResource("/Images/BannerUVM.png")) ;
        Icon iconBanner = new ImageIcon(banner.getImage().getScaledInstance(LabelBannerUV.getWidth(), LabelBannerUV.getHeight(), Image.SCALE_DEFAULT));
        LabelBannerUV.setIcon(iconBanner);      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana = new javax.swing.JPanel();
        LabelBannerUV = new javax.swing.JLabel();
        Labelnombre = new javax.swing.JLabel();
        TITULO = new javax.swing.JLabel();
        LabelApellido = new javax.swing.JLabel();
        LabelDocumento = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        LabelDireccion = new javax.swing.JLabel();
        LabelCorreo = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        FieldApellido = new javax.swing.JTextField();
        FieldTipoDocumento = new javax.swing.JComboBox<>();
        FieldDocumento = new javax.swing.JTextField();
        FieldTelefono = new javax.swing.JTextField();
        FieldDireccion = new javax.swing.JTextField();
        FieldCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buttonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ventana.setBackground(new java.awt.Color(255, 255, 255));
        Ventana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelBannerUV.setBackground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        LabelBannerUV.setForeground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBannerUV.setText(" ");
        Ventana.add(LabelBannerUV, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 450, 200));

        Labelnombre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Labelnombre.setForeground(new java.awt.Color(0, 0, 0));
        Labelnombre.setText("NOMBRES:");
        Ventana.add(Labelnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        TITULO.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        TITULO.setForeground(new java.awt.Color(0, 0, 0));
        TITULO.setText("LLENA LOS CAMPOS PARA ADICIONAR CLIENTE A LA BASE DE DATOS:");
        Ventana.add(TITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        LabelApellido.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelApellido.setForeground(new java.awt.Color(0, 0, 0));
        LabelApellido.setText("APELLIDOS:");
        Ventana.add(LabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        LabelDocumento.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelDocumento.setForeground(new java.awt.Color(0, 0, 0));
        LabelDocumento.setText("TIPO DE DOCUMENTO:");
        Ventana.add(LabelDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DOCUMENTO: ");
        Ventana.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        LabelTelefono.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelTelefono.setForeground(new java.awt.Color(0, 0, 0));
        LabelTelefono.setText("TELEFONO: ");
        Ventana.add(LabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        LabelDireccion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelDireccion.setForeground(new java.awt.Color(0, 0, 0));
        LabelDireccion.setText("DIRECCIÓN:");
        Ventana.add(LabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        LabelCorreo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        LabelCorreo.setForeground(new java.awt.Color(0, 0, 0));
        LabelCorreo.setText("CORREO:  ");
        Ventana.add(LabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, -1, -1));

        FieldNombre.setBackground(new java.awt.Color(204, 102, 255));
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
        Ventana.add(FieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 290, 200, -1));

        FieldApellido.setBackground(new java.awt.Color(204, 102, 255));
        FieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldApellidoActionPerformed(evt);
            }
        });
        FieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldApellidoKeyTyped(evt);
            }
        });
        Ventana.add(FieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 330, 200, -1));

        FieldTipoDocumento.setBackground(new java.awt.Color(204, 102, 255));
        FieldTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDULA DE CIUDADANIA", "TARJETA DE IDENTIDAD", "CEDULA DE EXTRANJERIA"}));
        FieldTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTipoDocumentoActionPerformed(evt);
            }
        });
        Ventana.add(FieldTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 370, 200, -1));

        FieldDocumento.setBackground(new java.awt.Color(204, 102, 255));
        FieldDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldDocumentoActionPerformed(evt);
            }
        });
        FieldDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldDocumentoKeyTyped(evt);
            }
        });
        Ventana.add(FieldDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 410, 200, -1));

        FieldTelefono.setBackground(new java.awt.Color(204, 102, 255));
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
        Ventana.add(FieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 450, 200, -1));

        FieldDireccion.setBackground(new java.awt.Color(204, 102, 255));
        FieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldDireccionActionPerformed(evt);
            }
        });
        Ventana.add(FieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 490, 200, -1));

        FieldCorreo.setBackground(new java.awt.Color(204, 102, 255));
        FieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCorreoActionPerformed(evt);
            }
        });
        Ventana.add(FieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 530, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraGM.png"))); // NOI18N
        Ventana.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 670, 290));

        buttonAtras.setBackground(new java.awt.Color(255, 153, 255));
        buttonAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAtras.setForeground(new java.awt.Color(0, 0, 0));
        buttonAtras.setText("ATRAS");
        buttonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtrasActionPerformed(evt);
            }
        });
        Ventana.add(buttonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCorreoActionPerformed
        //
    }//GEN-LAST:event_FieldCorreoActionPerformed

    private void FieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldDireccionActionPerformed
        //
    }//GEN-LAST:event_FieldDireccionActionPerformed

    private void FieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldTelefonoKeyTyped
        //
        char dato = evt.getKeyChar();

        if (Character.isLetter(dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NÚMEROS");
        }
    }//GEN-LAST:event_FieldTelefonoKeyTyped

    private void FieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTelefonoActionPerformed
        //
    }//GEN-LAST:event_FieldTelefonoActionPerformed

    private void FieldDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldDocumentoKeyTyped
        //
        char dato = evt.getKeyChar();

        if (Character.isLetter(dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NÚMEROS");
        }
    }//GEN-LAST:event_FieldDocumentoKeyTyped

    private void FieldDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldDocumentoActionPerformed
        //
    }//GEN-LAST:event_FieldDocumentoActionPerformed

    private void FieldTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTipoDocumentoActionPerformed
        //
    }//GEN-LAST:event_FieldTipoDocumentoActionPerformed

    private void FieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldApellidoKeyTyped
        //
        char dato = evt.getKeyChar();

        if (Character.isDigit(dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO TEXTO");
        }
    }//GEN-LAST:event_FieldApellidoKeyTyped

    private void FieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldApellidoActionPerformed
        //
    }//GEN-LAST:event_FieldApellidoActionPerformed

    private void FieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldNombreKeyTyped
        //
        char dato = evt.getKeyChar();

        if (Character.isDigit(dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO TEXTO");
        }
    }//GEN-LAST:event_FieldNombreKeyTyped

    private void FieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNombreActionPerformed
        //
    }//GEN-LAST:event_FieldNombreActionPerformed

    private void buttonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtrasActionPerformed
        this.root.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonAtrasActionPerformed

    public void setRoot(VentanaPrincipal root) {
        this.root = root;
    }
    
    public static void main(String args[]) {
        //--
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldApellido;
    private javax.swing.JTextField FieldCorreo;
    private javax.swing.JTextField FieldDireccion;
    private javax.swing.JTextField FieldDocumento;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldTelefono;
    private javax.swing.JComboBox<String> FieldTipoDocumento;
    private javax.swing.JLabel LabelApellido;
    private javax.swing.JLabel LabelBannerUV;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelDocumento;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel Labelnombre;
    private javax.swing.JLabel TITULO;
    private javax.swing.JPanel Ventana;
    private javax.swing.JButton buttonAtras;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
