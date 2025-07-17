package com.k02.recipe_platform.repository;

import com.k02.recipe_platform.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IngredientRepository  extends JpaRepository<Ingredient, Long> {
    Optional<Ingredient> findByName(String name); //Optional은 일치하지 않으면 null 반환
}
