/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probando;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Martino
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
       int max = 99;
        int min = 0;
        int range = max - min + 1;
  
        // generate random numbers within 1 to 10
        for (int i = 0; i < 8; i++) {
            int rand = (int)(Math.random() * range) + min;
  
            // Output is different everytime this code is executed
            System.out.println(rand);
        }
    }
    
}
