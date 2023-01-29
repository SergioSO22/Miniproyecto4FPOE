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

import Model.ListaDeClientes;
import Model.ListaDeProductos;
import Model.ListaDeProveedores;


public class MiniProyecto4 {

    public MiniProyecto4() {
        //--
    }
    
    public static void main(String[] args) {
        
        ListaDeProductos productos = new ListaDeProductos();
        GestionProductos gestion = new GestionProductos(productos);
        VentanaProductos model = new VentanaProductos(productos);
        ListaDeClientes listClientes = new ListaDeClientes();
        VentanaClientes clientes = new VentanaClientes(listClientes);
        ListaDeProveedores listPro = new ListaDeProveedores();
        VentanaProveedores proveedores = new VentanaProveedores(gestion, listPro);
        VentanaVentas ventas = new VentanaVentas(productos);
                
        VentanaPrincipal inicio = new VentanaPrincipal(model, clientes, proveedores, ventas );
        
        inicio.setVisible(true);
    }
    
}
