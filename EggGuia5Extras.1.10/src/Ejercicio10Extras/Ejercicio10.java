package Ejercicio10Extras;

import java.util.Locale;
import java.util.Scanner;

/*Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java.*/
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        adivinar();
    }

    public static void adivinar() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int n1, n2, res, num;
        n1 = (int) (Math.random() * 10 + 1);
        n2 = (int) (Math.random() * 10 + 1);
        res = n1 * n2;
        do {
            System.out.println("Ingrese numero para adivinar");
            num = leer.nextInt();
            if(num==res){
                System.out.println("Numero correcto!!!");
            }else if(num<res){
                System.out.println("el numero es mayor,vuelve a intentar");
            }else{
                 System.out.println("el numero es menor,vuelve a intentar");
            }
        } while (res != num);

    }
}
