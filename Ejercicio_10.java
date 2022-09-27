/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite, suma, resultado;
        System.out.print("Ingrese un valor límite positivo ");
        limite = leer.nextInt();
        resultado = 0;
        System.out.print("Ingrese un valor");
        suma = leer.nextInt();
        
        while (resultado < suma) {
        System.out.print("Ingrese un valor");
        suma = leer.nextInt();    
        resultado = resultado + suma;
        
    }
        
    }
    
}
