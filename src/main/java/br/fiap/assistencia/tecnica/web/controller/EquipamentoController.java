package br.fiap.assistencia.tecnica.web.controller;


import br.fiap.assistencia.tecnica.domain.Cliente;
import br.fiap.assistencia.tecnica.domain.Equipamento;
import br.fiap.assistencia.tecnica.service.EquipamentoService;
import br.fiap.assistencia.tecnica.web.dto.EquipamentoDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {
    private final EquipamentoService service;

    public EquipamentoController(EquipamentoService service) {
        this.service = service;
    }

    @PostMapping
    public Equipamento cadastrar(@RequestBody EquipamentoDTO equipamentoDTO) {
        return service.cadastrarEquip(equipamentoDTO);
    }
//    @GetMapping
//    public List<Equipamento> listar() {
//        return service.listar();
//    }
//
//    @GetMapping("/{id}")
//    public Equipamento buscarPorId(@PathVariable Long id) {
//        return service.buscarPorId(id);
//    }
}
