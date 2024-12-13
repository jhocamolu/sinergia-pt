package com.test.sinergia.infrastructure.envio;

import com.test.sinergia.domain.entity.Envio;
import com.test.sinergia.domain.repository.EnvioRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaEnvioRepository implements EnvioRepository {
    private final SpringDataEnvioRepository springDataRepo;

    public JpaEnvioRepository(SpringDataEnvioRepository springDataRepo) {
        this.springDataRepo = springDataRepo;
    }

    @Override
    public Optional<Envio> findById(Long id) {
        return springDataRepo.findById(id);
    }

    @Override
    public Envio save(Envio cliente) {
        return springDataRepo.save(cliente);
    }
}
