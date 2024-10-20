package com.example.drawings;

import javax.persistence.*;

@Entity
public class DrawingOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String drawingType;
    private String description;

    // Getters and Setters
}
