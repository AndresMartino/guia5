package Ejercicio12;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int nota;
        System.out.println("ingrese nota");
        nota=leer.nextInt();
        while(nota<1 || nota>10){
            System.out.println("ERROR! Ingrese nota entre 1 a 10");
            nota=leer.nextInt();
        }
        System.out.println("La nota ingresada es "+nota);
        
    }
    
}
