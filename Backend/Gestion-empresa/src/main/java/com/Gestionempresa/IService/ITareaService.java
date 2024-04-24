package com.Gestionempresa.IService;

import com.Gestionempresa.Entity.Tarea;

import java.util.List;
import java.util.Optional;

public interface ITareaService {
    List<Tarea> findAll();
    Optional<Tarea> findById(Long id);
    Tarea save(Tarea tarea);
    void update(Tarea tarea,Long id);
    void deleteById(Long id);

}
