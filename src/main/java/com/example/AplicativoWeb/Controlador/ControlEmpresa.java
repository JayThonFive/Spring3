package com.example.AplicativoWeb.Controlador;

import com.example.AplicativoWeb.Entidades.Empresa;
import com.example.AplicativoWeb.Servicio.ServiEmpresaImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ControlEmpresa {

    @Autowired
    ServiEmpresaImp serviEmpresaImp;

    @GetMapping("/empresa")
    private String verEmpresa(Model model){
        model.addAttribute("empresas",serviEmpresaImp.verEmpresa());
        return "empresa";
    }
    @GetMapping("/empresa/{id}")
    private void empresaId (@PathVariable("id")Long Long) {
        serviEmpresaImp.empresaId(Long);
    }

    @GetMapping("/agregarEmpresa")
    private String formularioEmpresa (Empresa empresa){
        return "agregarEmpresa";
    }
    @PostMapping ("/empresa")
    private String crearEmpresa(Empresa empresa){
        serviEmpresaImp.crearEmpresa(empresa);
        return "redirect:/empresa";
    }

    @PutMapping("/empresa")
    private void actualizarEmpresa (@RequestBody Empresa empresa){
        serviEmpresaImp.editarEmpresa(empresa);
    }
    @GetMapping("/empresa/borrar/{id}")
    private String eliminarEmpresa (@PathVariable("id")Long id){
        serviEmpresaImp.eliminarEmpresa(id);
        return "redirect:/empresa";
    }

}
