package com.recipeproject.recipeapp.commands;

import com.recipeproject.recipeapp.domain.Category;
import com.recipeproject.recipeapp.domain.Difficulty;
import com.recipeproject.recipeapp.domain.Ingredient;
import com.recipeproject.recipeapp.domain.Notes;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {
    private Long id;
    private String description;
    private int prepTime;
    private int cookTime;
    private int servings;
    private String source;
    private String url;
    private String directions;
    private Byte[] image;
    private Difficulty difficulty;
    private Set<CategoryCommand> categories = new HashSet<>();
    private NotesCommand notes;
    private Set<IngredientCommand> ingredients = new HashSet<>();
}
