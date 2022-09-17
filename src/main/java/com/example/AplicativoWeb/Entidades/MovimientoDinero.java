package com.example.AplicativoWeb.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "movements")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private int montMovimiento;
    @Column
    private int montoPositivoYNegativo;
    @Column
    private String concepto;
    @Column
    private String usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MovimientoDinero(int montMovimiento, int montoPositivoYNegativo, String concepto, String usuario) {
        this.montMovimiento = montMovimiento;
        this.montoPositivoYNegativo = montoPositivoYNegativo;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public MovimientoDinero() {
    }

    public int getMontoMovimiento() {
        return montMovimiento;
    }

    public void setMontoMovimiento(int montoMovimiento) {
        this.montMovimiento = montoMovimiento;
    }

    public int getMontoPositivoYNegativo() {
        return montoPositivoYNegativo;
    }

    public void setMontoPositivoYNegativo(int montoPositivoYNegativo) {
        this.montoPositivoYNegativo = montoPositivoYNegativo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

