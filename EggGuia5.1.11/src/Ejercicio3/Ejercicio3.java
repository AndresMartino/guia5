package Ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        System.out.println("La frase en mayusculas es " + frase.toUpperCase());
        System.out.println("La frase en minisculas es " + frase.toLowerCase());
    }

}
