package fr.exercice.recette.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.exercice.recette.models.Recette;
import fr.exercice.recette.services.CategorieService;
import fr.exercice.recette.services.HttpService;
import fr.exercice.recette.services.RecetteService;


@RestController
@RequestMapping("recettes")
public class RecetteController extends HttpController<Recette>{
	
	@Autowired 
	private CategorieService categorieService;
	
	@Autowired
	protected RecetteController(HttpService<Recette> service) {
		super(service);
	}
	
	
	@GetMapping("/categorie/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Recette> findByCategorie(@PathVariable String id) {
		return ((RecetteService) this.service).findByCategorie(this.categorieService.findById(id));
	}
	
	@PutMapping("/{idRecette}/{idCategorie}")
	@ResponseStatus(code = HttpStatus.OK)
	public Recette ajouterCategorie(@PathVariable String idRecette, @PathVariable String idCategorie)
	{
		return ((RecetteService) this.service).ajouterCategorie(idRecette, idCategorie);
	}
	
	

}
