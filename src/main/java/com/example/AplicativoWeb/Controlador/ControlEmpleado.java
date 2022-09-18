package com.example.AplicativoWeb.Controlador;


import com.example.AplicativoWeb.Entidades.Empleado;
import com.example.AplicativoWeb.Servicio.ServiEmpleadoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControlEmpleado {

    @Autowired
    ServiEmpleadoImp serviEmpleadoImp;

    @GetMapping ("/empleado")
    private List<Empleado> verEmpleado(){
        return serviEmpleadoImp.verEmpleado();
    }
    @PostMapping ("/empleado")
    private void crearEmpleado(@RequestBody Empleado empleado){
        serviEmpleadoImp.crearEmpleado(empleado);
    }
    @DeleteMapping("/empleado/{id}")
    private void eliminarEmpleado(@PathVariable("id")Integer id){
        serviEmpleadoImp.eliminarEmpleado(id);
    }

}
