package Ejercicio19;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese cantidad de euros a comvertir");
        double euros = leer.nextDouble();
        String Conv;
        System.out.println("Ingrese moneda a la que quiera convertir");
        System.out.println("Dolar,Yen o Libra");
        Conv = leer.next();
        Conv = Conv.toUpperCase();
        //System.out.println(""+Conv);
        while (!(Conv.equals("DOLAR") || Conv.equals("YEN") || Conv.equals("LIBRA"))) {
            System.out.println("ERROR,imgrese ,moneda valida");
            System.out.println("Dolar,Yen o Libra");
            Conv = leer.next().toUpperCase();
        }
        convertir(euros, Conv);
    }

    public static void convertir(double euro, String Conv) {

        switch (Conv) {
            case "DOLAR":
                System.out.println("La conversion de " + euro + " a Doalres es $" + (euro * 0.86));
                break;
            case "LIBRA":
                System.out.println("La conversion de " + euro + " a Libras es £" + (euro * 1.28611));
                break;
            case "YEN":
                System.out.println("La conversion de " + euro + " a Yenes es ¥" + (euro * 129.852));
                break;

        }

    }
}
