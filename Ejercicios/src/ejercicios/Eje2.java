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
public class Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y 
          lo muestre por pantalla.
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese su nombre");
        
        String nombre = leer.nextLine();
        
        System.out.println("Su nombre es "+nombre);
        
        

    }
    
}
