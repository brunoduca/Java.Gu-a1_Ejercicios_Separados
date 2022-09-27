/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i,k;
        int[] vector = new int[100];
        
        for (i = 0; i < 100; i ++){
                vector[i] = i;
                
        }
        for (i = 99; i > 0; i --)
            System.out.println( vector[i]);
        
        
    }
    
}
