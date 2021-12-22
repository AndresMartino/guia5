package Ejercicio13;

import java.util.Locale;
import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. */
public class Ejercicio13{

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int suma,valor;
        System.out.println("Ingrese limite postivo");
        int limite=leer.nextInt();
        suma=0;
        while(suma<limite){
            System.out.println("Ingrese valor");
            valor=leer.nextInt();
            suma=suma+valor;
        }
        System.out.println("La suma es "+suma);
    }
    
}
