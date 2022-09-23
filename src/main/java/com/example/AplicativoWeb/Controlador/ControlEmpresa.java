package com.example.AplicativoWeb.Controlador;

import com.example.AplicativoWeb.Entidades.Empresa;
import com.example.AplicativoWeb.Servicio.IEmpresaService;
import com.example.AplicativoWeb.Servicio.ServiEmpresaImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ControlEmpresa {

    @Autowired
    private IEmpresaService empresaService;

    @GetMapping("/empresa/{id}")
    public Empresa verEmpresa(@PathVariable long id){
        return empresaService.verEmpresa(id);
    }
    @GetMapping("/empresa")
    public List<Empresa> buscarTodos() {
        return this.empresaService.buscarTodos();
    }
    @PostMapping ("/empresa")
    public Empresa crearEmpresa(@RequestBody Empresa empresa){
        return this.empresaService.crearEmpresa(empresa);
    }
    @PutMapping("/empresa/{id}")
    public Empresa editarEmpresa (@RequestBody Empresa empresa){
        return this.empresaService.editarEmpresa(empresa);
    }

    @DeleteMapping("/empresa/{id}")
    public void eliminarEmpresa (@PathVariable long id){
        this.empresaService.eliminarEmpresa(id);
    }

}
