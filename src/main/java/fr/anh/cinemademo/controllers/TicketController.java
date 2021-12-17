package fr.anh.cinemademo.controllers;

import fr.anh.cinemademo.models.Ticket;
import fr.anh.cinemademo.services.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
@AllArgsConstructor
public class TicketController {
    private TicketService ticketService;

    @GetMapping
    List<Ticket> getTickets() {
        return this.ticketService.findTickets();
    }

    @GetMapping("{filmId}")
    Ticket getTicketByFilmId(@PathVariable String filmId) {
        return this.ticketService.findTicketByFilmId(filmId);
    }

    @PostMapping
    Ticket postTicket(@RequestBody Ticket ticket) {
        return this.ticketService.createTicket(ticket);
    }

    @PutMapping
    Ticket putTicket(@RequestBody Ticket ticket) {
        return this.ticketService.updateTicket(ticket);
    }

    @DeleteMapping
    void deleteTicket(@RequestBody Ticket ticket) {
        this.ticketService.deleteTicket(ticket);
    }
}
