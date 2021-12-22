package Ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println("Ingrese numero");
         int num=leer.nextInt();
         System.out.println("El doble de " +num+" es "+ (2*num));
         System.out.println("El triple de " +num+" es "+ (3*num));
         System.out.println("La raiz cuadradada de " +num+" es "+ Math.sqrt(num));
    }
    
}
