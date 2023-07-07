package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListaMain {

    public static void main(String[] args) {

        //Construccion de la lista
        List<String> nombres = new ArrayList<>();

        //Agregar valores a la lista
        nombres.add("Abraham");
        nombres.add("Laura");
        nombres.add("Pedro");
        nombres.add("Jose");

        //Imprimir los valores de la lista
        System.out.println(nombres);

        //Tambien se puede hacer un bucle foreach para el recorrido de la lista
        for(String nombre : nombres) {
            System.out.println(nombre);
        }

        // Lista de carros
        List<Carro> carros = new ArrayList<>();

        // Agregar carros
        carros.add(new Carro("Camioneta"));
        carros.add(new Carro("Palio"));
        carros.add(new Carro("Honda civic"));

        //Foreach
        for(Carro carro : carros) {
            System.out.println(carro);
        }
    }

}
