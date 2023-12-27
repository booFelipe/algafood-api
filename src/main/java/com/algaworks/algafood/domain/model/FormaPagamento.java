package com.algaworks.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true) // criar o equals and hashcode apenas no id
@Data // engloba getter setter equals and hashcode e muito mais
@Entity
public class FormaPagamento {

    @EqualsAndHashCode.Include // criar o equals and hashcode apenas no id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //passando a responsa pro BD gerar a chave autoincrement com GenerationType.IDENTITY
    private Long id;

    @Column(nullable = false)
    private String descricao;

}
