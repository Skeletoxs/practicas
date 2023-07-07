package com.company.SinInterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmpleadosCRUD empleadoCRUD = new EmpleadosCRUD();

        Empleado juan    = new Empleado("Juan",30,200,true);
        Empleado abraham = new Empleado("Abraham",25,2500,true);
        Empleado laura   = new Empleado("Laura",19,2500,true);

        //Guadar empleados
        empleadoCRUD.guardarEmpleado(juan);
        empleadoCRUD.guardarEmpleado(abraham);
        empleadoCRUD.guardarEmpleado(laura);

        //Consultar empleados
        //Nota: empleados es el nombre de la variable
        List<Empleado> empleados = empleadoCRUD.verEmpleados();

        System.out.println(empleados);

        /*for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }*/

        /*for(int i = 0; i < empleados.size(); i++) {
            System.out.println(empleados.get(i));
        }*/
    }
}
