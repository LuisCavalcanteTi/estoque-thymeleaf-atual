package br.com.estoqueartesanart.mvc.estoqueartesanart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estoqueartesanart.mvc.estoqueartesanart.model.Compras;

public interface ComprasRepository extends  JpaRepository <Compras, Long>  {

	
}
