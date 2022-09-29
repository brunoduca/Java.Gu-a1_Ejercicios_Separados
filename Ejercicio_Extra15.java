/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package Ejercicios_Guía1;

import static Ejercicios_Guía1.Ejercicio_Extra15.suma;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String opcion;
        System.out.println("Elija una de las siguientes opciones \n"
                + "1. Suma \n"
                + "2. Resta \n"
                + "3. Multiplicación \n"
                + "4. División");
        opcion = leer.nextLine();
        System.out.println("Ingrese dos valores");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        switch (opcion) {
            case "1":
                System.out.println(suma(n1, n2));
                break;
            case "2":
                System.out.println(resta(n1, n2));
                break;
            case "3":
                System.out.println(multiplicacion(n1, n2));
                break;
            case "4":
                System.out.println(division(n2, n1));
                break;
        }
    }

    public static int suma(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }
    public static int resta(int n1, int n2) {
        int resta = (n1 - n2);
        return resta;
    }
    public static int multiplicacion(int n1, int n2) {
        int multiplicacion = (n1 * n2);
        return multiplicacion;
    }
    public static int division(int n1, int n2) {
        int division = (n1 / n2);
        return division;
    }
}
