package com.company;

import com.company.Clases.Vehiculo;

public class Carro extends Vehiculo {
    //Propiedad
    String nombre;

    //Constructor
    public Carro(String nombre) {
        this.nombre = nombre;
    }

    public Carro() {}

    //ToString


    @Override
    public String toString() {
        return "Carro{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
