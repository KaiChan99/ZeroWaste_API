package com.example.ZeroWasteAPI.repositories;

import com.example.ZeroWasteAPI.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

//    @Query("SELECT recipe FROM recipe r "
//            + "WHERE r.ingredient = :name "
//    )
//    List<Recipe>FindRecipeByString(
//            @Param("name") String name
//    );



}
