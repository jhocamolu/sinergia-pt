package com.test.sinergia.infrastructure.puerto;

import com.test.sinergia.domain.entity.Puerto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataPuertoRepository extends JpaRepository<Puerto, Long> {
}
