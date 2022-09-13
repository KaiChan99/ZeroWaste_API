package com.example.ZeroWasteAPI.repositories;
import com.example.ZeroWasteAPI.models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}
