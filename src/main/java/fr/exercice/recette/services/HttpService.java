package fr.exercice.recette.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.exercice.recette.repositories.HttpRepository;


@Service
public class HttpService<T> {
	
	@Autowired
	private HttpRepository<T> repository;

	public List<T> getAll() {
		return this.repository.findAll();
	}

}
