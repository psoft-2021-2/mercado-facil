package com.ufcg.psoft.mercadofacil;

import com.ufcg.psoft.mercadofacil.model.Lote;
import com.ufcg.psoft.mercadofacil.model.Produto;

public class MercadoFacilApplication {

	public static void main(String[] args) {
		
		System.out.println("Mercado Fácil");
		
		Produto p1 = new Produto("Leite", "X102", "Italac", 10.5, "Outro");
		Lote l1 = new Lote(p1, 10);
		
		System.out.println(l1);
		System.out.println(l1.getProduto());
		
		Produto p2 = new Produto("Pao", "X102", "Nao sei", 5.0, "Outro");
		Lote l2 = new Lote(p2, 10);
		
		System.out.println(l2);
		System.out.println(l2.getProduto());
	}

}
