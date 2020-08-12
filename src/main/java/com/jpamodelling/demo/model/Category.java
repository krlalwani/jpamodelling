package com.jpamodelling.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany (mappedBy = "categories") //mapping with parent entity receipes
    private Set<Receipe> receipes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Receipe> getReceipes() {
        return receipes;
    }

    public void setReceipes(Set<Receipe> receipes) {
        this.receipes = receipes;
    }
}
