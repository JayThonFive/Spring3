package com.example.AplicativoWeb.Controlador;

import com.example.AplicativoWeb.Entidades.Empleado;
import com.example.AplicativoWeb.Entidades.Empresa;
import com.example.AplicativoWeb.Entidades.MovimientoDinero;
import com.example.AplicativoWeb.Entidades.Rol;
import com.example.AplicativoWeb.Servicio.*;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmpleadoController {
    @Autowired
    private IEmpleadoService empleadoService;
    @Autowired
    private IEmpresaService empresaService;
    @Autowired
    private IMovDineroService movDineroService;
    @Autowired
    private IRolService rolService;

    private final Logger LOG = Logger.getLogger(""+EmpleadoController.class);

    @GetMapping("/empleados/list")
    public String getListEmpleados(Model model) {
        LOG.log(Logger.Level.INFO, "getListEmpleados");
        List<Empleado> empleados = empleadoService.buscarTodos();
        for (Empleado user : empleados)
            System.out.println(user.toString());
        model.addAttribute("empleados", empleados);
        return "/empleados/list";
    }
    @GetMapping("/empleados/crear")
    public String createEmpleado(Model model){
        LOG.log(Logger.Level.INFO,"createEmpleado");
        //Empleado
        Empleado empleado=new Empleado();
        model.addAttribute("empleado",empleado);
        //Roles
        List<Rol> roles = rolService.buscarTodos();
        model.addAttribute("roles",roles);
        //Empresa
        List<Empresa> empresa = empresaService.buscarTodos();
        model.addAttribute("empresa",empresa);
        //Movimiento de dinero
        List<MovimientoDinero> movimientoDinero = movDineroService.buscarTodos();
        model.addAttribute("movimientoDinero",movimientoDinero);
        return "/empleados/modificar";
    }
    @PostMapping("/empleados/guardar")
    public String guardarEmpleado(Empleado user){
        LOG.log(Logger.Level.INFO,"guardarEmpleado");
        user.setEstado(true);
        System.out.println(user.toString());
        user=empleadoService.crearEmpleado(user);
        return "redirect:/empleados/list";
    }
}
