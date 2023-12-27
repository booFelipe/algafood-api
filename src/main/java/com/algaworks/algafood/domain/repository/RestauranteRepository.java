package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.model.Restaurante;

import java.util.List;

public interface RestauranteRepository {

    List<Restaurante> listar();
    Cozinha buscar(Long id);
    Cozinha salvar(Restaurante cozinha);
    void remover(Restaurante cozinha);


}
