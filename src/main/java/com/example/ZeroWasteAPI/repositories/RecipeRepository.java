package com.example.ZeroWasteAPI.repositories;

import com.example.ZeroWasteAPI.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

//    @Query("SELECT * FROM recipes r "
//            + "WHERE r.ingredient = :name "
//    )
//    List<Recipe>FindRecipeByString(
//            @Param("name") String name
//    );

//    Join recipes to recipes_by_ingredients table THEN join that to ingredients
//    Filter by ingredient name


}
