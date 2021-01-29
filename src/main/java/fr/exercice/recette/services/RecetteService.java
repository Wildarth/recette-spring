package fr.exercice.recette.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.exercice.recette.models.Recette;
import fr.exercice.recette.repositories.HttpRepository;


@Service
public class RecetteService extends HttpService<Recette>{

	@Autowired
	protected RecetteService(HttpRepository<Recette> repository) {
		super(repository);
	}


}
