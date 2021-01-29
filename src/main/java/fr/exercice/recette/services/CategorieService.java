package fr.exercice.recette.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.exercice.recette.models.Categorie;
import fr.exercice.recette.repositories.CategorieRepository;
import fr.exercice.recette.repositories.HttpRepository;

@Service
public class CategorieService extends HttpService<Categorie>{

	@Autowired
	protected CategorieService(HttpRepository<Categorie> repository) {
		super(repository);
	}

	public Categorie findByNom(String categorie) {
		return ((CategorieRepository) this.repository).findByNomAllIgnoreCase(categorie);
	}

}
