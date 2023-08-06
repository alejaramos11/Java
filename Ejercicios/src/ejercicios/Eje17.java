/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alejandra
 */
public class Eje17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos).
         */
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int[] vector = new int[tam];
        int aux = 0;

        llenarVectorAleatorio(vector, tam);

        for (int j = 1; j < 6; j++) {
            for (int i = 0; i < tam; i++) {
                if (String.valueOf(vector[i]).length() == j) {
                    aux++;
                }
                
            }
            System.out.println("el vector tiene "+aux+" numeros de " +j +" digitos");
        }
    }

    public static void llenarVectorAleatorio(int[] vector, int tam) {
        Random azar = new Random();
        for (int i = 0; i < tam; i++) {
            vector[i] = azar.nextInt(99999);
            System.out.print("[ "+vector[i]+" ]");

        }
        System.out.println("");
    }
}
