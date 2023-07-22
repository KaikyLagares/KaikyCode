package com.sistema_concessionaria.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sistema_concessionaria.backend.vendedor.VendedorModel;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class VendedorTeste {

    @Test
    void testeVendedor() {
        // Teste
        VendedorModel vendedor = new VendedorModel();
        vendedor.setNome("Rodrigo");
      vendedor.setTelefone(1234567891);

        assertNotNull(vendedor, "Vendedor não pode ser nulo.");
    }
}

