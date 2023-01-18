
package SupermercadoUV;

/**
 *
 * @author 
 */
public class MiniProyecto4 {

    public MiniProyecto4() {
        //--
    }

    
    public static void main(String[] args) {
        VentanaProductos productos = new VentanaProductos();
        VentanaClientes clientes = new VentanaClientes();
        VentanaProveedores proveedores = new VentanaProveedores();
        VentanaVentas ventas = new VentanaVentas();
                
        VentanaPrincipal inicio = new VentanaPrincipal(productos, clientes, proveedores, ventas );
        
        inicio.setVisible(true);
    }
    
}
