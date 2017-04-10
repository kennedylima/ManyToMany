package com.manytomany.Produto;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ProdutoDAO implements ProdutoRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void salvar(Produto produto) {
        entityManager.persist(produto);
    }
}
