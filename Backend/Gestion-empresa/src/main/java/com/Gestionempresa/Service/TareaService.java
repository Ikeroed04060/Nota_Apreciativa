package com.Gestionempresa.Service;

import com.Gestionempresa.Entity.Tarea;
import com.Gestionempresa.IService.ITareaService;
import com.Gestionempresa.Repository.ITareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService implements ITareaService {

    @Autowired
    private ITareaRepository repository;

    @Override
    public List<Tarea> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Tarea> findById(Long id){
        return repository.findById(id);

    }

    @Override
    public Tarea save(Tarea tarea){
        return repository.save(tarea);
    }

    @Override
    public void update(Tarea tarea, Long id){
        Optional<Tarea> ps = repository.findById(id);
        if (!ps.isEmpty()){
            Tarea tareaUpdate = ps.get();
            tareaUpdate.setDescripcion(tarea.getDescripcion());
            tareaUpdate.setFecha_vencimiento(tarea.getFecha_vencimiento());
            repository.save(tareaUpdate);
        }else{
            System.out.println("No existe la tarea");
        }

    }
    @Override
    public void deleteById(Long id){
       repository.deleteById(id);
    }
}