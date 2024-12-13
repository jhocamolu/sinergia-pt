package com.test.sinergia.controllers;

import com.test.sinergia.application.service.BodegaService;
import com.test.sinergia.domain.entity.Bodega;
import com.test.sinergia.domain.payload.bodega.BodegaForm;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bodegas")
public class BodegaController {

    private final BodegaService bodegaService;

    public BodegaController(BodegaService bodegaService) {
        this.bodegaService = bodegaService;
    }

    @GetMapping
    public List<Bodega> listarBodega(@RequestBody @Validated BodegaForm bodega) {
        return bodegaService.listarBodegas();
    }

    @PostMapping
    public Bodega registrarBodega(@RequestBody @Validated BodegaForm bodega) {
        return bodegaService.registrarBodega(bodega);
    }
}
