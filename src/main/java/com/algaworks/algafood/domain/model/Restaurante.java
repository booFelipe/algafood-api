package com.algaworks.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

//@Getter
//@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // criar o equals and hashcode apenas no id
@Data // engloba getter setter equals and hashcode e muito mais
@Entity
public class Restaurante {

    @EqualsAndHashCode.Include // criar o equals and hashcode apenas no id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(nullable = false) //não aceitando nulo
    private String nome;

    @Column(name = "taxa_frete", nullable = false)
    private BigDecimal taxaFrete;

    @ManyToOne
    @JoinColumn(name = "cozinha_id", nullable = false) //dando um nome para a FK gerada pelo BD
    private Cozinha cozinha;


}
