package com.manytomany.Produto;

import com.manytomany.EntidadeBase;
import com.manytomany.ItensPedido.ItensPedido;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Produto extends EntidadeBase implements Serializable{

    private  String descricao;
    private  int quantidade;

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ItensPedido> itens = new ArrayList<>();

    public Produto() { }

    public Produto(String descricao, int quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public List<ItensPedido> getItens() {
        return itens;
    }

}
