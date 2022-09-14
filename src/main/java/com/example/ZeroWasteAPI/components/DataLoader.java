package com.example.ZeroWasteAPI.components;

import com.example.ZeroWasteAPI.models.Ingredient;
import com.example.ZeroWasteAPI.models.Recipe;
import com.example.ZeroWasteAPI.models.User;
import com.example.ZeroWasteAPI.repositories.IngredientRepository;
import com.example.ZeroWasteAPI.repositories.RecipeRepository;
import com.example.ZeroWasteAPI.repositories.UserRepository;
import com.example.ZeroWasteAPI.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

        @Component
        public class DataLoader implements ApplicationRunner {

            @Autowired
            IngredientRepository ingredientRepository;

            @Autowired
            RecipeRepository recipeRepository;

            @Autowired
            UserRepository userRepository;

            public DataLoader() {

            }

            @Override
            public void run(ApplicationArguments args) throws Exception {

//        List<String> ingredients = Arrays.asList(
//                "chicken",
//                "rice",
//                "peppers",
//                "potato"
//        );


                // Recipes with chicken as ingredient

                Ingredient chicken = new Ingredient("chicken");
                ingredientRepository.save(chicken);

                //(chicken/peppers)
                Recipe chickenFajitas = new Recipe("Chicken Fajitas", "Chicken cooked in a blend of spices and vegetables wrapped in tortillas", 50, 5, "1) Cut chicken and peppers. 2) Mix seasoning blend. 3) Cook chicken in olive oil in a pan, and add peppers and vegetables. 4) Fill in tortillas with chicken and vegetables.");
                recipeRepository.save(chickenFajitas);

                Recipe creamyPestoChicken = new Recipe("Creamy Pesto Chicken", "Chicken cutlets cooked with creamy pesto sauce.", 35, 4, "1) Season chicken with blend of seasonings. 2) Cook chicken in olive oil in a pan on medium heat. 3) Add heavy cream, pesto and peppers to pan. 4) Allow chicken to simmer in sauce for 10 minutes and serve.");
                recipeRepository.save(creamyPestoChicken);

                Recipe chickenParmesanPasta = new Recipe("Chicken Parmesan Pasta", "An easy pasta dish combined with chicken and a flavourful sauce.", 30, 6, "1) Add chicken and peppers to pan on high heat with olive oil.  2) Add seasoning and marinara sauce.  3) Add pasta, stir and cook for 15 minutes. 4) Add cheese and cook for extra 2-3 minutes.");
                recipeRepository.save(chickenParmesanPasta);

                //Recipes with potato

                Ingredient potato = new Ingredient("potato");
                ingredientRepository.save(potato);

                Recipe mashedPotatoes = new Recipe("Mashed potatoes", "Creamy mashed potatoes with butter, milk and seasoning. Perfect as a side dish or a meal itself", 25, 4, "1) Boil potatoes in a pot and simmer until tender. 2) Heat the milk and butter in saucepan until melted. 3) Add milk mixture to potatoes, mashing with a mixer until smooth and creamy. 4) Season to taste.");
                recipeRepository.save(mashedPotatoes);

                Recipe bakedPotato = new Recipe("Jacket Potato", "Oven baked potato served with fillings, toppings or condiments such as cheese, coleslaw or beans", 80, 4, "1) Heat oven to 220C and put potatoes on top shelf of oven. 2) Bake for 45 minutes until crisp and soft. Step 3: Add favourite toppings");
                recipeRepository.save(bakedPotato);

                Recipe garlicRoastedPotatoes = new Recipe("Garlic Roasted Potatoes", "Chopped oven roasted potatoes with a fluffy inside and crispy edges, baked with garlic and butter", 60, 8, "1) Preheat oven to 200C. 2) Cut potatoes in quarters and place in a bowl with olive oil, salt, pepper and garlic. 3) Roast potatoes in oven for 45 minutes and add seasoning to taste.");
                recipeRepository.save(garlicRoastedPotatoes);


                Ingredient pepper = new Ingredient("pepper");
                ingredientRepository.save(pepper);

                //Recipe with bell pepper/chicken/rice
                Recipe stuffedPeppers = new Recipe("Stuffed Peppers", "Oven roasted peppers stuffed with a mixture of rice, chicken and a blend of seasonings.", 20, 8, "1) Cook chicken in pan over medium heat in olive oil. 2) Add seasoning and tomato paste.3) Cook for 10-15 minutes and add in cooked rice. 4) Spoon rice mixture into peppers and top with cheese. 5) Bake peppers for 35 minutes.");
                recipeRepository.save(stuffedPeppers);

                //add chickenFajitas

                //Recipes with rice as ingredient


                Ingredient rice = new Ingredient("rice");
                ingredientRepository.save(rice);

                //ingredients: chicken/rice/peppers
                Recipe chickenFriedRice = new Recipe("Chicken Fried Rice", "Chicken fried with a mix of vegetables and rice, seasoned with various spices", 30, 7, "1) Dice chicken into small cubes and add salt. 2) Fry the chicken and peppers and other veg in a pan and cook for 15/20 minutes. 3) Add in cooked rice, season further and cook for 10 minutes");
                recipeRepository.save(chickenFriedRice);


                //ingredients: rice/chicken/pepper

                Recipe chickenBurrito = new Recipe("Chicken Burrito", "Spicy chicken and rice wrapped in flour tortillas", 40, 5, "1) Fry onions, peppers and chicken in a pan and add seasoning. 2) Boil rice and add to chicken mixture. 3) Cook for 15/20 minutes and add mixture to tortillas and add preferred toppings");
                recipeRepository.save(chickenBurrito);

                //Assign ingredients to recipe

                chickenFriedRice.getIngredients().add(chicken);
                chickenFriedRice.getIngredients().add(rice);

                recipeRepository.save(chickenFriedRice);

                User Bob = new User("Bob");
                userRepository.save(Bob);

                User Steven = new User("Steven");
                userRepository.save(Steven);
            }

        }
        