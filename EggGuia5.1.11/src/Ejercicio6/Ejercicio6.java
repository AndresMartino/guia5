package Ejercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese primer numero");
        int num1=leer.nextInt();
         System.out.println("Ingrese segundo numero");
        int num2=leer.nextInt();
        if(num1>num2){
            System.out.println("El numero "+num1+" es mayor que "+num2);
        }else if(num2>num1){
             System.out.println("El numero "+num2+" es mayor que "+num1);
        }else{
         System.out.println("El numero "+num1+" es igual que "+num2);
        }
    
    }
    
    
}
