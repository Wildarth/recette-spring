package fr.exercice.recette.repositories;

import org.springframework.stereotype.Repository;

import fr.exercice.recette.models.Categorie;

@Repository
public interface CategorieRepository extends HttpRepository<Categorie>{

	Categorie findByNomAllIgnoreCase(String categorie);

}
