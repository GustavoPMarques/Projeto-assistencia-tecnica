package br.fiap.assistencia.tecnica.web.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class EquipamentoDTO {
    private Long id;
    private String tipo;
    private String marca;
    private String modelo;
    private String numeroSerie;
    private LocalDate dataCadastro;
}
