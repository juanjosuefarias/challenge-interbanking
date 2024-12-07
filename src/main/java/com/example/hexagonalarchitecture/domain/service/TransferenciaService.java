package com.example.hexagonalarchitecture.domain.service;

import com.example.hexagonalarchitecture.domain.model.Transferencia;
import com.example.hexagonalarchitecture.adapter.outbound.persistence.TransferenciaRepository;
import org.springframework.stereotype.Service;

@Service
public class TransferenciaService {

    private final TransferenciaRepository transferenciaRepository;

    public TransferenciaService(TransferenciaRepository transferenciaRepository) {
        this.transferenciaRepository = transferenciaRepository;
    }

    public Transferencia crearTransferencia(Transferencia transferencia) {
        return transferenciaRepository.save(transferencia);
    }
}
