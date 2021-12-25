package Ejercicio17Extras;

import java.util.Locale;
import java.util.Scanner;
/*Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/
public class Ejercicio17 {

     
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese numero");
        int n=leer.nextInt();
      if (primo(n)){
          System.out.println("El numero "+n+" es primo");
      }else{
          System.out.println("El numero "+n+" no es primo");
      }
    }
    public static boolean primo(int n){
        int c=0;
        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                c++;
            }
        }
        if(c==2){
        return true;
        
        }else{
        return false;
        }
        
        
    }
    
}
