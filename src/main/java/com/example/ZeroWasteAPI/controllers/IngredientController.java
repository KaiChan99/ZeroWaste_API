package com.example.ZeroWasteAPI.controllers;

import com.example.ZeroWasteAPI.models.Ingredient;
import com.example.ZeroWasteAPI.models.Recipe;
import com.example.ZeroWasteAPI.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    @Autowired
    IngredientService ingredientService;

    @GetMapping
    public ResponseEntity<List<Ingredient>> getAllIngredients(){
        List<Ingredient> ingredients = ingredientService.getAllIngredients();
        return new ResponseEntity<>(ingredients, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Ingredient> getIngredientById(@PathVariable long id){
        Ingredient ingredient = ingredientService.getIngredientById(id);
        return new ResponseEntity<>(ingredient, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Ingredient> addNewIngredient(@RequestBody Ingredient ingredient) {
        Ingredient savedIngredient = ingredientService.addNewIngredient(ingredient);
        return new ResponseEntity<>(savedIngredient, HttpStatus.CREATED);
    }

    @PatchMapping (value = "/{id}")
    public ResponseEntity<Ingredient> updateIngredient(@RequestBody Ingredient ingredient, @PathVariable Long id) {
        Ingredient updatedIngredient = ingredientService.updateIngredient(ingredient, id);
        return new ResponseEntity<>(updatedIngredient, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteIngredient(@PathVariable long id){
        ingredientService.deleteIngredient(id);
        return new ResponseEntity(null, HttpStatus.NO_CONTENT);
    }

}
