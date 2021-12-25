package Ejercicio21Extras;

import java.util.Locale;
import java.util.Scanner;

/*Los profesores del curso de programación de Egg necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.*/
public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int n = 2;
        int f = 4;
        double[][] M = new double[f][n];
        double[] V = new double[n];
        cargarNotas(M, f, n);
        cargarVector(M, V, f, n);
        aprobados(V, n);

    }
/*////////////////////FUCNION CARGAR NOTAS(USO UNA MATRIZ PARA TENER TODAS LAS NOTAS)//////////////*/
    public static void cargarNotas(double[][] M, int f, int n) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < f; j++) {
                switch (i) {
                    case 0:
                        do{
                        System.out.println("Ingrese nota del primer trabajo practico del alumno " + j);
                        M[j][i] = leer.nextDouble();
                        }while(M[j][i]<0 || M[j][i]>10);
                        break;
                    case 1:
                        do{
                        System.out.println("Ingrese nota del segundo trabajo practico del alumno " + j);
                        M[j][i] = leer.nextDouble();
                        }while(M[j][i]<0 || M[j][i]>10);
                        break;
                    case 2:
                        do{
                        System.out.println("Ingrese nota del primer integrador del alumno " + j);
                        M[j][i] = leer.nextDouble();
                        }while(M[j][i]<0 || M[j][i]>10);
                        break;
                    case 3:
                        do{
                        System.out.println("Ingrese nota del segundo integrador del alumno " + j);
                        M[j][i] = leer.nextDouble();
                        }while(M[j][i]<0 || M[j][i]>10);
                        break;
                    default:
                        break;
                }
            }
        }

    }
/*//////////////////////FUNCION CARGAR VECTOR(CON LAS NOTAS CARGADAS EN LA MATRIZ HALLO EL PROMEDIO)////*/
    public static void cargarVector(double[][] M, double[] V, int f, int n) {
        double n1 = 0, p = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < f; j++) {
                switch (j) {
                    case 0:
                        n1 = M[j][i] * 0.1;
                        break;
                    case 1:
                        n1 = M[j][i] * 0.15;
                        break;
                    case 2:
                        n1 = M[j][i] * 0.25;
                        break;
                    case 3:
                        n1 = M[j][i] * 0.5;
                        break;
                }
                p = p + n1;

            }
            V[i] = p;
            p = 0;
        }

    }
/*//////////////////FUNCION MSOTRAR(MUESTRO LA MATRIZ Y MUESTRO LAS CANTIDADES DE DESAPROBADOS Y APROBADOS)////*/
    public static void aprobados(double[] V, int n) {
        int ap = 0, des = 0;
        System.out.println("Los promedios son");
        for (int i = 0; i < n; i++) {
            System.out.print(V[i] + " ");
            if (V[i] >= 7) {
                ap++;
            } else {
                des++;
            }
        }
        System.out.println("");
        System.out.println("La cantidad de aprobados es " + ap);
        System.out.println("La cantidad de desaprobados es " + des);
    }
}
