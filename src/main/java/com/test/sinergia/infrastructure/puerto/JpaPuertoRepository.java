package com.test.sinergia.infrastructure.puerto;

import com.test.sinergia.domain.entity.Puerto;
import com.test.sinergia.domain.repository.PuertoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaPuertoRepository implements PuertoRepository {
    private final SpringDataPuertoRepository springDataRepo;

    public JpaPuertoRepository(SpringDataPuertoRepository springDataRepo) {
        this.springDataRepo = springDataRepo;
    }

    @Override
    public Optional<Puerto> findById(Long id) {
        return springDataRepo.findById(id);
    }

    @Override
    public Puerto save(Puerto cliente) {
        return springDataRepo.save(cliente);
    }
}
