/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz.equis;
import java.util.Scanner;
/**
 *
 * @author Angel
 */
public class MATRIZEQUIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int n,m ,c; 
          System.out.println("¿Que base y altura tendra tu x?");
    int a = teclado.nextInt();

    char[][]matriz = new char[a][a];

    for ( int i=0; i < matriz.length ;i++){
          for (int j=0;  j<matriz.length;j++){
                int x = i + 1;
                if((i==j)  ||  (j == (a - x))){
                    matriz[i][j] = '*';
                    System.out.print(matriz[i][j] + " ");
                }
                else{
                   matriz[i][j] = ' ';
                   System.out.print(matriz[i][j] + " ");
                }
          }  
           System.out.println();
    }
    }
    }
    

