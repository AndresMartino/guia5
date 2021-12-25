package Ejercicio20Extras;

import java.util.Locale;
import java.util.Scanner;

/*Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.*/
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese dimension del vector");
        int n = leer.nextInt();
        int[] V = new int[n];
        cargar(V, n);
        mostrar(V, n);

    }
/*//////////////////////FUNCION CARGAR/////////////////*/
    public static void cargar(int[] V, int n) {
        for (int i = 0; i < n; i++) {
            V[i] = (int) (Math.random() * 10 + 1);
        }

    }
/*////////////////////FUNCION MOSTRAR///////////////////*/
    public static void mostrar(int[] V, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(V[i] + " ");
        }

    }
}
