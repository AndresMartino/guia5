package Ejercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese numero");
        int num=leer.nextInt();
        if(num==0){
            System.out.println("El numero es  cero ");}
        else if((num%2)==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
     
    }
    
    
}
