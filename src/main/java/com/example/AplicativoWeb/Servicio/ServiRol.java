package com.example.AplicativoWeb.Servicio;

import com.example.AplicativoWeb.Entidades.Rol;
import com.example.AplicativoWeb.Repositorio.RepoRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiRol implements IRolService{
    @Autowired
    private RepoRol repoRol;
    @Override
    public Rol buscarPorId(long id) {
        Optional<Rol> rol = repoRol.findById(id);
        return rol.get();
    }

    @Override
    public List<Rol> buscarTodos() {
        List<Rol> roles = (List<Rol>) repoRol.findAll();
        return roles;
    }

    @Override
    public Rol crearRol(Rol rol) {
        Rol newRol = repoRol.save(rol);
        return newRol;
    }

    @Override
    public Rol actualizarRol(long id, Rol rol) {
        Rol putRol = repoRol.save(rol);
        return putRol;
    }

    @Override
    public void borrarRol(long id) {
        repoRol.deleteById(id);
    }
}
