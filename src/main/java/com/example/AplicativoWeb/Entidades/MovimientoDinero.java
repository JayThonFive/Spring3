package com.example.AplicativoWeb.Entidades;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "movements")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mov_dinero")
    private Long idMovDinero;

    @Column(name = "montoMovimiento")
    private Long montoMovimiento;
    
    @Column(name = "concepto")
    private String concepto;

	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

    @OneToOne
    @JoinColumn(name = "empleado")
    public Empleado empleado;

    public Long getIdMovDinero() {
        return idMovDinero;
    }

    public void setIdMovDinero(Long idMovDinero) {
        this.idMovDinero = idMovDinero;
    }

    public long getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(long montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}

