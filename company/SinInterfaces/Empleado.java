package com.company.SinInterfaces;

public class Empleado {
    //Atributos
    String nombre;
    int edad;
    double salario;
    boolean alta;

    //Constructores
    public Empleado() {

    }

    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

    //Metodos

    //ToString

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
