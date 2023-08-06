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
public class Eje14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
        */
        Scanner leer = new Scanner(System.in);
        double libras=0;
        double dolares=0;
        double yenes=0;
        
        
                
        System.out.println("a que moneda va a convertir los euros (libras, dolares, yenes)");
        String moneda = leer.nextLine();
        
        System.out.println("Ingrese la cantidad de euros");
        double euros = leer.nextDouble();
        
        cambioMoneda(moneda, euros, libras, dolares, yenes);
        
    }
    public static void cambioMoneda(String moneda, double euros, double libras, double dolares, double yenes) {
        
        switch (moneda) {
            case "libras":
                libras = euros * 0.86;
                System.out.println("el cambio a libras es " +libras +" libras");
                break;
            case "dolares":
                dolares = euros * 1.28611;
                System.out.println("el cambio a dolares es " +dolares +" dolares");
                break;
            case "yenes":
                yenes = euros *129.852;
                System.out.println("el cambio a yenes es " +yenes + " yenes");
                break;
            default:
                System.out.println("moneda no encontrada");
               
        }
        
        
        
        
    }
}
