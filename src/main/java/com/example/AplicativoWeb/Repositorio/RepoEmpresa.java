package com.example.AplicativoWeb.Repositorio;

import com.example.AplicativoWeb.Entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.AplicativoWeb.Entidades.Empresa;

@Repository
public interface RepoEmpresa extends CrudRepository<Empresa, Long> {

}
