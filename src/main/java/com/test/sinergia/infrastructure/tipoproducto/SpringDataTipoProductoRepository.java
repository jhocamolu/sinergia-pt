package com.test.sinergia.infrastructure.tipoproducto;

import com.test.sinergia.domain.entity.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataTipoProductoRepository extends JpaRepository<TipoProducto, Long> {
}
