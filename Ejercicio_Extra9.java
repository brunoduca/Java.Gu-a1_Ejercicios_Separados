/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro valor");
        int num2 = leer.nextInt();
        int resta; int cont = 1;
        System.out.println(num1 + " / " + num2 + " :");
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        
        do {
            
            resta = num1 - num2;
            if (num2 < resta){
                System.out.println("Dado que " + num2 + " es menor que " + resta + " el residuo es " + num2 + " y el cociente es " + cont);
                break;
            } else {
                System.out.println(resta + " - " + num2 + " = " + (resta - num2));
            }
            cont = cont + 1;
        } while (num2 > resta);

    }

}
