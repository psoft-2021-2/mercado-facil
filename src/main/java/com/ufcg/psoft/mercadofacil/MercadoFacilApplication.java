package com.ufcg.psoft.mercadofacil;

import com.ufcg.psoft.mercadofacil.model.Lote;
import com.ufcg.psoft.mercadofacil.model.Produto;
import com.ufcg.psoft.mercadofacil.services.LoteService;
import com.ufcg.psoft.mercadofacil.services.ProdutoService;

public class MercadoFacilApplication {

	public static void main(String[] args) {
		
		System.out.println("Mercado Fácil");
		
		ProdutoService prodService = new ProdutoService();
		LoteService loteService = new LoteService(prodService);
		
		Produto p1 = prodService.createProduto("Leite", "X102", "Italac", 10.5, "Outro");
		Lote l1 = loteService.createLote(p1.getId(), 10);
	
			
		System.out.println(l1);
		System.out.println(l1.getProduto());
		
		Produto p2 = prodService.createProduto("Pão", "X100", "Padaria", 5.0, "Outro");
		Lote l2 = loteService.createLote(p2.getId(), 10);
	
		System.out.println(l2);
		System.out.println(l2.getProduto());
		
		Produto p3 = prodService.getProdutoByName("Leite");
		Produto p4 = prodService.getProdutoById(p3.getId());
		Produto p5 = prodService.getProdutoById("xpto");
		
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
	}

}
