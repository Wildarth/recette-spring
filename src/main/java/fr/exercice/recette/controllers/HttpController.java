package fr.exercice.recette.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.exercice.recette.services.HttpService;

@RestController
public class HttpController<T> {
	
	@Autowired
	private HttpService<T> service;
	
	@GetMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public List<T> findAll(){
		return this.service.getAll();
	}
	
}
