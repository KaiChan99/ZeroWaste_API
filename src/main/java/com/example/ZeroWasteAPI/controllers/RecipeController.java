package com.example.ZeroWasteAPI.controllers;

import com.example.ZeroWasteAPI.models.Recipe;
import com.example.ZeroWasteAPI.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {


    @Autowired
    RecipeService recipeService;


    @GetMapping
    public ResponseEntity<List<Recipe>> getAllRecipes() {
        List<Recipe> recipes = recipeService.getAllRecipes();
        return new ResponseEntity<>(recipes, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable long id) {
        Recipe recipe = recipeService.getRecipeById(id);
        return new ResponseEntity<>(recipe, HttpStatus.OK);
    }

    // Recipe by STRING
    // Decision to be made, request param, request body, path variable?
//    @GetMapping(value = "/ingredient")
//    public ResponseEntity<Recipe> getRecipeByIngredient() {
//        Recipe Stringrecipe = recipeService.getRecipeByIngredient();
//        return new ResponseEntity<>(Stringrecipe, HttpStatus.OK);
//    }


    // Adding Recipe
    @PostMapping
    public ResponseEntity<Recipe> addNewRecipe(@RequestBody Recipe recipe) {
        Recipe savedRecipe = recipeService.addNewRecipe(recipe);
        return new ResponseEntity<>(savedRecipe, HttpStatus.CREATED);
    }

    // Deleting Recipe
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity cancelRecipe(@PathVariable long id) {
//        recipeService.deleteRecipe(id);
//        return new ResponseEntity(null, HttpStatus.NO_CONTENT);
//    }
}

