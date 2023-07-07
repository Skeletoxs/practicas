package com.company;

public class Main {

    public static void main(String[] args) {

        // La clase abstracta Coche no se puede instaciar por si soloa, solo se hace a traves de las clases hijas
        Coche carro = new Coche("rojo","Honda","Civic",500.40, 5.4);
        Coche carro2 = new Coche();

        CocheElectrico carroElectrico = new CocheElectrico("Motor de induccion");
        CocheElectrico carroElectrico2 = new CocheElectrico("verde","Tesla","camioneta",600d, 3.5, "zt");


        carro.acelerar(50);
        System.out.println(carro);

        /*carro2.acelerar(120);
        System.out.println(carro2);*/

        /*carroElectrico.acelerar(100);
        carroElectrico.color = "Morado";
        carroElectrico.fabricante = "Tesla";
        carroElectrico.modelo = "Cybertruck";
        carroElectrico.peso = 1000.40;
        carroElectrico.largo = 6.4;
        System.out.println(carroElectrico);*/

        /*System.out.println(carroElectrico2);
        carroElectrico2.acelerar(50);
        System.out.println(carroElectrico2);*/


    }
}