package fr.exercice.recette.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.exercice.recette.models.Recette;
import fr.exercice.recette.services.HttpService;


@RestController
@RequestMapping("recettes")
public class RecetteController extends HttpController<Recette>{
	
	@Autowired
	protected RecetteController(HttpService<Recette> service) {
		super(service);
	}

}
