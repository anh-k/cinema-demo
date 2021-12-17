package fr.anh.cinemademo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Session {
    @Id
    private String id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @DBRef
    private Room room;
}
