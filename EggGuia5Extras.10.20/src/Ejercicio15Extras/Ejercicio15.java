/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package Ejercicio15Extras;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int opc;
        do {
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma " + suma());
                    break;
                case 2:
                    System.out.println("La resta " + resta());
                    break;
                case 3:
                    System.out.println("EL producto es " + producto());
                    break;
                case 4:
                    System.out.println("LA division es " + cociente());
                    break;
                case 5:
                    System.out.println("SALIENDO");
                    break;
                default:
                    System.out.println("Opcion incorrecta!!");
                    break;

            }
        } while (opc != 5);
    }

    public static double suma() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double a, b;
        System.out.println("Ingrese primer valor a sumar");
        a = leer.nextDouble();
        System.out.println("Ingrese segundo valor a sumar");
        b = leer.nextDouble();
        return a + b;
    }

    public static double resta() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double a, b;
        System.out.println("Ingrese primer valor a restar");
        a = leer.nextDouble();
        System.out.println("Ingrese segundo valor a restar");
        b = leer.nextDouble();
        return a - b;
    }

    public static double producto() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double a, b;
        System.out.println("Ingrese primer valor a multiplicar");
        a = leer.nextDouble();
        System.out.println("Ingrese segundo valor a multiplicar");
        b = leer.nextDouble();
        return a * b;
    }

    public static double cociente() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double a, b;
        System.out.println("Ingrese numerador para dividir");
        a = leer.nextDouble();
        System.out.println("Ingrese denominador para dividir");
        b = leer.nextDouble();
        while (b == 0) {
            System.out.println("ERROR! no se puede dividir por cero, vuelva a ingresar denominador");
            b = leer.nextDouble();
        }
        return a / b;
    }
}
