package com.sistema_concessionaria.backend.veiculos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<VeiculoModel, Long> {
    VeiculoModel findById(long id);
}
