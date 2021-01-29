package fr.exercice.recette.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.exercice.recette.models.Categorie;
import fr.exercice.recette.models.Recette;


@Repository
public interface RecetteRepository extends HttpRepository<Recette>{

	
	List<Recette> findByCategories(Categorie categorie);

}
