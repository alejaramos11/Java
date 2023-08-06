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
public class Eje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que pida dos números enteros positivos por teclado y muestre por
        pantalla el siguiente menú:
        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:
        
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
        pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
        programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
        seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
        del programa, caso contrario se vuelve a mostrar el menú.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 1 numero entero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        int num2 = leer.nextInt();

        boolean menuAbierto = true;

        do {

            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opcion");

            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma es " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("la resta es " + resta);
                    break;
                case 3:
                    int multi = num1 * num2;
                    System.out.println("la multiplicacion es " + multi);
                    break;
                case 4:
                    double division = num1 / num2;
                    System.out.println("la division es " + division);
                    break;
                case 5:
                    System.out.println("estas saliendo, estás seguro (S/N)");
                    leer.nextLine();
                    String respuesta = leer.nextLine(); //line lee hasta los espacios y next solo lee hasta que encuentra algo en blanco
                    if (respuesta.equals("S") || respuesta.equals("s")) {
                        menuAbierto = false;

                    } else {
                        System.out.println("Te devuelvo al menu");

                    }
                    break;

                default:
                    System.out.println("opcion invalida");

            }

        } while (menuAbierto);

    }

}
