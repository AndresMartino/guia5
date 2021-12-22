package Ejercicio9;
/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese palabra");
        String palabra=leer.next();
        if(palabra.length()==8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
