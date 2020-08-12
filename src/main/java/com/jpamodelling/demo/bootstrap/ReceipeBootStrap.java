package com.jpamodelling.demo.bootstrap;

import com.jpamodelling.demo.model.Receipe;
import com.jpamodelling.demo.repositories.CategoryRepository;
import com.jpamodelling.demo.repositories.ReceipeRepository;
import com.jpamodelling.demo.repositories.UnitOfMeasureRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ReceipeBootStrap  implements ApplicationListener <ContextRefreshedEvent> {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    private ReceipeRepository receipeRepository;

    public ReceipeBootStrap(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository, ReceipeRepository receipeRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.receipeRepository = receipeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        receipeRepository.saveAll(getReceipe());
    }

    private List<Receipe> getReceipe(){
        List<Receipe> receipes = new ArrayList<>(2);


        return receipes;

    }

}
