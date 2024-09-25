package com.grupo2code.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/*JPA*/
@Data
@Entity
@Table(name = "reserva_servicios")
@IdClass(ReservaServicioPK.class)
public class ReservaServicio {

        @Id
        private Integer reserva;

        @Id
        private Integer servicio;

        @Column(name = "fecha_rservicio",nullable = false)
        private LocalDateTime fechaRServicio;
}
