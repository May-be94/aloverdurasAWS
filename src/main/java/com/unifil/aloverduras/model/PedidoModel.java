package com.unifil.aloverduras.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PedidoModel {

    @Id
    private String codigoPedido;

    @OneToMany
    private List<ProdutoModel> listaProdutos;

    private Double valorFinalPedido;
}
