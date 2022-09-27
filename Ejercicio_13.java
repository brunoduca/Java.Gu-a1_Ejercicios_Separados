/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String caracter;
       caracter = "* ";
       int longitud;
        System.out.println("Ingrese el largo del cuadrado");
        longitud = leer.nextInt();

        for(int aux1 = 1 ; aux1 <= longitud ; aux1++){               
            for(int aux2 = 1   ; aux2 <= longitud; aux2++){                    
	         if ((aux1 == 1) || (aux1 == longitud) || (aux2 == 1) || (aux2 == longitud))
                 { 
	           System.out.print(caracter);
                   }
                 else 
                 { 
                   System.out.print("  ");
                   }
                 
           }
            System.out.println(" ");
        
        }
   System.out.println(" ");  
    
    }
     }


