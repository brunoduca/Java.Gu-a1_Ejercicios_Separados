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
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int n1; int n2; int resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        n2 = leer.nextInt();
        resultado = (n1 + n2);
        System.out.println("El resultado es = " + resultado);
        
     
    }
}
