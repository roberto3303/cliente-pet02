package br.com.petz.cliente_pet.application.api;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.UUID;

@JsonPropertyOrder({"idCliente","nomeCompleto","cpf","email"})
public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private String celular;
    private String cpf;
}
