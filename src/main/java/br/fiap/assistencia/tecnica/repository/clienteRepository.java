package br.fiap.assistencia.tecnica.repository;

import br.fiap.assistencia.tecnica.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clienteRepository extends JpaRepository<Cliente, Long> {
}
