package Ejercicio18Extras;

import java.util.Locale;
import java.util.Scanner;

/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.*/
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese dimension del vector");
        int n=leer.nextInt();
        double[] V=new double [n];
        cargar(V,n);
        sumar(V,n);
    }
     /*///////////////////////FUNCION CARGAR////////////////////*/
    public static void cargar(double[] V,int n){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese valor del vector en la posicion "+i);
            V[i]=leer.nextDouble();
        }
        
    }
    /*///////////////////////FUNCION SUMAR////////////////////*/
    public static void sumar(double[] V,int n){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double suma=0;
        for (int i = 0; i < n; i++) {
            suma=suma+V[i];
        }
        System.out.println("La suma de los "+n+" elementos del vector es "+suma);
    }
}
