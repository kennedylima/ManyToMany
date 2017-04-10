package com.manytomany.Pedido;

import com.manytomany.ItensPedido.ItensPedido;
import com.manytomany.Produto.Produto;
import com.manytomany.Produto.ProdutoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PedidoTeste {

    @Autowired
    ProdutoRepository produtoRepository;


    @Autowired
    PedidoRepository pedidoRepository;

    @Test
    public void deve_salvar_um_pedido(){
        int quantidade = 10;
        Pedido pedido = new Pedido();

        Produto produto = new Produto("Zenfone 3 Zoom", 1);
        produtoRepository.salvar(produto);

        ItensPedido item = new ItensPedido(produto,quantidade,pedido);
        pedido.adicionar(item);

        pedidoRepository.salvar(pedido);
    }
}
