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
public class EjeExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Una obra social tiene tres clases de socios:
        1. Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
        todos los tipos de tratamientos.
        2. Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
        para los mismos tratamientos que los socios del tipo A.
        3. Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
        tratamientos.
        4. Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
        real que represente el costo del tratamiento (previo al descuento) y determine el
        importe en efectivo a pagar por dicho socio.
        */
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una letra de acuerdo al tipo de socio que es ");
        String letra = leer.nextLine();
        
        switch (letra) {
            case "A": 
                System.out.println("Ingrese in valor que represente el costo del tratamiento");
                int valorA = leer.nextInt();
                int descuentoA = (int) (valorA - (valorA * 0.5));
                System.out.println("Su descuento es del 50% y el valor final es " +descuentoA);
                break;
            case "B":
                System.out.println("Ingrese in valor que represente el costo del tratamiento");
                int valorB = leer.nextInt();
                int descuentoB = (int) (valorB - (valorB * 0.35));
                System.out.println("Su descuento es del 35% y el valor final es " +descuentoB);
                break;
            case "C":
                System.out.println("Ingrese in valor que represente el costo del tratamiento");
                int valorC = leer.nextInt();
                int descuentoC = valorC;
                System.out.println("Su descuento es del 0% y el valor final es " +descuentoC);
                break;
        }
    }
    
}
