package com.example.AplicativoWeb.Repositorio;

import com.example.AplicativoWeb.Entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepoMovDinero extends JpaRepository<MovimientoDinero, Long> {
}
