package com.recipeproject.recipeapp.services;

import com.recipeproject.recipeapp.commands.IngredientCommand;
import com.recipeproject.recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
