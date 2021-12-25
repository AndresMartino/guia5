package Ejercicio12Extras;

import java.util.Locale;
import java.util.Scanner;
/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.*/
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String con, c = "", c1 = "", c2 = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    c = String.valueOf(k);
                    c1 = String.valueOf(j);
                    c2 = String.valueOf(i);
                    if (c.equals("3")) {
                        c = "E";
                    }
                    if (c1.equals("3")) {
                        c1 = "E";
                    }
                    if (c2.equals("3")) {
                        c2 = "E";
                    }
                    System.out.println(c2 + "-" + c1 + "-" + c);
                }

            }
        }
    }

}
