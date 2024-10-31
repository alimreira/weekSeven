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

    @NotBlank(message = "Pastry name is required")
    private String pastryName;

    @NotNull(message = "Production date is required")
    private LocalDate productionDate;

    @NotNull(message = "Quantity is required")
    private Integer quantity;

    @NotNull(message = "Price per unit is required")
    @Min(value = 0, message = "Price per unit cannot be negative")
    private Double pricePerUnit;

    // Getters and Setters
}