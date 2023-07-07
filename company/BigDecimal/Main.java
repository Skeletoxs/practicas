package com.company.BigDecimal;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(3.15);

        BigDecimal resultado = valorA.add(valorB);

        System.out.println(resultado.toString());
    }
}
