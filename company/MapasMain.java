package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapasMain {

    public static void main(String[] args) {

        // Creacion de mapas o diccionario
        Map<String, String> personas = new HashMap<>();

        // Agregar valores al mapa
        personas.put("1", "Abraham");
        personas.put("2", "Laura");
        personas.put("3", "Pedro");

        // Mostrar el mapa
        System.out.println(personas);

        // Recorrer el mapa de llaves
        for(String key : personas.keySet()) {
            System.out.println(key);
        }

        // Recorrer el mapa de valor
        for(String valor : personas.values()) {
            System.out.println(valor);
        }

        // Recorrer el mapa para tener los dos valores
        for(Map.Entry<String, String> par : personas.entrySet()) {
            System.out.println(par.getKey() + " " + par.getValue());
        }

    }
}
