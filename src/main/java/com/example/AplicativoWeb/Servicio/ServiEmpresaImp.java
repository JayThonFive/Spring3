package com.example.AplicativoWeb.Servicio;

import com.example.AplicativoWeb.Entidades.Empresa;
import com.example.AplicativoWeb.Repositorio.RepoEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiEmpresaImp implements IEmpresaService{

    @Autowired
    private RepoEmpresa repoEmpresa;
    @Override
    public Empresa verEmpresa(long id) {
        Optional<Empresa> empresa = repoEmpresa.findById(id);
        return empresa.get();
    }
    @Override
    public List<Empresa> buscarTodos() {
        List<Empresa> empresas = (List<Empresa>) repoEmpresa.findAll();
        return empresas;
    }
    @Override
    public Empresa crearEmpresa(Empresa empresa) {
        Empresa newEmpresa = repoEmpresa.save(empresa);
        return newEmpresa;
    }
    @Override
    public Empresa editarEmpresa(Empresa empresa){
        Empresa putEmpresa = repoEmpresa.save(empresa);
        return putEmpresa;
    }
    @Override
    public void eliminarEmpresa(long id){
        repoEmpresa.deleteById(id);
    }
}
