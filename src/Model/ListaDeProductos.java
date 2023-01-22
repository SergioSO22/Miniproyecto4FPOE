/*
    *ListaDeAfiliados.java

    @Proyecto: 
    MiniProyecto #3 - Univalle EPS
    @Author: 
    Wilson Andrés Mosquera Zapata 202182116-3743
    @Profesor:
    Luis Yovany Romo Portilla
*/

package Model;

import java.util.ArrayList;
import Model.Producto;
import java.awt.List;


public class ListaDeProductos {
    private ArrayList<Producto> productos;
    
    
     public ListaDeProductos() {
        
        productos = new ArrayList<>();
        
        productos.add(new Producto("Gaseosa", 5500, 20, "Bebidas"));
        productos.add(new Producto("Cafe", 2500, 20, "Bebidas"));
        productos.add(new Producto("Cerveza", 4000, 20, "Bebidas"));
        productos.add(new Producto("Manzana", 1500, 20, "Comida"));
        productos.add(new Producto("Almuerzo", 10000, 20, "Comida"));
        productos.add(new Producto("Pan", 3000, 20, "Comida"));
        productos.add(new Producto("Shampoo", 18000, 20, "Aseo"));
        productos.add(new Producto("Crema", 7400, 20, "Aseo"));
        productos.add(new Producto("Jabón", 3600, 20, "Aseo"));
    } 
     
    public ArrayList<Producto> getProductos() {
       return productos;
    }
}


