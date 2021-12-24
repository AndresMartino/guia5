package Ejercicio24;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese filas");
        int f = leer.nextInt();
        while (f < 0) {
            System.out.println("ERROR! Ingrese numero de filas positivo");
            f = leer.nextInt();
        }
        System.out.println("Ingrese columnas");
        int c = leer.nextInt();
        while (c < 0) {
            System.out.println("ERROR! Ingrese numero de filas positivo");
            c = leer.nextInt();
        }
        int[][] M = new int[f][c];
        cargar(M, f, c);
        comprobar(M, f, c);
        mostrar(M, f, c);
    }
/*-------------------------------FUNCION CARGAR---------------------*/
    public static void cargar(int[][] M, int f, int c) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("ingrese valor en la posicion [" + i + "][" + j + "]");
                M[i][j] = leer.nextInt();
            }
        }

    }
/*-------------------------------FUNCION COMPROBAR ANTISIMETRIA---------------------*/
    public static void comprobar(int[][] M, int f, int c) {
        boolean log = false;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (M[i][j] == -M[j][i]) {
                    log = true;

                }
            }
        }
        if (log) {
            System.out.println("La matriz es antiSimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }
/*-------------------------------FUNCION MOSTRAR MATRIZ Y TRANSPUESTA---------------------*/
    public static void mostrar(int[][] M, int f, int c) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M[i][j] + " ");

            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M[j][i] + " ");

            }
            System.out.println("");
        }
    }
}
