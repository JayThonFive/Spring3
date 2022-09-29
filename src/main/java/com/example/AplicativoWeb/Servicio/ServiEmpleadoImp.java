package com.example.AplicativoWeb.Servicio;

import com.example.AplicativoWeb.Entidades.Empleado;
import com.example.AplicativoWeb.Repositorio.RepoEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiEmpleadoImp implements IEmpleadoService{

    @Autowired
    private RepoEmpleado repoEmpleado;

    @Override
    public Empleado verEmpleado(Long id){
        return repoEmpleado.findById(id).orElseThrow();
    }
    @Override
    public List<Empleado> buscarTodos() {
        List<Empleado> empleados= (List<Empleado>) repoEmpleado.findAll();
        return empleados;
    }
    @Override
    public Empleado crearEmpleado(Empleado empleado){
        return repoEmpleado.save(empleado);
    }
    @Override
    public Empleado editarEmpleado(Empleado empleado){

        //validamos si ya existe el empleado
        if (!repoEmpleado.existsById(empleado.getIdEmpleado())){
            new Exception("El empleado con id: " + empleado.getIdEmpleado() + " no existe en el sistema");
        }

        return repoEmpleado.save(empleado);

    }
    @Override
    public void eliminarEmpleado(long id){
        repoEmpleado.deleteById(id);

    }
}
