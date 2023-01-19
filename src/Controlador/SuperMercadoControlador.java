
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ClasesModelo.Cliente;
import SupermercadoUV.VentanaClientes;
import SupermercadoUV.VentanaClientes;
import SupermercadoUV.VentanaPrincipal;
import SupermercadoUV.VentanaProveedores;
import SupermercadoUV.VentanaVentas;
import SupermercadoUV.VentanaProductos;
import SupermercadoUV.VentanaProductos;
import SupermercadoUV.VentanaProveedores;
import SupermercadoUV.MiniProyecto4;
import SupermercadoUV.VentanaVentas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ClasesModelo.Cliente;
import ClasesModelo.Venta;
import ClasesModelo.Producto;
import ClasesModelo.Proveedor;

/**
 *
 * @author Sergio Sánchez
 */
public class SuperMercadoControlador {
    
    //Modelos
    private MiniProyecto4 superMercado;
    
    //Ventanas
    VentanaPrincipal ventanaPrincipal;
    VentanaClientes ventanaClientes;
    VentanaProductos ventanaProductos;
    VentanaProveedores ventanaProveedores;
    VentanaVentas ventanaVentas;
    
    
    ArrayList<Venta> registroVentas = new ArrayList<>();
     ArrayList<Venta> registroCompras = new ArrayList<>();
     int numeroRegistro = 0;
     
     public SuperMercadoControlador(){
         
         superMercado = new MiniProyecto4();
         //ventanaPrincipal = new VentanaPrincipal();
         //ventanaPrincipal.agregarListenerButtons(new ManejadorDeEventosMenu());
     }
    
     class ManejadorDeEventos implements ActionListener{
         
         @Override
         @SuppressWarnings("deprecation")
         public void actionPerformed(ActionEvent e){
             if(e.getActionCommand().equalsIgnoreCase("clientes")){
                 ventanaPrincipal.dispose();
                 try{
                     ventanaClientes.show();
                 }
                 catch (NullPointerException npe){
                     ventanaClientes = new VentanaClientes();
                     ventanaClientes.agregarListenerBtns(new ManejadorDeEventosCliente());
                     
                 }
             }
             else if(e.getActionCommand().equalsIgnoreCase("productos")){
                 ventanaPrincipal.dispose();
                 if(ventanaProductos != null){
                     ventanaProductos.show();
                 }
                 else{
                     ventanaProductos = new VentanaProductos();
                    ventanaProductos.
                            agregarListenersBtns(new ManejadorDeEventosProductos());
                 }
                  ventanaProductos.setTablaProductos(superMercado.
                            getProductos());
             }
             else if(e.getActionCommand().equalsIgnoreCase("proveedores")){
                if(ventanaProveedores != null) {
                    ventanaProveedores.show();
                    
             }
                else{
                    ventanaProveedores = new VentanaProveedores();
                    ventanaProveedores.
                            agregarListenersBtns(new ManejadorDeEventosProveedores());
                }
                ventanaProveedores.setTablaProveedores(superMercado.
                        getProveedores());
             }
             else if(e.getActionCommand().equalsIgnoreCase("ventas")){
                if(ventanaVentas != null){
                    ventanaVentas.show();
                }
                else{
                    ventanaVentas = new VentanaVentas();
                    ventanaVentas.
                            agregarListenersBtns(
                                    new ManejadorDeEventosVentas());
                }
                ventanaVentas.setLblTitulo("Registro de Ventas");
                ventanaVentas.setDatos("", "");
                registroVentas = superMercado.getVentas();
                if(!superMercado.getVentas().isEmpty()){
                    ventanaVentas.cambiarRegistro(superMercado.
                            getVentas().get(numRegistro));
              
         }
                
    }
       else if(e.getActionCommand().equalsIgnoreCase("compras")){
                if(ventanaVentas != null){
                    ventanaVentas.show();
                }
                else{
                    ventanaVentas = new VentanaVentas();                
                    ventanaVentas.
                            agregarListenersBnts(
                                    new ManejadorDeEventosVentas());
                }else if(e.getActionCommand().equalsIgnoreCase("compras")){
                if(ventanaVentas != null){
                    ventanaVentas.show();
                }
                else{
                    ventanaVentas = new VentanaVentas();                
                    ventanaVentas.
                            agregarListenersBnts(
                                    new ManejadorDeEventosVentas());
                }
                        ventanaVentas.setLblTitulo("Registro de Compras");
                ventanaVentas.setDatos("", "");
                registroCompras = superMercado.getCompras();
                if(!superMercado.getCompras().isEmpty()){                  
                    ventanaVentas.cambiarRegistro(superMercado.
                            getCompras().get(numRegistro));
           }
                        ventanaPrincipal.dispose();
       }
    }
 }
}
                        
}
 class ManejadorDeEventosModificarCliente implements ActionListener {

        @Override
        @SuppressWarnings("deprecation")
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("aceptar")){
                int clienteAModificar = ventanaClientes.getFilaTablaClientes();
                if(ventanaModificarCliente.advertencia()){
                    //se modifca el cliente
                    superMercado.getClientes().get(clienteAModificar).setNombre(
                    ventanaModificarCliente.getTxtNombre());
                    superMercado.getClientes().get(clienteAModificar).setiD(
                    ventanaModificarCliente.getTxtCedula());

                    ventanaModificarCliente.dispose();
                    ventanaClientes.limpiarTablaClientes();
                    ventanaClientes.setTablaClientes(
                    superMercado.getClientes());
                    ventanaClientes.show();
                }
            }
            else if(e.getActionCommand().equalsIgnoreCase("cancelar")){
                ventanaModificarCliente.dispose();
                ventanaClientes.show();
            }
        }
        
    }
