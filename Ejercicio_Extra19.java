/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Desea que el programa se ejecute de forma automática? (s/n)");
        String opcion = leer.next();
        opcion = opcion.toUpperCase();
        switch (opcion) {
            case "S":
                automatico();
                break;
            case "N":
                manual();
                break;
        }
    }

    public static void automatico() {
        int[] vector1 = new int[3];
        int[] vector2 = new int[3];
        for (int i = 0; i < 3; i++) {
            vector1[i] = (int) (Math.random() * 100);
            vector2[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 3; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Se encontró una diferencia en la posicón [" + i + "]");
                break;
            } else if (i == 2){
                System.out.println("Los vectores son iguales");
            }

        }
    }

    public static void manual() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int tamaño = leer.nextInt();
        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            if (i == 0) {
                System.out.println("VECTOR 1");
            }
            System.out.println("Ingrese el valor de la posición " + i);
            vector1[i] = leer.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < tamaño; i++) {
            if (i == 0) {
                System.out.println("VECTOR 2");
            }
            System.out.println("Ingrese el valor de la posición " + i);
            vector2[i] = leer.nextInt();
        }
        for (int i = 0; i < tamaño; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Se encontró una diferencia en la posicón [" + i + "]");
                break;
            } else if (i == (tamaño-1)) {
                System.out.println("Los vectores son iguales");
            }

        }
    }
}
