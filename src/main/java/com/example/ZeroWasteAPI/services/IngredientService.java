package com.example.ZeroWasteAPI.services;

import com.example.ZeroWasteAPI.models.Ingredient;
import com.example.ZeroWasteAPI.models.Recipe;
import com.example.ZeroWasteAPI.repositories.IngredientRepository;
import com.example.ZeroWasteAPI.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    RecipeRepository recipeRepository;

    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    public Ingredient getIngredientById(long id) {
        return ingredientRepository.findById(id).get();
    }

//    public Ingredient getIngredientsByRecipe(Recipe recipe) {
//        return ingredientRepository.findByRecipe(recipe).get();
//
//    }

//    public Ingredient getIngredientsByRecipe(Recipe recipe) {
//        return ingredientRepository.findByString(recipe).get();
//
//    }

    public void addRecipe(Recipe recipe){
        this.addRecipe(recipe);
    }

}

