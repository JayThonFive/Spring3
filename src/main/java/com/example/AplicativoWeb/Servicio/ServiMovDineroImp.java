package com.example.AplicativoWeb.Servicio;

import com.example.AplicativoWeb.Entidades.MovimientoDinero;
import com.example.AplicativoWeb.Repositorio.RepoMovDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiMovDineroImp implements IMovDineroService {

    @Autowired
    private RepoMovDinero repoMovDinero;
    @Override
    public MovimientoDinero verMovDinero(long id){
        Optional<MovimientoDinero> transaccion = repoMovDinero.findById(id);
        return transaccion.get();
    }
    @Override
    public List<MovimientoDinero> buscarTodos() {
        List<MovimientoDinero> transacciones = (List<MovimientoDinero>) repoMovDinero.findAll();
        return transacciones;
    }
    @Override
    public MovimientoDinero crearMovDinero(MovimientoDinero movDinero){
        return repoMovDinero.save(movDinero);

    }
    @Override
    public MovimientoDinero editarMovDinero(long id, MovimientoDinero movimientoDinero){
        MovimientoDinero putMovDinero = repoMovDinero.save(movimientoDinero);
        return putMovDinero;
    }
    @Override
    public void eliminarMovDinero(long id){
        repoMovDinero.deleteById(id);

    }
}
