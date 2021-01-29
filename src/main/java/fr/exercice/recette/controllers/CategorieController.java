package fr.exercice.recette.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.exercice.recette.models.Categorie;
import fr.exercice.recette.services.CategorieService;
import fr.exercice.recette.services.HttpService;

@RestController
@RequestMapping("categories")
public class CategorieController extends HttpController<Categorie>{

	@Autowired
	protected CategorieController(HttpService<Categorie> service) {
		super(service);
	}
	
	@GetMapping("/nom/{nom}")
	@ResponseStatus(code = HttpStatus.OK)
	public Categorie findByNom(@PathVariable String nom) {
		return ((CategorieService) this.service).findByNom(nom);
	}

}
