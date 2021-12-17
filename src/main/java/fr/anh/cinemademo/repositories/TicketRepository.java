package fr.anh.cinemademo.repositories;

import fr.anh.cinemademo.models.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {
    Ticket findTicketById(String id);
}
