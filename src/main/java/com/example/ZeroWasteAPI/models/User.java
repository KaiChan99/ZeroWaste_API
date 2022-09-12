package com.example.ZeroWasteAPI.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "name")
    private String name;
    private ArrayList<Recipe> recipes;

    public User(long id, String name, ArrayList<Recipe> recipes) {
        this.id = id;
        this.name = name;
        this.recipes = recipes;
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

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }
}
