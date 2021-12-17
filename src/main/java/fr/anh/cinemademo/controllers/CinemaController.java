package fr.anh.cinemademo.controllers;

import fr.anh.cinemademo.models.Cinema;
import fr.anh.cinemademo.services.CinemaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemas")
@AllArgsConstructor
public class CinemaController {
    private CinemaService cinemaService;

    @GetMapping
    List<Cinema> getCinemas() {
        return this.cinemaService.findCinemas();
    }

    @GetMapping("{id}")
    Cinema getCinemaById(@PathVariable String id) {
        return this.cinemaService.findCinemaById(id);
    }

    @PostMapping
    Cinema postCinema(@RequestBody Cinema cinema) {
        return this.cinemaService.createCinema(cinema);
    }

    @PutMapping
    Cinema putCinema(@RequestBody Cinema cinema) {
        return this.cinemaService.updateCinema(cinema);
    }

    @DeleteMapping
    void deleteCinema(@RequestBody Cinema cinema) {
        this.cinemaService.deleteCinema(cinema);
    }
}
