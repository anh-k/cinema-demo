package fr.anh.cinemademo.repositories;

import fr.anh.cinemademo.models.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilmRepository extends MongoRepository<Film, String> {
    Film findFilmById(String id);
}
