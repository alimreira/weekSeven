package com.bakery.pastry.service;

import com.bakery.pastry.exception.ResourceNotFoundException;
import com.bakery.pastry.model.Pastry;
import com.bakery.pastry.repository.PastryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PastryService {

    @Autowired
    private PastryRepository repository;

    public Pastry savePastry(Pastry pastry) {
        return repository.save(pastry);
    }

    public Pastry getPastryById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pastry Production not found"));
    }

    public List<Pastry> getAllPastries() {
        return repository.findAll();
    }

    public void deletePastry(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Pastry Production not found");
        }
        repository.deleteById(id);
    }
}