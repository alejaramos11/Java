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
public class Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados ");
        double grados = leer.nextDouble();
        
        double Fahrenheit = 32 + ((9* grados) / 5);
        
        System.out.println("Los grados en Fahrenheit es " + Fahrenheit);
        
        
        
    }
    
}
