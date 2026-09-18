package br.com.petz.cliente_pet.application.repository;

import br.com.petz.cliente_pet.application.domain.Cliente;

import java.util.List;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);

    List<Cliente> buscaTodosClientes();
}
