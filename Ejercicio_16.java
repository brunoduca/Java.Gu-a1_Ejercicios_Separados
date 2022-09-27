/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i, n2, cont;
        cont = 0;
        System.out.println("Ingrese el límite del vector");
        n = leer.nextInt();
        int[] vector = new int[n];
        
        for (i = 0; i < n; i ++) {
            vector[i] = (int)(Math.random()*10);
         }
        
        System.out.println("Ingrese el número que desea buscar");
        n2 = leer.nextInt();
        
        for (i = 0; i < n; i ++) {
            if (n2 == vector[i]){
            System.out.println("El número se encuentra en la posición " + i);
            cont = cont + 1;
        }
        }    
         if (cont > 1)
         System.out.println("El número ingresado se encuentra repetido");
        if (cont == 0) 
            System.out.println("No se ha encontrado el número");
    }
}
    
