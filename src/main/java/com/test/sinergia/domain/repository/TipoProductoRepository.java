package com.test.sinergia.domain.repository;

import com.test.sinergia.domain.entity.TipoProducto;

import java.util.Optional;

public interface TipoProductoRepository {
    Optional<TipoProducto> findById(Long id);
    TipoProducto save(TipoProducto cliente);
}
