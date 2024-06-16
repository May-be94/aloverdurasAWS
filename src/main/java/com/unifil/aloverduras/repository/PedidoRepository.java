package com.unifil.aloverduras.repository;

import com.unifil.aloverduras.model.PedidoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<PedidoModel, String> {

}
