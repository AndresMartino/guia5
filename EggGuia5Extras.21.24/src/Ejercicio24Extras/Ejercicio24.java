package Ejercicio24Extras;

import java.util.Locale;
import java.util.Scanner;

/*Realizar un programa que complete un vector con los N primeros números de la
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de
los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por
ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que
reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
https://quantdare.com/numeros-de-fibonacci/*/
public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese numero de terminos de la serie fibonacci");
        int n = leer.nextInt();
        while(n<1){
            System.out.println("ERROR! ingrese numero de termino valido");
            n=leer.nextInt();
        }
        int[] F=new int[n];
        cargar(F,n);
        mostrar(F,n);
    }
public static void cargar(int[] F,int n){
int a=0,b=1,c;
    for (int i = 0; i < n; i++) {
        
        F[i]=b;
        c=a+b;
        a=b;
        b=c;
        
    }

}
     public static void mostrar(int[] F,int n){
     
         for (int i = 0; i < n; i++) {
             System.out.print(F[i]+" ");
         }
}   
}
