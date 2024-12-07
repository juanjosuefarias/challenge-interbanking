package com.example.hexagonalarchitecture.adapter.outbound.persistence;

import com.example.hexagonalarchitecture.domain.model.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
}
