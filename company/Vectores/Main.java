package com.company.Vectores;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        //Asi se crea un vector
        Vector<Integer> vector = new Vector<>();

        Vector<Integer> vector2 = new Vector<>();

        //Asi se añaden valores a los vectores
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);

        System.out.println("Datos del vector " + vector);

        //Para remover valores
        /*vector.remove(0);
        System.out.println("Datos del vector " + vector);*/

        System.out.println("Vector tamaño " + vector.size() + " Vector capacidad " + vector.capacity());

        //Para comparar vectores
        boolean resultado = vector.equals(vector2);

        if (resultado) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        //Para recorrer un vector
        for(int  i = 0; i < vector.size(); i++) {
            if( i % 2 == 0) {
                vector.remove(i);
                continue;
            }
            System.out.println("Los valores son " + vector.get(i));
        }

        //Para decrecer un vector se utiliza el siguiente metodo
        System.out.println("Capacidad " + vector.capacity() + " Tamaño " + vector.size());
        vector.trimToSize(); // Este metodo lo decrece
        System.out.println("Capacidad " + vector.capacity() + " Tamaño " + vector.size());



    }
}
