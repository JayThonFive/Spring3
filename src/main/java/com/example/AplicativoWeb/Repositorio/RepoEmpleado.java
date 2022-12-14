package com.example.AplicativoWeb.Repositorio;

import com.example.AplicativoWeb.Entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.AplicativoWeb.Entidades.Empleado;

import java.util.Optional;

@Repository
public interface RepoEmpleado extends CrudRepository<Empleado, Long> {
}
