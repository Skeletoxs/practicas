package com.company.Herencia;

import com.company.Clases.Motor;
import com.company.Clases.Vehiculo;

/*
Clase hija o clase derivada
 */
public class Motocicleta extends Vehiculo {
    //Atributos
    boolean maletero;

    //Constructor
    public Motocicleta() {

    }

    public Motocicleta(String fabricante, String modelo, double cmCubicos, int year, boolean sport, int velocidad, Motor motor, boolean maletero) {
        super(fabricante, modelo, cmCubicos, year, sport, velocidad, motor);
        this.maletero = maletero;
    }


}
