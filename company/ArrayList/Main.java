package com.company.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        //Para agregar elementos
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        //Para retirar elementos
        lista.remove("Elemento B");
        System.out.println("Contenido" + lista);

        //Recorrer arraylist de forma corta
        for(String nombre : lista) {
            System.out.println(nombre);
        }

        lista.add("Elemento B");
        lista.remove("Elemento C");
        //Recorrer arraylist de forma larga
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        //Convertir un arrayList en un array
        //No se usa la forma corta para convertir el arrayList porque necesitamos poder saber la posicion
        String array[] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //Forma corta de convertir una lista en un array
        for(Object arrayObjeto : lista.toArray()) {
            System.out.println(arrayObjeto.toString());
        }

        //LinkedList
        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);
    }
}
