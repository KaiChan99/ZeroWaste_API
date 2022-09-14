package com.example.ZeroWasteAPI.repositories;

import com.example.ZeroWasteAPI.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static org.hibernate.loader.Loader.SELECT;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

//    @Query("SELECT * FROM recipes r "
//            + "WHERE r.ingredient = :name "
//    )
//    List<Recipe>FindRecipeByString(
//            @Param("name") String name
//    );

//    @Query("SELECT recipes FROM recipes r "
//           + " Inner Join ingredients_by_recipes "
//           + " ON recipes.id = ingredients_by_recipes.recipe_id "
//           + " Inner Join ingredients "
//           + " ON ingredients.id = ingredients_by_recipes.ingredient_id "
//           + " WHERE ingredients.name = :name ")
//    List<Recipe> FindRecipeByIngredient(
//            @Param("name") String name
//    );

    // JQL ATTEMPT


//    Join recipes to recipes_by_ingredients table THEN join that to ingredients
//    Filter by ingredient name


//    recipes.* (brings out a full recipe object)

    List<Recipe> findRecipeByIngredientsName(String name);
    List<Recipe> findRecipeByUsersName(String name);

}
