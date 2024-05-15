package ejercicios.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño");
        int tam = sc.nextInt();
        //cuadrado relleno
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.printf("*");
                System.out.printf(" ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
        //cuadrado vacio
        for(int x= 0; x<tam; x++){
            for (int z = 0; z<tam; z++){
                if(x == 0 || x == tam-1){
                    System.out.print("*");
                    System.out.print(" ");
                }else if(z == 0 || z == tam-1){
                    System.out.print("*");
                    System.out.print(" ");
                }else{
                    System.out.printf(" ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //triangulo
        for (int k = 0; k<tam; k++){
            for (int j = 0; j<k; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //Imprimir un X
        for (int f=0; f<=tam; f++){
            for(int g = 0 ; g<=tam; g++){
                if(f == g || f + g == tam ){
                    System.out.print("\u001B[34m" + "*" + "\u001B[0m");
                    System.out.print(" ");
                }else{
                    System.out.print("\u001B[31m" + "*" + "\u001B[0m");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        // imprimir una Z
        for(int a=0; a<=tam; a++){
            for(int b=0; b<=tam; b++){
                if(a == 0 || a == tam){
                    System.out.print("* ");
                }else if(a + b == tam){
                    System.out.print("* ");
                }else{
                    System.out.print("\u001B[36m" + "* " + "\u001B[0m");
                }
            }
            System.out.println();
        }

        System.out.println();
        //escalera invertida
        for (int k = tam; k>0; k--){
            for (int j = 0; j<k; j++){
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}