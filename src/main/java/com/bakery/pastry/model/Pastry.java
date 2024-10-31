package com.bakery.pastry.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
public class Pastry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pastryName;

    private LocalDate productionDate;

    private Integer quantity;

    private Double pricePerUnit;

    // Getters and Setters
}