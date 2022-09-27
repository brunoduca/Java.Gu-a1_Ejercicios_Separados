/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una letra");
        String n = leer.nextLine();
        if(("A".equals(n)) || ("E".equals(n)) || ("I".equals(n)) || ("O".equals(n)) || ("U".equals(n))){
            System.out.println("La letra ingresada es vocal");
        }else {
        System.out.println("La letra ingresada no es vocal");
    }
    }
    
}
    