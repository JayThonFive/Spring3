package com.example.aplicativoWed.Controller;


import com.example.aplicativoWed.Entidades.Employee;
import com.example.aplicativoWed.Servicios.ServiEmployeeImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControlEmployee {

    @Autowired
    ServiEmployeeImp serviEmployeeImp;

    @GetMapping ("/empleado")
    private List<Employee> verEmpleado(){
        return serviEmployeeImp.verEmpleado();
    }
    @PostMapping ("/empleado")
    private void crearEmpleado(@RequestBody Employee employee){
        serviEmployeeImp.crearEmpleado(employee);
    }
    @DeleteMapping("/empleado/{id}")
    private void eliminarEmpleado(@PathVariable("id")Integer id){
        serviEmployeeImp.eliminarEmpleado(id);
    }

}
