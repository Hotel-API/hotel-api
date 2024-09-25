package com.grupo2code.model.entity;

import com.grupo2code.model.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "costumers")

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dni_ce", nullable = false)
    private int dniCe;

    @Column(name = "nombres", nullable = false)
    private String nombre;

    @Column(name = "apellidos", nullable = false)
    private String apellido;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "email", unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDateTime fechaNacimiento;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Enumerated (EnumType.STRING)
    @Column(name = "role")

    private Role role;



}