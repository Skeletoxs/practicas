package com.company.Interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.Interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {

    //Metodo Implementado
    @Override
    public Coche CrearCocheDemo() {
        System.out.println("Creando un carro clasico");
        return new CocheElectrico();
    }
}
