package com.ufcg.psoft.mercadofacil.controller;

import com.ufcg.psoft.mercadofacil.dto.ProdutoDTO;
import com.ufcg.psoft.mercadofacil.exceptions.ProductNotFoundException;
import com.ufcg.psoft.mercadofacil.model.Lote;
import com.ufcg.psoft.mercadofacil.model.Produto;
import com.ufcg.psoft.mercadofacil.services.LoteService;
import com.ufcg.psoft.mercadofacil.services.ProdutoService;

// Facade do sistema
public class SystemController {
	
	private ProdutoService prodService;
	private LoteService loteService;
	
	public SystemController() {
		
		this.prodService = new ProdutoService();
		this.loteService = new LoteService(prodService);
	}

	public String criaProduto(ProdutoDTO produtoDTO) {
		return prodService.createProduto(produtoDTO).getId();
	}
	
	public String criaLote(String idProduto, int quantidade) throws ProductNotFoundException {
		return loteService.createLote(idProduto, quantidade).getId();
	}

	public Produto recuperaProduto(String idProduto) throws ProductNotFoundException {
		return prodService.getProdutoById(idProduto);
	}

	public Lote recuperaLote(String idLote) {
		return loteService.getLoteById(idLote);
	}

}
