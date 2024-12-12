package com.test.sinergia.controllers;

import com.test.sinergia.application.service.ClienteService;
import com.test.sinergia.domain.entity.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente registrarCliente(@RequestBody Cliente cliente) {
        return clienteService.registrarCliente(cliente.getNombre(), cliente.getEmail());
    }
}
