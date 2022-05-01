package br.com.estoqueartesanart.mvc.estoqueartesanart.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class EstoquePedidosCompasController {
	
	
	
	@GetMapping("estoque/PedidosCompras")
	public String Compras(){
		
		
		return("htmlEstoque/pedidosCompras");
		
		
	}
	

}
