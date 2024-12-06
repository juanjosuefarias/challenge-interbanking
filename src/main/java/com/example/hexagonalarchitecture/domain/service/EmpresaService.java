package com.example.hexagonalarchitecture.domain.service;

import com.example.hexagonalarchitecture.domain.model.Empresa;
import com.example.hexagonalarchitecture.adapter.outbound.persistence.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> obtenerEmpresasAdheridasUltimoMes() {
        LocalDate unMesAntes = LocalDate.now().minusMonths(1);
        return empresaRepository.findAll().stream()
                .filter(empresa -> empresa.getFechaAdhesion().isAfter(unMesAntes))
                .toList();
    }

    public void crearEmpresa(Empresa empresa) {
        empresaRepository.save(empresa);
    }
}
