package fr.anh.cinemademo.services;

import fr.anh.cinemademo.models.Room;
import fr.anh.cinemademo.repositories.RoomRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class RoomService {
    private RoomRepository roomRepository;

    public List<Room> findRooms() {
        return this.roomRepository.findAll();
    }

    public Room findRoomById(String id) {
        return this.roomRepository.findRoomById(id);
    }

    public Room createRoom(Room room) {
        return this.roomRepository.save(room);
    }

    public Room updateRoom(Room room) {
        return this.roomRepository.save(room);
    }

    public void deleteRoom(Room room) {
        this.roomRepository.delete(room);
    }
}
