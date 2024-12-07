package com.example.hexagonalarchitecture.domain.model;

import jakarta.persistence.*;

 
@Entity
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double importe;
    @Column(name = "id_empresa")
    private Long idEmpresa;  
    private String cuentaDebito;
    private String cuentaCredito;

    @ManyToOne
    @JoinColumn(name = "id_empresa", insertable = false, updatable = false)
    private Empresa empresa;
    
    public Transferencia() {
    }

    public Transferencia(Long id, Double importe, Long idEmpresa, String cuentaDebito, String cuentaCredito) {
        this.id = id;
        this.importe = importe;
        this.idEmpresa = idEmpresa;
        this.cuentaDebito = cuentaDebito;
        this.cuentaCredito = cuentaCredito;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getCuentaDebito() {
        return cuentaDebito;
    }

    public void setCuentaDebito(String cuentaDebito) {
        this.cuentaDebito = cuentaDebito;
    }

    public String getCuentaCredito() {
        return cuentaCredito;
    }

    public void setCuentaCredito(String cuentaCredito) {
        this.cuentaCredito = cuentaCredito;
    }

    // Método toString para facilitar el log
    @Override
    public String toString() {
        return "Transferencia{" +
                "id=" + id +
                ", importe=" + importe +
                ", idEmpresa=" + idEmpresa +
                ", cuentaDebito='" + cuentaDebito + '\'' +
                ", cuentaCredito='" + cuentaCredito + '\'' +
                '}';
    }
}


    
