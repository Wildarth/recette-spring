package fr.exercice.recette.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import fr.exercice.recette.services.HttpService;

public abstract class HttpController<T> {	
	
	private HttpService<T> service;
	
	protected  HttpController(HttpService<T> service){
		this.service = service;
	}
	
	@GetMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public List<T> findAll(){
		return this.service.getAll();
	}
	
}
