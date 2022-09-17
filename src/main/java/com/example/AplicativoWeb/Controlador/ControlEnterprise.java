package com.example.AplicativoWeb.Controlador.;

import com.example.aplicativoWed.Entidades.Enterprise;
import com.example.aplicativoWed.Servicios.ServiEnterpriseImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControlEnterprise {

    @Autowired
    ServiEnterpriseImp serviEnterpriseImp;

    @GetMapping("/empresa")
    private List<Enterprise> verEmpresa(){
        return serviEnterpriseImp.verEmpresa();
    }
    @PutMapping("/empresa")
    private void actualizarEmpresa (@RequestBody Enterprise enterprise){
        serviEnterpriseImp.editarEmpresa(enterprise);
    }
    @PostMapping ("/empresa")
    private void crearEmpresa(@RequestBody Enterprise enterprise){
        serviEnterpriseImp.crearEmpresa(enterprise);
    }
    @DeleteMapping("/empresa/{id}")
    private void eliminarEmpresa (@PathVariable("id")Integer id){
        serviEnterpriseImp.eliminarEmpresa(id);
    }

}
