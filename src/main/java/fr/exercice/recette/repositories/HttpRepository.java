package fr.exercice.recette.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import fr.exercice.recette.models.Model;

@NoRepositoryBean
public interface HttpRepository<T extends Model> extends MongoRepository<T, String> {

}
