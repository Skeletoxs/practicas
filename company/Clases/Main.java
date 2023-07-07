package com.company.Clases;

import com.company.Carro;
import com.company.Herencia.Camion;
import com.company.Herencia.Motocicleta;

public class Main {

    public static void main(String[] args) {

        // Clases y objetos
        // Clase identificador = new Clase()

        //Objeto creado con el constructor vacio
        Vehiculo toyotaPrio = new Vehiculo();
        Motor motorGTI = new Motor("Gti", 1500, 5.30, 6);

        //Objeto creado con el constructor de todos los parametros
        Vehiculo fordMondeo = new Vehiculo("ford", "Mondeo", 2.1,2010, false,0, motorGTI);

        //Acceder a las propiedades del objeto
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.velocidad);
        fordMondeo.acelerar(200);
        System.out.println(fordMondeo.velocidad);


        // Herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";

        System.out.println("Fin del programa");

        //Polimorfismo
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Carro();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        //Clases Abstractas


    }
}
