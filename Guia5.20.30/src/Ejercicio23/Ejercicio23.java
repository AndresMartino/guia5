package Ejercicio23;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int n = 4;
        double[][] M = new double[n][n];
        cargar(M, n);
        mostrar(M,n);
        System.out.println("");
        transpuesta(M, n);
    }

    public static void cargar(double[][] M, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = Math.floor(Math.random() * 6 + 1);
            }
        }

    }
    public static void mostrar(double[][] M, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(M[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void transpuesta(double[][] M, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(M[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
