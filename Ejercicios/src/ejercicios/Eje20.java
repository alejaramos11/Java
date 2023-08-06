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
public class Eje20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.
         */

        int matriz[][] = new int[3][3];

        llenarMatriz(matriz);
        System.out.println("La matriz inicial es ");
        mostrarMatriz(matriz);
        
        esMagica(matriz);
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

    public static void esMagica(int[][] matriz) {
        int sumaDiag1 = 0;
        int sumaDiag2 = 0;
        int sumaFilas = 0;
        int sumaColumnas = 0;
        
        int contador=0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFilas += matriz[i][j];
                sumaColumnas += matriz[i][j];
                
            }
            if (sumaFilas==sumaColumnas) {
                contador++;
            }
            sumaDiag1 += matriz[i][i];
            sumaDiag2 += matriz[i][(3-1-i)];
            

        }
        if (contador == 3) {
            System.out.println("La matriz es un cuadro magico");
        } else {
            System.out.println("La matriz NO es un cuadro magico");
        }
    }
}

