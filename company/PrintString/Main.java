package com.company.PrintString;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        try {
            InputStream in = new FileInputStream("C:\\Users\\User\\Documents\\Colores aplicacion.txt");
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("Destino.txt");
            out.write(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("Archivo no encontrado " + e.getMessage());
        }

    }
}
