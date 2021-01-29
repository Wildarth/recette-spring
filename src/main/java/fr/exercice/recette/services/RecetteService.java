package fr.exercice.recette.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.exercice.recette.models.Categorie;
import fr.exercice.recette.models.Recette;
import fr.exercice.recette.repositories.HttpRepository;
import fr.exercice.recette.repositories.RecetteRepository;


@Service
public class RecetteService extends HttpService<Recette>{

	@Autowired
	private CategorieService categorieRepository;
	
	@Autowired
	protected RecetteService(HttpRepository<Recette> repository) {
		super(repository);
	}

	
	public List<Recette> findByCategorie(Categorie categorie) {
		return ((RecetteRepository) this.repository).findByCategories(categorie);
	}
	
	public Recette ajouterCategorie(String idRecette, String idCategorie) {
		Recette recette = this.findById(idRecette);
		Categorie categorie = this.categorieRepository.findById(idCategorie);
		recette.ajouterCategorie(categorie);
		return this.repository.save(recette);
	}

}
