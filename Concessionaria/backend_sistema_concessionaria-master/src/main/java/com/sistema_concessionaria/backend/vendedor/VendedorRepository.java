package com.sistema_concessionaria.backend.vendedor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<VendedorModel, Long> {
    VendedorModel findById(long id);
}
