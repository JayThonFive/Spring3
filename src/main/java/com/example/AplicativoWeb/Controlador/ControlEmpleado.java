package com.example.AplicativoWeb.Controlador;


import com.example.AplicativoWeb.Entidades.Empleado;
import com.example.AplicativoWeb.Servicio.ServiEmpleadoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ControlEmpleado {

    @Autowired
    ServiEmpleadoImp serviEmpleadoImp;

    @GetMapping ("/employee")
    private List<Empleado> verEmpleado(){
        return serviEmpleadoImp.verEmpleado();
    }
    @GetMapping("/employee/{id}")
    private void empleadoId (@PathVariable("id")Integer id){
        serviEmpleadoImp.empleadoId(id);
    }
    @PostMapping ("/employee")
    private void crearEmpleado(@RequestBody Empleado empleado){
        serviEmpleadoImp.crearEmpleado(empleado);
    }
    @DeleteMapping("/employee/{id}")
    private void eliminarEmpleado(@PathVariable("id")Integer id){
        serviEmpleadoImp.eliminarEmpleado(id);
    }

}
