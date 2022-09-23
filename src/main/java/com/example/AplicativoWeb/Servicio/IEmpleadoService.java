package com.example.AplicativoWeb.Servicio;

import com.example.AplicativoWeb.Entidades.Empleado;

import java.util.List;

public interface IEmpleadoService {
    public Empleado verEmpleado(Long id);

    public List<Empleado> buscarTodos();

    public Empleado crearEmpleado(Empleado empleado);

    public Empleado editarEmpleado(Empleado empleado);

    public void eliminarEmpleado(long id);
}
