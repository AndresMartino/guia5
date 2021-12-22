package Ejercicio15;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int suma, num;
        suma = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("ingrese numero");
            num = leer.nextInt();
            if (num > 0) {
                suma = suma + num;
            } else if (num == 0) {
                break;
            }
        }
        System.out.println("La suma es " + suma);

    }

}
