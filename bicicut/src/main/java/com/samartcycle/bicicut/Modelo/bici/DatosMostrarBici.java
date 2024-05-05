package com.samartcycle.bicicut.Modelo.bici;

public record DatosMostrarBici(

        int estado,
        Boolean disponible
) {

    public DatosMostrarBici(Bici bici) {
        this(bici.getEstado(), bici.());
    }
}

