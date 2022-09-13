package com.example.ZeroWasteAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


//TO DO: Add dependency to fix errors, change List to ArrayList

@Entity
@Table(name = "recipes")

public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
private Long id;

    @Column
    private String name;

    @Column
private String description;

    @Column
private double cookingTime;

    @Column
private int servings;

//    @ManyToMany
//    @JoinTable(
//            name = "ingredients_by_recipes",
//            joinColumns = {@JoinColumn(name = "ingredients_id", nullable = false)},
//            inverseJoinColumns = {@JoinColumn(name = "recipe_id", nullable = false)}
//    )
//    @JsonIgnoreProperties({"ingredients"})

    @ElementCollection
    private List<String> ingredients;

// constructor

    public Recipe(String name, String description, double cookingTime, int servings) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cookingTime = cookingTime;
        this.servings = servings;
        this.ingredients = new ArrayList<>();
    }

    //empty constructor

    public Recipe() {

    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(double cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> newIngredients) {
        this.ingredients = newIngredients;
    }
}
