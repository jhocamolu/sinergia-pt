package com.test.sinergia.domain.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "envios_maritimos")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class EnvioMaritimo extends Envio {

    @Column(name = "id_puerto")
    private Long idPuerto;

    @Column(length = 8)
    private String numeroFlota;

    // Constructor vacío (requerido por algunos frameworks de ORM)
    public EnvioMaritimo() {}

    // Constructor con todos los atributos
    public EnvioMaritimo(Cliente cliente, TipoProducto tipoProducto, Integer cantidad, Date fechaRegistro, Date fechaEntrega, BigDecimal precioNormal, BigDecimal precioDescuento, String numeroGuia, Long idPuerto, String numeroFlota) {
        super(cliente, tipoProducto, cantidad, fechaRegistro, fechaEntrega, precioNormal, precioDescuento, numeroGuia);
        this.idPuerto = idPuerto;
        this.numeroFlota = numeroFlota;
    }

    // Getters y setters
    public Long getIdPuerto() {
        return idPuerto;
    }

    public void setIdPuerto(Long idPuerto) {
        this.idPuerto = idPuerto;
    }

    public String getNumeroFlota() {
        return numeroFlota;
    }

    public void setNumeroFlota(String numeroFlota) {
        this.numeroFlota = numeroFlota;
    }

    // Método toString para facilitar la depuración
    @Override
    public String toString() {
        return "EnvioMaritimo{" +
                "idPuerto=" + idPuerto +
                ", numeroFlota='" + numeroFlota + '\'' +
                ", " + super.toString() +
                '}';
    }
}
