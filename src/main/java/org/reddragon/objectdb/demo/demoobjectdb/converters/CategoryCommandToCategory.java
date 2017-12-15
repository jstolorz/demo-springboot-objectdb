package org.reddragon.objectdb.demo.demoobjectdb.converters;

import lombok.Synchronized;
import org.reddragon.objectdb.demo.demoobjectdb.commands.CategoryCommand;
import org.reddragon.objectdb.demo.demoobjectdb.domain.Category;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {

    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source) {
        return null;
    }
}
