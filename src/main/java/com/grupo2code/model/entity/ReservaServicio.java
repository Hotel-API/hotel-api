package com.grupo2code.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "reserva_servicios")
@IdClass(ReservaServicioPK.class)
public class ReservaServicio {

    @Id
    private Integer reserva;

    @Id
    private Integer servicio;

    @ManyToOne
    @JoinColumn(name = "pago_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_reserva_servicio_pago"))
    private Pago pago;

    @Column(name = "fecha_rservicio",nullable = false)
    private LocalDateTime fechaRServicio;
}
