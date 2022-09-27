package com.example.AplicativoWeb.Controlador;

import com.example.AplicativoWeb.Entidades.Empresa;
import com.example.AplicativoWeb.Servicio.ServiEmpresaImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControlEmpresa {

    @Autowired
    ServiEmpresaImp serviEmpresaImp;

    @GetMapping("/enterprise")
    private String verEmpresa(Model model){
        model.addAttribute("enterprises",serviEmpresaImp.verEmpresa());
        return "enterprise";
    }
    @GetMapping("/enterprise/{id}")
    private void empresaId (@PathVariable("id")Long Long) {
        serviEmpresaImp.empresaId(Long);
    }

    @PutMapping("/enterprise")
    private void actualizarEmpresa (@RequestBody Empresa empresa){
        serviEmpresaImp.editarEmpresa(empresa);
    }
    @GetMapping("/agregarEmpresa")
    private String formularioEmpresa (Empresa empresa){
        return "agregarEmpresa";
    }

    @PostMapping ("/enterprise")
    private String crearEmpresa(Empresa empresa){
        serviEmpresaImp.crearEmpresa(empresa);
        return "redirect:/enterprise";
    }
    @DeleteMapping("/enterprise/{id}")
    private void eliminarEmpresa (@PathVariable("id")Long id){
        serviEmpresaImp.eliminarEmpresa(id);
    }

}
