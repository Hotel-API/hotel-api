package com.grupo2code.model.entity;

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

    @Column(name = "numero", nullable = false, length = 50)
    private String numero;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "precio_por_noche", nullable = false)
    private Double precioPorNoche;

    @Column(nullable = false)
    private Boolean disponibilidad;

    @Column(name = "created_at",nullable = false)
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;


}
