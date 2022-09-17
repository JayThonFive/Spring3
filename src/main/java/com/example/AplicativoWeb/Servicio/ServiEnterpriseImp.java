package com.example.aplicativoWed.Servicios;

import com.example.aplicativoWed.Entidades.Enterprise;
import com.example.aplicativoWed.Repositorio.RepoEnterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiEnterpriseImp {

    @Autowired
    RepoEnterprise repoEnterprise;

    public List<Enterprise> verEmpresa(){
        List<Enterprise> enterprises = new ArrayList<Enterprise>();
        enterprises.addAll(repoEnterprise.findAll());
        return enterprises;

    }
    public void crearEmpresa(Enterprise enterprise){
        repoEnterprise.save(enterprise);

    }
    public void editarEmpresa(Enterprise enterprise){
        repoEnterprise.save(enterprise);
    }
    public void eliminarEmpresa(Integer Id){
        repoEnterprise.deleteById(Id);


    }
}
