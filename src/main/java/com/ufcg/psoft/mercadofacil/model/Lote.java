package com.ufcg.psoft.mercadofacil.model;

import java.util.UUID;

public class Lote {

    private String id;
    private Produto produto;
    private int numeroDeItens;

    public Lote(Produto produto, int numeroDeItens) {
        this.id = UUID.randomUUID().toString();
    	this.produto = produto;
        this.numeroDeItens = numeroDeItens;
    }

    public String getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getNumeroDeItens() {
        return numeroDeItens;
    }

    public void setNumeroDeItens(int numeroDeItens) {
        this.numeroDeItens = numeroDeItens;
    }
    
    public String toString() {
    	return "Lote ID:" + this.id + "; " + this.produto.toString() + "; Nº de items:" + this.numeroDeItens; 
    }
}
