
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Sergio Sánchez
 */
public class Venta {
    
    private String nombre;
    ///private String id;
    private final ArrayList<HashMap<String,String>> carrito;
    private int total;
    
    
    
    public Venta(String nombre, /*String id,*/ ArrayList<HashMap<String, String>> carrito, int total) {
        this.nombre = nombre;
        //this.id = id;
        this.carrito = carrito;
        this.total = total;
    }
     public String getNombre() {
        return nombre;
    }
/*
    public String getId() {
        return id;
    }*/

    public ArrayList<HashMap<String, String>> getCarrito() {
        return carrito;
    }

    public int getTotal() {
        return total;
    }
    
    
}
