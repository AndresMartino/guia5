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
        /*hallo el equivalente en horas de los minutos*/
        h = m / 60;
        /*aca hallo el equivalente en dias, esto queda redondeado para abajo*/
        d = h / 24;
        /*pregunto si las horas son menores a 24 y muestro simplemente la cantidad de horas, si no muestro los dias y la resta entre las horas y el dia para sacar las horas que van en un dia*/
        if (h < 24) {
            System.out.println("El equivalente es de " + h + " horas");
        } else {
            System.out.println("el equivalente es de " + d + " dias y " + (h - (d * 24)) + " horas");
        }

    }
}