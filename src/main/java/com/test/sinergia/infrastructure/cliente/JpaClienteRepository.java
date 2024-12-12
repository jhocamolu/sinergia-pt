package com.test.sinergia.infrastructure.cliente;

import com.test.sinergia.domain.entity.Cliente;
import com.test.sinergia.domain.repository.ClienteRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaClienteRepository implements ClienteRepository {
    private final SpringDataClienteRepository springDataRepo;

    public JpaClienteRepository(SpringDataClienteRepository springDataRepo) {
        this.springDataRepo = springDataRepo;
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return springDataRepo.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return springDataRepo.save(cliente);
    }
}
