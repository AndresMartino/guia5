package Ejercicio18;

/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int num;
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese numero entre 1 y 20");
            num = leer.nextInt();
            while (num < 1 || num > 20) {
                System.out.println("ERROR! ingrese numero correcto");
                num = leer.nextInt();
            }
            
            switch (i) {
                case 0:
                    //num1 = num;
                    System.out.print(""+num);
                    for (int j = 0; j < num; j++) {
                        System.out.print("*");
                    }
                    break;
                case 1:
                   // num2 = num;
                    System.out.print(""+num);
                    for (int j = 0; j < num; j++) {
                        System.out.print("*");
                    }
                    break;
                case 2:
                    //num3 = num;
                    System.out.print(""+num);
                    for (int j = 0; j < num; j++) {
                        System.out.print("*");
                    }
                    break;
                case 3:
                    //num4 = num;
                    System.out.print(""+num);
                    for (int j = 0; j < num; j++) {
                        System.out.print("*");
                    }
                    break;
            }
        }
    }
}
