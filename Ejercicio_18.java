/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).

Matriz A |1 , 0 , 4 |   Matriz B |1 , 0 , 6 |
         |0 , 5 , 0 |            |0 , 5 , 0 |
         |6 , 0 , -9|            |4 , 0 ,-9 |
 */
package Ejercicios_Guía1;

/**
 *
 * @author usuario
 */
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] [] matriz = new int[4][4];
        int i, j ;
        
        for(i = 0; i < 4; i ++) {
            for (j = 0; j < 4; j++){
                matriz [i][j] = (int) (Math.random()*10+1);
               
            }
        }

        for(i = 0; i < 4; i ++) {
            for (j = 0; j < 4; j++){
                 System.out.print("[" + matriz[i][j]+"]");
            }
             System.out.println(" ");
        }
        System.out.println(" ");
        for(i = 0; i < 4; i ++) {
             for (j = 0; j < 4; j++){
                 System.out.print("[" + matriz[j][i]+"]");
            }
             System.out.println(" ");
        }
        
        
    }
    
}
