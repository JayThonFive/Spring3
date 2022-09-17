package com.example.aplicativoWed.Servicios;

import com.example.aplicativoWed.Entidades.Employee;
import com.example.aplicativoWed.Entidades.Enterprise;
import com.example.aplicativoWed.Repositorio.RepoEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiEmployeeImp {

    @Autowired
    RepoEmployee repoEmployee;


    public List<Employee> verEmpleado(){
        List<Employee> employees = new ArrayList<Employee>();
        employees.addAll(repoEmployee.findAll());
        return employees;

    }

    public void crearEmpleado(Employee employee){
        repoEmployee.save(employee);

    }
    public void editarEmpleado(Employee employee){
        repoEmployee.save(employee);

    }
    public void eliminarEmpleado(Integer Id){
        repoEmployee.deleteById(Id);

    }
}
