/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] suma = new int[10];
        int nota1, nota2, nota3, nota4, contA, contD;
        contA = 0;
        contD = 0;
        for (int i = 0; i < 10; i++) {
            nota1 = 0;
            nota2 = 0;
            nota3 = 0;
            nota4 = 0;
            System.out.println("ALUMNO: " + (i + 1) + "\n"
                    + "Ingrese la nota del primer TP");
            nota1 = leer.nextInt();
            if ((nota1 >= 1) && (nota1 <= 10)) {
            } else {
                do {
                    System.out.println("El dato ingresado es incorrecto. Ingrese la nota del primer TP");
                    nota1 = leer.nextInt();
                } while ((nota1 < 1) || (nota1 > 10));
            }
            System.out.println("Ingrese la nota del segundo TP");
            nota2 = leer.nextInt();
            if ((nota2 >= 1) && (nota2 <= 10)) {
            } else {
                do {
                    System.out.println("El dato ingresado es incorrecto. Ingrese la nota del segundo TP");
                    nota1 = leer.nextInt();
                } while ((nota2 < 1) || (nota2 > 10));
            }
            System.out.println("Primer Integrador");
            nota3 = leer.nextInt();
            if ((nota3 >= 1) && (nota3 <= 10)) {
            } else {
                do {
                    System.out.println("El dato ingresado es incorrecto. Ingrese la nota del primer Integrador");
                    nota1 = leer.nextInt();
                } while ((nota3 < 1) || (nota3 > 10));
            }
            System.out.println("Segundo integrador");
            nota4 = leer.nextInt();
            if ((nota4 >= 1) && (nota4 <= 10)) {
            } else {
                do {
                    System.out.println("El dato ingresado es incorrecto. Ingrese la nota del segundo Integrador");
                    nota4 = leer.nextInt();
                } while ((nota4 < 1) || (nota4 > 10));
            }
            suma[i] = (int) ((nota1 * 0.1) + (nota2 * 0.15) + (nota3 * 0.25) + (nota4 * 0.5));
            if (suma[i] >= 7) {
                contA = contA + 1;
            } else {
                contD = contD + 1;
            }
        }
        if (contA >= 1) {
            System.out.println("La cantidad de alumnos aprobados es de: " + contA);
        } else {
            System.out.println("No hay ningún alumno aprobado");
        }
        if (contD >= 1) {
            System.out.println("La cantidad de alumnos desaprobados es de: " + contD);
        } else {
            System.out.println("No hay ningún alumno desaprobado");
        }
    }
}
