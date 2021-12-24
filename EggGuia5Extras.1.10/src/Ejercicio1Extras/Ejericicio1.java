package Ejercicio1Extras;
//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
//el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas

import java.util.Locale;
import java.util.Scanner;

public class Ejericicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese minutos");
        int minutos = leer.nextInt();
        convertir(minutos);

    }

    public static void convertir(int m) {
        int d, h;
        d = m / 60;
        h = d / 24;
        if (d < 24) {
            System.out.println("El equivalente es de " + d + " horas");
        } else {
            System.out.println("el equivalente es de " + h + " dias y " + (d - (h * 24)) + " horas");
        }

    }
}
