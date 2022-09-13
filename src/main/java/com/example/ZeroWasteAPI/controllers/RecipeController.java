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


    //READ
    @GetMapping
    public ResponseEntity<List<Recipe>> getAllRecipes() {
        List<Recipe> recipes = recipeService.getAllRecipes();
        return new ResponseEntity<>(recipes, HttpStatus.OK);
    }

    //READ
    //Get recipe by ID
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


    // CREATE - Adding Recipe
    @PostMapping
    public ResponseEntity<Recipe> addNewRecipe(@RequestBody Recipe recipe) {
        Recipe savedRecipe = recipeService.addNewRecipe(recipe);
        return new ResponseEntity<>(savedRecipe, HttpStatus.CREATED);
    }

    //UPDATE - Changing recipe
    @PatchMapping (value = "/{id}")
    public ResponseEntity<Recipe> updateRecipe(@RequestBody Recipe recipe, @PathVariable Long id) {
        Recipe updatedRecipe = recipeService.updateRecipe(recipe, id);
        return new ResponseEntity<>(updatedRecipe, HttpStatus.OK);
    } }

    // DELETE
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity deleteRecipe(@RequestBody Recipe recipe, @PathVariable long id) {
//        recipeService.deleteRecipe(id);
//        return new ResponseEntity(null, HttpStatus.NO_CONTENT);
//    }
//}

