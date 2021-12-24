package Ejercicio4Extras;

import java.util.Locale;
import java.util.Scanner;

/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
¿No te acordás los números romanos? Consultalos acá.*/
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese Numero a convertir a romano");
        int n = leer.nextInt();
        while(n<1 || n>10){
            System.out.println("ERROR! ingrese numero entre 1 y 10");
            n=leer.nextInt();
        }
        romano(n);
    }

    public static void romano(int n) {
        String num="";
        switch (n) {
            case 1:
                num = "I";
                break;
            case 2:
                num = "II";
                break;
            case 3:
                num = "III";
                break;
            case 4:
                num = "IV";
                break;
            case 5:
                num = "V";
                break;
            case 6:
                num = "VI";
                break;
            case 7:
                num = "VII";
                break;
            case 8:
                num = "VIII";
                break;
            case 9:
                num = "IX";
                break;
            case 10:
                num = "X";
                break;

        }
        System.out.println("el numero "+n+" en romanos es "+num);

    }
}
