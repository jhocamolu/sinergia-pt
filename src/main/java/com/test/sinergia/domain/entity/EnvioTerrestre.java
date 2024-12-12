package com.test.sinergia.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "envios_terrestres")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class EnvioTerrestre extends Envio {
    @Column(name = "id_bodega")
    private Long idBodega;

    @Column(length = 6)
    private String placa;

    // Constructor vacío (requerido por algunos frameworks de ORM)
    public EnvioTerrestre() {}

    // Constructor con todos los atributos
    public EnvioTerrestre(Cliente cliente, TipoProducto tipoProducto, Integer cantidad, Date fechaRegistro, Date fechaEntrega, BigDecimal precioNormal, BigDecimal precioDescuento, String numeroGuia, Long idBodega, String placa) {
        super(cliente, tipoProducto, cantidad, fechaRegistro, fechaEntrega, precioNormal, precioDescuento, numeroGuia);
        this.idBodega = idBodega;
        this.placa = placa;
    }

    // Getters y setters
    public Long getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(Long idBodega) {
        this.idBodega = idBodega;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Método toString para facilitar la depuración
    @Override
    public String toString() {
        return "EnvioTerrestre{" +
                "idBodega=" + idBodega +
                ", placa='" + placa + '\'' +
                ", " + super.toString() +
                '}';
    }
}
