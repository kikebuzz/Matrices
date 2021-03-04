/*
 * GONZALEZ VALADEZ LUIS ENRIQUE
 * 3S11
 * TESOEM:ESTRUCTURA DE DATOS
 */
package diagonalsuperior;

import java.util.Scanner;
 
public class DIAGONALSUPERIOR {

    public static void main(String[] args) {
    //Se llama a la clase Scanner para ingresar datos
        Scanner sc= new Scanner (System.in);
        //Se declara la variable para el tama;o de la matriz
        int a;
        System.out.println("Tama;o de la matriz");
        //Se guarda en la cariable a el dato ingresado gracias a escanner
        a=sc.nextInt();
        //Se declara la matriz de tipo char para  mostrar caracteres con tama;o que ingrese el usuario
        char [][] sup = new char [a][a];
        //se inicia el recorrido del arreglo
        for (int i = 0; i < sup.length; i++) {
        for (int j = i; j < sup[i].length; j++) {
            //if que detecta que cuando la posicion de i es superior a la de j no mostrara nada solo sera un valor nulo
            if (j < i) {
              //Se muestra lo que se muestra en el sout
                System.out.print(" ");
            } else {
              //Si es diferente a la condicion muestra valores con *
                System.out.print(sup[i][j]='*');  
                  
            }
        }
        System.out.println();           
    }}}