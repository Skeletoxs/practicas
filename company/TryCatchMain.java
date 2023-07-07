package com.company;

public class TryCatchMain {

    public static void main(String[] args) {

        // Estos mecanismos de gestion de errores se utilizan normalmente en los bloques de codigo que son propensos a fallar: Como conecciones a servidores
        try { 
            int resultado = 5 / 0;
        } catch (ArithmeticException o) {
            o.printStackTrace();
        } finally {
            System.out.println("Cierre de recursos");
        }

        System.out.println("Fin");
    }
}
