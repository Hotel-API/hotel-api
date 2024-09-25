package com.grupo2code.model.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class ReservaServicioPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "reserva_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "fk_Servicios_reservas"))
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name = "servicio_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_Reserva_servicios"))
    private Servicio servicio;
}
