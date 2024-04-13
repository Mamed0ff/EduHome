package com.example.eduhome.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "about")
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public String title;
    private String description;
}
