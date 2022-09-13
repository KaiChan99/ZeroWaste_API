package com.example.ZeroWasteAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "ingredients_by_users",
            joinColumns = {@JoinColumn(name = "ingredient_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "user_id", nullable = false)}
    )
    @JsonIgnoreProperties({"recipes"})
    private List<Ingredient> ingredients;
    //private ArrayList<Recipe> recipes;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
        this.ingredients = new ArrayList<>();
    }
    public User(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
