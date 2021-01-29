package fr.exercice.recette.repositories;

import org.springframework.stereotype.Repository;

import fr.exercice.recette.models.Recette;


@Repository
public interface RecetteRepository extends HttpRepository<Recette>{

}
