package Ejercicio8Extras;

import java.util.Locale;
import java.util.Scanner;

/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.*/
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese cantidad de numeros a leer");
        int n = leer.nextInt();
        while (n < 1) {
            System.out.println("ERROR! ingrese cantidad correcta");
            n = leer.nextInt();
        }
        cargar(n);

    }

    public static void cargar(int n) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int num, suma = 0, cPares = 0, cImpares = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese numero " + i);
            num = leer.nextInt();
            if (num % 5 == 0) {
                break;
            } else if (num > 0) {
                if (num % 2 == 0) {
                    cPares++;
                } else {
                    cImpares++;
                }
            }
        }
        System.out.println("La cantidad de numeros pares es " + cPares);
        System.out.println("La cantidad de numeros impares es " + cImpares);
        System.out.println("El total de numeros leidos es " + (cPares + cImpares));
    }

}
