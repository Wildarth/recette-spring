package fr.exercice.recette.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("categories")
public class Categorie {
	
	@Id
	private String id;
	
	private String nom;

}
