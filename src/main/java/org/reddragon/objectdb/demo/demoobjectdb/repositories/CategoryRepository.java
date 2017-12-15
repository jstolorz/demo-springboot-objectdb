package org.reddragon.objectdb.demo.demoobjectdb.repositories;

import org.reddragon.objectdb.demo.demoobjectdb.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository  extends CrudRepository<Category, Long>{
}
