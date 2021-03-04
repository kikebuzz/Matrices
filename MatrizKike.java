
import java.util.Scanner;

public class MatrizKike {

    public static void main(String[] args) {
//Se llama a la clase Scanner para ingresar datos
        Scanner teclado = new Scanner(System.in);
       //Se declaran las variables para guardar los valores que ingrese el usuario
        int n, m;
        System.out.println("Ingrese la medida de la base");
       //Se ingrese y guarda el pro=imer rango en la variable n
        n = teclado.nextInt();
        System.out.println("Ingrese la medida de la altura");
         //Se ingrese y guarda el pro=imer rango en la variable n
        m = teclado.nextInt();
         //Se declara la matriz de tipo char para  mostrar caracteres con tama;o que ingrese el usuario
        char matriz[][] = new char[n][m];
         //se inicia el recorrido del arreglo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                //inicia un if que pone laa condicion de que cuando los valores que esten dentro del rango solo de la orilla de la matriz
                //va a mostrar asteriscos 
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    matriz[i][j] = '*';
                    //si la condicion no se cumple solo mostrara espacios en blanco
                } else {
                    matriz[i][j] = ' ';
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
