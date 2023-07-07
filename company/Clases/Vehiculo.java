package com.company.Clases;

/*
Clase padre, super clase, clase Base
 */

public class Vehiculo {

    // 1. Atributos
    protected String fabricante;
    protected String modelo;
    protected double cmCubicos;
    protected int year;
    protected boolean sport;
    protected int velocidad = 0;
    protected Motor motor;

    // 2. Constructores
    public Vehiculo() {

    }

    public Vehiculo(String fabricante, String modelo, double cmCubicos, int year, boolean sport, int velocidad, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cmCubicos = cmCubicos;
        this.year = year;
        this.sport = sport;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo     = modelo;
    }

    public Vehiculo(int year) {
        this.year = year;
    }


    // 3. Metodos (Comportamiento)
    public void acelerar(int velocidad) {
        if(velocidad <= 200) {
            this.velocidad += velocidad;
        } else {
            System.out.println("No, se puede ir a esa velocidad");
        }
    }

    // Getters y Setters

    //ToString
}
