/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package Ejercicios_Guía1;

import com.sun.media.sound.SoftJitterCorrector;
import java.util.Scanner;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author usuario
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String palabra;
        System.out.println("Ingrese una palabra");
        palabra = leer.next();
        if (palabra.equals("eureka")){
        System.out.println("Correcto");
    }
        else {
       System.out.println("Incorrecto");
                }
       }
    
}
