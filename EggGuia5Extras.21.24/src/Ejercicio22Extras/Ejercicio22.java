package Ejercicio22Extras;

import java.util.Locale;
import java.util.Scanner;

/*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.*/
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese cantidad de filas de la matriz");
        int f = leer.nextInt();
        while (f < 1) {
            System.out.println("ERROR! ingrese numero valido de filas");
            f = leer.nextInt();
        }
        System.out.println("Ingrese cantidad de columnas de la matriz");
        int c = leer.nextInt();
        while (c < 1) {
            System.out.println("ERROR! ingrese numero valido de columnas");
            c = leer.nextInt();
        }
        int[][] M = new int[f][c];
        cargar(M, f, c);
        sumar(M, f, c);
        mostrar(M, f, c);
    }

    /*///////////////FUNCION CARGAR MATRIZ///////*/
    public static void cargar(int[][] M, int f, int c) {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                M[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

    }

    /*/////////////////FUNCION SUMAR ELEMENTOS MATRIZ//////////////////*/
    public static void sumar(int[][] M, int f, int c) {
        int suma = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                suma += M[i][j];
            }
        }
        System.out.println("La suma de los elementos de la matriz es " + suma);
    }

    /*////////////////////////////////////FUNCION MOSTRAR MATRIZ///////////////////////*/
    public static void mostrar(int[][] M, int f, int c) {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
