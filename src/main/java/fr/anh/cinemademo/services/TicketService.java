package fr.anh.cinemademo.services;

import fr.anh.cinemademo.models.Film;
import fr.anh.cinemademo.models.Ticket;
import fr.anh.cinemademo.repositories.FilmRepository;
import fr.anh.cinemademo.repositories.TicketRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class TicketService {
    private TicketRepository ticketRepository;
    private FilmRepository filmRepository;

    public List<Ticket> findTickets() {
        return this.ticketRepository.findAll();
    }

    public Ticket findTicketByFilmId(String filmId) {
        Film film = this.filmRepository.findFilmById(filmId);

        Ticket ticket = Ticket.builder()
                .id(filmId)
                .order(UUID.randomUUID().toString())
                .cinema(film.getSession().getRoom().getCinema().getName())
                .film(film.getName())
                .startDate(film.getSession().getStartDate())
                .endDate(film.getSession().getEndDate())
                .room(film.getSession().getRoom().getNumber())
                .build();

        return ticket;
    }

    public Ticket createTicket(Ticket ticket) {
        return this.ticketRepository.save(ticket);
    }

    public Ticket updateTicket(Ticket ticket) {
        return this.ticketRepository.save(ticket);
    }

    public void deleteTicket(Ticket ticket) {
        this.ticketRepository.delete(ticket);
    }
}
