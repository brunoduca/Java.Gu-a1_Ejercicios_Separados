/*
 Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su plan");
        String opcion = leer.nextLine();
        opcion = opcion.toUpperCase();
        System.out.println("Ingrese el costo del tratamiento");
        int costo = leer.nextInt();

        switch (opcion) {
            case "A":
                System.out.println("El costo del tratamiento es = " + (costo / 2));
                break;
            case "B":
                System.out.println("El costo del tratamiento es = " + (costo - ( costo * 0.35)));
                break;
            case "C":
                System.out.println("Su plan no posee descuento. Debe abonar = " + costo);
                break;
                default:
                    System.out.println("El plan ingresado no es válido");

        }
    }

}
