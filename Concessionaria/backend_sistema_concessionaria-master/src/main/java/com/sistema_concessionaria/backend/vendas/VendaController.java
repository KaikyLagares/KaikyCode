package com.sistema_concessionaria.backend.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaRepository vendaRepository;


    @GetMapping("/listar")
    public List<VendaModel> listarVendas() {
        return vendaRepository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public VendaModel buscarVenda(@PathVariable(value = "id") long id) {
        return vendaRepository.findById(id);
    }

    @PostMapping("/cadastrar")
    public VendaModel cadastrarVenda(@RequestBody VendaModel venda) {
        LocalDateTime dataAtual = LocalDateTime.now();
        venda.setData(dataAtual);

        return vendaRepository.save(venda);
    }

    @GetMapping("/buscarVendasClienteID/{idCliente}")
    public List<VendaModel> buscarVendarClienteId (@PathVariable(value = "idCliente") Long idCliente) {
        return vendaRepository.findByClienteId(idCliente);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarVenda(@PathVariable(value = "id") long id) {
        VendaModel venda = vendaRepository.findById(id);
        vendaRepository.delete(venda);
    }
}
