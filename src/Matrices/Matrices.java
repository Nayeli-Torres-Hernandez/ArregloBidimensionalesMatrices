package Matrices;
import java.util.*;
public class Matrices{
    public static void main(String[] args){ 
        int [][] matrizTransB;
        int [][] matrizTransA;
        int Filas, Columnas;
    Scanner sc =new Scanner(System.in);
    
    //Definir tamaño f*c de las dos matrices
        System.out.println("Digite tamaño de las filas de las matrices:");
        Filas=sc.nextInt();
        System.out.println("Digite tamaño de las columnas de las matrices:");
        Columnas=sc.nextInt();
       
        int[][] matrizA = new int[Filas][Columnas];
        int[][] matrizB = new int [Filas][Columnas];
        matrizTransA=new int [Filas][Columnas];
        matrizTransB=new int [Filas][Columnas];

    //Matriz A
    System.out.println("Digite los números de la primera matriz"); 
    for (int i=0; i<matrizA.length; i++){
        for (int j=0; j<matrizA.length; j++){
       matrizA[i][j]=sc.nextInt();  
       matrizTransA[i][j]=matrizA[i][j];
        }
    }
         
    //Matriz B
    System.out.println("\nIngrese los números de la segunda matriz");
    for (int i=0; i<matrizA.length; i++){
        for (int j=0; j<matrizB.length; j++){
            matrizB[i][j]=sc.nextInt();
            matrizTransB[i][j]=matrizB[i][j];
        }
    }
    
    //Imprimir Matriz A
    System.out.println("Matriz A:");
    for (int i=0; i<matrizA.length; i++){
        System.out.println();
        for (int j=0; j<matrizA.length; j++){ 
            System.out.print(matrizA[i][j] + " ");
        }
    }
    
    //Imprimir Matriz B
    System.out.println("\nMatriz B:");
    for (int i = 0; i<matrizB.length; i++){
        System.out.println();
        for (int j=0; j<matrizB.length; j++){
            System.out.print(matrizB[i][j] + " ");
        }
    }
    
    //SUMA
     int [][] matrizSuma =new int [Filas][Columnas];
    System.out.println("\nSuma de las dos matrices. [A+B]");
    int suma=0;
    for (int i=0; i<matrizSuma.length; i++){
        for (int j=0; j<matrizSuma.length; j++){
            suma=matrizA[i][j]+matrizB[i][j];
            matrizSuma[i][j]=suma;
        }
        suma=0;
    }
    
    for (int i=0; i<matrizSuma.length; i++){
        System.out.println();
        for (int j=0; j<matrizSuma.length; j++){
            System.out.print(matrizSuma[i][j] + " ");
        }
    }
    
    //RESTA
        int [][] matrizResta= new int[Filas][Columnas];
    System.out.println("\nResta de las dos matrices. [A-B]:");
    int resta=0;
    for (int i=0; i<matrizResta.length; i++){
        for (int j=0; j<matrizResta.length; j++){
            resta=matrizA[i][j]-matrizB[i][j];
            matrizResta[i][j]=resta;
        }
        resta=0;
    }
    
    for (int i = 0; i <matrizResta.length; i++){
        System.out.println();
        for (int j=0; j<matrizResta.length; j++){
            System.out.print(matrizResta[i][j] + " ");
        }
    }
    suma=0;
    
    //MULTIPLICACIÓN
    int [][] matrizMultiplicación=new int [Filas][Columnas];
    System.out.println("\nResultado de la multiplicación de las matrices");
    for (int i = 0; i <matrizMultiplicación.length; i++){
        for (int j=0; j<matrizMultiplicación.length; j++){
            for(int Acumulador=0;Acumulador<matrizMultiplicación.length; Acumulador++){
                suma+=matrizA[i][Acumulador]*matrizB[Acumulador][j];
            }
            matrizMultiplicación[i][j]=suma;
            suma=0;
        }
    }
    
    for (int i = 0; i <matrizMultiplicación.length; i++){
        System.out.println();
        for (int j = 0; j <matrizMultiplicación.length; j++){
            System.out.print(matrizMultiplicación[i][j] + " ");
        }
    }
    
    //TRANSPUESTA A
    System.out.println("\nMatriz Transpuesta A:");
    for (int i=0; i<matrizTransA.length; i=i+1){
        System.out.println();
        for (int j=0; j<matrizTransA.length; j++){
            System.out.print(matrizTransA[j][i] + " ");
        }
    }
    
    //TRANSPUESTA B
    System.out.println("\nMatriz Transpuesta B:");
    for (int i=0; i<matrizTransB.length; i=i+1){
        System.out.println();
        for (int j=0; j<matrizTransB.length; j++){
            System.out.print(matrizTransB[j][i] + " ");
        }
    }

    }
}
