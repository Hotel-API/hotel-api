INSERT INTO clientes (id, dni_ce, nombres, apellidos, nacionalidad, email, password, telefono, fechas_nacimiento, created_at, updated_at) VALUES
                                                                                                                                              (1, 12345678, 'Juan', 'Pérez', 'Peruano', 'juan.perez@example.com', 'password123', '987654321', '1985-05-20', NOW(), NOW()),
                                                                                                                                              (2, 87654321, 'María', 'González', 'Colombiana', 'maria.gonzalez@example.com', 'password456', '987654322', '1990-07-15', NOW(), NOW()),
                                                                                                                                              (3, 11223344, 'Carlos', 'Ramírez', 'Chileno', 'carlos.ramirez@example.com', 'password789', '987654323', '1988-02-10', NOW(), NOW()),
                                                                                                                                              (4, 55667788, 'Ana', 'Martínez', 'Argentina', 'ana.martinez@example.com', 'password321', '987654324', '1992-11-30', NOW(), NOW()),
                                                                                                                                              (5, 99887766, 'Pedro', 'López', 'Ecuatoriano', 'pedro.lopez@example.com', 'password654', '987654325', '1979-03-25', NOW(), NOW()),
                                                                                                                                              (6, 33445566, 'Lucía', 'Torres', 'Uruguaya', 'lucia.torres@example.com', 'password987', '987654326', '1995-08-22', NOW(), NOW()),
                                                                                                                                              (7, 77441122, 'Roberto', 'Díaz', 'Mexicano', 'roberto.diaz@example.com', 'password234', '987654327', '1983-07-19', NOW(), NOW()),
                                                                                                                                              (8, 66778899, 'Carmen', 'Morales', 'Venezolana', 'carmen.morales@example.com', 'password567', '987654328', '1991-10-15', NOW(), NOW()),
                                                                                                                                              (9, 44556677, 'Luis', 'Hernández', 'Boliviano', 'luis.hernandez@example.com', 'password890', '987654329', '1987-01-05', NOW(), NOW()),
                                                                                                                                              (10, 22334455, 'Sofía', 'Rojas', 'Paraguaya', 'sofia.rojas@example.com', 'password1234', '987654330', '1993-04-18', NOW(), NOW());
ON CONFLICT DO NOTHING;
INSERT INTO habitaciones (id, numero, tipo, precio_por_noche, disponibilidad, created_at, updated_at) VALUES
                                                                                                          (1, '101', 'Simple', '50.00', true, NOW(), NOW()),
                                                                                                          (2, '102', 'Doble', '75.00', true, NOW(), NOW()),
                                                                                                          (3, '201', 'Suite', '150.00', true, NOW(), NOW()),
                                                                                                          (4, '202', 'Triple', '120.00', true, NOW(), NOW()),
                                                                                                          (5, '301', 'Suite Deluxe', '200.00', true, NOW(), NOW()),
                                                                                                          (6, '302', 'Simple', '50.00', true, NOW(), NOW()),
                                                                                                          (7, '401', 'Doble', '80.00', true, NOW(), NOW()),
                                                                                                          (8, '402', 'Triple', '130.00', true, NOW(), NOW()),
                                                                                                          (9, '501', 'Suite Premium', '250.00', true, NOW(), NOW()),
                                                                                                          (10, '502', 'Simple', '55.00', true, NOW(), NOW());
ON CONFLICT DO NOTHING;
INSERT INTO reservas (id, estado, fecha_inicio, fecha_final, created_at, update_at, cliente_id, habitacion_id) VALUES
                                                                                                                   (1, 'CONFIRMADA', '2024-10-01 14:00:00', '2024-10-05 11:00:00', NOW(), NOW(), 1, 1),
                                                                                                                   (2, 'PENDIENTE', '2024-10-10 14:00:00', '2024-10-12 11:00:00', NOW(), NOW(), 2, 2),
                                                                                                                   (3, 'CONFIRMADA', '2024-10-15 14:00:00', '2024-10-18 11:00:00', NOW(), NOW(), 3, 3),
                                                                                                                   (4, 'CANCELADA', '2024-10-20 14:00:00', '2024-10-22 11:00:00', NOW(), NOW(), 4, 4),
                                                                                                                   (5, 'CONFIRMADA', '2024-11-01 14:00:00', '2024-11-05 11:00:00', NOW(), NOW(), 5, 5),
                                                                                                                   (6, 'PENDIENTE', '2024-11-10 14:00:00', '2024-11-12 11:00:00', NOW(), NOW(), 6, 6),
                                                                                                                   (7, 'CONFIRMADA', '2024-11-15 14:00:00', '2024-11-18 11:00:00', NOW(), NOW(), 7, 7),
                                                                                                                   (8, 'CONFIRMADA', '2024-11-20 14:00:00', '2024-11-22 11:00:00', NOW(), NOW(), 8, 8),
                                                                                                                   (9, 'PENDIENTE', '2024-12-01 14:00:00', '2024-12-05 11:00:00', NOW(), NOW(), 9, 9),
                                                                                                                   (10, 'CONFIRMADA', '2024-12-10 14:00:00', '2024-12-15 11:00:00', NOW(), NOW(), 10, 10);
