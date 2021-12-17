package fr.anh.cinemademo.config;

import fr.anh.cinemademo.repositories.CinemaRepository;
import fr.anh.cinemademo.services.CinemaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CinemaConfiguration {
    @Bean
    public CinemaService cinemaService(CinemaRepository cinemaRepository) {
        return new CinemaService(cinemaRepository);
    }
}
