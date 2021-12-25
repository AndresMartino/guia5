package Ejercicio14Extras;

import java.util.Locale;
import java.util.Scanner;

/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
todas las familias*/
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese cantidad de familias");
        int edad, suma = 0;
        int n = leer.nextInt();
        while (n < 1) {
            System.out.println("ERROR! ingrese cantidad valida");
            n = leer.nextInt();
        }
        int[][] Fam = new int[3][n];
        for (int i = 0; i < n; i++) {
            Fam[0][i]=i;
        }
        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese cantidad de hijos de la familia " + i);
            Fam[1][i] = leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < Fam[1][i]; j++) {
                System.out.println("Ingrese edades de los " + Fam[1][i] + " hijos de la familia " + i);
                edad = leer.nextInt();
                while (edad < 0 || edad > 99) {
                    System.out.println("ERROR! ingrese edad valida");
                    edad = leer.nextInt();
                }
                suma += edad;
            }
          
            Fam[2][i] = suma / Fam[1][i];           //me dio fiaca usar funciones
              suma=0;
        }
        System.out.println("");
        System.out.print("Familia  numero    ");
        for (int i = 0; i < n; i++) {
            System.out.print(Fam[0][i]+ "  ");
        }
        System.out.println("");
        System.out.print("Cantidad de hijos  ");
        for (int i = 0; i < n; i++) {
            System.out.print(Fam[1][i]+ "  ");
        }
        System.out.println("");
        System.out.print("Edad promedio     ");
        for (int i = 0; i < n; i++) {
            System.out.print(Fam[2][i]+ "  ");
        }
    }

}
