package com.company.EntradaYSalida;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\User\\Documents\\Colores aplicacion.txt");
            BufferedInputStream ficherosBuffer = new BufferedInputStream(fichero);

            try {
//                byte datos[] = new byte[5];
                //byte[] datos = fichero.readAllBytes(); Se lee de golpe (Para ficheros pequeños)
                int dato = ficherosBuffer.read(); //Para leerlo poco a poco (Si el fichero es grande)
//                int dato = fichero.read(datos); Otra forma de leer el fichero pero de 5 en 5 bytes

                while (dato != -1) {
//                    System.out.print(datos.toString());
                    System.out.print((char)dato);
                    //dato = fichero.read(datos);
                    dato = ficherosBuffer.read();
                }

                /*for (byte dato : datos) {
                    System.out.print((char)dato);// El char forza el dato de la variable dato
                }*/
            } catch (IOException e) {
                System.out.println("No se puede leer el fichero " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado " + e.getMessage());
        }

    }
}
