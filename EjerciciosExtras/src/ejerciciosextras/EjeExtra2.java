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
public class EjeExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
        una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
        C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
        iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de A");
        int A = leer.nextInt();
        
        System.out.println("Ingrese el valor de B");
        int B = leer.nextInt();
        
        System.out.println("Ingrese el valor de C");
        int C = leer.nextInt();
        
        System.out.println("Ingrese el valor de D");
        int D = leer.nextInt();
        
        int aux;
        
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        
        System.out.println("");
        System.out.println("El valor inical de A es " +C +" y después del cambio es "+A);
        System.out.println("El valor inical de B es " +D +" y después del cambio es "+B);
        System.out.println("El valor inical de C es " +B +" y después del cambio es "+C);
        System.out.println("El valor inical de D es " +A +" y después del cambio es "+D);
        
        
    }
    
}
