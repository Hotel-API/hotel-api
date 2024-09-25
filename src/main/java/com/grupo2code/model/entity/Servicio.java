package com.grupo2code.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "servicios")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "nombre", nullable = false)
    private String nombre;

    @Column (name = "descripcion", nullable = false)
    private String descripcion;

    @Column (name = "precio", nullable = false)
    private String precio;

    @Column (name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column (name = "updated_at")
    private LocalDateTime updatedAt;

}
