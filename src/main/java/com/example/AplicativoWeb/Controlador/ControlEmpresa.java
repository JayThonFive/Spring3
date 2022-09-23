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

    @GetMapping("/enterprise")
    private List<Empresa> verEmpresa(){
        return serviEmpresaImp.verEmpresa();
    }
    @GetMapping("/enterprise/{id}")
    private void empresaId (@PathVariable("id")Long Long) {
        serviEmpresaImp.empresaId(Long);
    }

    @PutMapping("/enterprise")
    private void actualizarEmpresa (@RequestBody Empresa empresa){
        serviEmpresaImp.editarEmpresa(empresa);
    }
    @PostMapping ("/enterprise")
    private void crearEmpresa(@RequestBody Empresa empresa){
        serviEmpresaImp.crearEmpresa(empresa);
    }
    @DeleteMapping("/enterprise/{id}")
    private void eliminarEmpresa (@PathVariable("id")Long id){
        serviEmpresaImp.eliminarEmpresa(id);
    }

}