class ManejadorDeEventosNuevoCliente implements ActionListener {

        @Override
        @SuppressWarnings("deprecation")
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("aceptar")){
                if(ventanaNuevoCliente.advertencia()){
                    //se agrega al cliente
                    superMercado.
                            agregarCliente(ventanaNuevoCliente.getTxtNombre(), 
                                    ventanaNuevoCliente.getTxtCedula());

                    superMercado.setClienteSeleccionado(
                    superMercado.getClientes().size()-1);

                    //se abre la ventanaVentas
                    if(ventanaVentas != null){
                        ventanaVentas.show();
                    }
                    else{
                        ventanaVentas = new VentanaVentas();
                        ventanaVentas.
                                agregarListenersBtns(new ManejadorDeEventosVentas());
                    }
                    //se establcen los producto en la ventanVenta
                    ventanaVentas.setCboxProductos(superMercado.
                            getProductos());
                    
                }
            }
            else if(e.getActionCommand().equalsIgnoreCase("cancelar")){
                ventanaNuevoCliente.dispose();
            }
        }
        
         
     }
class ManejadorDeEventosVenta implements ActionListener {

        @Override
        @SuppressWarnings("deprecation")
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("agregar a venta")){
                
                //se obtiene el producto seleccionado
                String nombreProducto = ventanaVentas.getProductoElegido();
                
                if(!nombreProducto.equalsIgnoreCase("")){
                    int indiceProducto = superMercado.
                            getIndiceProducto(nombreProducto);
                    if(superMercado.getProductos().get(indiceProducto).
                            reducirUnaUnidad()){
                        //se agrega el producto al carrito del cliente
                        int cliente = superMercado.getClienteSeleccionado();

                        superMercado.getClientes().get(cliente).
                                agregarProductoAlCarrito(
                                        superMercado.getProductos().
                                                get(indiceProducto).getNombre(), 
                                        superMercado.getProductos().
                                                get(indiceProducto).getPrecio());

                        //Se actulizan las tablas y datos de la ventana
                        ventanaVentas.limpiarTablaCarrito();
                        ventanaVentas.setTablaCarrito(superMercado.
                                getClientes().get(cliente).getCarrito());
                        ventanaVentas.setTotal(superMercado.
                                getTotalCarritoCliente());
                    }
                    else{
                        ventanaVentas.mensaje("Producto sin existencias");
                    }
                }
            }
            else if(e.getActionCommand().equalsIgnoreCase("cancelar venta")){
                ventanaVentas.dispose();
                superMercado.cancelarVenta(ventanaVenta.getProductosInfo());
                ventanaVentas.setTotal(0);
                ventanaVentas.limpiarTablaCarrito();
                ventanaVentas.dispose();
                ventanaPrincipal.show();
            }
            else if(e.getActionCommand().equalsIgnoreCase("eliminar item seleccionado")){
                int itemSeleccionado = ventanaVentas.getFilaTblCarrito();
                if(itemSeleccionado != -1){
                    int cliente = superMercado.getClienteSeleccionado();
                    ArrayList<String> producto = ventanaVentas.
                            getProductoInfo(itemSeleccionado);
                    //se elimina el prodeucto del carrito
                    superMercado.getClientes().get(cliente).eliminarProducto(itemSeleccionado);
                    
                    //se reestablce 3el prducto
                    superMercado.restablecerProducto(producto);
                    
                    //Se actulizan las tablas y datos de la ventana
                    ventanaVentas.limpiarTablaCarrito();
                    ventanaVentas.setTablaCarrito(superMercado.
                            getClientes().get(cliente).getCarrito());
                    ventanaVentas.setTotal(superMercado.
                                getTotalCarritoCliente());
                }
            }
        else if(e.getActionCommand().equalsIgnoreCase("finalizar")){
                if(ventanaVentas.advertencia()){
                    Cliente cliente = superMercado.getClientes().
                        get(superMercado.getClienteSeleccionado());

                    ArrayList<HashMap<String,String>> carrito = cliente.getCarrito();
                    ArrayList<HashMap<String,String>> carritoCopia = new ArrayList<>();
                    //se copia el carrito
                    for(HashMap<String,String> p : carrito){
                        @SuppressWarnings("unchecked")
                        HashMap<String,String> pN = (HashMap<String,String>)p.clone();
                        carritoCopia.add(pN);
                    }

                    //se agrega la venta
                    superMercado.agregarVenta(new Ventas(
                            cliente.getNombre(), cliente.getiD(), 
                            carritoCopia, 
                            superMercado.getTotalCarritoCliente()));

                    //se vacia el crrito de lcliente
                    cliente.limpiarCarrito();

                    //Se cierrra la ventana
                    ventanaVentas.setTotal(0);
                    ventanaVentas.limpiarTablaCarrito();
                    ventanaVentas.dispose();
                    ventanaPrincipal.show();
                }
            }
            else if(e.getActionCommand().equalsIgnoreCase("comboBoxChanged")){
                ventanaVenta.setCboxProductos(
                superMercado.getProductos());
            }
            
