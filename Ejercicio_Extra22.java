/*
 Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
 muestre la suma de sus elementos.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Ingrese el tamaño de la primera dimensión de la matriz");
        n = leer.nextInt();
        if (n < 1) {
            do {
                System.out.println("El dato ingresado es incorrecto. Ingrese un número mayor a 0");
                n = leer.nextInt();
            } while (n < 1);
        }
        System.out.println("Ingrese el tamaño de la segunda dimensión de la matriz");
        m = leer.nextInt();
        if (m < 1) {
            System.out.println("El dato ingresado es incorrecto. Ingrese un número mayor a 0");
            m = leer.nextInt();
        }
        int[][] matriz = new int[n][m];
        System.out.println("La suma de los valores de la matriz [" + n + "][" + m + "] = " + LlenarMatriz(n, m, matriz));

    }

    public static int LlenarMatriz(int n, int m, int matriz[][]) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                suma = suma + matriz[i][j];
            }
        }
        return suma;

    }
}
