/**
 * Universidad del Valle de Guatemala
 * @author Jimena Hernández
 * @version 19/02/2022
 * Algoritmos y estructuras de Datos HDT2
 * 
 * Controlador.java 
 * main del programa
 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class Controlador {
    //implementación de la vista módelo Vista-Controlador
    private static Vista vista = new Vista(); 
    //propiedades para leer .txt
    private static File archivo; 
    private static FileReader lectura;
    private static BufferedReader buffR;
    private static String line = "";

    public static void main(String[] args) {

        vista.mensaje("\nCalculadora de operaciones postfix");
        Calculadora calculadora= new MyCalculadora();

        try {
            archivo= new File("/Users/jime/Desktop/HT 2 /HT-2/src/datos.txt"); //cambiar ruta del archivo
            lectura = new FileReader(archivo);
            buffR= new BufferedReader(lectura);
            line= buffR.readLine();
            vista.mensaje("\nLeyendo su archivo.....");
            vista.mensaje("\nSu resultado es: "+ calculadora.Calculo(line)+ "\n" );
            //Si no se encuentra el archivo se imprime un mensaje de error.
        } catch (Exception e) {
            vista.mensaje("\nNo se encontro archivo, asegurese de ingresar el nombre correctamente.");
        }  
    }
}
