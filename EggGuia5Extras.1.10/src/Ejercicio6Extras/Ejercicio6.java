package Ejercicio6Extras;

import java.util.Locale;
import java.util.Scanner;
/*Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.*/
public class Ejercicio6 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println("Ingrese cantidad de personas");
         int n=leer.nextInt();
         while(n<1){
             System.out.println("ERROR! ingrese cantidad valida");
             n=leer.nextInt();
         }
         estaturas(n);
    }
    public static void estaturas(int n){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double s,pBajo=0,pGeneral=0;
        int c=0;
        for (int i = 1; i <= n; i++) {
            System.out.println("ingrese estatura de la persona numero "+i);
            s=leer.nextDouble();
            pGeneral=pGeneral+s;
            if (s<1.6) {
                pBajo=pBajo+s;
                c++;
            }
        }
        System.out.println("El promedio general de esaturas es :"+(pGeneral/n)+"m");
         System.out.println("El promedio de esaturas de menos de 1.6 m es :"+(pBajo/c)+"m");
    }
}
