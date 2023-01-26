/*
    *Save.java

    @Proyecto: 
    MiniProyecto #3 - Univalle EPS
    @Author: 
    Wilson Andrés Mosquera Zapata 202182116-3743
    @Profesor:
    Luis Yovany Romo Portilla
*/

package Model;

//import Model.Citas;
//import View.Paciente;
import java.util.ArrayList;


public class Save {

    private ArrayList<Producto> producto = new ArrayList();
    //private ArrayList<Citas> citas = new ArrayList();

    public Save() {
    }

    public ArrayList<Producto> getPacientes() {
        return this.producto;
    }

    public ArrayList<Producto> getAfiliados() {
        return producto;
    }

    public void setAfiliados(ArrayList<Producto> producto) {
        this.producto = producto;
    }
    
}
/*
    public ArrayList<Citas> getCitas() {
        return this.citas;
    }
}
*/
