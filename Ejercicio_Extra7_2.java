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
public class Ejercicio_Extra7_2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int menor, mayor, suma, cont, num;
        menor = 100000;
        mayor = 0;
        suma = 0;
        cont = 0;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        System.out.println("¿Desea ingresar un número (s/n");
        String opcion = leer.nextLine();

        while (opcion.equals("s")) {
            if ((num > mayor) && (num > 0)) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
            suma = suma + num;
            cont = cont + 1;
        }

        suma = (suma / cont);
        System.out.println(suma);

    }
}
