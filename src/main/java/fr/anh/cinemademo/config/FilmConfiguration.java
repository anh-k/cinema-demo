package fr.anh.cinemademo.config;

import fr.anh.cinemademo.repositories.FilmRepository;
import fr.anh.cinemademo.services.FilmService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilmConfiguration {
    @Bean
    public FilmService filmService(FilmRepository filmRepository) {
        return new FilmService(filmRepository);
    }
}
