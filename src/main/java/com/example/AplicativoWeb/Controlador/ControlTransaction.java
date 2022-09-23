package com.example.AplicativoWeb.Controlador;

import com.example.AplicativoWeb.Entidades.MovimientoDinero;
import com.example.AplicativoWeb.Servicio.ServiMovDineroImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControlTransaction {

    @Autowired
    ServiMovDineroImp serviMovDineroImp;

    @GetMapping("/movements")
    private List<MovimientoDinero> verMovDinero(){
        return serviMovDineroImp.verMovDinero();
    }

    @PostMapping("/movements")
    private void crearMOvDinero (@RequestBody MovimientoDinero movDinero){
        serviMovDineroImp.crearMovDinero(movDinero);
    }

    @DeleteMapping("/movements/{id}")
    private void eliminarMOvDinero(@PathVariable("id")Long Long){
        serviMovDineroImp.eliminarMovDinero(Long);
    }

}
