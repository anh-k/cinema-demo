package fr.anh.cinemademo.services;

import fr.anh.cinemademo.models.Session;
import fr.anh.cinemademo.repositories.SessionRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class SessionService {
    private final SessionRepository sessionRepository;

    public List<Session> findSessions() {
        return this.sessionRepository.findAll();
    }

    public Session findSessionById(String id) {
        return this.sessionRepository.findSessionById(id);
    }

    public Session createSession(Session session) {
        return this.sessionRepository.save(session);
    }

    public Session updateSession(Session session) {
        return this.sessionRepository.save(session);
    }

    public void deleteSession(Session session) {
        this.sessionRepository.delete(session);
    }
}
