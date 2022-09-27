/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que desea analizar");
        int n = leer.nextInt();
        float [] alturas = new float [n]; float suma; suma = 0; float suma1; suma1 = 0; float cont; cont = 0;
        for (int i = 0; i < n; i ++) {
            System.out.println("Ingrese la altura de la persona " + (i+1) + " en centímetros");
            alturas [i]  = leer.nextFloat();
            suma = suma + (alturas [i]/ 100);
            if (alturas[i] < 160) {
                suma1 = suma1 + (alturas[i]/100);
                cont = cont + 1;
            }
        }
        System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 m es : \n"
                +  (suma1/ cont) + " m" );
        System.out.println("El promedio de estaturas en general es : \n "
                + (suma / n ) + " m");
        
    }
    
}
