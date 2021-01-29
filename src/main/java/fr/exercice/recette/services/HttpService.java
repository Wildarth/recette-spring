package fr.exercice.recette.services;

import java.util.List;


import fr.exercice.recette.repositories.HttpRepository;



public abstract class HttpService<T> {
	
	
	private HttpRepository<T> repository;
	
	protected HttpService(HttpRepository<T> repository){
		this.repository = repository;
	}

	public List<T> getAll() {
		return this.repository.findAll();
	}

}
