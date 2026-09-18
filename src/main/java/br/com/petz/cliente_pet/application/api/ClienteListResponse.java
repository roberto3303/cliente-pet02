package br.com.petz.cliente_pet.application.api;

import br.com.petz.cliente_pet.application.domain.Cliente;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.UUID;

@JsonPropertyOrder({"idCliente","nomeCompleto","cpf","email"})
public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private String celular;
    private String cpf;


    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return null;
    }
}
