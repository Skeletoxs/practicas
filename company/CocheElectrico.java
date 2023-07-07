package com.company;

public class CocheElectrico extends Coche{

    //Atributos
    String motorElectrico;

    //Constructor
    public CocheElectrico() {}

    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico) {
        super(color, fabricante, modelo, peso, largo); // Este metodo nos permite usar el constructor de la clase padre;
        this.motorElectrico = motorElectrico;
    }

    //Metodo sobrecargado
    @Override
    public void acelerar(Integer velocidad) {
        Integer velocidadAumentada = velocidad * 2;
        super.acelerar(velocidadAumentada);
    }

    // ToString metodo
    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
