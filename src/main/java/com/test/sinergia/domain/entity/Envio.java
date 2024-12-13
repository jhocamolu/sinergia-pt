package com.test.sinergia.domain.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "envios")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_tipo_producto")
    private TipoProducto tipoProducto;

    private Integer cantidad;
    private Date fechaRegistro;
    private Date fechaEntrega;
    private BigDecimal precioNormal;
    private BigDecimal precioDescuento;
    @Column(unique = true, length = 10)
    private String numeroGuia;

    // Constructores
    // Constructor vacío (requerido por algunos frameworks de ORM)
    public Envio() {}

    // Constructor con todos los atributos
    public Envio(Cliente cliente, TipoProducto tipoProducto, Integer cantidad, Date fechaRegistro, Date fechaEntrega, BigDecimal precioNormal, BigDecimal precioDescuento, String numeroGuia) {
        this.cliente = cliente;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.fechaRegistro = fechaRegistro;
        this.fechaEntrega = fechaEntrega;
        this.precioNormal = precioNormal;
        this.precioDescuento = precioDescuento;
        this.numeroGuia = numeroGuia;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public BigDecimal getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(BigDecimal precioNormal) {
        this.precioNormal = precioNormal;
    }

    public BigDecimal getPrecioDescuento() {
        return precioDescuento;
    }

    public void setPrecioDescuento(BigDecimal precioDescuento) {
        this.precioDescuento = precioDescuento;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    // Método toString para facilitar la depuración
    @Override
    public String toString() {
        return "Envio{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", tipoProducto=" + tipoProducto +
                ", cantidad=" + cantidad +
                ", fechaRegistro=" + fechaRegistro +
                ", fechaEntrega=" + fechaEntrega +
                ", precioNormal=" + precioNormal +
                ", precioDescuento=" + precioDescuento +
                ", numeroGuia='" + numeroGuia + '\'' +
                '}';
    }
}
