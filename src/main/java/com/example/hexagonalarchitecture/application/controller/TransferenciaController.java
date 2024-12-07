package com.example.hexagonalarchitecture.application.controller;

import com.example.hexagonalarchitecture.domain.model.Transferencia;
import com.example.hexagonalarchitecture.domain.service.TransferenciaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

    private final TransferenciaService transferenciaService;

    public TransferenciaController(TransferenciaService transferenciaService) {
        this.transferenciaService = transferenciaService;
    }

    @PostMapping
    public ResponseEntity<Transferencia> crearTransferencia(@RequestBody Transferencia transferencia) {
        Transferencia transferenciaCreada = transferenciaService.crearTransferencia(transferencia);
        return ResponseEntity.ok(transferenciaCreada);
    }
}
