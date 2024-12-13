package com.test.sinergia.infrastructure.tipoproducto;

import com.test.sinergia.domain.entity.TipoProducto;
import com.test.sinergia.domain.repository.TipoProductoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaTipoProductoRepository implements TipoProductoRepository {
    private final SpringDataTipoProductoRepository springDataRepo;

    public JpaTipoProductoRepository(SpringDataTipoProductoRepository springDataRepo) {
        this.springDataRepo = springDataRepo;
    }

    @Override
    public Optional<TipoProducto> findById(Long id) {
        return springDataRepo.findById(id);
    }

    @Override
    public TipoProducto save(TipoProducto cliente) {
        return springDataRepo.save(cliente);
    }
}
