package fr.exercice.recette.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.exercice.recette.models.Recette;
import fr.exercice.recette.services.HttpService;
import fr.exercice.recette.services.RecetteService;


@RestController
@RequestMapping("recettes")
public class RecetteController extends HttpController<Recette>{
	
	@Autowired
	protected RecetteController(HttpService<Recette> service) {
		super(service);
	}
	
	
	@PutMapping("/{idRecette}/{idCategorie}")
	@ResponseStatus(code = HttpStatus.OK)
	public Recette ajouterCategorie(@PathVariable String idRecette, @PathVariable String idCategorie)
	{
		return ((RecetteService) this.service).ajouterCategorie(idRecette, idCategorie);
	}

}
