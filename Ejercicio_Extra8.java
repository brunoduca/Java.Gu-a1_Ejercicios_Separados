/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int cont; int cont1; int cont2;
       cont = 0; cont1 = 0; cont2 = 0;
       String opcion;
        do {          
            cont = cont + 1;
            System.out.println("Ingrese un número entero");
            int num = leer.nextInt();
            if (num % 5 == 0){
                System.out.println("La cantidad de números leídos es = " + cont);
                System.out.println("La cantidad de números pares es = " + cont1);
                  System.out.println("La cantidad de números impares es = " + cont2);
                  break;
            }
            if (num % 2 == 0){
                cont1 = cont1 + 1;
            }else
                cont2 =  cont2 + 1;
            
            System.out.println("¿Desea continuar? (s/n)");
            opcion = leer.nextLine();
        } while (opcion.equals("s"));
    }
    
}
