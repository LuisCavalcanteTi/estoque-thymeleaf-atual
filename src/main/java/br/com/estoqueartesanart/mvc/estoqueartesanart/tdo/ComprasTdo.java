package br.com.estoqueartesanart.mvc.estoqueartesanart.tdo;

import br.com.estoqueartesanart.mvc.estoqueartesanart.model.Compras;

public class ComprasTdo {

	private String codigoProduto;
	private String descricao;
	private String quantidadeSolicitada;
	
	
	
	
	
	public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getQuantidadeSolicitada() {
		return quantidadeSolicitada;
	}
	public void setQuantidadeSolicitada(String quantidadeSolicitada) {
		this.quantidadeSolicitada = quantidadeSolicitada;
	}
	
	
	
	public Compras formCompras() {
	
		Compras compras =  new Compras();
		
		compras.setCodigoProduto(codigoProduto);
		compras.setDescricao(descricao);
		compras.setQuantidadeSolicitada(quantidadeSolicitada);
		
		
		return compras;

	}
	
	
	
}
