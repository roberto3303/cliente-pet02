package br.com.petz.cliente_pet.application.repository;

import br.com.petz.cliente_pet.application.domain.Cliente;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
}
