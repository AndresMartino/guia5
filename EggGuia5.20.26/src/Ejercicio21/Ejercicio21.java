package Ejercicio21;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese tamaño del vector");
        int n=leer.nextInt();
        double[] V=new double[n];
        System.out.println("Ingrese numero a buscar dentro del vector");
        int buscar=leer.nextInt();
        Buscar(V,buscar,n);
    }
    public static void Buscar(double[] V,int b,int n){
        int pos,c;
        c=0;
        pos=0;
        for (int i = 0; i < n; i++) {
            V[i]=Math.floor(Math.random()*6+1);             
        }
        for (int i = 0; i < n; i++) {
            if(V[i]==b){
            pos=i;
            c++;
            
            }
        }
        switch (c) {
            case 0:
                System.out.println("el valor "+b+" no se encontro en el vector");
                break;
            case 1:
                System.out.println("El valor "+b+" se econontro en el vector en la posicion "+pos);
                break;
            default:
                System.out.println("El valor "+b+" se encontro en la posicion "+pos+" y esta repetido");
                break;
        }
         for (int i = 0; i < n; i++) {
             System.out.print(V[i]+" ");
        }
    }
}
