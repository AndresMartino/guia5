package Ejercicio19Extras;

import java.util.Locale;
import java.util.Scanner;
/*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos)*/
public class Ejercicio19 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println("Ingrese dimension de los vectores");
         int n=leer.nextInt();
         int[] V1=new int[n];
          int[] V2=new int[n];
          cargar(V1,n);
          cargar(V2,n);
         if (comparar(V1,V2,n)){
             System.out.println("Son iguales");
         }else{
             System.out.println("NO son iguales");
         }
    }
    /*/////////////////////////FUNCION CARGAR///////////////////*/
    public static void cargar(int[] V,int n){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < n; i++) {
            System.out.print("Cargar valor del vector en la posicion "+i+" :");
            V[i]=leer.nextInt();
            System.out.println("");
        }
        
        
    }
      /*/////////////////////////FUNCION COMPARAR///////////////////*/
    public static boolean comparar(int[] V1,int[] V2,int n){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < n; i++) {
           if(V1[i]!=V2[i]){
               return false;
               
           }
            
           
        }
        return true;
        
    }
}
