/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);   
        
         /**System.out.println("Ingrese la cantidad de números que desea analizar");
         *int n = leer.nextInt();
         */
        int menor, mayor, suma, cont, num;
        menor = 100000; mayor = 0; suma = 0; cont = 0;
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if ((num > mayor) && (num > 0)){
                mayor = num;
            }
            if (num < menor) {
                menor =  num;
            }
            suma = suma + num;
            cont =  cont + 1;
        } while (cont < 4);
        // } while (cont < n);
        
        suma = (suma / cont);
        System.out.println(suma);
        
        }
}
    
    

