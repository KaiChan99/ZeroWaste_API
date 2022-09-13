package com.example.ZeroWasteAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "recipes_by_ingredients",
            joinColumns = {@JoinColumn(name = "recipe_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "ingredient_id", nullable = false)}
    )
    @JsonIgnoreProperties({"recipes"})
    private List<Recipe> recipes;

    @ManyToMany
    @JoinTable(
            name = "users_by_ingredients",
            joinColumns = {@JoinColumn(name = "user_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "ingredient_id", nullable = false)}
    )
    @JsonIgnoreProperties({"users"})
    private List<User> users;

    public Ingredient(long id, String name) {
        this.id = id;
        this.name = name;
        this.recipes = new ArrayList<>();
        this.users = new ArrayList<>();
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

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
