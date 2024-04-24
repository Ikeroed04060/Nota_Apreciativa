package com.Gestionempresa.Repository;

import com.Gestionempresa.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepository extends JpaRepository<Empleado,Long> {
}
