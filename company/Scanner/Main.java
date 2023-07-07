package com.company.Scanner;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Variable de bandera
        boolean ok = false;
        do {
            //Entrada de datos
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce dos numeros");
            try {
                //Variables que almacenan los dos numeros
                int numeroA = scanner.nextInt();
                int numeroB = scanner.nextInt();
                System.out.println("Los numero son " + numeroA + "  y " + numeroB);
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Numero invalidos... Intenta de nuevo");
            }
        } while (!ok);

        try {
            PrintStream info = new PrintStream("Copia.txt");
            info.println("Hola");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }





    }
}
