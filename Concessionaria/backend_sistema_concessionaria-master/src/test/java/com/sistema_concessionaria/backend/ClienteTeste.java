package com.sistema_concessionaria.backend;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sistema_concessionaria.backend.clientes.ClienteModel;

public class ClienteTeste {
    
    @Test
    void testeCliente() {
        // Teste
        ClienteModel cliente = new ClienteModel();
        cliente.setNome("Rodrigo");
        cliente.setEndereco("rua 1");
        cliente.setTelefone("12345678910");

        assertAll("Cliente properties should not be null",
            () -> assertNotNull(cliente.getNome(), "Nome não pode ser nulo."),
            () -> assertNotNull(cliente.getEndereco(), "Endereço não pode ser nulo."),
            () -> assertNotNull(cliente.getTelefone(), "Telefone não pode ser nulo.")
        );
    }
}
