package fr.anh.cinemademo.config;

import fr.anh.cinemademo.repositories.SessionRepository;
import fr.anh.cinemademo.services.SessionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SessionConfiguration {
    @Bean
    public SessionService sessionService(SessionRepository sessionRepository) {
        return new SessionService(sessionRepository);
    }
}
