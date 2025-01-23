/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class EJerciciAnuncio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];
        int num1 = 0;
        int num2 = 0;
        int div = 0;

        /*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/
        try {
            for (int i = 0; i < resultados.length; i++) {
                System.out.println("Ingrese un valor");
                num1 = entrada.nextInt();
                System.out.println("Ingrese un valor");
                num2 = entrada.nextInt();

                div = num1 / num2;

                resultados[i] = div;
            }

        } catch (ArithmeticException e) {
            System.out.printf("(ArithmeticException) Ocurrió una "
                    + "excepción por dividir para 0\n");
        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s\n", e);
        }

    }

}
