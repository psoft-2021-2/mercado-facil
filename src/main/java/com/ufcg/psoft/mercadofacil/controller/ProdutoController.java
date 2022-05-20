package com.ufcg.psoft.mercadofacil.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ufcg.psoft.mercadofacil.dto.ProdutoDTO;
import com.ufcg.psoft.mercadofacil.exceptions.ProductNotFoundException;
import com.ufcg.psoft.mercadofacil.model.Produto;
import com.ufcg.psoft.mercadofacil.services.ProdutoService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SystemController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value = "/produto/", method = RequestMethod.POST)
	public ResponseEntity<?> criarProduto(@RequestBody ProdutoDTO produtoDTO, UriComponentsBuilder ucBuilder) {

		Produto produto;
		try {
			produto = produtoService.getProdutoByCodigoBarra(produtoDTO.getCodigoBarra());
		} catch (ProductNotFoundException e) {
			produto = produtoService.createProduto(produtoDTO);
			return new ResponseEntity<Produto>(produto, HttpStatus.CREATED);
		}
		
		return new ResponseEntity<String>("Produtos já cadastrado", HttpStatus.NOT_ACCEPTABLE);
	}


	@RequestMapping(value = "/produto/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> consultarProduto(@PathVariable("id") String id) {

		Produto produto;
		try {
			produto = produtoService.getProdutoById(id);
		} catch (ProductNotFoundException e) {
			return new ResponseEntity<String>("Produto não encontrado", HttpStatus.NO_CONTENT);
		}
			
		return new ResponseEntity<Produto>(produto, HttpStatus.OK);
	}
}
