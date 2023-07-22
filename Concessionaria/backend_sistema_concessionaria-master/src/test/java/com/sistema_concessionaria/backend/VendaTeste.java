package com.sistema_concessionaria.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sistema_concessionaria.backend.vendas.VendaModel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class VendaTeste {

    @Test
    void testeVenda() {
        // Teste
        VendaModel venda = new VendaModel();
        venda.setClienteId(3L); // Use Long value here
        venda.setVeiculoId(3L);

        // Convert the date string to LocalDateTime
        String dateString = "2020-01-01T00:00:00";
        LocalDateTime dateTime = LocalDateTime.parse(dateString, DateTimeFormatter.ISO_DATE_TIME);
        venda.setData(dateTime);

        // Assertions
        assertNotNull(venda, "Venda não pode ser nula.");
        assertEquals(3L, venda.getClienteId(), "Cliente deve ser 3.");
        assertEquals(3L, venda.getVeiculoId(), "Veículo deve ser '3'.");
        assertEquals(dateTime, venda.getData(), "Data deve ser '2020-01-01T00:00:00'.");
    }
}
