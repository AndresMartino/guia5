package Ejercicio16;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String frase;
        int c,inc;
        c=0;
        inc=0;
        do {
            System.out.println("Ingrese codigo");
            frase=leer.next();
            if (frase.length()==5 && frase.substring(0,1).equals("O") && frase.substring(4,5).equals("X") ) {
                c++;
            }else if(!frase.equals("&&&&&")){
            inc++;
            }   
            
        } while (!frase.equals("&&&&&"));
        System.out.println("Las lecturas correctas fueron "+c+" y las incorrectas "+inc);
        
        
    }
    
}
