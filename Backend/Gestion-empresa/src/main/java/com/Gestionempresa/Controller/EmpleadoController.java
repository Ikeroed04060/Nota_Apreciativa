package com.Gestionempresa.Controller;


import com.Gestionempresa.Entity.Empleado;
import com.Gestionempresa.Entity.Tarea;
import com.Gestionempresa.IService.IEmpleadoService;
import com.Gestionempresa.IService.ITareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/empleado")
public class EmpleadoController {

    @Autowired
    private IEmpleadoService service;

    @GetMapping()
    public List<Empleado> findAll(){return service.findAll();}

    @GetMapping("/{id}")
    public Optional<Empleado> finById(@RequestParam Long id){return service.findById(id);}

    @PostMapping()
    public Empleado save(@RequestBody Empleado empleado){return service.save(empleado);}

    @PutMapping("/{id}")
    public void update(@RequestBody Empleado empleado, @RequestParam Long id){service.update(empleado, id);}

    @DeleteMapping("/{id}")
    public void delete(@RequestParam Long id){service.deleteById(id);}
}
