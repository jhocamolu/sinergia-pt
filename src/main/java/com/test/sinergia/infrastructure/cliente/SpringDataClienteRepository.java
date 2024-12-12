package com.test.sinergia.infrastructure.cliente;

import com.test.sinergia.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataClienteRepository extends JpaRepository<Cliente, Long> {
}
