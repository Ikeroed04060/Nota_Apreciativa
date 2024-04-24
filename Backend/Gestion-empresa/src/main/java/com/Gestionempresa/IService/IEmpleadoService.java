package com.Gestionempresa.IService;

import com.Gestionempresa.Entity.Empleado;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {
    List<Empleado> findAll();
    Optional<Empleado> findById(Long id);
    Empleado save(Empleado empleado);
    void update(Empleado empleado,Long id);
    void deleteById(Long id);
}