class ManejadorDeEventosProductos implements ActionListener {

        @Override
        @SuppressWarnings("deprecation")
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("regresar")){
                ventanaProductos.limpiarTablaProductos();
                ventanaProductos.dispose();
                ventanaInicio.show();
            }
            else if(e.getActionCommand().equalsIgnoreCase("eliminar producto")){
                String productoSeleccionado = ventanaProductos.
                        getProductoSeleccionado();
                if("".equals(productoSeleccionado)){
                    ventanaProductos.mensajeSelecProducto();
                }
                else{
                    int productoAEliminar = superMercado.
                            getIndiceProducto(productoSeleccionado);
                    superMercado.getProductos().remove(productoAEliminar);
                    ventanaProductos.limpiarTablaProductos();
                    ventanaProductos.setTablaProductos(superMercado.
                            getProductos());
                }
            }
            else if(e.getActionCommand().equalsIgnoreCase("nuevo producto")){
                if(ventanaNuevoProducto != null){
                    ventanaNuevoProducto.show();
                }
                else{
                    ventanaNuevoProducto = new VentanaDatosProducto();
                    ventanaNuevoProducto.
                            agregarListenersBtns(
                                    new ManejadorDeEventosNuevoProducto());
                }
                ventanaProductos.dispose();
            }
            else if(e.getActionCommand().equalsIgnoreCase("modificar producto")){
                String productoSeleccionado = ventanaProductos.
                        getProductoSeleccionado();
                if("".equals(productoSeleccionado)){
                    ventanaProductos.mensajeSelecProducto();
                }
                else{
                    int productoAModificar = superMercado.
                            getIndiceProducto(productoSeleccionado);
                    if(ventanaModificarProducto != null){
                        ventanaModificarProducto.show();
                    }
                    else{
                        ventanaModificarProducto = new VentanaDatosProducto();
                        ventanaModificarProducto.
                                agregarListenersBtns(
                                        new ManejadorDeEventosModificarProducto());
                    }
                    ventanaModificarProducto.setTxtNombre(
                    superMercado.getProductos().get(productoAModificar).getNombre());
                    ventanaModificarProducto.setTxtPrecio(
                    superMercado.getProductos().get(productoAModificar).getPrecio()+"");
                    ventanaModificarProducto.setTxtCategoria(
                    superMercado.getProductos().get(productoAModificar).getCategoria());
                    ventanaProductos.dispose();
                }
            }
            else if(e.getActionCommand().equalsIgnoreCase("comboBoxChanged")){
                ventanaProductos.limpiarTablaProductos();
                ventanaProductos.setTablaProductos(superMercado.
                        getProductos());
            }
        }
        
    }
