package com.analistas.luzclaritaweb.model.domain;


import lombok.Data;
@Data
public class Cliente {

    private Long id;
    private String nomb_ape;
    private Long celular;
    private String direccion;
    private String correo;
    private Usuario usuario;

    @Override
    public String toString() {
        return id + " - " + nomb_ape;
    }
}
