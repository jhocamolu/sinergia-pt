package com.test.sinergia.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipos_productos")
public class TipoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String descripcion;

    // Constructor vacío
    public TipoProducto() {}

    // Constructor con todos los atributos
    public TipoProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método toString para facilitar la depuración
    @Override
    public String toString() {
        return "TipoProducto{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
