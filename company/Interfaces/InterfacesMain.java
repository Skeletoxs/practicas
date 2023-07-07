package com.company.Interfaces;

import com.company.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService carroService1 = new CocheServiceClassicImpl();
        CocheService carroService2 = new CocheServiceSportImpl();

        Coche carro1 = carroService1.CrearCocheDemo();

        Coche carro2 = carroService2.CrearCocheDemo();

    }
}
