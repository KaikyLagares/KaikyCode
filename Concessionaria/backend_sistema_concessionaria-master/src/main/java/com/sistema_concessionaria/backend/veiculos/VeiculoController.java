package com.sistema_concessionaria.backend.veiculos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
    
    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping("/listar")
    public List<VeiculoModel> listarVeiculos() {
        return veiculoRepository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public VeiculoModel buscarVeiculo(@PathVariable(value = "id") long id) {
        return veiculoRepository.findById(id);
    }

    @PostMapping("/cadastrar")
    public VeiculoModel cadastrarVeiculo(@RequestBody VeiculoModel veiculo) {
        return veiculoRepository.save(veiculo);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarVeiculo(@PathVariable(value = "id") long id) {
        VeiculoModel veiculo = veiculoRepository.findById(id);
        veiculoRepository.delete(veiculo);
    }
}
