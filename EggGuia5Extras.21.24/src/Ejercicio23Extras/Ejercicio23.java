package Ejercicio23Extras;

import java.util.Locale;
import java.util.Scanner;

/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con un
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random().*/
public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int n = 20;
        String[][] M = new String[n][n];
        cargar(M, n);
        mostrar(M,n);
    }
/*///////////////////FUNCION CARGAR /////////////////////////////*/
    public static void cargar(String[][] M, int n) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String pal;
        int f,c,con,r=0,p;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese palabra pa la sopa de letters");
            pal=leer.next();
            while(pal.length()<3 || pal.length()>5 ){
                System.out.println("ERROR!la palabra tiene que tener entre 3 y 5 caracteres");
                pal=leer.next();
            }
            f=(int)(Math.random()*19+1);    //defino la fila aleatoria
            
            c=(int)(Math.random()*14+1);       //defino la columna aleatoria 
           con=pal.length();                    //defino la longitud de la palabra
            for (int j = c; j < (c+con); j++) {         //me posiciono dentro de la matriz para cargar la palabra
                M[f][j]=pal.substring(r,r+1);
                r++;
            }                                       //QUEDA CONSIDERAR QUE SE SUPERPONGAN NOMAS
            r=0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (M[i][j] == null) {
                    M[i][j]="3";
                }
            }
        }

    }
    /*///////////////////////////FUNCION MOSTRAR///////////////////////*/
    public static void mostrar(String[][] M,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(M[i][j]+" ");
            }
            System.out.println("");
        }
    
    }
}
