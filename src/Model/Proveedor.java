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

/**
 *
 * @author Sergio Sánchez
 */

public class Proveedor implements Serializable{
    
    private String codigo;
    private String nombre;
    private String telefono;
    private String categoria;

    public Proveedor(String codigo, String nombre, String telefono, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String datos(){
        return codigo + ";"+ nombre + ";" + telefono + ";" + categoria;
    }    


    @Override
    public String toString() {
        return String.format(
                "%s * %s * %s * %s *",
                this.codigo,
                this.nombre,
                this.telefono,
                this.categoria
        );
    }
}
