package Ejercicio23Extras;


import java.util.Random;

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
public class Ejercicio23{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int n = 20;
        String[][] M = new String[n][n];
        cargar(M, n);
        terminarDeCargar(M,n);
        mostrar(M,n);
    }
/*///////////////////FUNCION CARGAR /////////////////////////////*/
    public static void cargar(String[][] M, int n) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        //defino mi obejto random, me va a servir para poner las letras aleatorias
        Random random=new Random();
        String pal;
        char l;
        int f,c,con,r=0;
        /* con este for me encargo de pedir las 5 palabras que pide el problema*/
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese palabra pa la sopa de letters");
            pal=leer.next();
        /*valido cada palabra ingresada para que la longitud este entre 3 y 5 caracteres*/
            while(pal.length()<3 || pal.length()>5 ){
                System.out.println("ERROR!la palabra tiene que tener entre 3 y 5 caracteres");
                pal=leer.next();
            }
        /*defino mi fila random para poner la palabra ingresada*/
            f=(int)(Math.random()*19+1);   
         /* Verifico que la primer posicion de la fila random este vacia, 
            esto para que no se superpongan las palabras en la sopa*/
            while(M[f][0]!=null){
            f=(int)(Math.random()*19+1); 
            }
            /*defino tambien una columna aleatoria, para que las palabras se ingresen en disitntas posiciones
           , de forma arbitraria hagoa que las columnas aleatorias como maximo sean hasta la 14 , esto
           es por que la palabra mas larga puede ser de 5 caracteres entonces no se sale de la matriz al cargarse 
            */
            c=(int)(Math.random()*14+1);   
            /*averiguo la longitud de la palabra para cargarla*/
           con=pal.length();    
           /*en este for me pocisiono en la columna aleatoria y cargo la palabra ingresada, letra por letra dentro de la matriz*/
            for (int j = c; j < (c+con); j++) {         
                M[f][j]=pal.substring(r,r+1);
                r++;
            }                                      
            r=0;
        /*aca termino de llenar esa fila con letras aleatorias, esto es para la condicion de mas arriba donde pregunto
            para que las palabras no esten en las mismas filas y se superpongan
            */
        for (int j = 0; j < n; j++) {         
                if (M[f][j] == null) {
                    l=(char)(random.nextInt(26) + 'a');             //asi puedo obtener letras aleatorias y concatenar en la matriz de strings
                    M[f][j]=l+"";
                
            }                                       
            
        }
        

    }
    }
    /*esta funcion sirve para terminar de cargar la matriz de letras aleatorias, por que en la funcion cargar
    solo llene cada fila que contenia una palabra para tener de condicion de no repeticion de filas, recien ahora
    puedo terminar de cargar la matriz
    */
    public static void terminarDeCargar(String[][] M,int n){
        Random random=new Random();
        char l;
        //recorro la matriz preguntando si la posicion esta vacia , si lo esta le doy una letra random
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (M[i][j] == null) {
                    l=(char)(random.nextInt(26) + 'a');
                    M[i][j]=l+"";
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