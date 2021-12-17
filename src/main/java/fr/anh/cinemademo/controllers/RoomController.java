package fr.anh.cinemademo.controllers;

import fr.anh.cinemademo.models.Room;
import fr.anh.cinemademo.services.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
@AllArgsConstructor
public class RoomController {
    private RoomService roomService;

    @GetMapping
    List<Room> getRooms() {
        return this.roomService.findRooms();
    }

    @GetMapping("{id}")
    Room getRoomById(@PathVariable String id) {
        return this.roomService.findRoomById(id);
    }

    @PostMapping
    Room postRoom(@RequestBody Room room) {
        return this.roomService.createRoom(room);
    }

    @PutMapping
    Room putRoom(@RequestBody Room room) {
        return this.roomService.updateRoom(room);
    }

    @DeleteMapping
    void deleteRoom(@RequestBody Room room) {
        this.roomService.deleteRoom(room);
    }
}
