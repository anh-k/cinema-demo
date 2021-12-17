package fr.anh.cinemademo.repositories;

import fr.anh.cinemademo.models.Session;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SessionRepository extends MongoRepository<Session, String> {
    Session findSessionById(String id);
}
