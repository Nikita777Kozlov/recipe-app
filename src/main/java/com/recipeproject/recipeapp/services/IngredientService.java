package com.recipeproject.recipeapp.services;

import com.recipeproject.recipeapp.commands.IngredientCommand;

public interface IngredientService {

     IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

     IngredientCommand saveIngredientCommand(IngredientCommand command);

     void deleteIngredientById(Long recipeId, Long ingredientId);
}
