package com.grupo2code.service;

import com.grupo2code.model.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClienteServicio {
    //Metodos
    List<Cliente> getAll();//todo el listado de clientes
    Page<Cliente> paginate (Pageable pageable);
    Cliente findById(Integer id); //buscar
    Cliente create(Cliente cliente);
    Cliente update(Integer Id, Cliente updateCliente);
    void delete(Integer Id); // Eliminar al cliente por su número de ID

}
