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
	private List<Ingredient> ingredients;
	@DBRef
	private List<Categorie> categories;
	private String description;
	
	
	public void ajouterCategorie(Categorie categorie) {
		if(this.categories == null) this.categories = new ArrayList<>();
		this.categories.add(categorie);
	}

}
