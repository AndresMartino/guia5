package Ejrcicio9Extras;

import java.util.Locale;
import java.util.Scanner;
/*Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Consultá acá.*/
public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int aux;
        System.out.println("ingrese numero a restar");
        int num1=leer.nextInt();
        while(num1<1){
            System.out.println("ERROR! ingrese num positivo");
            num1=leer.nextInt();
        }
        System.out.println("ingrese numero a restar");
        int num2=leer.nextInt();
        while(num2<1){
            System.out.println("ERROR! ingrese num positivo");
            num2=leer.nextInt();
        }
        if(num1<num2){
            aux=num1;
            num1=num2;
            num2=aux;
        }
        resta(num1,num2);
    }
    
    public static void resta(int n1, int n2){
        int c=0;
        do {
            n1=n1-n2;
            c++;
        } while (n1>n2);
        System.out.println("el cociente es "+n1+" y el resto es "+c);
        
    }
}
