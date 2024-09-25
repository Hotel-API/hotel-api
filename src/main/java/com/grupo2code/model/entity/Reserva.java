package com.grupo2code.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String estado;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDateTime fechaInicio;

    @Column(name = "fecha_final" )
    private LocalDateTime fechaFinal;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_reserva_clientes"))
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "habitacion_id", referencedColumnName = "id"
            ,foreignKey = @ForeignKey(name = "FK_reserva_habitaciones"))
    private Habitacion habitacion;

    // Relación OneToMany para obtener los servicios relacionados con la reserva
    // @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    //private List<ReservaServicio> servicio;
}
