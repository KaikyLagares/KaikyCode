package com.sistema_concessionaria.backend.vendedor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {

    @Autowired
    private VendedorRepository vendedorRepository;

    @GetMapping("/listar")
    public List<VendedorModel> listarVendedores() {
        return vendedorRepository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public VendedorModel buscarVendedor(@PathVariable(value = "id") long id) {
        return vendedorRepository.findById(id);
    }
    
    @PostMapping("/cadastrar")
    public VendedorModel cadastrarVendedor(@RequestBody VendedorModel vendedor) {
        return vendedorRepository.save(vendedor);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarVendedor(@PathVariable(value = "id") long id) {
        VendedorModel vendedor = vendedorRepository.findById(id);
        vendedorRepository.delete(vendedor);
    }
}
