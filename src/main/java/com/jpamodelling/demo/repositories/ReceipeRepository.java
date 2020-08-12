package com.jpamodelling.demo.repositories;

import com.jpamodelling.demo.model.Receipe;
import org.springframework.data.repository.CrudRepository;

public interface ReceipeRepository extends CrudRepository<Receipe,Long> {
}
