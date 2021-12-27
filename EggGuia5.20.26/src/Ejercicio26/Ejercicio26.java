package Ejercicio26;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         int [][]M10=new int[10][10];
         int [][]M3=new int[3][3];
         cargarMatrices(M10,M3);
         inside(M10,M3);
    }
    public static void cargarMatrices(int[][] M,int[][] M3){
    /*---------------me tomo el trabajo de cargar la bendita matriz para poder comprobar de antemano, o sino puedo definir valores aleatorios--------------------*/
     Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    M[0][0]=1;M[0][1]=26; M[0][2]=36;M[0][3]=47; M[0][4]=5;M[0][5]=6; M[0][6]=72;M[0][7]=81; M[0][8]=95;M[0][9]=10;
    M[1][0]=11;M[1][1]=12; M[1][2]=13;M[1][3]=21; M[1][4]=41;M[1][5]=22; M[1][6]=67;M[1][7]=20; M[1][8]=10;M[1][9]=61;
    M[2][0]=56;M[2][1]=78; M[2][2]=87;M[2][3]=90; M[2][4]=9;M[2][5]=90; M[2][6]=17;M[2][7]=12; M[2][8]=87;M[2][9]=67;
    M[3][0]=41;M[3][1]=87; M[3][2]=24;M[3][3]=56; M[3][4]=97;M[3][5]=74; M[3][6]=87;M[3][7]=42; M[3][8]=67;M[3][9]=45;
    M[4][0]=32;M[4][1]=76; M[4][2]=79;M[4][3]=1; M[4][4]=36;M[4][5]=5; M[4][6]=67;M[4][7]=98; M[4][8]=12;M[4][9]=11;
    M[5][0]=99;M[5][1]=13; M[5][2]=54;M[5][3]=88; M[5][4]=89;M[5][5]=90; M[5][6]=75;M[5][7]=12; M[5][8]=41;M[5][9]=76;
    M[6][0]=67;M[6][1]=78; M[6][2]=87;M[6][3]=45; M[6][4]=14;M[6][5]=22; M[6][6]=26;M[6][7]=42; M[6][8]=56;M[6][9]=78;
    M[7][0]=98;M[7][1]=45; M[7][2]=34;M[7][3]=23; M[7][4]=32;M[7][5]=56; M[7][6]=74;M[7][7]=16; M[7][8]=19;M[7][9]=18;
    M[8][0]=24;M[8][1]=67; M[8][2]=97;M[8][3]=46; M[8][4]=87;M[8][5]=13; M[8][6]=67;M[8][7]=89; M[8][8]=93;M[8][9]=24;
    M[9][0]=21;M[9][1]=68; M[9][2]=78;M[9][3]=98; M[9][4]=90;M[9][5]=67; M[9][6]=12;M[9][7]=41; M[9][8]=65;M[9][9]=12;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               System.out.println("ingrese matriz 3x3 ["+i+"]["+j+"]");
                M3[i][j]=leer.nextInt();
            }
       }
// M3[0][0]=36;M3[0][1]=5; M3[0][2]=67;
// M3[1][0]=89; M3[1][1]=90;M3[1][2]=75;
// M3[2][0]=14;M3[2][1]=22; M3[2][2]=26;
    
    }
    /*----------------------------FUNCION INSIDE-------------------------*/
    public static void inside(int[][] M10, int[][] M3) {
        int posi=0, posj=0,c=0,ci=0,cc=0;
        boolean log=false;
        for (int i = 0; i < 10 - 2; i++) {
            for (int j = 0; j < 10 - 2; j++) {
                if (M3[0][0] == M10[i][j]) {
                    posi = i;
                    posj = j;
                    log=comprobar(M10,M3,posi,posj);
                    if(log){
                    break;
                    }
                }
              if(log){
                    break;
                
            }
        }
        }
        if (log==true) {
            System.out.println("La matriz de 3x3 esta contenida en la de 10x10 y comienza en la posicion ["+posi+"]["+posj+"]");
        }else{
            System.out.println("La matriz de 3x3 no se encuentra contenida en la de 10x10");
        }

    
    }
    
    /*-----------------------------FUNCION COMPROBAR---------------------------------*/
    public static boolean comprobar(int[][] M10,int[][] M3,int posi,int posj){
    int[][] M=new int[3][3];
    int c=0,d=0,cont=0;
        for (int i = posi; i < posi+3; i++) {
            for (int j = posj; j < posj+3; j++) {
                M[c][d]=M10[i][j];
                d++;
            }
            c++;
            d=0;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (M[i][j]==M3[i][j]) {
                    cont++;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(M[i][j]+" ");
            }
            System.out.println("");
        }
        return cont==9;
    
    }
}

    
    

    
    