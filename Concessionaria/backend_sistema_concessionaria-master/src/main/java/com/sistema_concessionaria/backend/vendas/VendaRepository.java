package com.sistema_concessionaria.backend.vendas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<VendaModel, Long> {
    VendaModel findById(long id);
    List<VendaModel> findByClienteId (long id);
}
