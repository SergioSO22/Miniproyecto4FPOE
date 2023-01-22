
package View;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Andres
 */


public class GestionProductos extends javax.swing.JFrame {

    private VentanaProveedores root;

    public GestionProductos() {
        initComponents();
        setTitle("Supermercado Univalle");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        //Gestion de Imagenes:
        ImageIcon banner = new ImageIcon(getClass().getResource("/Images/BannerUVM.png")) ;
        Icon iconBanner = new ImageIcon(banner.getImage().getScaledInstance(LabelBannerUV.getWidth(), LabelBannerUV.getHeight(), Image.SCALE_DEFAULT));
        LabelBannerUV.setIcon(iconBanner);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana = new javax.swing.JPanel();
        buttonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProductos = new javax.swing.JTable();
        buttonAtras = new javax.swing.JButton();
        LabelBannerUV = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ventana.setBackground(new java.awt.Color(255, 255, 255));
        Ventana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGuardar.setBackground(new java.awt.Color(204, 102, 255));
        buttonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        buttonGuardar.setText("GUARDAR");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });
        Ventana.add(buttonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 130, 50));

        jScrollPane1.setBackground(new java.awt.Color(153, 255, 204));

        TableProductos.setBackground(new java.awt.Color(255, 153, 204));
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

        Ventana.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 170));

        buttonAtras.setBackground(new java.awt.Color(204, 102, 255));
        buttonAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAtras.setForeground(new java.awt.Color(0, 0, 0));
        buttonAtras.setText("ATRAS");
        buttonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtrasActionPerformed(evt);
            }
        });
        Ventana.add(buttonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 130, 50));

        LabelBannerUV.setBackground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        LabelBannerUV.setForeground(new java.awt.Color(0, 0, 0));
        LabelBannerUV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBannerUV.setText(" ");
        Ventana.add(LabelBannerUV, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 450, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraPM.png"))); // NOI18N
        Ventana.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 460, 380, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FiguraPM.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        Ventana.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        //Guardar();
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtrasActionPerformed
        this.root.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonAtrasActionPerformed

    public void setRoot(VentanaProveedores root) {
        this.root = root;
    }
    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBannerUV;
    private javax.swing.JTable TableProductos;
    private javax.swing.JPanel Ventana;
    private javax.swing.JButton buttonAtras;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
