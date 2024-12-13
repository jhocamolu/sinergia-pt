package com.test.sinergia.application.service;

import com.test.sinergia.domain.entity.Bodega;
import com.test.sinergia.domain.payload.bodega.BodegaForm;
import com.test.sinergia.domain.repository.BodegaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodegaService {
    private final BodegaRepository bodegaRepository;

    public BodegaService(BodegaRepository bodegaRepository) {
        this.bodegaRepository = bodegaRepository;
    }

    public Bodega registrarBodega(BodegaForm bodega) {
        Bodega nuevoBodega = new Bodega();
        nuevoBodega.setNombre(bodega.getNombre());
        nuevoBodega.setCiudad(bodega.getCiudad());
        nuevoBodega.setDireccion(bodega.getDireccion());
        return bodegaRepository.createBodega(nuevoBodega);
    }
    
    public List<Bodega> listarBodegas() {
        return bodegaRepository.getAllBodegas();
    }
}
