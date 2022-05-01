package br.com.estoqueartesanart.mvc.estoqueartesanart.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.estoqueartesanart.mvc.estoqueartesanart.model.Pedido;
import br.com.estoqueartesanart.mvc.estoqueartesanart.model.StatusPedido;
import br.com.estoqueartesanart.mvc.estoqueartesanart.repository.PedidoRepository;
import br.com.estoqueartesanart.mvc.estoqueartesanart.tdo.RequisicaoNovoPedido;

@Controller
@RequestMapping("estoque")
public class EstoquePedidosPendentesController {

	@Autowired
	private PedidoRepository pedidoRepository;

	@GetMapping("pedidosEstoque/Pendentes")
	public String pedidosPendentesEstoque(Model model) {
		
		
		List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.PENDENTE);
		model.addAttribute("pedidos", pedidos);
	
		return ("htmlEstoque/pedidosPendentesEstoque");

	}
	
	

	
	
	@PostMapping("alterar")
	public String Imprimir( RequisicaoNovoPedido requisicao ) {
		DateTimeFormatter pegarData = DateTimeFormatter.ofPattern("HH:mm  (dd/MM/yyyy) ");
        String data = pegarData.format(LocalDateTime.now());
		
			
		List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.PENDENTE);
					 		 
		while(pedidos.size() != 0 ) {
			
		
			for(Pedido pedido : pedidos) {
				
				if(pedido.getCodigoProduto() != null) {
				
				pedido.setStatus(StatusPedido.IMPRESSO);
				System.out.println(pedido.getStatus());
				
				pedido.setHoraImpresso(data);
				}else {
					
				}
				
			}
				
			 Pedido pedido = requisicao.update();
	         pedidoRepository.save(pedido);
	         return ("redirect:pedidosEstoque/Pendentes"); 
		}
		
		 return ("redirect:pedidosEstoque/Pendentes"); 
		 	
			

	}
	
	

}
