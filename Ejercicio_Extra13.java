/*
 Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la escalera");
        int tamaño = leer.nextInt();
        System.out.println("");
        for (int i = 1; i <= tamaño ; i ++){
            for (int j = 1; j <=  i; j ++){
                System.out.print(j + "");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
