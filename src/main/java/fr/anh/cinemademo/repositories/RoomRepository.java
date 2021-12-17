package fr.anh.cinemademo.repositories;

import fr.anh.cinemademo.models.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String> {
    Room findRoomById(String id);
}
