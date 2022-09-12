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

    public Ingredient(String name, long id, ArrayList<Recipe> recipes) {
        this.name = name;
        this.id = id;
        this.recipes = recipes;
    }
    public Ingredient(){

    }

}
