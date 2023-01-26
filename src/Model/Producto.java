
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
   
   //private String Productos[] = {"Gaseosa", "Cafe", "Cerveza", "Manzana", "Almuerzo", "Pan", "Shampoo", "Crema", "Jabón"};
   //private int Precio[] = {5500, 2500, 4000, 1500, 10000, 3000, 18000, 7400, 3600};
   
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
