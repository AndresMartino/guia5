package Ejercicio20;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cargar();

    }

    public static void Cargar() {
        int[] V = new int[100];

        for (int i = 0; i < V.length; i++) {
            V[i] = i;
        }
        for (int i = V.length - 1; i > 0; i--) {
            System.out.println(V[i] + " ");
        }
    }

}
