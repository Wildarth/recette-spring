package fr.exercice.recette.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document("recettes")
public class Recette implements Model{
	
	@Id
	private String id;
	
	private String nom;
	//@DBRef
	private List<Ingredient> ingredients;
	@DBRef
	private List<Categorie> Categories;
	private String description;
	
	
	public void ajouterCategorie(Categorie categorie) {
		if(this.Categories == null) this.Categories = new ArrayList<>();
		this.Categories.add(categorie);
	}

}
