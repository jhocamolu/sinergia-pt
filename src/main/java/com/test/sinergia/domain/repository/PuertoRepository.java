package com.test.sinergia.domain.repository;

import com.test.sinergia.domain.entity.Puerto;

import java.util.Optional;

public interface PuertoRepository {
    Optional<Puerto> findById(Long id);
    Puerto save(Puerto cliente);
}
