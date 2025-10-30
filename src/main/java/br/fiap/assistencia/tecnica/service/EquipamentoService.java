package br.fiap.assistencia.tecnica.service;

import br.fiap.assistencia.tecnica.domain.Cliente;
import br.fiap.assistencia.tecnica.domain.Equipamento;
import br.fiap.assistencia.tecnica.repository.ClienteRepository;
import br.fiap.assistencia.tecnica.repository.EquipamentoRepository;
import br.fiap.assistencia.tecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipamentoService {

    private final ClienteRepository clienteRepository;
    private final EquipamentoRepository equipamentoRepository;

    public EquipamentoService(ClienteRepository clienteRepository, EquipamentoRepository repository) {
        this.clienteRepository = clienteRepository;
        this.equipamentoRepository = repository;
    }

    public Equipamento cadastrarEquip (EquipamentoDTO equipamentoDTO) {
        Equipamento equipamento = new Equipamento();
        equipamento.setId(equipamentoDTO.getId());
        equipamento.setTipo(equipamentoDTO.getTipo());
        equipamento.setMarca(equipamentoDTO.getMarca());
        equipamento.setModelo(equipamentoDTO.getModelo());
        equipamento.setNumeroSerie(equipamento.getNumeroSerie());
        equipamento.setDataCadastro(equipamentoDTO.getDataCadastro());

        return equipamentoRepository.save(equipamento);

    }

//    public List<Equipamento> listar() {
//        return equipamentoRepository.findAll();
//    }
//
//    public Equipamento buscarPorId(Long id) {
//        return equipamentoRepository.findById(id).orElse(null);
//    }
}