////////////////////////////VentanaModificarProducto///////////////////////
    class ManejadorDeEventosModificarProducto implements ActionListener {

        @Override
        @SuppressWarnings("deprecation")
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("aceptar")){
                if(ventanaModificarProducto.advertencia()){
                    //se modifica el producto
                    int producto = superMercado.getIndiceProducto(
                    ventanaProductos.getProductoSeleccionado());

                    superMercado.getProductos().set(producto,new Producto(
                            ventanaModificarProducto.getTxtNombre(), 
                            superMercado.getProductos().get(producto).getCantidad(),
                    Integer.parseInt(ventanaModificarProducto.getTxtPrecio()), 
                            ventanaModificarProducto.getTxtCategoria()));

                    //se cierra y abre ventanas
                    ventanaModificarProducto.dispose();
                    ventanaProductos.limpiarTablaProductos();
                    ventanaProductos.setTablaProductos(
                    superMercado.getProductos());
                    ventanaProductos.show();
                }
            }
            else if(e.getActionCommand().equalsIgnoreCase("cancelar")){
                ventanaModificarProducto.dispose();
                ventanaProductos.show();
            }
        }
        
    } 
   ///////////////////////// Ventana Proveedor /////////////////////////////
    class ManejadorDeEventosProveedores implements ActionListener{
        @Override
        @SuppressWarnings("deprecation")
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Comprar Producto")){
                int fila = ventanaProveedores.getFilaTabla();
                if(fila != -1){
                    if(ventanaCompra != null){
                        ventanaCompra.show();
                    }
                    else{
                        ventanaCompra = new VentanaCompra();
                        ventanaCompra.
                                agregarListenersBtns(
                                        new ManejadorDeEventosCompra());
                    }
                    Proveedor p = superMercado.getProveedor(fila);
                    String nombre = p.getNombre();
                    String categoria = p.getCategoria();
                    ArrayList<String> productos = new ArrayList<>();
                    for(HashMap<String,String> map : p.getProductos()){
                        for(Map.Entry<String, String> entry : map.entrySet()){
                            String nombreP = "";
                            if(entry.getKey().equalsIgnoreCase("Nombre")){
                                nombreP = entry.getValue();
                                productos.add(nombreP);
                            }
                        }    
                    }
                    ventanaCompra.mostrarProveedor(nombre, categoria, productos);
                    ventanaCompra.setLblTotal("0");
                    ventanaProveedores.dispose();
                }else{
                    ventanaProveedores.mensajesEmergentes("Comprar");
                }
            }
            else if(e.getActionCommand().equalsIgnoreCase("Nuevo Proveedor")){
                try {
                    ventanaDProveedor
                            .setTitulo("Nuevo Proveedor");
                    ventanaDProveedor
                            .show();
                    ventanaProveedores.dispose();
                }
                catch (NullPointerException npe){
                    ventanaProveedores.dispose();
                    ventanaDProveedor
                            = new VentanaDatosProveedor();
                    ventanaDProveedor
                            .
                            agregarListenersBtns(new ManejadorDeEventosNuevoProveedor());
                }
            }
            else if(e.getActionCommand().equalsIgnoreCase("Modificar Proveedor")){
                int fila = ventanaProveedores.getFilaTabla();
                if(fila != -1){
                    Proveedor p;
                    ventanaProveedores.dispose();
                     if(ventanaDProveedor
                             != null){
                        ventanaDProveedor
                                .show();
                    }
                    else{
                        ventanaDProveedor
                                = new VentanaProveedores();
                        ventanaDProveedor
                                .
                            agregarListenersBtns(new ManejadorDeEventosNuevoProveedor());
                    }
                    p = superMercado.getProveedor(fila);
                    ventanaDProveedor
                            .limpiarCampos();
                    ventanaDProveedor
                            .setTxtNombre(p.getNombre());
                    ventanaDProveedor
                            .setCbCategoria(p.getCategoria());
                    for(HashMap<String,String> map : p.getProductos()){
                        String nombre = "";
                        String precio = "";
                        for(Map.Entry<String, String> entry : map.entrySet()){
                            if(entry.getKey().equalsIgnoreCase("Nombre")){
                                nombre = entry.getValue();
                            }
                            else if(entry.getKey().equalsIgnoreCase("Precio")){
                                precio = entry.getValue();
                            }                                              
                        }
                        ventanaDProveedor
                                .aNadirTablaProductos(nombre, precio);
                    }
                    ventanaDProveedor
                            .setTitulo("Modificar Proveedor");
                    ventanaDProveedor
                            .show();
                }else{
                    ventanaProveedores.mensajesEmergentes("SelecModificar");
                }
            }
            else if(e.getActionCommand().equalsIgnoreCase("Eliminar Proveedor")){
                int fila = ventanaProveedores.getFilaTabla();
                if(fila != -1){
                    if(ventanaProveedores.mensajeEliminarProveedor() == 0){
                        superMercado.eliminarProveedor(fila);
                        ventanaProveedores.setTablaProveedores(superMercado.getProveedores());
                    }
                }else{
                    ventanaProveedores.mensajesEmergentes("SelectEliminar");
                }
            }
            else if(e.getActionCommand().equalsIgnoreCase("Regresar")){
                try {
                    ventanaProveedores.dispose();
                    ventanaInicio.show();
                }
                catch (NullPointerException npe){
                    ventanaProveedores.dispose();
                    ventanaPrincipal = new VentanaPrincipal();
                    ventanaPrincipal.
                            agregarListenersBtns(new ManejadorDeEventosProveedores());
                }
            }
        }
        
    }
         public void attachShutDownHook(){
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
              superMercado.guardarDatos();
            }
        } );
    }
}
