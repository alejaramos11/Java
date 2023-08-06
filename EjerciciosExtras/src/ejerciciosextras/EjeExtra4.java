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
public class EjeExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        equivalente en romano.
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 10");
        int num = leer.nextInt();
        
        if ( num >= 1 && num <= 10 ) {
            switch (num) {
                case 1: System.out.println("El numero " +num +" en romano es " +"I" );
                break;
                case 2: System.out.println("El numero " +num +" en romano es " +"II" );
                break;
                case 3: System.out.println("El numero " +num +" en romano es " +"III" );
                break;
                case 4: System.out.println("El numero " +num +" en romano es " +"IV" );
                break;
                case 5: System.out.println("El numero " +num +" en romano es " +"V" );
                break;
                case 6: System.out.println("El numero " +num +" en romano es " +"VI" );
                break;
                case 7: System.out.println("El numero " +num +" en romano es " +"VII" );
                break;
                case 8: System.out.println("El numero " +num +" en romano es " +"VIII" );
                break;
                case 9: System.out.println("El numero " +num +" en romano es " +"IX" );
                break;
                case 10: System.out.println("El numero " +num +" en romano es " +"X" );
                break;
            }
        } else {
            System.out.println("El numero no está entre 1 y 10 ");
        }
        
    }
    
}
