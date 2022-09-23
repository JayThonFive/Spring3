package com.example.AplicativoWeb.Entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Long idEmpresa;
    
    @Column(name = "nombre",unique = true)
    private String nombre;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "telefono")
    private int telefono;
    
    @Column(name = "NIT",unique = true)
    private int nit;
    
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

    public Long getId() {
        return idEmpresa;
    }

    public void setId(Long id) {
        this.idEmpresa= id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = new Date();
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = new Date();
	}

}
