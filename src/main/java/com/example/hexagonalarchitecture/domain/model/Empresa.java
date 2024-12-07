package com.example.hexagonalarchitecture.domain.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;
    private String razonSocial;
    public LocalDate fechaAdhesion; // o LocalDate, según tu implementación
    

    public Empresa() {
    }

    public Empresa(Long id, String razonSocial, LocalDate fechaAdhesion) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.fechaAdhesion = fechaAdhesion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public LocalDate getFechaAdhesion() {
        return fechaAdhesion;
    }

    public void setFechaAdhesion(LocalDate fechaAdhesion) {
        this.fechaAdhesion = fechaAdhesion;
    }

    // Método toString para facilitar el log
    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", razonSocial='" + razonSocial + '\'' +
                ", fechaAdhesion='" + fechaAdhesion + '\'' +
                '}';
    }
}
