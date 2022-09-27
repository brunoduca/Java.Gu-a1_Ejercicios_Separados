/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int longitud, cont1, cont2;
        cont1 = 0;
        cont2 = 0;
         do {
        System.out.println("Ingrese una palabra");
        palabra = leer.next();
        longitud = palabra.length();
                if ((longitud <= 5) && (palabra.substring(0,1).equals("x")) && (palabra.substring(longitud - 1, longitud).equals("o"))) {
         cont1 = cont1 + 1;
          System.out.println("Se ha ingresado un dato correcto"); 
         }  
          else if (!"&&&&&".equals(palabra)){
                cont2= cont2 + 1;
            }
  
        
         } while (!"&&&&&".equals(palabra));
         
         if (cont1 > cont2) { 
          System.out.println("Se han registrado más intentos correctos. En total " + cont1); 
          }
          else { 
              System.out.println("Se han registrado más intentos incorrectos. En total: " + cont2); 
              }
    System.out.println("Hata luego!");
         
}
 }

