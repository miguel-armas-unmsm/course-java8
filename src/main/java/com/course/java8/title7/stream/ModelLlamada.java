package com.course.java8.title7.stream;

import java.time.Duration;
import java.time.LocalDate;

public class ModelLlamada {
    
    private ModelContacto contacto;
    private LocalDate fecha;
    private Duration duracion;

    public ModelLlamada(ModelContacto contacto, LocalDate fecha, Duration duracion) {
        this.contacto = contacto;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public ModelContacto getContacto() {
        return contacto;
    }

    public void setContacto(ModelContacto contacto) {
        this.contacto = contacto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }
}
