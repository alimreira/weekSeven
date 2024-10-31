package com.bakery.pastry.repository;

import com.bakery.pastry.model.Pastry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PastryRepository extends JpaRepository<Pastry, Long> {
}
