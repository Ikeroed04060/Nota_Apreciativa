package com.Gestionempresa.Repository;

import com.Gestionempresa.Entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITareaRepository extends JpaRepository<Tarea, Long> {
}