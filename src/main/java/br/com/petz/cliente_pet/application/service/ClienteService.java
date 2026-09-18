package br.com.petz.cliente_pet.application.service;

import br.com.petz.cliente_pet.application.api.ClienteListResponse;
import br.com.petz.cliente_pet.application.api.ClienteRequest;
import br.com.petz.cliente_pet.application.api.ClienteResponse;

import java.util.List;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);

    List<ClienteListResponse> buscaTodosClientes();
}
