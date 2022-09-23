package com.example.AplicativoWeb.Servicio;

import com.example.AplicativoWeb.Entidades.MovimientoDinero;

import java.util.List;

public interface IMovDineroService {
    public MovimientoDinero verMovDinero(long id);

    public List<MovimientoDinero> buscarTodos();

    public MovimientoDinero crearMovDinero(MovimientoDinero movDinero);

    public MovimientoDinero editarMovDinero(long id, MovimientoDinero movimientoDinero);

    public void eliminarMovDinero(long id);
}
