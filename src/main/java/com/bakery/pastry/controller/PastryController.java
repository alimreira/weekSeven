package com.bakery.pastry.controller;

import com.bakery.pastry.model.Pastry;
import com.bakery.pastry.service.PastryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pastries")
public class PastryProductionController {

    @Autowired
    private PastryService service;

    // Endpoint 1: Create a new Pastry Production record
    @PostMapping
    public ResponseEntity<Pastry> createPastry(@RequestBody Pastry pastry) {
        Pastry savedPastry = service.savePastry(pastry);
        return new ResponseEntity<>(savedPastry, HttpStatus.CREATED);
    }

    // Endpoint 2: Get a Pastry Production record by ID
    @GetMapping("/{id}")
    public ResponseEntity<Pastry> getPastryById(@PathVariable Long id) {
        Pastry pastry = service.getPastryById(id);
        return new ResponseEntity<>(pastry, HttpStatus.OK);
    }

// Endpoint 3: Get all Pastry Production record

    @GetMapping
    public ResponseEntity<List<Pastry>> getAllPastries() {
        List<Pastry> pastries = service.getAllPastries();
        return new ResponseEntity<>(pastries, HttpStatus.OK);
    }

    // Endpoint 4: Delete a Pastry Production record
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePastry(@PathVariable Long id) {
        service.deletePastry(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
