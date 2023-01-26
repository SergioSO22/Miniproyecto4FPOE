
package Model;

/**
 *
 * @author Andres
 */

public class Ventas {
    String nombre;
    int precio;
    int cantidad;
    int importe;
  
    
    public Ventas() {
    }
    
    
    public double getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
