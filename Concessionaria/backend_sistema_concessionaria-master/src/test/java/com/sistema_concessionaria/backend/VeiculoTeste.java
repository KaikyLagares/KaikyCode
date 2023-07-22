package com.sistema_concessionaria.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.sistema_concessionaria.backend.veiculos.VeiculoModel;
import com.sistema_concessionaria.backend.veiculos.VeiculoRepository;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class VeiculoTeste {
    @Test
    void testeVeiculo(){

       
        //teste 
        VeiculoModel veiculo = new VeiculoModel();
        veiculo.setPlaca("ABC-1234");
        veiculo.setModelo("Gol");
        veiculo.setMarca("VW");
        veiculo.setCor("Preto");
        veiculo.setAno(2020);
        veiculo.setValor(1000);
        
        Assert.notNull(veiculo, "Veiculo não pode ser nulo.");
        
        



    }
}
