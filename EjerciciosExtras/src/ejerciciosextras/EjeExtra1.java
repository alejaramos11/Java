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
public class EjeExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tiempo en minutos");
        int minutos = leer.nextInt();
        
        int dias = minutos/1440;
        int horas = (minutos%1440)/60;
        
        System.out.println("Los minutos " +minutos +" son " +dias +" dias " +" y " +horas  +" horas");
        
                
        
    }
    
}
