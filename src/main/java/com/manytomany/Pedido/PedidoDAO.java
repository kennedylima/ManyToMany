package com.manytomany.Pedido;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class PedidoDAO implements PedidoRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void salvar(Pedido pedido) {
            entityManager.persist(pedido);

    }
}
