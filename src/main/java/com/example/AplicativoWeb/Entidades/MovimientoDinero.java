package com.example.AplicativoWeb.Entidades;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "movements")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "montoMovimiento")
    private int montMovimiento;
    
    @Column (name = "concepto")
    private String concepto;
    
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "empresa_id", nullable = false)
	private Empresa empresa;	
	
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "empleado_id", nullable = false)
	private Empleado empleado;	

    @UpdateTimestamp
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;

    @CreationTimestamp
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;	

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MovimientoDinero(int montMovimiento, String concepto, Empleado empleado) {
        this.montMovimiento = montMovimiento;
        this.concepto = concepto;
        this.empleado = empleado;
    }

    public MovimientoDinero() {
    }

    public int getMontoMovimiento() {
        return montMovimiento;
    }

    public void setMontoMovimiento(int montoMovimiento) {
        this.montMovimiento = montoMovimiento;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}

