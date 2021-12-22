package Ejercicio17;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese tamaño del cuadrado");
        int n = leer.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if (i > 0 && j > 0 && i < n - 1 && j < n - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }

}
