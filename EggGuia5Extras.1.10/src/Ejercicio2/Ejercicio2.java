package Ejercicio2;
/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.*/
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println("Ingrese valor A");
         int A=leer.nextInt();
         System.out.println("Ingrese valor B");
         int B=leer.nextInt();
         System.out.println("Ingrese valor C");
         int C=leer.nextInt();
         System.out.println("Ingrese valor D");
         int D=leer.nextInt();
         cambiar(A,B,C,D);
    }
    
    public static void cambiar(int A, int B,int C,int D){
    int aux;
        System.out.println("Los valores antes del intercambio");
        System.out.println("A:"+A+" B:"+B +" C:"+C+ "D:"+D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("Los valores despues del intercambio");
        System.out.println("A:"+A+" B:"+B +" C:"+C+ " D:"+D);
    
    }
}
