package fr.exercice.recette.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
public interface HttpRepository<T> extends MongoRepository<T, String> {

}
