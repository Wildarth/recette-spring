package fr.exercice.recette.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.exercice.recette.models.Categorie;
import fr.exercice.recette.models.Recette;
import fr.exercice.recette.repositories.HttpRepository;


@Service
public class RecetteService extends HttpService<Recette>{

	@Autowired
	protected RecetteService(HttpRepository<Recette> repository) {
		super(repository);
	}
	
	@Autowired
	private CategorieService categorieRepository;

	public Recette ajouterCategorie(String idRecette, String idCategorie) {
		Recette recette = this.findById(idRecette);
		Categorie categorie = this.categorieRepository.findById(idCategorie);
		recette.ajouterCategorie(categorie);
		return this.repository.save(recette);
	}

}
