package com.example.hexagonalarchitecture.application.controller;

import com.example.hexagonalarchitecture.domain.model.Empresa;
import com.example.hexagonalarchitecture.domain.service.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping("/adhesionUltimoMes")
    public List<Empresa> obtenerEmpresasAdheridas() {
        return empresaService.obtenerEmpresasAdheridasUltimoMes();
    }

    @PostMapping("/adhesion")
    public void crearEmpresa(@RequestBody Empresa empresa) {
        empresaService.crearEmpresa(empresa);
    }
}
