package com.ufcg.psoft.mercadofacil.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ufcg.psoft.mercadofacil.dto.ProdutoDTO;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class ControllerTemplate {
	
//	@Autowired
//	private ProdutoService produtoService;

	@RequestMapping(value = "/produto/", method = RequestMethod.POST)
	public ResponseEntity<?> criarProduto(@RequestBody ProdutoDTO produtoDTO, UriComponentsBuilder ucBuilder) {
		
		return null; //new ResponseEntity<Produto>(null, HttpStatus.CREATED);
	}


	@RequestMapping(value = "/produto/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> consultarProduto(@PathVariable("id") String id) {
		
		return null; //new ResponseEntity<Produto>(produto, HttpStatus.OK);
	}
}
