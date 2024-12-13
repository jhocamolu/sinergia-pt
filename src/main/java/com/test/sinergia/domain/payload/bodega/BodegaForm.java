package com.test.sinergia.domain.payload.bodega;


import jakarta.validation.constraints.NotNull;

public class BodegaForm {

    @NotNull(message = "El nombre es obligatorio")
    private String nombre;

    @NotNull(message = "La direccion es obligatoria")
    private String direccion;

    @NotNull(message = "El pais es obligatorio")
    private String pais;

    @NotNull(message = "La ciudad es obligatoria")
    private String ciudad;

    public BodegaForm(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
}
