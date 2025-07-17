package com.k02.recipe_platform.repository;

import com.k02.recipe_platform.model.RecipeIngredient;
import com.k02.recipe_platform.model.RecipeIngredientId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, RecipeIngredientId> {
}
