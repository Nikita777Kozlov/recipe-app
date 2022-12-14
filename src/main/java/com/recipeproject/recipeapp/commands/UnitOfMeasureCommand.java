package com.recipeproject.recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@NoArgsConstructor
@Getter
public class UnitOfMeasureCommand {
    private Long id;
    private String description;
}
