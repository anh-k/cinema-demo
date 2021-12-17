package fr.anh.cinemademo.controllers;

import fr.anh.cinemademo.models.Session;
import fr.anh.cinemademo.services.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
@AllArgsConstructor
public class SessionController {
    private SessionService sessionService;

    @GetMapping
    List<Session> getSessions() {
        return this.sessionService.findSessions();
    }

    @GetMapping("{id}")
    Session getSessionById(@PathVariable String id) {
        return this.sessionService.findSessionById(id);
    }

    @PostMapping
    Session postRoom(@RequestBody Session session) {
        return this.sessionService.createSession(session);
    }

    @PutMapping
    Session putRoom(@RequestBody Session session) {
        return this.sessionService.updateSession(session);
    }

    @DeleteMapping
    void deleteRoom(@RequestBody Session session) {
        this.sessionService.deleteSession(session);
    }
}
