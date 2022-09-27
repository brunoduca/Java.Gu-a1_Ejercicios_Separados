/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Desea ingresar los datos por teclado? (s/n)");
        String opcion = leer.nextLine();
        opcion = opcion.toUpperCase();
        int[][] matrizMayor = new int[10][10];
        int[][] matrizMenor = new int[3][3];
        switch (opcion) {
            case "S":
                LlenarManual(matrizMayor, matrizMenor);
                break;
            case "N":
                LlenarAutomatico(matrizMayor, matrizMenor);
        }
        MostrarMatriz(matrizMayor, matrizMenor);
        Comprobar(matrizMayor, matrizMenor);
    }

    public static void LlenarManual(int[][] matrizMayor, int[][] matrizMenor) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i == 0) && (j == 0)) {
                    System.out.println("MATRIZ 10 X 10 \n"
                            + "Ingrese un número para la posición \n"
                            + "[" + i + "] [" + j + "]");
                    matrizMayor[i][j] = leer.nextInt();
                } else {
                    System.out.println("[" + i + "] [" + j + "]");
                    matrizMayor[i][j] = leer.nextInt();
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0) && (j == 0)) {
                    System.out.println("MATRIZ 3 X 3 \n"
                            + "Ingrese un número para la posición \n"
                            + "[" + i + "] [" + j + "]");
                    matrizMenor[i][j] = leer.nextInt();
                } else {
                    System.out.println("[" + i + "] [" + j + "]");
                    matrizMenor[i][j] = leer.nextInt();
                }

            }
        }
    }

    public static void LlenarAutomatico(int[][] matrizMayor, int[][] matrizMenor) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizMayor[i][j] = (int) ((Math.random()) * 100);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizMenor[i][j] = (int) ((Math.random()) * 100);
            }
        }
    }

    public static void MostrarMatriz(int[][] matrizMayor, int[][] matrizMenor) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i == 0) && (j == 0)) {
                    System.out.println("MATRIZ 10 X 10");
                }
                System.out.print("[" + matrizMayor[i][j] + "]" + "");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0) && (j == 0)) {
                    System.out.println("MATRIZ 3 X 3");
                }
                System.out.print("[" + matrizMenor[i][j] + "]" + "");
            }
            System.out.println("");
        }
    }

    public static void Comprobar(int[][] matrizMayor, int[][] matrizMenor) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i < 3) && (j < 3)) {
                    if (matrizMayor[i][j] == matrizMenor[i][j]) {
                        System.out.println("Existe una coincidencia en la posición \n"
                                + " " + i + ", " + j + " ");
                    }
                } else if ((i > 3) || (j > 3)) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matrizMayor[i][j] == matrizMenor[k][l]) {
                                System.out.println("Existe una coincidencia en la posición \n"
                                        + " " + i + ", " + j + " ");
                            }
                        }
                    }
                }

            }
        }
    }

}
