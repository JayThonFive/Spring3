package com.example.AplicativoWeb.Controlador;

import com.example.AplicativoWeb.Entidades.Empleado;
import com.example.AplicativoWeb.Entidades.Empresa;
import com.example.AplicativoWeb.Entidades.MovimientoDinero;
import com.example.AplicativoWeb.Entidades.Rol;
import com.example.AplicativoWeb.Servicio.IEmpleadoService;
import com.example.AplicativoWeb.Servicio.IEmpresaService;
import com.example.AplicativoWeb.Servicio.IMovDineroService;
import com.example.AplicativoWeb.Servicio.IRolService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmpresaController {
    @Autowired
    private IEmpleadoService empleadoService;
    @Autowired
    private IEmpresaService empresaService;
    @Autowired
    private IMovDineroService movDineroService;
    @Autowired
    private IRolService rolService;

    private final Logger LOG = Logger.getLogger(""+EmpresaController.class);

    @GetMapping("/empresas/list")
    public String getListEmpresas(Model model) {
        LOG.log(Logger.Level.INFO, "getListEmpresas");
        List<Empresa> empresas = empresaService.buscarTodos();
        for (Empresa emp : empresas)
            System.out.println(emp.toString());
        model.addAttribute("empresas", empresas);
        return "/empresas/list";
    }
    @GetMapping("/empresas/crear")
    public String createEmpresa(Model model){
        LOG.log(Logger.Level.INFO,"createEmpresa");
        //Empresa
        Empresa empresa=new Empresa();
        model.addAttribute("empresa",empresa);
        //Empresa
        //List<Empresa> empresa = empresaService.buscarTodos();
        //model.addAttribute("empresa",empresa);
        //Movimiento de dinero
        List<MovimientoDinero> movimientoDinero = movDineroService.buscarTodos();
        model.addAttribute("movimientoDinero",movimientoDinero);
        return "/empresas/modificar";
    }
    @PostMapping("/empresas/guardar")
    public String guardarEmpresa(Empresa emp){
        LOG.log(Logger.Level.INFO,"guardarEmpresa");
        emp.setEstado(true);
        System.out.println(emp.toString());
        emp=empresaService.crearEmpresa(emp);
        return "redirect:/empresas/list";
    }
}
