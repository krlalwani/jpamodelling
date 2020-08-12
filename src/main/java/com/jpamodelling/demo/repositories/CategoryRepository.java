package com.jpamodelling.demo.repositories;

import com.jpamodelling.demo.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
