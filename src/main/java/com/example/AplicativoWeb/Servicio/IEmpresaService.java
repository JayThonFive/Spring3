package com.example.AplicativoWeb.Servicio;

import com.example.AplicativoWeb.Entidades.Empresa;

import java.util.List;

public interface IEmpresaService {
    public Empresa verEmpresa(long id);

    public List<Empresa> buscarTodos();

    public Empresa crearEmpresa(Empresa empresa);

    public Empresa editarEmpresa(Empresa empresa);

    public void eliminarEmpresa(long id);
}
