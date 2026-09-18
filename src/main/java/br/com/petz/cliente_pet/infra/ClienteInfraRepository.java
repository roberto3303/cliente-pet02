package br.com.petz.cliente_pet.infra;

import br.com.petz.cliente_pet.application.domain.Cliente;
import br.com.petz.cliente_pet.application.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

    private final ClienteSpringDataJpaRepository clienteSpringDataJpaRepository;



    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository - salva");
        clienteSpringDataJpaRepository.save(cliente);
        log.info("[finaliza] ClienteInfraRepository - salva");
        return cliente;
    }

    @Override
    public List<Cliente> buscaTodosClientes() {
        log.info("[inicia] ClienteInfraRepository - buscaTodosClientes");
        log.info("[finaliza] ClienteInfraRepository - buscaTodosClientes");
        return List.of();
    }
}
