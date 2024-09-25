package com.grupo2code.service.impl;
import org.springframework.transaction.annotation.Transactional;
import com.grupo2code.model.entity.Cliente;
import com.grupo2code.repository.ClienteRepository;
import com.grupo2code.service.ClienteServicio;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteServicioImpl implements ClienteServicio {
    private final ClienteRepository clienteRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Cliente> paginate(Pageable pageable) {
        return clienteRepository.findAll(pageable);
    }
    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Integer id) {
        return clienteRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("No se encontro el cliente con el id: " + id));
    }

    @Override
    @Transactional
    public Cliente create(Cliente cliente) {
        cliente.setCreatedAt(LocalDateTime.now());
        return clienteRepository.save(cliente);
    }

    @Override
    @Transactional
    public Cliente update(Integer id, Cliente updateCliente) {
        Cliente clienteFromDB =findById(id); // Utiliza el método findById para obtener el autor existente
        clienteFromDB.setNombre(updateCliente.getNombre());
        clienteFromDB.setApellido(updateCliente.getApellido());
        clienteFromDB.setEmail(updateCliente.getEmail());
        clienteFromDB.setTelefono(updateCliente.getTelefono());
        clienteFromDB.setUpdatedAt(LocalDateTime.now());

        return clienteRepository.save(clienteFromDB);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Cliente cliente = findById(id);
        clienteRepository.delete(cliente);

    }
}
