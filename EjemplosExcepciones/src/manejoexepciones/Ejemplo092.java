/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String pais = "";
        while (bandera) {
            try {
                System.out.print("Ingrese un pais: ");
                pais = entrada.nextLine();

                String letra = pais.substring(0,1);
                letra = letra.toLowerCase();

                if (letra.equals("a") || letra.equals("e") || letra.equals("o") || letra.equals("u") || letra.equals("i")) {

                    throw new Exception("Pais con inicial en vocal");

                }

                bandera = false;

            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción: %s\n", e);
            }
        }
        
        System.out.println(pais);
    }
}
