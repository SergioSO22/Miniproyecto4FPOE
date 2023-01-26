
package View;

import Model.ListaDeProductos;

/**
 *
 * @author 
 */
public class MiniProyecto4 {

    public MiniProyecto4() {
        //--
    }

    
    public static void main(String[] args) {
        
        ListaDeProductos productos = new ListaDeProductos();
        GestionProductos gestion = new GestionProductos(productos);
        VentanaProductos model = new VentanaProductos(productos);
        VentanaClientes clientes = new VentanaClientes();
        VentanaProveedores proveedores = new VentanaProveedores(gestion);
        VentanaVentas ventas = new VentanaVentas(productos);
                
        VentanaPrincipal inicio = new VentanaPrincipal(model, clientes, proveedores, ventas );
        
        inicio.setVisible(true);
    }
    
}
