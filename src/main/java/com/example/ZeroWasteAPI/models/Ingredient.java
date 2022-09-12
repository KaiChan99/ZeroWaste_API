package com.example.ZeroWasteAPI.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity(name = "ingredients")
public class Ingredient {

    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue
    private long id;
    private ArrayList<Recipe> recipes;

    public Ingredient(String name, ArrayList<Recipe> recipes) {
        this.name = name;
        this.recipes = recipes;
    }
    public Ingredient(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }
}
