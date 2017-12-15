package org.reddragon.objectdb.demo.demoobjectdb.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.reddragon.objectdb.demo.demoobjectdb.domain.Category;
import org.reddragon.objectdb.demo.demoobjectdb.repositories.CategoryRepository;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CategoryServiceImplTest {

    CategoryService categoryService;

    @Mock
    CategoryRepository categoryRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        categoryService = new CategoryServiceImpl(categoryRepository);
    }

    @Test
    public void listAllCategorys() throws Exception {

        Set<Category> categories = new HashSet<>();

        Category category1 = new Category();
        category1.setId(1L);

        categories.add(category1);

        Category category2 = new Category();
        category1.setId(2L);

        categories.add(category2);

        when(categoryRepository.findAll()).thenReturn(categories);

        Set<Category> result = categoryService.listAllCategorys();

        verify(categoryRepository, times(1)).findAll();
        assertEquals(2, result.size());


    }

}