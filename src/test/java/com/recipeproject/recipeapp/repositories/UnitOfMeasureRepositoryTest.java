package com.recipeproject.recipeapp.repositories;

import com.recipeproject.recipeapp.domain.UnitOfMeasure;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UnitOfMeasureRepositoryTest {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Test
    void findByDescriptionTeaspoon() {
        Optional<UnitOfMeasure> unit = unitOfMeasureRepository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", unit.get().getDescription());
    }

    @Test
    void findByDescriptionCup() {
        Optional<UnitOfMeasure> unit = unitOfMeasureRepository.findByDescription("Cup");

        assertEquals("Cup", unit.get().getDescription());
    }
}
