/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejercicios_Guía1;

import java.util.Random;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author usuario
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int n, i, cont, cont1, cont2, cont3, cont4;
        cont = 0; 
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        System.out.println("Ingrese el límite del vector");
        n = leer.nextInt();
        int[] vector  = new int[n];
        String[] num = new String[n];
        int [] longitud = new int [n];
        Random num1 = new Random(); 
        
        for (i = 0; i < n; i ++) {  
            vector[i] = (num1.nextInt(10000-0+1)+0);
            num [i] = String.valueOf(vector[i]);
            longitud[i] = num[i].length();
            
         }
          for (i = 0; i < n; i ++) {
              switch (longitud[i]){
                  case 1: 
                      cont ++;
                      continue;
                  case 2:
                      cont1 ++;
                      continue;
                  case 3:
                      cont2 ++;
                      continue;
                  case 4:
                      cont3 ++;
                      continue;
                  case 5:
                      cont4 ++;    
            }
          }
         if ((cont >= 1) || (cont1 >= 1) || (cont2 >= 1) || (cont3 >= 1) || (cont4 >= 1)){
          System.out.println("Se han encontrado");
         }else {
         System.out.println("No se han encontrado números con las condiciones requeridas");
         }
          if(cont >= 1) {
          System.out.println( cont + "  número/s de un dígito");
          } 
          if (cont1 >= 1){
            System.out.println( cont1 + " número/s de dos dígitos");
          }
         
         if (cont2 >= 1){
           System.out.println( cont2 + " números de tres dígitos");
         }
          
         if (cont3 >= 1){
            System.out.println( cont3 + " número/s de cuatro dígitos");
         }
          
         if (cont4 >= 1) {
          System.out.println( cont4 + " número/s de cinco dígitos");
         }
    }
    }


    
