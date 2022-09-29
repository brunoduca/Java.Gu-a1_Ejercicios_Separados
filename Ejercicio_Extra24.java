/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límite");
        int limite = leer.nextInt();
        int[] vector = new int[limite];
        int cont = 0;
        for (int i = 0; i < limite; i++) {
            if ((i == 0) || (i == 1)) {
                vector[i] = 1;
            } else {
                vector[i] = vector[i - 1] + vector[i - 2];
            }

            if (vector[i] <= limite) {
                cont = cont + 1;
            } else {
                break;
            }
        }

        for (int i = 0; i < cont; i++) {
            if (i < (cont - 1)) {
                System.out.print("[" + vector[i] + "],");
            } else {
                System.out.print("[" + vector[i] + "]");
            }
        }
        System.out.println("");
    }

}
