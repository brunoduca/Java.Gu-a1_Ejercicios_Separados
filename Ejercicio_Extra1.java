/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
https://www.youtube.com/watch?v=STVXkRO4LZY

 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese minutos");
        num = leer.nextInt();

        if (num < 60) {
            System.out.println("El número ingresado corresponde a menos de una hora");

        } else {
            System.out.println("El total es = " + num / 60 + " hora/s");
        }
        if (num < 1440) {
            System.out.println("El número ingresado corresponde a menos de un día");

        } else {
            System.out.println("Y total es = " + num / 1440 + " día/s");
        }
    }

}
