package Ejercicio11Extras;

import java.util.Locale;
import java.util.Scanner;
/*Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo entero
truncan los números o resultados.*/
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese numero");
        int n=leer.nextInt();
        digitos(n);
        
    }
    public static void digitos(int n){
    int div=10,con=0,res;
        do {
            res=n/div;
            con++;
            div*=10;
        } while (res>=1);
        System.out.println("El numero "+n+ " tiene "+con+" digitos");
    }
}
