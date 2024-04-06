package com.example.eduhome.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="InfoCards")
public class CardsEntity {
    @Id
    @Column(name = "cardId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String text;
}
