package com.example.AplicativoWeb.Entidades;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "enterprise")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(unique = true)
    private String nombre;
    
    @Column
    private String direccion;
    
    @Column
    private int telefono;
    
    @Column(unique = true)
    private int nit;

    @UpdateTimestamp
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;

    @CreationTimestamp
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "empresa")
	private List<MovimientoDinero> lMovimientoDinero;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "empresa")
	private List<Empleado> lEmpleado;    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Empresa(String nombre, String direccion, int telefono, int nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public Empresa() {
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
		this.fechaModificacion = fechaModificacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<MovimientoDinero> getlMovimientoDinero() {
		return lMovimientoDinero;
	}

	public void setlMovimientoDinero(List<MovimientoDinero> lMovimientoDinero) {
		this.lMovimientoDinero = lMovimientoDinero;
	}

	public List<Empleado> getlEmpleado() {
		return lEmpleado;
	}

	public void setlEmpleado(List<Empleado> lEmpleado) {
		this.lEmpleado = lEmpleado;
	}
    
    
}