ON CONFLICT DO NOTHING;
INSERT INTO servicios (id, nombre, descripcion, precio, created_at, updated_at) VALUES
                                                                                    (1, 'WiFi', 'Internet inalámbrico de alta velocidad', '5.00', NOW(), NOW()),
                                                                                    (2, 'Desayuno', 'Desayuno buffet incluido', '10.00', NOW(), NOW()),
                                                                                    (3, 'Spa', 'Acceso al spa y piscina', '20.00', NOW(), NOW()),
                                                                                    (4, 'Gimnasio', 'Acceso al gimnasio las 24 horas', '15.00', NOW(), NOW()),
                                                                                    (5, 'Parking', 'Estacionamiento privado', '8.00', NOW(), NOW()),
                                                                                    (6, 'Lavandería', 'Servicio de lavandería', '12.00', NOW(), NOW()),
                                                                                    (7, 'Bar', 'Acceso al bar y bebidas incluidas', '25.00', NOW(), NOW()),
                                                                                    (8, 'Restaurante', 'Cena gourmet en el restaurante del hotel', '50.00', NOW(), NOW()),
                                                                                    (9, 'Transfer', 'Traslado al aeropuerto', '30.00', NOW(), NOW()),
                                                                                    (10, 'Room Service', 'Servicio a la habitación 24 horas', '18.00', NOW(), NOW());
ON CONFLICT DO NOTHING;

INSERT INTO reserva_servicios (reserva_id, servicio_id, fecha_rservicio) VALUES
                                                                             (1, 1, NOW()),
                                                                             (1, 2, NOW()),
                                                                             (2, 3, NOW()),
                                                                             (2, 4, NOW()),
                                                                             (3, 5, NOW()),
                                                                             (3, 6, NOW()),
                                                                             (4, 7, NOW()),
                                                                             (4, 8, NOW()),
                                                                             (5, 9, NOW()),
                                                                             (5, 10, NOW());
ON CONFLICT DO NOTHING;
INSERT INTO pagos (id, fecha_pago, monto, metodo_pago, created_at, updated_at, reserva_id) VALUES
                                                                                               (1, '2024-10-05 12:00:00', '100.00', 'Tarjeta de crédito', NOW(), NOW(), 1),
                                                                                               (2, '2024-10-12 12:00:00', '150.00', 'Efectivo', NOW(), NOW(), 2),
                                                                                               (3, '2024-10-18 12:00:00', '250.00', 'Tarjeta de crédito', NOW(), NOW(), 3),
                                                                                               (4, '2024-10-22 12:00:00', '300.00', 'Transferencia bancaria', NOW(), NOW(), 4),
                                                                                               (5, '2024-11-05 12:00:00', '400.00', 'Tarjeta de débito', NOW(), NOW(), 5),
                                                                                               (6, '2024-11-12 12:00:00', '350.00', 'Efectivo', NOW(), NOW(), 6),
                                                                                               (7, '2024-11-18 12:00:00', '450.00', 'Tarjeta de crédito', NOW(), NOW(), 7),
                                                                                               (8, '2024-11-22 12:00:00', '500.00', 'Transferencia bancaria', NOW(), NOW(), 8),
                                                                                               (9, '2024-12-05 12:00:00', '600.00', 'Tarjeta de débito', NOW(), NOW(), 9),
                                                                                               (10, '2024-12-15 12:00:00', '700.00', 'Efectivo', NOW(), NOW(), 10);
ON CONFLICT DO NOTHING;