package com.unifil.aloverduras.repository;

import com.unifil.aloverduras.model.ProdutoModel;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<ProdutoModel,String> {
}
