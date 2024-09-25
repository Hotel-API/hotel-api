package com.grupo2code.repository;
// logica para de acceso a base de datos para ejecutar las cueri

import com.grupo2code.model.entity.Cliente;
import com.grupo2code.model.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
