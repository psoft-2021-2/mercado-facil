package com.ufcg.psoft.mercadofacil.model;

import java.util.UUID;

import com.ufcg.psoft.mercadofacil.model.Produto;

public class Produto {

	private String id;
	
	private String nome;

	private Double preco;

	private String codigoBarra;

	private String fabricante;

	private String categoria;

	public Produto(String nome, String codigoBarra, String fabricante,
			Double preco, String nomeCategoria) {
		
		this.id = UUID.randomUUID().toString();
		this.nome = nome;
		this.preco = preco;
		this.codigoBarra = codigoBarra;
		this.fabricante = fabricante;
		this.categoria = nomeCategoria;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
			
	public String toString() {
		return "Produto ID:" + this.id + " " + this.nome + "; fabricante:" + this.fabricante + "; preço:" + this.preco;
	}
}