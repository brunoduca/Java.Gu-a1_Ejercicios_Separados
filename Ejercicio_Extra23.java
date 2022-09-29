/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package Ejercicios_Guía1;

import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        int largo;
        String opcion;

        for (int i = 0; i < 20; i++) {
            if (i < 5) {
                System.out.println("Ingrese una palabra de entre 3 a 5 caracteres");
                opcion = leer.nextLine();
                largo = opcion.length();
                if ((largo < 3) || (largo > 5)) {
                    do {
                        System.out.println("La palabra ingresada es incorrecta. Ingrese otra");
                        opcion = leer.nextLine();
                        largo = opcion.length();
                    } while ((largo < 3) || (largo > 5));
                }
                for (int k = 0; k < largo; k++) {
                        sopa[i][k] = opcion.substring(k, k+1); 
                }   
                for (int l = largo; l < 20; l++) {
                    sopa[i][l] = String.valueOf((int) (Math.random() * 10));
                }
            } else {
                for (int j = 0; j < 20; j++) {
                    sopa[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + sopa[i][j] + "] ");
            }
            System.out.println("");
        }
    }

}
