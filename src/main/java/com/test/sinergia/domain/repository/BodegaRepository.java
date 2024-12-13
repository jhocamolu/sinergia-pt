package com.test.sinergia.domain.repository;

import com.test.sinergia.domain.entity.Bodega;

import java.util.List;
import java.util.Optional;

public interface BodegaRepository {
    Bodega createBodega(Bodega bodega);
    Optional<Bodega> getBodegaById(Long id);
    List<Bodega> getAllBodegas();
    Bodega updateBodega(Long id, Bodega bodega);
    void deleteBodega(Long id);
}
