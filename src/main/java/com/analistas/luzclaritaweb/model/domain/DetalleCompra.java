package com.analistas.luzclaritaweb.model.domain;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class DetalleCompra {
    private int id;
    private int cantidad;
    private BigDecimal precioActual;
    private Compra compra;
    
    //Metodos
    public Double calcularSubtotal() {
        return cantidad * precioActual.doubleValue();
    }
}
