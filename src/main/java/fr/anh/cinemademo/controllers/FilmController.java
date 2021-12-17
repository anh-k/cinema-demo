package fr.anh.cinemademo.controllers;

import fr.anh.cinemademo.models.Film;
import fr.anh.cinemademo.services.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
@AllArgsConstructor
public class FilmController {
    private FilmService filmService;

    @GetMapping
    List<Film> getFilms() {
        return this.filmService.findFilms();
    }

    @GetMapping("{id}")
    Film getFilmById(@PathVariable String id) {
        return this.filmService.findFilmById(id);
    }

    @PostMapping
    Film postFilm(@RequestBody Film film) {
        return this.filmService.createFilm(film);
    }

    @PutMapping
    Film putFilm(@RequestBody Film film) {
        return this.filmService.updateFilm(film);
    }

    @DeleteMapping
    void deleteFilm(@RequestBody Film film) {
        this.filmService.deleteFilm(film);
    }
}
