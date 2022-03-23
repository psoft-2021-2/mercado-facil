package com.ufcg.psoft.mercadofacil.services;

import java.util.HashMap;
import java.util.Map;

import com.ufcg.psoft.mercadofacil.dto.ProdutoDTO;
import com.ufcg.psoft.mercadofacil.exceptions.ProductNotFoundException;
import com.ufcg.psoft.mercadofacil.model.Produto;

public class ProdutoService {
	
	private Map<String, Produto> catalogProduto = new HashMap<String, Produto>();

	public Produto getProdutoById(String idProduto) throws ProductNotFoundException {
		Produto produto = this.catalogProduto.get(idProduto);
		
		checkProductNull(produto);
		return produto;
	}

	public Produto getProdutoByName(String nome) throws ProductNotFoundException {
		
		Produto produto = catalogProduto.values().stream()
			.filter(prod-> nome.equals(prod.getNome()))
			.findAny()
			.orElse(null);

		checkProductNull(produto);
		return produto;
	}
	
	private void checkProductNull(Produto produto) throws ProductNotFoundException { 
		if (produto == null) {
			throw new ProductNotFoundException(); 
		}
	}

	public Produto createProduto(ProdutoDTO produtoDTO) {
		Produto produto = new Produto(produtoDTO.getNome(), produtoDTO.getCodigoBarra(), produtoDTO.getFabricante(), produtoDTO.getPreco(), produtoDTO.getCategoria());
		this.catalogProduto.put(produto.getId(), produto);
		return produto;
	}

}
