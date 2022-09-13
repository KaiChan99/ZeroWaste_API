package com.example.ZeroWasteAPI.components;

import com.example.ZeroWasteAPI.models.Ingredient;
import com.example.ZeroWasteAPI.models.Recipe;
import com.example.ZeroWasteAPI.repositories.IngredientRepository;
import com.example.ZeroWasteAPI.repositories.RecipeRepository;
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

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // Recipes with chicken as ingredient

        Ingredient chicken = new Ingredient("chicken");
        ingredientRepository.save(chicken);

        //(chicken/peppers)
        Recipe chickenFajitas = new Recipe("Chicken Fajitas", "Step 1: Cut chicken and peppers. Step 2: Mix seasoning blend. Step 3: Cook chicken in olive oil in a pan, and add peppers and vegetables. Step 4: Fill in tortillas with chicken and vegetables.",50, 5);
        recipeRepository.save(chickenFajitas);

        Recipe creamyPestoChicken = new Recipe("Creamy Pesto Chicken", "Step 1: Season chicken with blend of seasonings. Step 2: Cook chicken in olive oil in a pan on medium heat. Step 2: Add heavy cream, pesto and peppers to pan. Step 3: Allow chicken to simmer in sauce for 5-10 minutes and serve.",  35, 4);
        recipeRepository.save(creamyPestoChicken);

        Recipe chickenParmesanPasta = new Recipe("Chicken Parmesan Pasta", "Step 1: Add chicken and peppers to pan on medium-high heat with olive oil. Step 2: Add italian seasoning, garlic powder, salt and papper and marinara sauce. Step 3: Add pasta, stir and cover and cook for 10-15 minutes, Step 4: Add cheese and cook for extra 2-3 minutes.", 30, 6);
        recipeRepository.save(chickenParmesanPasta);

        //Recipes with potato

        Ingredient potato = new Ingredient("potato");
        ingredientRepository.save(potato);

        Recipe mashedPotatoes = new Recipe("Mashed potatoes", "Step 1: Boil potatoes in a large pot and simmer until tender. Step 2: Heat the milk and butter in saucepan until melted. Step 3: Add the milk mixture to potatoes, mashing with a mixer until smooth and creamy. Step 4: Season to taste. ", 25, 4);
        recipeRepository.save(mashedPotatoes);

        Recipe bakedPotato = new Recipe ("Baked Potato", "Step 1: Heat oven to 220C and put potatoes on top shelf of oven, Step 2: Bake for 20 minutes then turn down oven to 190C and bake for 45 mins until crisp and soft. Step 3: Add favourite toppings.", 80, 4);
        recipeRepository.save(bakedPotato);

        Recipe garlicRoastedPotatoes = new Recipe ("Garlic Roasted Potatoes", "Step 1: Preheat oven to 200C. Step 2: Cut potatoes in quarters and place in a bowl with olive oil, salt, pepper and garlic. Step 3: Roast potatoes in oven for 45 minutes and then add seasoning to taste once removed.", 60, 8);
        recipeRepository.save(garlicRoastedPotatoes);



        Ingredient pepper = new Ingredient("pepper");
        ingredientRepository.save(pepper);

        //Recipe with bell pepper/chicken/rice
        Recipe stuffedPeppers = new Recipe ("Stuffed Peppers", "Step 1: Preheat oven to 200C. Step 2: Boil rice in boiling water and simmer for 20 minutes. Step 2: Cook chicken in pan over medium heat in olive oil. Step 3: Add seasoning and tomato paste. Cook for 10-15 minutes and add in cooked rice. Step 4: Spoon rice mixture into peppers and top with cheese. Step 5: Bake until peppers are tender for about 35 minutes.", 20, 8);
        recipeRepository.save(stuffedPeppers);

        //add chickenFajitas

        //Recipes with rice as ingredient

        Ingredient rice = new Ingredient ("rice");
        ingredientRepository.save(rice);

        //ingredients: chicken/rice/peppers
        Recipe chickenFriedRice = new Recipe ("Chicken Fried Rice", "Step 1: Dice chicken into small cubes and add salt. Step 2: Fry the chicken and peppers and other veg in a pan and cook for 15/20 minutes. Step 3: Add in cooked rice, season further and cook for 10 minutes", 30, 7);
        recipeRepository.save(chickenFriedRice);


        //ingredients: rice/chicken/peppers
        Recipe burrito = new Recipe ("Burrito", "Step 1: Fry onions, peppers and chicken in a pan and add seasoning. Step 2: Boil rice and add to chicken mixture. Step 3: Cook for 15/20 minutes and add mixture to tortillas and add preferred toppings", 40, 5);
        recipeRepository.save(burrito);





    }
}
