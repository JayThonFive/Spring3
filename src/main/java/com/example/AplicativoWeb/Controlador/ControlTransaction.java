package com.example.aplicativoWed.Controller;

import com.example.aplicativoWed.Entidades.Transaction;
import com.example.aplicativoWed.Servicios.ServiTransactionImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControlTransaction {

    @Autowired
    ServiTransactionImp serviTransactionImp;

    @GetMapping("/movDinero")
    private List<Transaction> verMovDinero(){
        return serviTransactionImp.verMovDinero();
    }

    @PostMapping("/movDinero")
    private void crearMOvDinero (@RequestBody Transaction transaction){
        serviTransactionImp.crearMovDinero(transaction);
    }

    @DeleteMapping("/movDinero/{id}")
    private void eliminarMOvDinero(@PathVariable("id")Integer id){
        serviTransactionImp.eliminarMovDinero(id);
    }

}
