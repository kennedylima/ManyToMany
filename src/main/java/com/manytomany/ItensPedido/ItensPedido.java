package com.manytomany.ItensPedido;

import com.manytomany.Pedido.Pedido;
import com.manytomany.Produto.Produto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ItensPedido implements Serializable{

    @Id
    @ManyToOne
    private Pedido pedido;

    @Id
    @ManyToOne
    private Produto produto;

    private int quantidade;

    public ItensPedido(Produto produto, int quantidade, Pedido pedido) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.pedido = pedido;
    }

    public ItensPedido() {
    }

}
