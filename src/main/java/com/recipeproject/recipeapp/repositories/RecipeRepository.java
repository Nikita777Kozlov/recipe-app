package com.recipeproject.recipeapp.repositories;

import com.recipeproject.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
