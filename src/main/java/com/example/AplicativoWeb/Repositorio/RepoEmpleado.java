package com.example.AplicativoWeb.Repositorio;

import com.example.AplicativoWeb.Entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoEmpleado extends JpaRepository <Empleado, Integer>{


}
