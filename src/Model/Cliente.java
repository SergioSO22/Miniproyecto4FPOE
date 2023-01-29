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

public class Cliente implements Serializable{
    
    private String nombre;
    private String documento;
    private String tipoDocumento;
    private String direccion;
    private String correo;
    private String telefono;

    public Cliente(String nombre, String documento, String tipoDocumento, String telefono, String direccion, String correo ) {
        this.nombre = nombre;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String datos(){
        return nombre + ";" + tipoDocumento + ";" + documento + ";" + direccion + ";" + correo + ";" + telefono;
    }    


    @Override
    public String toString() {
        return String.format(
                "%s * %s * %s * %s * %s * %s *",
                this.nombre,
                this.tipoDocumento,
                this.documento,
                this.direccion,
                this.correo,
                this.telefono
        );
    }
}
