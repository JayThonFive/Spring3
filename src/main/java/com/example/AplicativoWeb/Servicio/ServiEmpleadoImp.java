package com.example.AplicativoWeb.Servicio;

import com.example.AplicativoWeb.Entidades.Empleado;
import com.example.AplicativoWeb.Repositorio.RepoEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiEmpleadoImp {

    @Autowired
    RepoEmpleado repoEmpleado;


    public List<Empleado> verEmpleado(){
        List<Empleado> employees = new ArrayList<Empleado>();
        employees.addAll(repoEmpleado.findAll());
        return employees;

    }

    public void crearEmpleado(Empleado empleado){
        repoEmpleado.save(empleado);

    }
    public void editarEmpleado(Empleado empleado){
        repoEmpleado.save(empleado);

    }
    public void eliminarEmpleado(Integer Id){
        repoEmpleado.deleteById(Id);

    }
}