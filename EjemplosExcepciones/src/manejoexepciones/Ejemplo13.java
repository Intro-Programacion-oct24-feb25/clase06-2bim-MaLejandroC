/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

/**
 *
 * @author Alejandro
 */
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt(); // 2
        int[] resultados = new int[valor];

        /*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/
        int contador = 0;
        int limite = resultados.length;
        //condicion para salir dependiendo el tamaño del arreglo, como bien 
        //pedimos el numero de operacion a realizar entocnes a esto con la 
        //variable limite le ponemos el .length para agarrar el tamaño de tal, 
        //y con un contador iniciado en 0. se evaluara hasta ser falso, el 
        //contador se aumenta segun se guarde el resultado en la posicion 
        //del arreglo. 
        while (contador < limite) { // 1 < 2
            System.out.printf("Proceso de ingreso de datos para (%d)"
                    + "operación\n", contador + 1); // 
            // Proceso de ingreso de datos para 1 operación
            // Proceso de ingreso de datos para 2 operación
            try {
                System.out.println("Ingrese valor 1 a operar: ");
                int valor1 = entrada.nextInt(); // 200 // Loja
                System.out.println("Ingrese valor 2 a operar: ");
                int valor2 = entrada.nextInt(); // 5

                int resultado = valor1 / valor2; // 40
                resultados[contador] = resultado; // {40, 0}
                contador = contador + 1; // 1

            } catch (ArithmeticException e) {
                System.out.printf("(ArithmeticException) Ocurrió una "
                        + "excepción %s\n", e);
            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
                entrada.nextLine();
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
            }

        }

        for (int i = 0; i < resultados.length; i++) {
            System.out.printf("Resultado %s\n", resultados[i]);
        }
    }
}
