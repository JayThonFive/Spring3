package com.example.AplicativoWeb.Controlador;

import com.example.AplicativoWeb.Entidades.Empresa;
import com.example.AplicativoWeb.Entidades.MovimientoDinero;
import com.example.AplicativoWeb.Servicio.IEmpleadoService;
import com.example.AplicativoWeb.Servicio.IEmpresaService;
import com.example.AplicativoWeb.Servicio.IMovDineroService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MovimientoController {
    @Autowired
    private IEmpleadoService empleadoService;
    @Autowired
    private IEmpresaService empresaService;
    @Autowired
    private IMovDineroService movDineroService;

    private final Logger LOG = Logger.getLogger(""+MovimientoController.class);

    @GetMapping("/movimientos/list")
    public String getListMovimientos(Model model) {
        LOG.log(Logger.Level.INFO, "getListMovimientos");
        List<MovimientoDinero> movimientoDineros = movDineroService.buscarTodos();
        for (MovimientoDinero movDinero : movimientoDineros)
            System.out.println(movDinero.toString());
        model.addAttribute("movimientoDineros", movimientoDineros);
        return "/movimientos/list";
    }
    @GetMapping("/movimientos/crear")
    public String createMovimiento(Model model){
        LOG.log(Logger.Level.INFO,"createMovimiento");
        //Movimientos Dinero
        MovimientoDinero movimientoDinero=new MovimientoDinero();
        model.addAttribute("movimientoDinero",movimientoDinero);
        //Empresa
        //List<Empresa> empresa = empresaService.buscarTodos();
        //model.addAttribute("empresa",empresa);
        //Movimiento de dinero
        //List<MovimientoDinero> movimientoDinero = movDineroService.buscarTodos();
        //model.addAttribute("movimientoDinero",movimientoDinero);
        return "/movimientos/modificar";
    }
    @PostMapping("/movimientos/guardar")
    public String guardarMovimiento(MovimientoDinero movimientoDinero){
        LOG.log(Logger.Level.INFO,"guardarMovimiento");
        movimientoDinero.setEstado(true);
        System.out.println(movimientoDinero.toString());
        movimientoDinero=movDineroService.crearMovDinero(movimientoDinero);
        return "redirect:/movimientos/list";
    }

}
