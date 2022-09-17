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
    RepoMovDinero repoTransaction;


    public List<MovimientoDinero> verMovDinero(){
        List<MovimientoDinero> transactions = new ArrayList<MovimientoDinero>();
        transactions.addAll(repoTransaction.findAll());
        return transactions;

    }
    public void crearMovDinero(MovimientoDinero movDinero){
        repoTransaction.save(movDinero);

    }
    public void editarMovDinero(){

    }
    public void eliminarMovDinero(Integer Id){
        repoTransaction.deleteById(Id);

    }
}
