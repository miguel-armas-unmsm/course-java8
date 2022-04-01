package com.course.java8.title7.stream;

import java.time.LocalDate;
import java.time.Period;

public class ModelContacto {
    
    private String nombre;
    private String ciudad;
    private String numeroTelefono;
    private LocalDate fechaNac;

    public ModelContacto(String nombre, String ciudad, String numeroTelefono, LocalDate fechaNac) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numeroTelefono = numeroTelefono;
        this.fechaNac = fechaNac;
    }
    
    public int getAge() {
        return Period.between(this.fechaNac, LocalDate.now()).getYears();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
}
