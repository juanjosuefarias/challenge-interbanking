package com.example.hexagonalarchitecture.adapter.outbound.persistence;

import com.example.hexagonalarchitecture.domain.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, String> {
}
