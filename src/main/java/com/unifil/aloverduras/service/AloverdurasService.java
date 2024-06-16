package com.unifil.aloverduras.service;

import com.unifil.aloverduras.model.PedidoModel;
import com.unifil.aloverduras.model.ProdutoModel;
import com.unifil.aloverduras.repository.PedidoRepository;
import com.unifil.aloverduras.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AloverdurasService {


    @Autowired
    PedidoRepository pedidoRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    public Optional<PedidoModel> buscarPedido(String codigoPedido){

        var pedido = pedidoRepository.findById(codigoPedido);

        return pedido;
    }

    public PedidoModel criarpedido(PedidoModel pedido){

        pedido = pedidoRepository.save(pedido);
        return pedido;
    }
    public ProdutoModel criarproduto(ProdutoModel produto){

        produto = produtoRepository.save(produto);
        return produto;
    }

}
