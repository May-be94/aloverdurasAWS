package com.unifil.aloverduras.controller;


import com.unifil.aloverduras.model.PedidoModel;
import com.unifil.aloverduras.model.ProdutoModel;
import com.unifil.aloverduras.service.AloverdurasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AloVerdurasController {

    @Autowired
    AloverdurasService service;

    @GetMapping("/pedido/{codigoPedido}")
    public ResponseEntity<Object> getPedidos(@PathVariable("codigoPedido") String codigoPedido){

        var response = service.buscarPedido(codigoPedido);

        if (response.isPresent())
            return new ResponseEntity<>(response,HttpStatus.OK);
        else
            return new ResponseEntity<>("pedido não encontrado",HttpStatus.BAD_REQUEST);

    }


    @PostMapping("/pedido")
    public ResponseEntity<Object> postPedidos(@RequestBody PedidoModel pedido){

        var response = service.criarpedido(pedido);

        return new ResponseEntity<>(response,HttpStatus.OK);

    }

    @PostMapping("/produto")
    public ResponseEntity<Object> postProduto(@RequestBody ProdutoModel produto){

        var response = service.criarproduto(produto);

        return new ResponseEntity<>(response,HttpStatus.OK);

    }

}
