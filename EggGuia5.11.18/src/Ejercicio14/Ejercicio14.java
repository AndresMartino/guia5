package Ejercicio14;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese primer numero a operar");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese segundo numero a operar");
        double num2 = leer.nextDouble();
        int opc;
        String salir;
        salir = "N";
         System.out.print("\033[H\033[2J");
            System.out.flush();
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("      MENU     ");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("La suma entre " + num1 + " y " + num2 + " es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta entre " + num1 + " y " + num2 + " es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El producto entre " + num1 + " y " + num2 + " es " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero");
                    } else {
                        System.out.println("El cociente entre " + num1 + " y " + num2 + " es " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Seguro que desea salir (S/N)?");
                    salir = leer.next();
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;

            }

        } while (!salir.equals("S"));

    }

}
