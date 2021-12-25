/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”.
 */
package Ejercicio16Extras;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese numero de personas");
        int n=leer.nextInt();
        String[] nombres=new String[n]; 
        int[] anios=new int[n];
        edad(nombres,anios,n);
        mostrar(nombres,anios,n);
    }
    public static void edad(String[] nombres,int[] anios,int n){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese nombre de la persona "+i);
            nombres[i]=leer.next();
            System.out.println("Ingrese la edad de "+ nombres[i]);
            anios[i]=leer.nextInt();
            while(anios[i]<1){
            System.out.println("ERROR! Ingrese la edad de "+ nombres[i]);
            anios[i]=leer.nextInt();
            }
        }
    }
    public static void mostrar(String[] nombres,int[] anios,int n){
         Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String opc;
        for (int i = 0; i < n; i++) {
            if (anios[i]>=18) {
                System.out.println(nombres[i]+" es mayor de edad");
            }else{
                System.out.println(nombres[i]+" es menor de edad");
            }
            System.out.println("Dese seguir viendo nombres? (si/no)");
            opc=leer.next().toUpperCase();
            if (opc.equals("NO")) {
                break;
            }
        }
        
    }
}
