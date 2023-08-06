/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author alejandra
 */
public class Eje19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
        una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
        de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
         */
        int matriz[][] = new int[3][3];

        System.out.println("La matriz inicial es ");
        llenarMatriz(matriz);
        mostrarMatriz(matriz);

        System.out.println("La matriz transpuesta es ");
        transponerMatriz(matriz);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == -matriz[j][i]) {

                }

            }

        }
        System.out.println("La matriz es anti simétrica");
    }

    public static void llenarMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero para la posicion (" + i + " , " + j + ")");
                matriz[i][j] = leer.nextInt();

            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");
        }

    }

    public static void transponerMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + matriz[j][i] + " ]");
            }
            System.out.println("");
        }

    }
}
