package org.reddragon.objectdb.demo.demoobjectdb.services;

import org.reddragon.objectdb.demo.demoobjectdb.domain.Category;

import java.util.Set;

public interface CategoryService {

    Set<Category> listAllCategorys();
}
