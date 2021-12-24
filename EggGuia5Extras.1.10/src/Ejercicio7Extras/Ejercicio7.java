package Ejercicio7Extras;

import java.util.Locale;
import java.util.Scanner;

/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”*/
public class Ejercicio7 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println("ingrese la cantidad de numeros a introducir");
         int n=leer.nextInt();
         while(n<1 ){
             System.out.println("ERROR! ingrese cantidad valida");
             n=leer.nextInt();
         }
         versionW(n);
         versionDo(n);
    }
    /*--------------------------------VERSION WHILE----------------------*/
    public static void versionW(int n){
         Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int num,inicio=n,mayor=0,menor=0,acu=0;
    while(n>0){
        System.out.println("ingrese numero");
        num=leer.nextInt();
        if (n==inicio) {
            mayor=menor=num;
        }
        if (num>mayor) {
            mayor=num;
        }else if(num<menor){
            menor=num;
        }
        acu=acu+num;
        n--;
    }
        System.out.println("El mayor es : "+mayor);
         System.out.println("El menor es : "+menor);
         System.out.println("El promedio es : "+acu/inicio);
    }
    /*--------------------------------VERSION Do WHILE----------------------*/
    public static void versionDo(int n){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int num,inicio=n,mayor=0,menor=0,acu=0;
        do {
            System.out.println("ingrese numero");
        num=leer.nextInt();
        if (n==inicio) {
            mayor=menor=num;
        }
        if (num>mayor) {
            mayor=num;
        }else if(num<menor){
            menor=num;
        }
        acu=acu+num;
        n--;
            
        } while (n>0);
         System.out.println("El mayor es : "+mayor);
         System.out.println("El menor es : "+menor);
         System.out.println("El promedio es : "+acu/inicio);
    
    }
}
