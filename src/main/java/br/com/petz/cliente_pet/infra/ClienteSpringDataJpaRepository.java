package br.com.petz.cliente_pet.infra;

import br.com.petz.cliente_pet.application.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJpaRepository extends JpaRepository<Cliente, UUID> {
}
