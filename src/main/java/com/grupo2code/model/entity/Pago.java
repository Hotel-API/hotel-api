package com.grupo2code.model.entity;

import com.grupo2code.model.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fecha_pago")
    private LocalDateTime fechaPago;

    @Column(name = "monto")
    private String monto;

    @Column(name = "metodo_pago")
    private String metodoPago;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private PaymentStatus status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "reserva_id", referencedColumnName = "id"
            ,foreignKey = @ForeignKey(name = "FK_pago_reservas"))
    private Reserva reserva;

    // Relación OneToMany para obtener los servicios de la reserva al momento de pagar
    @OneToMany(mappedBy = "reservas", cascade = CascadeType.ALL)
    private List<ReservaServicio> servicio;

}
