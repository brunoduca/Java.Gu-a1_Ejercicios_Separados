/*
 Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        int resto;
        int cont;
        cont = 0;
        resto = num;
        /**
         * String longitud = String.valueOf(num); int tamaño =
         * longitud.length(); System.out.println("El número ingresado tiene: " +
         * tamaño + " dígitos");
         * (una forma de hacerlo)
         */

        do {
            cont = cont + 1;
            resto = (resto / 10);
        } while (resto > 0);
        System.out.println("El nñumero ingresado: " + num + " tiene " + cont + " dígitos");
    }
}
