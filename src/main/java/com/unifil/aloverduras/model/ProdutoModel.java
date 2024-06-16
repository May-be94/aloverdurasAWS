package com.unifil.aloverduras.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ProdutoModel {

    @Id
    private String codigoProduto;

    private String nome;
    private String descricao;
    private Double preco;
}
