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
public class Eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
        solicite números al usuario hasta que la suma de los números introducidos supere el
        límite inicial.
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite positivo");
        int num = leer.nextInt();
        
        int suma=0;
        
        while (true) {
            System.out.println("Ingrese valores al azar");
            int nums = leer.nextInt();
            
            suma += nums;
            
            if (suma>num){
               break; 
            
            
        }
 
            
        }
        System.out.println("Se pasó el valor limite");
    }
    
}
