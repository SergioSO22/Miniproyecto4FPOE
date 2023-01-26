/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sergio Sánchez
 */
public class Archivo {
    
    public static void main(String[] args) throws IOException{
        
        FileWriter fichero = new FileWriter("C:/Users/LENOVO/Desktop/Miniproyecto4FPOE-Andres/Miniproyecto4FPOE-Andres/fichero.txt");
        for(int x = 0; x<10; x++){
            fichero.write("Fila numero " + x + "\n");
        }
        fichero.close();
        
    }
    
}
