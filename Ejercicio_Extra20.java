/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[3];
        /*
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Desea ingresar el tamaño del vector? (s/n)");
        String opcion = leer.next();
        opcion = opcion.toUpperCase();
        int tam = 0;
        switch (opcion) {
            case "S":
                System.out.println("Ingrese el tamaño del vector");
                tam = leer.nextInt();
                int []vector = new int [tam];
                break;
            case "N":
                tam = (int) (Math.random()*100);
                int []vector = new int [tam];         
        }
         */
        rellenarVector(vector);
        imrimirVector(vector);
    }

    public static void rellenarVector(int[] vector) {
       /* public static void rellenarVector(int[] vector, tam) {
        */
        for (int i = 0; i < 3; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        /*for (int i = 0; i < tam; i++) {
            vector[i] = (int) (Math.random() * 100);
        }*/
    }

    public static void imrimirVector(int[] vector) {
        /*
         public static void imrimirVector(int[] vector, tam) {
        */
        for (int i = 0; i < 3; i++) {
            System.out.println("[" + vector[i] + "]");
        }
        /*for (int i = 0; i < 3; i++) {
            System.out.println("[" + vector[i] + "]");
        }
         */
    }

}
