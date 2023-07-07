package com.company;

import java.util.Scanner;

public class ScanerMain {

    public static void main(String[] args) {

        // Con este codigo se puede introducir datos en la consola

        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = scaner.nextLine();
        System.out.println("Introduce un numero");
        int numero = scaner.nextInt();

        System.out.println("El nombre es " + nombre);
        System.out.println("El numero es " + numero);
    }
}
