package fr.exercice.recette.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import fr.exercice.recette.models.Model;
import fr.exercice.recette.services.HttpService;

public abstract class HttpController<T extends Model> {	
	
	private HttpService<T> service;
	
	protected  HttpController(HttpService<T> service){
		this.service = service;
	}
	
	@GetMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public List<T> findAll(){
		return this.service.getAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public  T findById(@PathVariable String id) {
		return this.service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public T create(@RequestBody T t) {
		return this.service.create(t);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public T update(@PathVariable String id, @RequestBody T t) {
		T oldT = this.service.findById(id);
		t.setId(oldT.getId());
		return this.service.update(t);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deleteById(@PathVariable String id) {
		this.service.deleteById(id);
	}
}
