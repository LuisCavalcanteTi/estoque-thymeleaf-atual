package br.com.estoqueartesanart.mvc.estoqueartesanart.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estoqueartesanart.mvc.estoqueartesanart.model.Compras;
import br.com.estoqueartesanart.mvc.estoqueartesanart.repository.ComprasRepository;


@RestController
@RequestMapping("/estoque")
public class ComprasApi {

	
	
	@Autowired
	private ComprasRepository comprasRepository;
	
	@GetMapping("/listarPedidosCompras")
	public List<Compras> getCompras(){
		
		return comprasRepository.findAll();
	}
	
}
