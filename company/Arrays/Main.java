package com.company.Arrays;

public class Main {

    public static void main(String[] args) {
        // Arrays

        //Un array se crea de la siguiente manera
        //int[] arrayUno = new int[5];
//        int[] arrayDos = {6, 7, 8, 9, 0};
        String nombres[] = {
                "Abraham",
                "Laura",
                "Lilly"
        };

        int arrayBidi[][] = new int[2][4];

        // Para colocarle datos seria
        /*arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;*/

        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        /*for(int i : arrayUno) {
            System.out.println(i);
        }

        for(int i : arrayDos) {
            System.out.println(i);
        }*/

        //Asi se ve la longitud del array
        /*System.out.println("La longitud es " + nombres.length);
        for(String nombre : nombres) {
            System.out.println("El nombre actual es " + nombre);
        }*/

        for(int i = 0; i < nombres.length; i++) {
            System.out.println("Le nombre es " + nombres[i] + "Su posicion es " + i);
        }

        /*for(int i = 0; i < arrayBidi.length; i++) {
            System.out.println("El valor de i es: " + i);
            for(int x = 0; x < arrayBidi[1].length; x++) {
                System.out.println("Los valores de i = " + i +" Los valores de x = " + x);
                System.out.println(arrayBidi[i][x]);
            }
        }*/

    }
}
