package com.example.AplicativoWeb.Controlador;

import com.example.AplicativoWeb.Entidades.Empresa;
import com.example.AplicativoWeb.Servicio.ServiEmpresaImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControlEmpresa {

    @Autowired
    ServiEmpresaImp serviEmpresaImp;

    @GetMapping("/empresa")
    private List<com.example.AplicativoWeb.Entidades.Empresa> verEmpresa(){
        return serviEmpresaImp.verEmpresa();
    }
    @PutMapping("/empresa")
    private void actualizarEmpresa (@RequestBody Empresa empresa){
        serviEmpresaImp.editarEmpresa(empresa);
    }
    @PostMapping ("/empresa")
    private void crearEmpresa(@RequestBody Empresa empresa){
        serviEmpresaImp.crearEmpresa(empresa);
    }
    @DeleteMapping("/empresa/{id}")
    private void eliminarEmpresa (@PathVariable("id")Long id){
        serviEmpresaImp.eliminarEmpresa(id);
    }

}
