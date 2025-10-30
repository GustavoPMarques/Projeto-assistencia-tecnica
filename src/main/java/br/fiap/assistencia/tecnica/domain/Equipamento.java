package br.fiap.assistencia.tecnica.domain;


import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "java_equipamento")

public class Equipamento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equip")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", foreignKey = @ForeignKey(name = "fk_equip_cliente"))
    private Cliente cliente;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @Column(name = "marca", length = 50)
    private String marca;

    @Column(name = "modelo", length = 80)
    private String modelo;

    @Column(name = "numero_serie", length = 80,unique = true)
    private String numeroSerie;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDate dataCadastro;




}
