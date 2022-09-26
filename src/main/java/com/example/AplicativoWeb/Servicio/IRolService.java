package com.example.AplicativoWeb.Servicio;

import com.example.AplicativoWeb.Entidades.Rol;

import java.util.List;

public interface IRolService {
    public Rol buscarPorId(long id);

    public List<Rol> buscarTodos();

    public Rol crearRol(Rol rol);

    public Rol actualizarRol(long id, Rol rol);

    public void borrarRol(long id);
}
