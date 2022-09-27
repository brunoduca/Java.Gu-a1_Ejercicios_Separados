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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       String frase;
        System.out.println("Ingrese una frase");
        frase = leer.next();
        frase = frase.toUpperCase();
        System.out.println("Mayúscula: " + frase);
        frase = frase.toLowerCase();
        System.out.println("Minúscula " + frase);
         
    }
    
}
