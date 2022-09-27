/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double grados, resultado;
        System.out.println("Ingrese la cantidad de grados");
        grados = leer.nextDouble();
        resultado = 32 + (9 * grados / 5);
        System.out.println("El resultado en grados Fahrenheit es " + resultado);
        
    }
    
}
