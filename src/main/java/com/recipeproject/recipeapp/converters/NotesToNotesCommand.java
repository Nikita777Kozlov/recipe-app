package com.recipeproject.recipeapp.converters;

import com.recipeproject.recipeapp.commands.NotesCommand;
import com.recipeproject.recipeapp.domain.Notes;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class NotesToNotesCommand implements Converter<Notes, NotesCommand> {
    @Override
    @Nullable
    @Synchronized
    public NotesCommand convert(Notes source) {
        if (source == null) return null;

        final NotesCommand notesCommand = new NotesCommand();

        notesCommand.setRecipeNotes(source.getRecipeNotes());
        notesCommand.setId(source.getId());

        return notesCommand;
    }
}
