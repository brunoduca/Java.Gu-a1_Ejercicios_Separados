/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int sum, sum1, suma3, suma4;
        sum = 0;
        sum1 = 0;
        suma4 = 0;
        suma3 = 0;
        System.out.println("Elija el tamaño del cuadrado mágico");
        int n = leer.nextInt();
        int[] suma1 = new int[n];
        int[] suma2 = new int[n];
        int[][] matriz = new int[n][n];
        System.out.println("¿Desea llenar la matriz de manera manual? (s/n)");
        String opcion = leer.next();
        opcion = opcion.toUpperCase();
        switch (opcion) {
            case "S":
                LlenarMatrizManual(matriz, n);
                break;
            case "N":
                LlenarMatrizAutomatico(matriz, n);
        }
        MostrarMatriz(matriz, n);
        LlenarSumas(matriz, sum, suma1, sum1, suma2, suma3, suma4, n);
        Comprobar(suma1, suma2, suma4, suma4, n);

    }

    public static void LlenarMatrizManual(int[][] matriz, int n) {
        Scanner leer = new Scanner(System.in);
        int numero;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0) && (j == 0)) {
                    System.out.println("Ingrese un número para la posición: \n"
                            + "[" + i + "] [" + j + "]");
                    numero = leer.nextInt();
                } else {
                    System.out.println("[" + i + "] [" + j + "]");
                    numero = leer.nextInt();
                }
                if ((numero >= 1) && (numero <= 9)) {
                    matriz[i][j] = numero;
                } else {
                    do {
                        System.out.println("Número incorrecto. Ingrese otro número");
                        numero = leer.nextInt();
                    } while ((numero < 1) || (numero > 9));
                    matriz[i][j] = numero;

                }
            }
        }

    }

    public static void LlenarMatrizAutomatico(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static void MostrarMatriz(int[][] matriz, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                //Imprimir
            }
            System.out.println(" ");
        }
    }

    public static void LlenarSumas(int[][] matriz, int sum, int[] suma1, int sum1, int[] suma2, int suma3, int suma4, int n) {

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + matriz[j][i];
                //Para columnas
            }
            suma1[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            sum1 = 0;
            for (int j = 0; j < n; j++) {
                sum1 = sum1 + matriz[i][j];
                //Para filas
            }
            suma2[i] = sum1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    suma3 = suma3 + matriz[i][j];
                    //Para Diagonal izquierda
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((i == 1) && (j == 1)) || ((i == (n - 1)) && (j == 0)) || ((i == 0) && (j == (n - 1)))) {
                    suma4 = suma4 + matriz[i][j];
                    //Para Diagonal derecha
                }
            }
        }

    }

    public static void Comprobar(int[] suma1, int[] suma2, int suma3, int suma4, int n) {
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if ((suma1[i] == suma2[i]) || (suma1[i] == suma3) || (suma1[i] == suma4)) {
                cont = cont + 1;
            }

        }
        if (cont == 3) {
            System.out.println("El cuadrado es mágico");
        } else {
            System.out.println("El cuadrado no es mágico");

        }
    }
}
