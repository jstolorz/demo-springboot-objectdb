package org.reddragon.objectdb.demo.demoobjectdb.bootstrap;

import org.reddragon.objectdb.demo.demoobjectdb.domain.Category;
import org.reddragon.objectdb.demo.demoobjectdb.repositories.CategoryRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class RecipeBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final CategoryRepository categoryRepository;

    public RecipeBootstrap(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadCategory();
    }

    private void loadCategory(){
        Category category1 = new Category();
        category1.setDescription("American");
        categoryRepository.save(category1);

        Category category2 = new Category();
        category1.setDescription("Italian");
        categoryRepository.save(category2);

        Category category3 = new Category();
        category1.setDescription("Mexican");
        categoryRepository.save(category3);

        Category category4 = new Category();
        category1.setDescription("Fast Food");
        categoryRepository.save(category4);

    }
}
