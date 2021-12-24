package Ejercicio25;

import java.util.Locale;
import java.util.Scanner;

/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.*/
public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese dimension del cuadrado magico");
        int n = leer.nextInt();
        int[][] M = new int[n][n];
        cargar(M, n);
        magica(M, n);
        mostrar(M, n);
    }

    /*-----------------------------FUNCION CARGAR----------------------------------*/
    public static void cargar(int[][] M, int n) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("ingrese valor entre 1 y 9 en la posicion [" + i + "][" + j + "]");
                M[i][j] = leer.nextInt();
                while (M[i][j] < 1 || M[i][j] > 9) {
                    System.out.println("ERROR! Ingrese numero valido!");
                    M[i][j] = leer.nextInt();
                }
            }
        }
    }
/*-------------------------------------FUNCION MOSTRAR---------------------------------------*/
    public static void mostrar(int[][] M, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(M[i][j] + " ");

            }
            System.out.println("");
        }
    }


    /*-------------------------FUNCION MAGICA-----------------------------*/
    public static void magica(int[][] M, int n) {
        int acuD = 0, acuDi = 0, acuF = 0, acuC = 0, acu = 0, c = n - 1;
        boolean log = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    acu += M[i][j];
                }
                if (i == j) {
                    acuD += M[i][j];
                }
                acuF += M[i][j];
                acuC += M[j][i];
            }
            acuDi += M[i][c];
            c--;
            if (acu != acuF || acu != acuC) {
                log = false;
            }
            acuF = 0;
            acuC = 0;
        }
        if (log && acu == acuD && acu == acuDi) {
            System.out.println("La matriz es magica y la suma es " + acu);
        } else {
            System.out.println("La matriz no es magica");
        }
    }
}
