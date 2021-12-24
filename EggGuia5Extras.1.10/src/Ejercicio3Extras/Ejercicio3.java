package Ejercicio3Extras;

import java.util.Locale;
import java.util.Scanner;

/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String*/
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese letra");
        char letra = leer.next().charAt(0);

        vocal(letra);
    }

    public static void vocal(char letra) {

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("No es una vocal");
                break;

        }

    }
}
