package fr.anh.cinemademo.services;

import fr.anh.cinemademo.models.Cinema;
import fr.anh.cinemademo.repositories.CinemaRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CinemaService {
    private CinemaRepository cinemaRepository;

    public List<Cinema> findCinemas() {
        return this.cinemaRepository.findAll();
    }

    public Cinema findCinemaById(String id) {
        return this.cinemaRepository.findCinemaById(id);
    }

    public Cinema createCinema(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    public Cinema updateCinema(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    public void deleteCinema(Cinema cinema) {
        this.cinemaRepository.delete(cinema);
    }
}
