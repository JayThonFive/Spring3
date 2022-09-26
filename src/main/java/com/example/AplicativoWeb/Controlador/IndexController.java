package com.example.AplicativoWeb.Controlador;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final Logger LOG = Logger.getLogger(""+IndexController.class);

    @GetMapping("/")
    public String index(Model model){
        LOG.log(Logger.Level.INFO,"index");
        var mensaje="Bienvenidos al sistema de gestión de ingresos y egresos";
        model.addAttribute("mensaje",mensaje);
        return "index";
    }
}