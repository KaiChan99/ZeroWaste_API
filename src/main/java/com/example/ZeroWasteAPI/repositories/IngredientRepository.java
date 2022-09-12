package com.example.ZeroWasteAPI.repositories;


import com.example.ZeroWasteAPI.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Recipe, Long> {
}
