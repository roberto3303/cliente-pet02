package br.com.petz.cliente_pet.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<ClienteListResponse> getTodosClientes();

    @GetMapping("/{idCliente}")
    @ResponseStatus(HttpStatus.OK)
    ClienteDetalhadoResponse getClienteAtravesId(@PathVariable UUID idCliente);

}
