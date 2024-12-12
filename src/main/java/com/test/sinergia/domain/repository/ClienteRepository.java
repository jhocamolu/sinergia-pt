package com.test.sinergia.domain.repository;

import com.test.sinergia.domain.entity.Cliente;

import java.util.Optional;

public interface ClienteRepository {
    Optional<Cliente> findById(Long id);
    Cliente save(Cliente cliente);
}
