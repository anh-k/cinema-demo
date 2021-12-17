package fr.anh.cinemademo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Room {
    @Id
    private String id;
    private Integer number;
    private Integer seats;

    @DBRef
    private Cinema cinema;
}
