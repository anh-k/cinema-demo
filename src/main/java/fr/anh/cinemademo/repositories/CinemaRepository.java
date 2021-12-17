package fr.anh.cinemademo.repositories;

import fr.anh.cinemademo.models.Cinema;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CinemaRepository extends MongoRepository<Cinema, String> {
    Cinema findCinemaById(String id);
}
