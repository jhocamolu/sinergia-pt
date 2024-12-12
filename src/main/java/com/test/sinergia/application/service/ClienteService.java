package com.test.sinergia.application.service;

import com.test.sinergia.domain.entity.Cliente;
import com.test.sinergia.domain.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente registrarCliente(String nombre, String correo) {
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombre(nombre);
        nuevoCliente.setEmail(correo);
        return clienteRepository.save(nuevoCliente);
    }
}
