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

public class ListaDeClientes {
    
    private ArrayList <Cliente> clientes;
    
    public ListaDeClientes(ArrayList <Cliente> clientes){
        this.clientes = clientes;
    }
    
    public ListaDeClientes(){
        this.clientes = new ArrayList<>();
    }
    
    public void crearLista(){
        setAfiliados((ArrayList<Cliente>) new ArrayList());
    }
    
    public void añadirCliente(Cliente clientes){
        getClientes().add(clientes);
    }

    public ArrayList <Cliente> getClientes() {
        return clientes;
    }

    public void setAfiliados(ArrayList <Cliente> clientes) {
        this.clientes = clientes;
    }
    
    @Override
    public String toString() {
        String datos = " ";
        for (int i = 0; i < clientes.size(); i++){
            datos+=clientes.get(i).toString()+("\r\n");
            
        }
        return "Clientes: " + clientes;
    }
}
