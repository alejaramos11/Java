/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author alejandra
 */
public class EjeExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
        String.
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") ||letra.equals("O") || letra.equals("U")) {
            System.out.println("Es una vocal");
            
            
        } else {
            System.out.println("No es una vocal");
        }
    }
    
}
