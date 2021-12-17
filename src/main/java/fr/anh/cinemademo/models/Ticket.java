package fr.anh.cinemademo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
@Builder
public class Ticket {
    @Id
    private String id;
    private String order;
    private String cinema;
    private String film;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int room;
}
