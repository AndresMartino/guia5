package Ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println("Ingrese nombre");
         String nombre=leer.next();
         System.out.println("Mi nombre es "+nombre);
    }
    
}
