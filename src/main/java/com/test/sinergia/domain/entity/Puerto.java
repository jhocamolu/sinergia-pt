package com.test.sinergia.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "puertos")
public class Puerto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String nombre;

    @Column(length = 50)
    private String pais;

    @Column(length = 50)
    private String ciudad;

    // Constructor vacío (requerido por algunos frameworks de ORM)
    public Puerto() {}

    // Constructor con todos los atributos
    public Puerto(String nombre, String pais, String ciudad) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Método toString para facilitar la depuración
    @Override
    public String toString() {
        return "Puerto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
