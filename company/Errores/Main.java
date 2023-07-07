package com.company.Errores;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        try {
            int resultado = numeroA / numeroB;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Boom!!!!, excepcion es " + e.getClass());
        } catch (Exception e) {
            System.out.println("Estoy en una excepcion que no es aritmetica");
        } finally {
            System.out.println("Finally");
        }*/
        try {
            divide(4,0);
        } catch (Exception e) {
            System.out.println("Error en la ejecucion");
        }

    }

    public static int divide(int A, int B) throws ArithmeticException, IOException {
        int resultado = 0;
        try {
            resultado =  A / B;
        } catch (ArithmeticException e) {
            //System.out.println("No se puede dividir por cero");
            throw new IOException();
        }
        return resultado;
    }
}
