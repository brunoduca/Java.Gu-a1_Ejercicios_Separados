/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int media1; media1 = 0;
        int media; media = 0;
        int hijos;
        System.out.println("Ingrese la cantidad de familias que desea analizar");
       int familias = leer.nextInt();
       for (int i = 0; i < familias; i ++){
           media1 = 0;
           media = 0;
           hijos = 0;
           System.out.println("Familia " + (i + 1) + ":");
           System.out.println("¿Cuántos hijos tiene?");
            hijos = leer.nextInt();
           for(int j = 0; j < hijos; j ++){
               System.out.println("¿Cál es la edad del hijo " + (j + 1) + "?");
               media = leer.nextInt();
               media1 = media1 + media;
           }
           System.out.println("La media de la familia " + (i +1 ) + " es: " + media1/hijos);
           System.out.println("");
       }
    }
    
}
