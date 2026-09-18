package br.com.petz.cliente_pet.application.api;

import br.com.petz.cliente_pet.application.domain.Cliente;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@JsonPropertyOrder({"idCliente","nomeCompleto","cpf","email"})
@Value
public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private String celular;
    private String cpf;

    public ClienteListResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
        this.cpf = cliente.getCpf();
    }

    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return clientes.stream()
                .map(ClienteListResponse::new)
                .collect(Collectors.toList());
    }
}
