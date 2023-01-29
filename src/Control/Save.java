/*
    @Proyecto: 
    MiniProyecto #4 - Supermercado Univalle
    @Author: 
    Wilson Andrés Mosquera.
    Sergio André Sanchez.
    @Profesor:
    Luis Yovany Romo Portilla
*/

package Control;

import Model.Proveedor;
import Model.Cliente;
import java.util.ArrayList;


public class Save {

    private ArrayList<Proveedor> proveedor = new ArrayList();
    private ArrayList<Cliente> citas = new ArrayList();

    public Save() {
    }

    public ArrayList<Proveedor> getProveedor() {
        return this.proveedor;
    }

    public ArrayList<Cliente> getCitas() {
        return this.citas;
    }
}
