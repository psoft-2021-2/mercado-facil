package com.ufcg.psoft.mercadofacil;

import com.ufcg.psoft.mercadofacil.controller.SystemController;
import com.ufcg.psoft.mercadofacil.exceptions.ProductNotFoundException;
import com.ufcg.psoft.mercadofacil.model.Lote;
import com.ufcg.psoft.mercadofacil.model.Produto;

public class MercadoFacilApplication {

	public static void main(String[] args) {
		
		System.out.println("Mercado Fácil");
		
		SystemController controller = new SystemController();
		
		String idProduto = controller.criaProduto("Leite", "X102", "Italac", 10.5, "Outro"); 
		String idLote = null;
		
		try {
			idLote = controller.criaLote(idProduto, 10);
			idLote = controller.criaLote("xpto", 10);
		} catch (ProductNotFoundException e) {
			System.err.println("Produto não encontrado para adicionar ao lote");
		}
		
		Produto p1;
		try {
			p1 = controller.recuperaProduto(idProduto);
			System.out.println(p1);
		} catch (ProductNotFoundException e) {
			System.err.println("Produto não encontrado no catálogo");
		}

		Lote l1 = controller.recuperaLote(idLote);
					
		System.out.println(l1);
		System.out.println(l1.getProduto());
		
	}

}
