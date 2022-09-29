package com.recipeproject.recipeapp.services;

import com.recipeproject.recipeapp.domain.Recipe;


import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
