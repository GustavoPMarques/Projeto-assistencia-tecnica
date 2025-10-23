package br.fiap.assistencia.tecnica.domain;


import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;

import java.time.LocalDate;

@Entity
@Table(name = "java_equipamento")

public class Equipamento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equip")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Cliente cliente;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @Column(name = "marca", length = 50)
    private String marca;

    @Column(name = "modelo", length = 80)
    private String modelo;

    @Column(name = "numero_serie", nullable = false, length = 80)
    private String numeroSserie;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDate dataCadastro;




}
