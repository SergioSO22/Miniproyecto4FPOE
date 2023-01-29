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

import java.util.ArrayList;

public class ListaDeProveedores {
    
    private ArrayList <Proveedor> proveedores;
    
    public ListaDeProveedores(ArrayList <Proveedor> proveedores){
        this.proveedores = proveedores;
    }
    
    public ListaDeProveedores(){
        this.proveedores = new ArrayList<>();
    }
    
    public void crearLista(){
        setAfiliados((ArrayList<Proveedor>) new ArrayList());
    }
    
    public void añadirProveedor(Proveedor proveedores){
        getProveedor().add(proveedores);
    }

    public ArrayList <Proveedor> getProveedor() {
        return proveedores;
    }

    public void setAfiliados(ArrayList <Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    
    @Override
    public String toString() {
        String datos = " ";
        for (int i = 0; i < proveedores.size(); i++){
            datos+=proveedores.get(i).toString()+("\r\n");
            
        }
        return "Proveedores: " + proveedores;
    }
}
