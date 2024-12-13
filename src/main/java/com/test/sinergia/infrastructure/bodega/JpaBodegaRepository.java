package com.test.sinergia.infrastructure.bodega;

import com.test.sinergia.domain.entity.Bodega;
import com.test.sinergia.domain.repository.BodegaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaBodegaRepository implements BodegaRepository {
    private final BodegaRepository bodegaRepository;

    public JpaBodegaRepository(BodegaRepository bodegaRepository) {
        this.bodegaRepository = bodegaRepository;
    }

    @Override
    public Bodega createBodega(Bodega bodega) {
        return bodegaRepository.createBodega(bodega);
    }

    @Override
    public Optional<Bodega> getBodegaById(Long id) {
        return bodegaRepository.getBodegaById(id);
    }

    @Override
    public List<Bodega> getAllBodegas() {
        return bodegaRepository.getAllBodegas();
    }

    @Override
    public Bodega updateBodega(Long id, Bodega bodega) {
        return bodegaRepository.getBodegaById(id)
                .map(existing -> {
                    existing.setNombre(bodega.getNombre());
                    existing.setDireccion(bodega.getDireccion());
                    existing.setPais(bodega.getPais());
                    existing.setCiudad(bodega.getCiudad());
                    return bodegaRepository.updateBodega(bodega.getId(),existing);
                })
                .orElseThrow(() -> new RuntimeException("Bodega no encontrada"));
    }

    @Override
    public void deleteBodega(Long id) {
        bodegaRepository.deleteBodega(id);
    }
}
