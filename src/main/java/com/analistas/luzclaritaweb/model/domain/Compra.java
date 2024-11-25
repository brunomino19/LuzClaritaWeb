package com.analistas.luzclaritaweb.model.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Compra {
    private Long id;
    private LocalDateTime fechaHora;
    private String descripcion;
    private BigDecimal precio;
    private List<DetalleCompra> compras;
    private boolean activo;

    public Compra() {
        compras = new ArrayList<>();
        fechaHora = LocalDateTime.now();
        descripcion = "Ninguna";
        activo = true;
    }

    public Double calcularTotal() {

        Double total = 0.0;

        for (DetalleCompra compra : compras) {
            total += compra.calcularSubtotal();
        }
        return total;
    }
}
