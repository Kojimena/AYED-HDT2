/**
 * Universidad del valle de Guatemala
 * @author Jimena Hernández
 * @version 19/02/2022
 * Algoritmos y estructuras de Datos HDT2
 * 
 * Controlador.java 
 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class Controlador {
    private static Vista vista = new Vista();
    private static File archivo;
    private static FileReader lectura;
    private static BufferedReader buffR;
    private static String line = "";

    public static void main(String[] args) {

        vista.mensaje("\nCalculadora de operaciones postfix");

        try {
            archivo= new File("datos.txt");
            lectura = new FileReader(archivo);
            buffR= new BufferedReader(lectura);
            line= buffR.readLine();
            vista.mensaje("\nArchivo leido...");
        } catch (Exception e) {
            //TODO: handle exception
            vista.mensaje("No hay ningún archivo");
        }  
    }
}
