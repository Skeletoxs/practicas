package com.company.ConInterfaces;

import com.company.SinInterfaces.Empleado;

import java.util.List;

/**
 * Se declaran los metodos, no se implementan
 *
 * Actua como un contrato de lo que se debe hacer pero no lo hace
 */
public interface EmpleadoCRUD {

    //Metodos
    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);

}
