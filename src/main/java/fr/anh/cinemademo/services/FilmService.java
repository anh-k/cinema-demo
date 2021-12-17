package fr.anh.cinemademo.services;

import fr.anh.cinemademo.models.Film;
import fr.anh.cinemademo.repositories.FilmRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class FilmService {
    private FilmRepository filmRepository;

    public List<Film> findFilms() {
        return this.filmRepository.findAll();
    }

    public Film findFilmById(String id) {
        return this.filmRepository.findFilmById(id);
    }

    public Film createFilm(Film film) {
        return this.filmRepository.save(film);
    }

    public Film updateFilm(Film film) {
        return this.filmRepository.save(film);
    }

    public void deleteFilm(Film film) {
        this.filmRepository.delete(film);
    }
}
