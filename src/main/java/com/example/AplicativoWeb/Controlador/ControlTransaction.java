package com.example.AplicativoWeb.Controlador;

import com.example.AplicativoWeb.Entidades.MovimientoDinero;
import com.example.AplicativoWeb.Servicio.IMovDineroService;
import com.example.AplicativoWeb.Servicio.ServiMovDineroImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ControlTransaction {

    @Autowired
    private IMovDineroService movDineroService;
    @GetMapping("/movDinero/{id}")
    public MovimientoDinero verMovDinero(@PathVariable long id){
        return movDineroService.verMovDinero(id);
    }
    @GetMapping("/movDinero")
    public List<MovimientoDinero> buscarTodos() {
        return this.movDineroService.buscarTodos();
    }
    @PostMapping("/movDinero")
    public MovimientoDinero crearMovDinero (@RequestBody MovimientoDinero movDinero){
        return this.movDineroService.crearMovDinero(movDinero);
    }
    @PutMapping("/movDinero/{id}")
    public MovimientoDinero editarMovDinero(@PathVariable long id, @RequestBody MovimientoDinero movimientoDinero) {
        return this.editarMovDinero(id, movimientoDinero);
    }
    @DeleteMapping("/movDinero/{id}")
    public void eliminarMovDinero(@PathVariable long id){
        this.movDineroService.eliminarMovDinero(id);
    }

}
