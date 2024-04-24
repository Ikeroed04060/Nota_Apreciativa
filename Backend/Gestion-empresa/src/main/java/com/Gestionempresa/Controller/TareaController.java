package com.Gestionempresa.Controller;


import com.Gestionempresa.Entity.Tarea;
import com.Gestionempresa.IService.ITareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/tarea")
public class TareaController {

    @Autowired
    private ITareaService service;

    @GetMapping()
    public List<Tarea> findAll(){return service.findAll();}

    @GetMapping("/{id}")
    public Optional<Tarea> finById(@RequestParam Long id){return service.findById(id);}

    @PostMapping()
    public Tarea save(@RequestBody Tarea tarea){return service.save(tarea);}

    @PutMapping("/{id}")
    public void update(@RequestBody Tarea tarea, @RequestParam Long id){service.update(tarea, id);}

    @DeleteMapping("/id")
    public void delete(@RequestParam Long id){service.deleteById(id);}
}
