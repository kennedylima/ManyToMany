package com.manytomany.Pedido;

import com.manytomany.EntidadeBase;
import com.manytomany.ItensPedido.ItensPedido;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido extends EntidadeBase implements Serializable {

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItensPedido> itens = new ArrayList<>();

    public Pedido() {
    }

    public void adicionar(ItensPedido item) {
        itens.add(item);
    }

    public List<ItensPedido> getItens() {
        return itens;
    }
}
