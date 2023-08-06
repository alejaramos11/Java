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
public class Eje16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
        al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        numero y si se encuentra repetido
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int[] vector = new int[tam];

        llenarVectorAleatorio(vector, tam);
        
        System.out.print("Ingrese el número a buscar: ");
        int num = leer.nextInt();
        int cant=0;
        
        for (int i = 0; i < tam; i++) {
            if (vector[i]== num ){
            System.out.println("el numero " +num +" se encontró en la posición " +i);
            cant++;
            } 
        }
        if (cant>1) {
            System.out.println("El numero " +num +" se repitió " +cant +" veces");
        }
        else if (cant==1) {
        System.out.println("El numero está una vez en el vector");        
        } else {
                
                System.out.println("El numero no está en el vector");
            }
    }   
    public static void llenarVectorAleatorio(int[] vector, int tam) {
        Random azar = new Random();
        for (int i = 0; i < tam; i++) {
            vector[i] = azar.nextInt(5);
            System.out.print("[ "+vector[i]+" ]");
        }
    }           
        }
   
    


        

