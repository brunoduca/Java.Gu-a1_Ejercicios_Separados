/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        float plata;
        String opcion;
        System.out.println("Ingrese el importe en Euros: ");
        plata = leer.nextFloat();
        System.out.println("Ingrese el tipo de que desea obtener:\n "
                           + "Dolar, Yan, Libra ");
        opcion = leer.next();
        opcion = opcion.toUpperCase();
        float retorno = convertir(plata, opcion);
        System.out.println("El total es = " + retorno);
         
    }
         
         public static float convertir(float plata, String opcion){
             double plata1 = 0;
         switch (opcion) {
             case "DOLAR": 
                  plata1 = (plata * 1.28611);
                  break;
            case "YAN": 
                plata1 = plata * 129.852;
                break;
            case "LIBRAS":
                 plata1 = plata *  0.86;
                 break;
             }
         return  (float) plata1;
         }
} 
             
             
     
    
