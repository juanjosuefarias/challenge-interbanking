package com.example.hexagonalarchitecture.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Empresa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cuit;
    private String razonSocial;
    private LocalDate fechaAdhesion;

    
    public String getRazonSocial(){
        return razonSocial;
    }

    public LocalDate getFechaAdhesion(){
        return fechaAdhesion;
    }

    public void setRazonSocial(String razonSocial){
        this.razonSocial = razonSocial;
    }

    public void setFechaAdhesion(LocalDate fechaAdhesion){
        this.fechaAdhesion = fechaAdhesion;
    }
}
