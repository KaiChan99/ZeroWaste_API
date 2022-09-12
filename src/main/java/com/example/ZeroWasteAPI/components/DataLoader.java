package com.example.ZeroWasteAPI.components;

import com.example.ZeroWasteAPI.models.Ingredient;
import com.example.ZeroWasteAPI.models.Recipe;
import com.example.ZeroWasteAPI.repositories.IngredientRepository;
import com.example.ZeroWasteAPI.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    RecipeRepository recipeRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // Recipes with chicken as ingredient

        //To do: How to represent time as double, List for Recipes and List for ingredients

        Ingredient chicken = new Ingredient(1, "chicken", ;
        ingredientRepository.save(chicken);

        Recipe chickenFajitas = new Recipe(1, "Chicken Fajitas", "Step 1: Slice chicken and add to a marinade of paprika, ground coriander, " +
                "", 50, 5, chicken, );
        recipeRepository.save(chickenFajitas);

        Recipe creamyPestoChicken = new Recipe(2, "Creamy Pesto Chicken", "Yummy", 50, 5, chicken);
        recipeRepository.save(creamyPestoChicken);

        Recipe chickenParmesanPasta = new Recipe(3, "Chicken Parmesan Pasta", "Chicken Pasta", 110, 6, chicken);
        recipeRepository.save(chickenParmesanPasta);

        //Recipes with potato

        Ingredient potato = new Ingredient(2,"potato", );
        ingredientRepository.save(potato);

        Recipe mashedPotatoes = new Recipe(4, "Mashed potatoes", "Step 1: ", 40, 4, potato);
        recipeRepository.save(mashedPotatoes);

        Recipe bakedPotato = new Recipe (5, "Baked Potato", "Step 1:", 7, 1, potato);
        recipeRepository.save(bakedPotato);

        Recipe garlicRoastedPotatoes = new Recipe (6, "Garlic Roasted Potatoes", "Step 1:", 60, 8, potato);
        recipeRepository.save(garlicRoastedPotatoes);

        //Recipes with bell pepper

        Ingredient pepper = new Ingredient(3, "Pepper",);
        ingredientRepository.save(pepper);

        Recipe stuffedPeppers = new Recipe (7, "Stuffed Peppers", "Peppers stuffed with couscous, and spices", 20, 8, pepper, rice);
        recipeRepository.save(stuffedPeppers);

        //add chickenFajitas

        //Recipes with rice

        Recipe chickenFriedRice = new Recipe (8, "Chicken Fried Rice", "Rice cooked with delicious ", 30, 7, rice, chicken);
        recipeRepository.save(chickenFriedRice);
        Recipe burrito = new burrito (9, "Burrito", "Tortilla filled with rice and chicken", 20, 5, rice, chicken);
        recipeRepository.save(burrito);





    }
}
