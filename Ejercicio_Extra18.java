/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();
        int [] vector = new int [tamaño];
        int suma = 0;
        for(int i = 0; i < tamaño; i ++){
            System.out.println("Ingrese un valor para la posición [" + (i+1) + "]");
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
        }
        System.out.println("La suma de los números ingresados es: \n"
        + suma);
    }
    
}
