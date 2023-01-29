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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class TxtProveedor {

    File txt;
    
    public boolean userExist(String Documento) {
        boolean user = false;
        
        try {
            BufferedReader text = new BufferedReader( new FileReader(txt) );
            String posicion = "";

            while ((posicion = text.readLine()) != null) {
                if ( posicion.indexOf(Documento) != -1 ) {
                    user = true;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        
        return user;
    }

    
    public void inicializarTextoProveedor() {
        txt = new File("src/Persistencia/Proveedores.txt");
    }   

    public void escribirProveedor(Proveedor proveedor) {
        try {
            FileWriter text = new FileWriter(txt, true);
            text.write(proveedor.toString() + "\r\n" );
            text.close();
            
        } catch (IOException e) {
            System.out.println(e);

        }
    }

    
    public void MostrarTextoProveedor() {
        try {
            BufferedReader text = new BufferedReader(new FileReader(txt));
            text.readLine();
            text.close();
            
        } catch (IOException e) {
            System.out.println(e);

        }
    }  
}

