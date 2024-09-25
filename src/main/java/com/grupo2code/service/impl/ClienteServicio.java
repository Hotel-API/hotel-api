package com.grupo2code.service.impl;

import com.grupo2code.model.entity.Cliente;
import com.grupo2code.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteServicio implements com.grupo2code.service.ClienteServicio {
    private final ClienteRepository clienteRepository;


    @Transactional(readOnly = true)
    @Override
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }
    @Transactional(readOnly = true)
    @Override
    public Page<Cliente> paginate(Pageable pageable) {
        return clienteRepository.findAll(pageable);
    }
    @Transactional(readOnly =true)
    @Override
    public Cliente findById(Integer id) {
        return clienteRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("No se encontro el cliente con el id: " + id));
    }
    @Transactional
    @Override
    public Cliente create(Cliente cliente) {
        cliente.setCreatedAt(LocalDateTime.now());
        return clienteRepository.save(cliente);
    }
    @Transactional
    @Override
    public Cliente update(Integer Id, Cliente updateCliente) {
        Cliente clienteFromDB =findById(id);
        clienteFromDB.setNombre(updateCliente.getNombre());
        clienteFromDB.setApellido(updateCliente.getApellido());
        clienteFromDB.setEmail(updateCliente.getEmail());
        clienteFromDB.setTelefono(updateCliente.getTelefono());
        clienteFromDB.setUpdatedAt(LocalDateTime.now());

        return clienteRepository.save(clienteFromDB);
    }
    @Transactional
    @Override
    public void delete(Integer Id) {
        Cliente cliente = findById(id);
        clienteRepository.deleteById(Id);

    }
}
