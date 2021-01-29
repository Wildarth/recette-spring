package fr.exercice.recette.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import fr.exercice.recette.models.Recette;

@RequestMapping("recettes")
public class RecetteController extends HttpController<Recette>{

}
