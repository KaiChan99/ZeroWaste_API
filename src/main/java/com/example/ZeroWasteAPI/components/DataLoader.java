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

        Recipe chickenFajitas = new Recipe("Chicken Fajitas", "Step 1: Cut chicken and peppers. Step 2: Mix seasoning blend. Step 3: Cook chicken in olive oil in a pan, and add peppers and vegetables. Step 4: Fill in tortillas with chicken and vegetables.",50, 5);
        recipeRepository.save(chickenFajitas);

//        chickenFajitas.getIngredient().add(chicken);

        Recipe creamyPestoChicken = new Recipe("Creamy Pesto Chicken", "Oven roasted chicken", 50, 5);
        recipeRepository.save(creamyPestoChicken);

        Recipe chickenParmesanPasta = new Recipe("Chicken Parmesan Pasta", "Chicken Pasta", 110, 6);
        recipeRepository.save(chickenParmesanPasta);

        //Recipes with potato

        Ingredient potato = new Ingredient("potato");
        ingredientRepository.save(potato);

        Recipe mashedPotatoes = new Recipe("Mashed potatoes", "Simple potato mash that is easy to make. ", 40, 4);
        recipeRepository.save(mashedPotatoes);

        Recipe bakedPotato = new Recipe ("Baked Potato", "Jacket potato baked in the oven", 7, 1);
        recipeRepository.save(bakedPotato);

        Recipe garlicRoastedPotatoes = new Recipe ("Garlic Roasted Potatoes", "Step 1:", 60, 8);
        recipeRepository.save(garlicRoastedPotatoes);

        //Recipes with bell pepper

        Ingredient pepper = new Ingredient("Pepper");
        ingredientRepository.save(pepper);

        Recipe stuffedPeppers = new Recipe ("Stuffed Peppers", "Peppers stuffed with rice, chicken and spices", 20, 8);
        recipeRepository.save(stuffedPeppers);

        //add chickenFajitas

        //Recipes with rice as ingredient

        Ingredient rice = new Ingredient("Rice");
        ingredientRepository.save(rice);

        Recipe chickenFriedRice = new Recipe ("Chicken Fried Rice", "Rice cooked with delicious chicken and peppers", 30, 7);
        recipeRepository.save(chickenFriedRice);



        chickenFriedRice.getIngredients().add(chicken);
        chickenFriedRice.getIngredients().add(rice);

//        chickenFriedRice.setIngredient();

        recipeRepository.save(chickenFriedRice);
//        ingredientRepository.save(rice);


        Recipe burrito = new Recipe ("Burrito", "Tortilla filled with rice and chicken", 40, 5);
        recipeRepository.save(burrito);

        User Bob = new User("Bob");
        userRepository.save(Bob);

        User Steven = new User("Steven");
        userRepository.save(Steven);



    }
}
