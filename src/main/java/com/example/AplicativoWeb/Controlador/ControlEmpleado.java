package com.example.AplicativoWeb.Controlador;


import com.example.AplicativoWeb.Entidades.Empleado;
import com.example.AplicativoWeb.Servicio.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ControlEmpleado {

    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/empleado/{id}")
    public Empleado verEmpleado(@PathVariable long id) {
        return empleadoService.verEmpleado(id);
    }
    @GetMapping("/empleado")
    public List<Empleado> verEmpleado(){
        return this.empleadoService.buscarTodos();
    }
    @PostMapping ("/empleado")
    public Empleado crearEmpleado (@RequestBody Empleado empleado){
        return this.empleadoService.crearEmpleado(empleado);
    }
    @PutMapping("/empleado")
    public Empleado editarEmpleado (@RequestBody Empleado empleado){
        return this.empleadoService.editarEmpleado(empleado);
    }
    @DeleteMapping("/empleado/{id}")
    public void eliminarEmpleado(@PathVariable long id){
        this.empleadoService.eliminarEmpleado(id);
    }

}
