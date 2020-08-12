package com.jpamodelling.demo.services;

import com.jpamodelling.demo.model.Receipe;
import com.jpamodelling.demo.repositories.ReceipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class ReceipeServiceImpl implements ReceipeService{

    private final ReceipeRepository receipeRepository;

    public ReceipeServiceImpl(ReceipeRepository receipeRepository) {
        this.receipeRepository = receipeRepository;
    }

    @Override
    public Set<Receipe> getReceipes() {
        Set<Receipe> receipeSet = new HashSet<>();
        receipeRepository.findAll().iterator().forEachRemaining(receipeSet::add);
        return null;
    }
}
