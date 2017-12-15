package org.reddragon.objectdb.demo.demoobjectdb.services;

import org.reddragon.objectdb.demo.demoobjectdb.domain.Category;
import org.reddragon.objectdb.demo.demoobjectdb.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Set<Category> listAllCategorys() {
        return StreamSupport.stream(categoryRepository.findAll()
        .spliterator(),false)
                .collect(Collectors.toSet());
    }
}
