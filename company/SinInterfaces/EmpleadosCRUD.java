package com.company.SinInterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create------- C
 * Read--------- R
 * Update------- U
 * Delete------- D
 */

public class EmpleadosCRUD {

    //Lista de empleados: Cons esta estructura podemos simular una base de datos usando un array list;
    //Estructura de datos
    List<Empleado> empleados = new ArrayList<>();

    //OPERACIONES CRUD

    //CREATE - Guardar empledado
    public void guardarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Nota: El tipo de dato List<Empleado> que devueve la funcion ver empleado
     * es el mismo que la del array list, porque es lo que se quiere consultar
     */
    public List<Empleado> verEmpleados() {
        return empleados;
    }

}
