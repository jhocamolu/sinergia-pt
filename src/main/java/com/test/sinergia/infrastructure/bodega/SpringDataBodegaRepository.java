package com.test.sinergia.infrastructure.bodega;

import com.test.sinergia.domain.entity.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataBodegaRepository extends JpaRepository<Bodega, Long> {
}
