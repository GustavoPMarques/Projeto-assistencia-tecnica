package br.fiap.assistencia.tecnica.web.controller;

import br.fiap.assistencia.tecnica.service.ClienteService;
import br.fiap.assistencia.tecnica.web.dto.ClienteDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public void cadastrar(@RequestBody ClienteDTO clienteDTO) {

    }
}
