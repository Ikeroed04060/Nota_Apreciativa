package com.Gestionempresa.Service;

import com.Gestionempresa.Entity.Empleado;
import com.Gestionempresa.IService.IEmpleadoService;
import com.Gestionempresa.Repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IEmpleadoService {

    @Autowired
    private IEmpleadoRepository repository;

    @Override
    public List<Empleado> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Empleado> findById(Long id){
        return repository.findById(id);

    }

    @Override
    public Empleado save(Empleado empleado){
        return repository.save(empleado);
    }

    @Override
    public void update(Empleado empleado, Long id){
        Optional<Empleado> ps = repository.findById(id);
        if (!ps.isEmpty()){
            Empleado empleadoUpdate = ps.get();
            empleadoUpdate.setNombre(empleado.getNombre());
            empleadoUpdate.setCargo(empleado.getCargo());
            repository.save(empleadoUpdate);
        }else{
            System.out.println("No existe el empleado");
        }

    }
    @Override
    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
