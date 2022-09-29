/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pedir();
    }

    public static void pedir() {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántas personas desea analizar?");
        int personas = leer.nextInt();
        String[] nombre = new String[personas];
        int[] edad = new int[personas];
        String opcion;
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1));
            nombre[i] = leer.next();
            System.out.println("Ingrese la edad de " + nombre[i]);
            edad[i] = leer.nextInt();
        }
        for (int i = 0; i < personas; i++) {
            if (edad[i] > 18) {
                System.out.println(nombre[i] + " es mayor de edad");
            } else {
                System.out.println(nombre[i] + " es menor de edad");
            }
            if (i < (personas - 1)){
                System.out.println("¿Desea continuar?(si/no)");
                opcion = leer.next();
                opcion = opcion.toUpperCase();
                switch (opcion) {
                    case "SI":
                    case "NO":
                        break;
                }
            }
        }
    }

}
