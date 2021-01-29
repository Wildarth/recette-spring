package fr.exercice.recette.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import fr.exercice.recette.models.Model;
import fr.exercice.recette.repositories.HttpRepository;



public abstract class HttpService<T extends Model> {
	
	
	private HttpRepository<T> repository;
	
	protected HttpService(HttpRepository<T> repository){
		this.repository = repository;
	}

	public List<T> getAll() {
		return this.repository.findAll();
	}

	public T create(T t) {
		return this.repository.insert(t);
	}

	public void deleteById(String id) {
		this.repository.deleteById(id);
	}

	public T findById(String id) {
		return this.repository.findById(id)
				.orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	public T update(T t) {
		return this.repository.save(t);
	}

}
