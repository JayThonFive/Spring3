package com.example.AplicativoWeb.Servicio;

import com.example.AplicativoWeb.Entidades.MovimientoDinero;
import com.example.AplicativoWeb.Repositorio.RepoMovDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiMovDineroImp {

    @Autowired
    RepoMovDinero repoMovDinero;


    public List<MovimientoDinero> verMovDinero(){
        List<MovimientoDinero> transactions = new ArrayList<MovimientoDinero>();
        transactions.addAll(repoMovDinero.findAll());
        return transactions;

    }
    public void crearMovDinero(MovimientoDinero movDinero){
        repoMovDinero.save(movDinero);

    }
    public void editarMovDinero(){

    }
    public void eliminarMovDinero(Long Long){
        repoMovDinero.deleteById(Long);

    }
}
