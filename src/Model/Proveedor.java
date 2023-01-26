
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Sergio Sánchez
 */
public class Proveedor implements Serializable{
    
    private String nombre;
    private String categoria;
    private ArrayList<HashMap<String,String>> productos;

    public Proveedor(String nombre, String categoria, ArrayList<HashMap<String, String>> productos) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<HashMap<String, String>> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<HashMap<String, String>> productos) {
        this.productos = productos;
    }

    
    
}
