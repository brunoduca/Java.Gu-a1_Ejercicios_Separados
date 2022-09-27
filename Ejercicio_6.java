/*
Crear un programa que dado un numero determine si es par o impar.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        
        if (num % 2 == 0 ) {
            System.out.println("El número ingresado es par"); }
        else {
            System.out.println("El número ingresado es impar");
        }
                
    }
    
}
