package com.example.AplicativoWeb.Servicio;

import com.example.AplicativoWeb.Entidades.Empresa;
import com.example.AplicativoWeb.Repositorio.RepoEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiEmpresaImp {

    @Autowired
    RepoEmpresa repoEmpresa;

    public List<Empresa> verEmpresa(){
        List<Empresa> enterprises = new ArrayList<Empresa>();
        enterprises.addAll(repoEmpresa.findAll());
        return enterprises;

    }
    public void crearEmpresa(Empresa empresa){
        repoEmpresa.save(empresa);

    }
    public void editarEmpresa(Empresa empresa){
        repoEmpresa.save(empresa);
    }
    public void eliminarEmpresa(Long Id){
        repoEmpresa.deleteById(Id);


    }
}
