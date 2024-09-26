package com.grupo2code.model.entity;

import com.grupo2code.model.enums.EstadoHabitacion;
import com.grupo2code.model.enums.TipoHabitacion;
import jakarta.persistence.*;
import lombok.Data;
//JPA
@Data
@Entity
@Table(name = "habitaciones")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero_habitación", nullable = false, length = 10)
    private String numeroHabitacion;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_habitacion")
    private TipoHabitacion tipoHabitacion;

    @Column(name = "capacidad", nullable = false)
    private String capacidad;

    @Column(name = "precio_por_noche", nullable = false)
    private Double precioPorNoche;

    @Enumerated(EnumType.STRING)
    @Column (name = "estado_habitacion")
    private EstadoHabitacion estadoHabitacion;

    @Column(name = "created_at",nullable = false)
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;

    @ManyToOne
    @JoinColumn(name="reserva_id",referencedColumnName = "id")
    private Reserva reserva;

}
