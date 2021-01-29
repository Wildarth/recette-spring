package fr.exercice.recette.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HttpRepository<T> extends MongoRepository<T, String> {

}
