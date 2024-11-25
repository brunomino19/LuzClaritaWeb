package com.analistas.luzclaritaweb.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class Factura {
    private Long id;
    private Long numero;
    private LocalDateTime fecha; 
    private boolean activo;
    private String metodo_pago;
    private Cliente cliente;
    private List<Detalle_factura> detalles;
    //private Cajas cajas;

    public Double calcularTotal(){

        Double total = 0.0;

        for(Detalle_factura detalle : detalles) {
            //Obtener el subtotal y acumularlo...
            total += detalle.calcularSubtotal();
        }

        return total;
    }

    public void AddDetalles(Detalle_factura detalle) {
        detalles.add(detalle);
    }
}
