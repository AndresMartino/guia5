package Ejercicio5Extras;

import java.util.Locale;
import java.util.Scanner;

/*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.*/
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese Clase de socio");
        char clase = leer.next().charAt(0);
        while (!(clase == 'A' || clase == 'B' || clase == 'C')) {
            System.out.println("ERROR! ingrese clase: A,B o C");
            clase = leer.next().charAt(0);
        }
        System.out.println("Ingrese costo del tratamiento");
        double costo = leer.nextDouble();
        while (costo < 1) {
            System.out.println("ERROR! ingrese costo correcto");
            costo = leer.nextDouble();
        }
        obraSocial(clase, costo);
    }

    public static void obraSocial(char clase, double costo) {
        switch (clase) {
            case 'A':
                System.out.println("El costo del tratamiento con el descuento de clase " + clase + " es : $" + (costo * 0.5));
                break;
            case 'B':
                System.out.println("El costo del tratamiento con el descuento de clase " + clase + " es : $" + (costo * 0.65));
                break;
            case 'C':
                System.out.println("El costo del tratamiento con el descuento de clase " + clase + " es : $" + (costo * 1));
                break;

        }

    }
}
