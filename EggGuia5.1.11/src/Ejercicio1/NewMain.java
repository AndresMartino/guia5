package Ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
       System.out.println("Ingrese primer numero a sumar");
       int num1=leer.nextInt();
        System.out.println("Ingrese segundo numero a sumar");
       int num2=leer.nextInt();
        System.out.println("La suma entre "+num1+" y "+num2+" es " +(num1+num2));
    }
    
}
