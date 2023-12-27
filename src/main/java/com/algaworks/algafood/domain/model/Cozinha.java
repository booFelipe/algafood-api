package com.algaworks.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

//@Getter
//@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // criar o equals and hashcode apenas no id
@Data // engloba getter setter equals and hashcode e muito mais
@Entity
//@Table(name = "tab_cozinha")  ** se eu quiser da um nome pra tabela diferente do nome da classe **
public class Cozinha {

    @EqualsAndHashCode.Include // criar o equals and hashcode apenas no id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //passando a responsa pro BD gerar a chave autoincrement com GenerationType.IDENTITY
    private Long id;

    //@Column(name = "nom_cozinha")
    private String nome;


}
