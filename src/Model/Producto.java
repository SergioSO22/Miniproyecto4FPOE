/*
    @Proyecto: 
    MiniProyecto #4 - Supermercado Univalle
    @Author: 
    Wilson Andrés Mosquera.
    Sergio André Sanchez.
    @Profesor:
    Luis Yovany Romo Portilla
*/

package Model;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Sergio Sánchez
 */

public class Producto implements Serializable {
    
   private String nombre;
   private int precio = 0;
   private int cantidad = 0;
   private String categoria;
   private ArrayList<Producto> productos;
   
   
   public Producto(String nombre, int precio, int cantidad, String categoria){
       this.nombre = nombre;
       this.cantidad = cantidad;
       this.precio = precio;
       this.categoria = categoria;
   }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
         
   
   public boolean reducirCantidad(){
       if(cantidad>0){
           cantidad--;
           return true;
       }
       else{
           return false;
       }
   }
   
    @Override
    public String toString() {
        return String.format(
                "%s * %s * %s * %s *",
                this.nombre,
                this.cantidad,
                this.precio,
                this.categoria
        );
    }
    
}
