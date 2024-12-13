package com.test.sinergia.infrastructure.envio;

import com.test.sinergia.domain.entity.Envio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataEnvioRepository extends JpaRepository<Envio, Long> {
}
