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
public class Eje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
         */

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del cuadrado");
        int tam = leer.nextInt();

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                
                if (i == 0 || j == 0 || j == tam - 1 || i == tam - 1) {
                System.out.print("* ");
            
                }else {
                System.out.print("  ");
                
            }
            
        }
            System.out.println("");

    }
    }
}

