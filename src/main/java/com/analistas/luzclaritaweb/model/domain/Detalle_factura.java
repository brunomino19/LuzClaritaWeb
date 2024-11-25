package com.analistas.luzclaritaweb.model.domain;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class Detalle_factura {

    //Atributos
    private Long id;
    private int cantidad;
    private BigDecimal precio_unitario;
    private Factura facturas;
    private Producto producto;

    //Metodos
    public Double calcularSubtotal() {
        return cantidad * precio_unitario.doubleValue();
    }
}