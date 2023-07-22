package com.sistema_concessionaria.backend.clientes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
    ClienteModel findById(long id);
}
