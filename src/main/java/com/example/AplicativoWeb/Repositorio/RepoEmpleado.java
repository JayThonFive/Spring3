package com.example.AplicativoWeb.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AplicativoWeb.Entidades.Empleado;

@Repository
public interface RepoEmpleado extends JpaRepository<Empleado, Integer> {


}
