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
        Recipe chickenFajitas = new Recipe("Chicken Fajitas", "Step 1: Cut ch. Step 4: Fill in tornd vegetables.",50, 5);
        recipeRepository.save(chickenFajitas);

        Recipe creamyPestoChicken = new Recipe("Creamy Pesto Chicken", "Step 1: Season am, pesto and pep sauce for 5-10 minutes and serve.",  35, 4);
        recipeRepository.save(creamyPestoChicken);

        Recipe chickenParmesanPasta = new Recipe("Chicken Parmesan Pasta", "S: Add 3: Add pasta, stir and cover and cook for 10-15 minutes, Step 4: Add cheese and cook for extra 2-3 minutes.", 30, 6);
        recipeRepository.save(chickenParmesanPasta);

        //Recipes with potato

        Ingredient potato = new Ingredient("potato");
        ingredientRepository.save(potato);

        Recipe mashedPotatoes = new Recipe("Mashed potatoes", "Step ntil smooth and creamy. Step 4: Season to taste. ", 25, 4);
        recipeRepository.save(mashedPotatoes);

        Recipe bakedPotato = new Recipe ("Baked Potato", "Shen turn down oven to 190C and bake l crisp and soft. Step 3: Add favourite toppings.", 80, 4);
        recipeRepository.save(bakedPotato);

        Recipe garlicRoastedPotatoes = new Recipe ("Garlic Roasted Potatoes", "Step 1: Preven for 45 dd seasoning to taste once removed.", 60, 8);
        recipeRepository.save(garlicRoastedPotatoes);



        Ingredient pepper = new Ingredient("pepper");
        ingredientRepository.save(pepper);

        //Recipe with bell pepper/chicken/rice
        Recipe stuffedPeppers = new Recipe ("Stuffed Peppers", "Step 1: Pve oil.nutes.", 20, 8);
        recipeRepository.save(stuffedPeppers);

        //add chickenFajitas

        //Recipes with rice as ingredient


        Ingredient rice = new Ingredient ("rice");
        ingredientRepository.save(rice);

        //ingredients: chicken/rice/peppers
        Recipe chickenFriedRice = new Recipe ("Chicken Fried Rice", "Step 1: Dice chicken into small cubes a", 30, 7);
        recipeRepository.save(chickenFriedRice);


        //ingredients: rice/chicken/pepper

        Recipe burrito = new Recipe("Burrito", "Step 1: Fry onions, peppers and chicken in a pan and add seasoni", 40, 5);
        recipeRepository.save(burrito);


        User Bob = new User("Bob");
        userRepository.save(Bob);

        User Steven = new User("Steven");
        userRepository.save(Steven);
    }

                }

