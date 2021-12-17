package fr.anh.cinemademo.config;

import fr.anh.cinemademo.repositories.RoomRepository;
import fr.anh.cinemademo.services.RoomService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoomConfiguration {
    @Bean
    public RoomService roomService(RoomRepository roomRepository) {
        return new RoomService(roomRepository);
    }
}
