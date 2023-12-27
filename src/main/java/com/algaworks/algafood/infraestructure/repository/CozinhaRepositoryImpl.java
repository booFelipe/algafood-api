package com.algaworks.algafood.infraestructure.repository;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository {

    @PersistenceContext //é como se fosse um @inject aqui eu injeto o manager que faz a relação com o BD
    private EntityManager manager;

    @Override
    public List<Cozinha> listar(){
        TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class);

        return query.getResultList();
    }

    @Override
    public Cozinha buscar(Long id){
        return manager.find(Cozinha.class, id);
    }

    @Override
    @Transactional //anotado como transactional para ser executado dentro de uma transação
    public Cozinha salvar(Cozinha cozinha){
        return manager.merge((cozinha));
    }

    @Override
    @Transactional //anotado como transactional para ser executado dentro de uma transação
    public void remover(Cozinha cozinha){
        cozinha = buscar(cozinha.getId());
        manager.remove(cozinha);
    }
}
