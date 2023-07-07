package com.company.Interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.Interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche CrearCocheDemo() {
        System.out.println("Creando un carro deportivo");
        return new CocheElectrico();
    }
}
