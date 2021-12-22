package Ejercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double F;
        System.out.println("Ingrese temperatura en grados centigrados");
        double grados=leer.nextDouble();
        F=32+(9*(grados/5));
        System.out.println("En grados Farenheits es "+F);
    }
    
}
