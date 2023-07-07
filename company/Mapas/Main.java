package com.company.Mapas;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Crear mapa
        HashMap<String, Integer> map = new HashMap<>();

        //Agregar datos
        map.put("Uno",    1);
        map.put("Dos",    2);
        map.put("Tres",   3);
        map.put("Cuatro", 4);

/*        //Para reemplazar una clave
        map.replace("Cuatro", 100);

        //Para remover una clave
        map.remove("Cuatro");*/

        System.out.println(map);

        //Para recorrer un mapa
        for(Map.Entry elemento : map.entrySet()){
            System.out.println("Elemento clave es: " + elemento.getKey() + " Elemento valor es: " + elemento.getValue());
        }

    }
}
