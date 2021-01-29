package fr.exercice.recette.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("ingredients")
public class Ingredient implements Model{
	
	@Id
	private String id;
	
	private String nom;
	private int quantite;
	private String unite;

}
