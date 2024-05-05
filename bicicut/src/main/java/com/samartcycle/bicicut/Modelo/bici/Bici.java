package com.samartcycle.bicicut.Modelo.bici;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity(name = "bicis")
@Table(name = "bicis")
@NoArgsConstructor
@AllArgsConstructor
@Getter
//Hola
public class Bici {
    @Id
    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    @Column(name = "id", nullable = false)
    private UUID id_bici;

    private int estado;

    private Boolean disponible;


    public Bici(int estado, boolean disponible) {
        this.estado = estado;
        this.disponible = disponible;
    }

    public Bici(DatosBici datosBici) {

    }

    public UUID getId_bici() {
        return UUID.randomUUID();
    }
/*
    public void setId_bici(UUID id_bici) {
        this.id_bici = id_bici;
    }

    public int isEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }*/
}
