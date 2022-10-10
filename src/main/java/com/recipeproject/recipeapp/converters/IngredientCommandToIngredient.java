package com.recipeproject.recipeapp.converters;

import com.recipeproject.recipeapp.commands.IngredientCommand;
import com.recipeproject.recipeapp.domain.Ingredient;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class IngredientCommandToIngredient implements Converter<IngredientCommand, Ingredient> {

    private final UnitOfMeasureCommandToUnitOfMeasure uomConverter;

    public IngredientCommandToIngredient(UnitOfMeasureCommandToUnitOfMeasure uomConverter) {
        this.uomConverter = uomConverter;
    }

    @Override
    @Nullable
    @Synchronized
    public Ingredient convert(IngredientCommand source) {
        if (source == null) return null;

        final Ingredient ingredient = new Ingredient();
        ingredient.setId(source.getId());
        ingredient.setAmount(source.getAmount());

        ingredient.setUom(uomConverter.convert(source.getUom()));
        ingredient.setDescription(source.getDescription());
        return ingredient;
    }
}
