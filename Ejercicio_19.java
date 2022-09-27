/*

 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Ejercicios_Guía1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño de la matriz");
        n = leer.nextInt();
        int [] [] matriz = new int[n][n];
        int i, j, cont;
        cont = 0;
       
        //Para llenar
        for(i = 0; i < n; i ++) {
            for (j = 0; j < n; j++){
                if (i == 0){
                System.out.println("Ingrese el número de la posición");
                }
                System.out.println("[" +i+ "] [" +j+"]");
                matriz [i][j] = leer.nextInt();
        }
         System.out.println(" ");
        }
        
            
             //Para imprimir
        for(i = 0; i < n; i ++) {
           for (j = 0; j < n; j++){
                 System.out.print("[" + matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
        

        System.out.println(" ");
        for(i = 0; i < n; i ++) {
             for (j = 0; j < n; j++){
                 System.out.print("[" + matriz[j][i]*(-1)+"]");
            }
             System.out.println(" ");
        }
        
        //Para corroborar
        
               for(i = 0; i < n; i ++) {
             for (j = 0; j < n; j++){
                 if ((matriz[i][j]) == (matriz[j][i] *(-1))){
                 cont ++;
             }
             }
        }
               if (cont == (n*n)){
                   System.out.println("La matríz es anti simétrica");
               }else {
                   System.out.println("La matriz no es anti simétrica");
               }
               
               
        
    }
    
}
