package fr.anh.cinemademo.config;

import fr.anh.cinemademo.repositories.FilmRepository;
import fr.anh.cinemademo.repositories.TicketRepository;
import fr.anh.cinemademo.services.TicketService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TicketConfiguration {
    @Bean
    public TicketService ticketService(TicketRepository ticketRepository, FilmRepository filmRepository) {
        return new TicketService(ticketRepository, filmRepository);
    }
}
