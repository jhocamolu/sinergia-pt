package com.test.sinergia.domain.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "envios_maritimos")
public class EnvioMaritimo {
    @Id
    private Long id_envio;

    @Column(name = "id_puerto")
    private Long idPuerto;

    @Column(length = 8)
    private String numeroFlota;

    // Constructor vacío (requerido por algunos frameworks de ORM)
    public EnvioMaritimo() {}

    // Constructor con todos los atributos
    public EnvioMaritimo(Cliente cliente, TipoProducto tipoProducto, Integer cantidad, Date fechaRegistro, Date fechaEntrega, BigDecimal precioNormal, BigDecimal precioDescuento, String numeroGuia, Long idPuerto, String numeroFlota) {
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
