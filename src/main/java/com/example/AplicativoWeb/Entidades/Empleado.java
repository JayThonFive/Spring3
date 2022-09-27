package com.example.AplicativoWeb.Entidades;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "employee")
public class Empleado {

    @Id
    private int documento;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "correo")
    private String correo;
    
	@ManyToOne(fetch = FetchType.LAZY /*, cascade = CascadeType.ALL*/)
	@JoinColumn(name = "empresa_id", nullable = false)
	private Empresa empresa;
	
	@OneToOne
	@JoinColumn(name = "perfil_id", nullable = false)
	private Perfil perfil;

    @Column(name = "rol", nullable = false)
    private String rol;

	@UpdateTimestamp
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;

	@CreationTimestamp
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;	    
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "empleado")
	private List<MovimientoDinero> lMovimientoDinero;	

    public Empleado(String nombre, String correo, Empresa empresa, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
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
	
}
