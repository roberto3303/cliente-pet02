package br.com.petz.cliente_pet.application.service;

import br.com.petz.cliente_pet.application.api.ClienteRequest;
import br.com.petz.cliente_pet.application.api.ClienteResponse;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
