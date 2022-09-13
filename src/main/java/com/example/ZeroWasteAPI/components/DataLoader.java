package com.example.ZeroWasteAPI.components;

import com.example.ZeroWasteAPI.models.Ingredient;
import com.example.ZeroWasteAPI.models.Recipe;
import com.example.ZeroWasteAPI.models.User;
import com.example.ZeroWasteAPI.repositories.IngredientRepository;
import com.example.ZeroWasteAPI.repositories.RecipeRepository;
import com.example.ZeroWasteAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // Recipes with chicken as ingredient

        Ingredient chicken = new Ingredient("chicken");
        ingredientRepository.save(chicken);

        //(chicken/peppers)
        Recipe chickenFajitas = new Recipe("Chicken Fajitas", "Step 1: Cut chicken and peppers. Step 2: Mix speppith chicken and vegetables.", 50, 5);
        recipeRepository.save(chickenFajitas);

        Recipe creamyPestoChicken = new Recipe("Creamy Pesto Chicken", "Step 1: Seal in a pan  Allow chicken to simmer in sr 5-10 minutes and serve.", 35, 4);
        recipeRepository.save(creamyPestoChicken);

        Recipe chickenParmesanPasta = new Recipe("Chicken Parmesan Pasta", "Step 1: Add chick pas minutes, Steheese and cook for extra 2-3 minutes.", 30, 6);
        recipeRepository.save(chickenParmesanPasta);

        //Recipes with potato

        Ingredient potato = new Ingredient("potato");
        ingredientRepository.save(potato);

        Recipe mashedPotatoes = new Recipe("Mashed potatoes", "Step 1: Bn saucepan until melted. Stepxer until smooth and creamy. Step 4: Season to taste. ", 25, 4);
        recipeRepository.save(mashedPotatoes);

        Recipe bakedPotato = new Recipe("Baked Potato", "Step 1: Heat n to 190Cep 3: Add favourite toppings.", 80, 4);
        recipeRepository.save(bakedPotato);

        Recipe garlicRoastedPotatoes = new Recipe("Garlic Roasted Potatoes", "Step 1: Psalt, peppd seasoning to taste once removed.", 60, 8);
        recipeRepository.save(garlicRoastedPotatoes);


        Ingredient pepper = new Ingredient("pepper");
        ingredientRepository.save(pepper);

        //Recipe with bell pepper/chicken/rice
        Recipe stuffedPeppers = new Recipe("Stuffed Peppers", "Step 1: Preh 2: Co Cook for 10about 35 minutes.", 20, 8);
        recipeRepository.save(stuffedPeppers);

        //add chickenFajitas

        //Recipes with rice as ingredient

        Ingredient rice = new Ingredient("rice");
        ingredientRepository.save(rice);

        //ingredients: chicken/rice/peppers
        Recipe chickenFriedRice = new Recipe("Chicken Fried Rice", "season further and cook for 10 minutes", 30, 7);
        recipeRepository.save(chickenFriedRice);


        //ingredients: rice/chicken/peppers
        Recipe burrito = new Recipe("Burrito", "Step 1: Fry onions, peppers and chicken in a pan and add seasoni", 40, 5);
        recipeRepository.save(burrito);


        User Bob = new User("Bob");
        userRepository.save(Bob);

        User Steven = new User("Steven");
        userRepository.save(Steven);
    }

                }

