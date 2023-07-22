package com.sistema_concessionaria.backend.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/cliente")

public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/listar")
    public List<ClienteModel> listarClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public ClienteModel buscarCliente(@PathVariable(value = "id") Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @PostMapping("/cadastrar")
    public ClienteModel cadastrarCliente(@RequestBody ClienteModel cliente) {
        cliente.setAgendamento(LocalDateTime.now());
        cliente.setStatusVenda("Pendente");
        cliente.setQuantidadePedidos(0);
    
        if (cliente.getId() == null) {
            cliente.setId(0L); // ou defina um valor inicial adequado para o ID
        }
    
        return clienteRepository.save(cliente);
    }

    @PutMapping("/atualizar/{id}/status")
    public ClienteModel atualizarStatusVenda(@PathVariable(value = "id") Long id, @RequestBody String novoStatus) {
        ClienteModel cliente = clienteRepository.findById(id).orElse(null);
        if (cliente != null) {
            cliente.setStatusVenda(novoStatus);
            return clienteRepository.save(cliente);
        }
        return null;
    }

    @PutMapping("/atualizar/{id}/quantidade-pedidos")
    public ClienteModel atualizarQuantidadePedidos(@PathVariable(value = "id") Long id, @RequestBody int novaQuantidade) {
        ClienteModel cliente = clienteRepository.findById(id).orElse(null);
        if (cliente != null) {
            cliente.setQuantidadePedidos(novaQuantidade);
            return clienteRepository.save(cliente);
        }
        return null;
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarCliente(@PathVariable(value = "id") Long id) {
        ClienteModel cliente = clienteRepository.findById(id).orElse(null);
        if (cliente != null) {
            clienteRepository.delete(cliente);
        }
    }

}
