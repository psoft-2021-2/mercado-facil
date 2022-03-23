package com.ufcg.psoft.mercadofacil.services;

import java.util.HashMap;
import java.util.Map;

import com.ufcg.psoft.mercadofacil.model.Lote;
import com.ufcg.psoft.mercadofacil.model.Produto;

public class LoteService {

	private Map<String, Lote> catalogLote = new HashMap<String, Lote>();
	private ProdutoService produtoService; 
	
	public LoteService(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}
	
	public Lote createLote(String idProduto, int quantidade) {
		Produto produto = this.produtoService.getProdutoById(idProduto);
		Lote lote = new Lote(produto, quantidade);
		this.catalogLote.put(lote.getId(), lote);
		return lote;
	}

}
