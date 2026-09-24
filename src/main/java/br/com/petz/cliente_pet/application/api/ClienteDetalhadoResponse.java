package br.com.petz.cliente_pet.application.api;

import br.com.petz.cliente_pet.application.domain.Sexo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@JsonPropertyOrder({"idCliente","nomeCompleto","cpf","email","dataNascimento","sexo"})
@Value
public class ClienteDetalhadoResponse {

    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private String celular;
    private String cpf;
    private LocalDate dataNascimento;
    private Sexo sexo;
    private String telefone;
    private Boolean aceitaTermos;
    private LocalDateTime dataHoraCadastro;
}
