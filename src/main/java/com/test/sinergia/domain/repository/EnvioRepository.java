package com.test.sinergia.domain.repository;

import com.test.sinergia.domain.entity.Envio;

import java.util.Optional;

public interface EnvioRepository {
    Optional<Envio> findById(Long id);
    Envio save(Envio cliente);
}
